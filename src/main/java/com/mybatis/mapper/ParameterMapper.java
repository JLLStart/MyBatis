package com.mybatis.mapper;

import com.mybatis.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author JLLStart
 * 2022/10/27 20:17
 */
public interface ParameterMapper {

    /**
     * 根据username获取User
     * @param username
     * @return
     */
    User getUserByUsername(String username);

    /**
     * 获取所有User
     * @return
     */
    List<User> getAllUser();


    /**
     * 验证登录
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username, String password);

    /**
     *
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 使用@param注解
     * @param username
     * @param password
     * @return
     */
    User checkLoginByParam(@Param("username") String username,@Param("password") String password);
}
