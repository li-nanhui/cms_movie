package com.linh.apps.cms_movie.bean;

public class Test {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.id
     *
     * @mbg.generated Wed Mar 11 17:03:30 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.name
     *
     * @mbg.generated Wed Mar 11 17:03:30 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.age
     *
     * @mbg.generated Wed Mar 11 17:03:30 CST 2020
     */
    private Integer age;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test.id
     *
     * @return the value of test.id
     *
     * @mbg.generated Wed Mar 11 17:03:30 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test.id
     *
     * @param id the value for test.id
     *
     * @mbg.generated Wed Mar 11 17:03:30 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test.name
     *
     * @return the value of test.name
     *
     * @mbg.generated Wed Mar 11 17:03:30 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test.name
     *
     * @param name the value for test.name
     *
     * @mbg.generated Wed Mar 11 17:03:30 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test.age
     *
     * @return the value of test.age
     *
     * @mbg.generated Wed Mar 11 17:03:30 CST 2020
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test.age
     *
     * @param age the value for test.age
     *
     * @mbg.generated Wed Mar 11 17:03:30 CST 2020
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}