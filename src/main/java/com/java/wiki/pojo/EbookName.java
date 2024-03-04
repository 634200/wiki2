package com.java.wiki.pojo;

public class EbookName {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ebook.id
     *
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ebook.name
     *
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ebook.category1_id
     *
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    private Long category1Id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ebook.category2_id
     *
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    private Long category2Id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ebook.description
     *
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ebook.cover
     *
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    private String cover;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ebook.doc_count
     *
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    private Integer docCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ebook.view_count
     *
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    private Integer viewCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ebook.vote_count
     *
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    private Integer voteCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ebook.id
     *
     * @return the value of ebook.id
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ebook.id
     *
     * @param id the value for ebook.id
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ebook.name
     *
     * @return the value of ebook.name
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ebook.name
     *
     * @param name the value for ebook.name
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ebook.category1_id
     *
     * @return the value of ebook.category1_id
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    public Long getCategory1Id() {
        return category1Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ebook.category1_id
     *
     * @param category1Id the value for ebook.category1_id
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    public void setCategory1Id(Long category1Id) {
        this.category1Id = category1Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ebook.category2_id
     *
     * @return the value of ebook.category2_id
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    public Long getCategory2Id() {
        return category2Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ebook.category2_id
     *
     * @param category2Id the value for ebook.category2_id
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    public void setCategory2Id(Long category2Id) {
        this.category2Id = category2Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ebook.description
     *
     * @return the value of ebook.description
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ebook.description
     *
     * @param description the value for ebook.description
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ebook.cover
     *
     * @return the value of ebook.cover
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    public String getCover() {
        return cover;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ebook.cover
     *
     * @param cover the value for ebook.cover
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ebook.doc_count
     *
     * @return the value of ebook.doc_count
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    public Integer getDocCount() {
        return docCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ebook.doc_count
     *
     * @param docCount the value for ebook.doc_count
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    public void setDocCount(Integer docCount) {
        this.docCount = docCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ebook.view_count
     *
     * @return the value of ebook.view_count
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ebook.view_count
     *
     * @param viewCount the value for ebook.view_count
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ebook.vote_count
     *
     * @return the value of ebook.vote_count
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    public Integer getVoteCount() {
        return voteCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ebook.vote_count
     *
     * @param voteCount the value for ebook.vote_count
     * @mbg.generated Mon Mar 04 09:12:44 CST 2024
     */
    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }
}