<template>

  <a-layout>
    <a-layout-content
        :style="{ background: '#fff' ,padding: '24px', margin: 0,
            minHeight: '280px' }">
      <p>
        <a-from layout="inline" :model="param">
          <a-form-item>
            <a-button type="primary" @click="handleQuery()">
              <!--<a-button type="primary" @click="edit">-->
              查询
            </a-button>
          </a-form-item>
          <a-form-item>
            <a-button type="primary" @click="add()">
              新增
            </a-button>
          </a-form-item>
        </a-from>

      </p>
      <a-table
          :columns="columns"
          :row-key="record => record.id"
          :data-source="level1"
          :loading="loading"
          :pagenation="false"
      >
        <template #cover="{ text: cover }">
          <img v-if="cover" :src="cover" alt="avatar"/>
        </template>
        <template v-slot:action="{ text, record }">
        <a-space size="small">
            <a-button type="primary" @click="edit(record)">
              <!--<a-button type="primary" @click="edit">-->
              编辑
            </a-button>
            <a-popconfirm
                title="删除后不可恢复，确认删除?"
                ok-text="是"
                cancel-text="否"
                @confirm="handleDelete(record.id)"
            >
              <a-button type="danger">
                删除
              </a-button>
            </a-popconfirm>
          </a-space>
        </template>
      </a-table>
    </a-layout-content>
  </a-layout>

  <a-modal
      title="分类表单"
      v-model:visible="modalVisible"
      :confirm-loading="modalLoading"
      @ok="handleModalOk"
  >
    <a-form :model="category" :label-col="{span:6}">
      <a-form-item label="名称">
        <a-input v-model:value="category.name"/>
      </a-form-item>
      <a-form-item label="父分类">
        <a-input v-model:value="category.parent"/>
      </a-form-item>
      <a-form-item label="顺序">
        <a-input v-model:value="category.sort"/>
      </a-form-item>

    </a-form>
  </a-modal>
</template>

<script lang="ts">
import {defineComponent, onMounted, ref} from 'vue';
import axios from 'axios';
import wrapperRaf from "ant-design-vue/es/_util/raf";
import cancel = wrapperRaf.cancel;
import {message} from 'ant-design-vue';
import {Tool} from "@/util/tool";

export default defineComponent({
  name: 'AdminCategory',
  methods: {cancel},

  computed: {
    wrapperRaf() {
      return wrapperRaf
    }
  },
  setup() {
    const param = ref();
    param.value = {};
    const categorys = ref();
    const loading = ref(false);

    const columns = [
      {
        title: '名称',
        dataIndex: 'name'
      },
      {
        title: '父分类',
        key: 'parent',
        dataIndex: 'parent'
      },
      {
        title: '顺序',
        dataIndex: 'sort'
      },
      {
        title: '点赞数',
        dataIndex: 'voteCount'
      },
      {
        title: 'Action',
        key: 'action',
        slots: {
          customRender: 'action'
        }
      }
    ];

    /**
     * 一级分类树:children组件就是二级分类
     *
     *
     *
     */
    const level1 = ref();//一级分类树，chlidren属性就是二级分类
    /**
     数据查询
     **/
    const handleQuery = () => {
      loading.value = true;
      axios.get("/category/all").then((response) => {
        loading.value = false;
        const data = response.data;
        if (data.success) {
          categorys.value = data.content;
          console.log("原始数组", categorys.value);

          level1.value = [];
          level1.value = Tool.array2Tree(categorys.value, 0);
          console.log("树形结构：", level1);
          // 重置分页按钮
        } else {
          message.error(data.message);
        }
      });
    };


    // -----表单--------
    const category = ref({});
    const modalVisible = ref(false);
    const modalLoading = ref(false);
    const handleModalOk = () => {
      modalLoading.value = true;

      axios.post("/category/save", category.value).then((response) => {
        modalLoading.value = false;
        const data = response.data;
        if (data.success) {
          modalVisible.value = false;
          //重新加载列表
          handleQuery();
        } else {
          message.error(data.message);
        }
      });
    }

    // 编辑
    const edit = (record: any) => {
      modalVisible.value = true;
      category.value = Tool.copy(record);
    }
    // 新增
    const add = () => {
      modalVisible.value = true;
      // Object.assign(category.value, {});
      category.value = {}
    }

    const handleDelete = (id: number) => {
      axios.delete("/category/delete/" + id).then((response) => {
        const data = response.data;
        if (data.success) {

          //重新加载列表
          handleQuery();
        }
      });
    };


    onMounted(() => {
      handleQuery();
    });

    return {
      param,
      // categorys,
      level1,
      columns,
      loading,
      handleQuery,

      edit,
      add,

      category,
      modalVisible,
      modalLoading,
      handleModalOk,


      handleDelete
    }
  }
})
;
</script>

<style scoped>
img {
  width: 50px;
  height: 50px;
}
</style>