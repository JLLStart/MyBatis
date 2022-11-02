package com.mybatis.mapper;

import com.mybatis.bean.User;

import java.util.List;

/**
 * @author JLLStart
 * 2022/10/27 16:38
 */
public interface UserMapper {

    /**
     *  添加用户信息
     * @return
     */
    int insertUser();


    void updateUser();


    /**
     * 根据id查询
     * @return
     */
    User getUserById();


    /**
     * 查询所有
     */
    List<User> getAllUser();
}
