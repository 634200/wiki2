package com.java.wiki.req;

public class EbookNameQueryReq extends PageReq {
    private Long id;
    private String name;

    //服务于传入参数特点
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        sb.append("Hash = ").append(hashCode());
        sb.append(",id=").append(id);
        sb.append(",name").append(name);
        sb.append("]");
        return sb.toString();
    }
}