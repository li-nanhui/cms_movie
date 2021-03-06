package com.linh.apps.cms_movie.dao;

import com.linh.apps.cms_movie.bean.Role_Privilege;
import com.linh.apps.cms_movie.bean.Role_PrivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Role_PrivilegeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_privilege
     *
     * @mbg.generated Wed Mar 11 18:14:01 CST 2020
     */
    long countByExample(Role_PrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_privilege
     *
     * @mbg.generated Wed Mar 11 18:14:01 CST 2020
     */
    int deleteByExample(Role_PrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_privilege
     *
     * @mbg.generated Wed Mar 11 18:14:01 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_privilege
     *
     * @mbg.generated Wed Mar 11 18:14:01 CST 2020
     */
    int insert(Role_Privilege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_privilege
     *
     * @mbg.generated Wed Mar 11 18:14:01 CST 2020
     */
    int insertSelective(Role_Privilege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_privilege
     *
     * @mbg.generated Wed Mar 11 18:14:01 CST 2020
     */
    List<Role_Privilege> selectByExample(Role_PrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_privilege
     *
     * @mbg.generated Wed Mar 11 18:14:01 CST 2020
     */
    Role_Privilege selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_privilege
     *
     * @mbg.generated Wed Mar 11 18:14:01 CST 2020
     */
    int updateByExampleSelective(@Param("record") Role_Privilege record, @Param("example") Role_PrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_privilege
     *
     * @mbg.generated Wed Mar 11 18:14:01 CST 2020
     */
    int updateByExample(@Param("record") Role_Privilege record, @Param("example") Role_PrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_privilege
     *
     * @mbg.generated Wed Mar 11 18:14:01 CST 2020
     */
    int updateByPrimaryKeySelective(Role_Privilege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_privilege
     *
     * @mbg.generated Wed Mar 11 18:14:01 CST 2020
     */
    int updateByPrimaryKey(Role_Privilege record);
}