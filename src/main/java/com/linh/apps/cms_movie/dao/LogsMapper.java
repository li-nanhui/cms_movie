package com.linh.apps.cms_movie.dao;

import com.linh.apps.cms_movie.bean.Logs;
import com.linh.apps.cms_movie.bean.LogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_logs
     *
     * @mbg.generated Tue Apr 07 15:11:25 CST 2020
     */
    long countByExample(LogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_logs
     *
     * @mbg.generated Tue Apr 07 15:11:25 CST 2020
     */
    int deleteByExample(LogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_logs
     *
     * @mbg.generated Tue Apr 07 15:11:25 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_logs
     *
     * @mbg.generated Tue Apr 07 15:11:25 CST 2020
     */
    int insert(Logs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_logs
     *
     * @mbg.generated Tue Apr 07 15:11:25 CST 2020
     */
    int insertSelective(Logs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_logs
     *
     * @mbg.generated Tue Apr 07 15:11:25 CST 2020
     */
    List<Logs> selectByExampleWithBLOBs(LogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_logs
     *
     * @mbg.generated Tue Apr 07 15:11:25 CST 2020
     */
    List<Logs> selectByExample(LogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_logs
     *
     * @mbg.generated Tue Apr 07 15:11:25 CST 2020
     */
    Logs selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_logs
     *
     * @mbg.generated Tue Apr 07 15:11:25 CST 2020
     */
    int updateByExampleSelective(@Param("record") Logs record, @Param("example") LogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_logs
     *
     * @mbg.generated Tue Apr 07 15:11:25 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") Logs record, @Param("example") LogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_logs
     *
     * @mbg.generated Tue Apr 07 15:11:25 CST 2020
     */
    int updateByExample(@Param("record") Logs record, @Param("example") LogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_logs
     *
     * @mbg.generated Tue Apr 07 15:11:25 CST 2020
     */
    int updateByPrimaryKeySelective(Logs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_logs
     *
     * @mbg.generated Tue Apr 07 15:11:25 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(Logs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_logs
     *
     * @mbg.generated Tue Apr 07 15:11:25 CST 2020
     */
    int updateByPrimaryKey(Logs record);
}