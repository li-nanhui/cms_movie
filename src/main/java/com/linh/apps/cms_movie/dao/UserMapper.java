package com.linh.apps.cms_movie.dao;

import com.linh.apps.cms_movie.bean.User;
import com.linh.apps.cms_movie.bean.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_user
     *
     * @mbg.generated Sat Mar 21 20:30:03 CST 2020
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_user
     *
     * @mbg.generated Sat Mar 21 20:30:03 CST 2020
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_user
     *
     * @mbg.generated Sat Mar 21 20:30:03 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_user
     *
     * @mbg.generated Sat Mar 21 20:30:03 CST 2020
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_user
     *
     * @mbg.generated Sat Mar 21 20:30:03 CST 2020
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_user
     *
     * @mbg.generated Sat Mar 21 20:30:03 CST 2020
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_user
     *
     * @mbg.generated Sat Mar 21 20:30:03 CST 2020
     */
    User selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_user
     *
     * @mbg.generated Sat Mar 21 20:30:03 CST 2020
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_user
     *
     * @mbg.generated Sat Mar 21 20:30:03 CST 2020
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_user
     *
     * @mbg.generated Sat Mar 21 20:30:03 CST 2020
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_user
     *
     * @mbg.generated Sat Mar 21 20:30:03 CST 2020
     */
    int updateByPrimaryKey(User record);
}