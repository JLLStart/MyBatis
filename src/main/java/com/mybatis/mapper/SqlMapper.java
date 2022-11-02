package com.mybatis.mapper;

import com.mybatis.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author JLLStart
 * 2022/10/28 12:49
 */
public interface SqlMapper {

    /**
     * 根据用户名模糊查询
     */
    List<User> getUserByLike(@Param("username") String username);

    /**
     * 批量删除
     */
    int deleteMore(@Param("ids") String ids);

}
