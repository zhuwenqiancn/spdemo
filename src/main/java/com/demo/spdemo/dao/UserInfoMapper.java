package com.demo.spdemo.dao;

import com.demo.spdemo.entity.UserInfo;

public interface UserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     * @mbggenerated
     */
    int insert(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     * @mbggenerated
     */
    int insertSelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     * @mbggenerated
     */
    UserInfo selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     * @mbggenerated
     */
    int updateByPrimaryKey(UserInfo record);
}