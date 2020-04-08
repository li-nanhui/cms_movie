package com.linh.apps.cms_movie.bean;

public class Movie {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_movie.id
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_movie.title
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_movie.content
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_movie.source
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    private String source;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_movie.publish_time
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    private String publishTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_movie.read_times
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    private Long readTimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_movie.status
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_movie.thump_up
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    private Long thumpUp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_movie.thump_down
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    private Long thumpDown;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_movie.author_id
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    private Long authorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_movie.category_id
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    private Long categoryId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_movie.id
     *
     * @return the value of cms_movie.id
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_movie.id
     *
     * @param id the value for cms_movie.id
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_movie.title
     *
     * @return the value of cms_movie.title
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_movie.title
     *
     * @param title the value for cms_movie.title
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_movie.content
     *
     * @return the value of cms_movie.content
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_movie.content
     *
     * @param content the value for cms_movie.content
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_movie.source
     *
     * @return the value of cms_movie.source
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_movie.source
     *
     * @param source the value for cms_movie.source
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_movie.publish_time
     *
     * @return the value of cms_movie.publish_time
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    public String getPublishTime() {
        return publishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_movie.publish_time
     *
     * @param publishTime the value for cms_movie.publish_time
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime == null ? null : publishTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_movie.read_times
     *
     * @return the value of cms_movie.read_times
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    public Long getReadTimes() {
        return readTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_movie.read_times
     *
     * @param readTimes the value for cms_movie.read_times
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    public void setReadTimes(Long readTimes) {
        this.readTimes = readTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_movie.status
     *
     * @return the value of cms_movie.status
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_movie.status
     *
     * @param status the value for cms_movie.status
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_movie.thump_up
     *
     * @return the value of cms_movie.thump_up
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    public Long getThumpUp() {
        return thumpUp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_movie.thump_up
     *
     * @param thumpUp the value for cms_movie.thump_up
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    public void setThumpUp(Long thumpUp) {
        this.thumpUp = thumpUp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_movie.thump_down
     *
     * @return the value of cms_movie.thump_down
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    public Long getThumpDown() {
        return thumpDown;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_movie.thump_down
     *
     * @param thumpDown the value for cms_movie.thump_down
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    public void setThumpDown(Long thumpDown) {
        this.thumpDown = thumpDown;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_movie.author_id
     *
     * @return the value of cms_movie.author_id
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    public Long getAuthorId() {
        return authorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_movie.author_id
     *
     * @param authorId the value for cms_movie.author_id
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_movie.category_id
     *
     * @return the value of cms_movie.category_id
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_movie.category_id
     *
     * @param categoryId the value for cms_movie.category_id
     *
     * @mbg.generated Thu Mar 19 14:37:05 CST 2020
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}