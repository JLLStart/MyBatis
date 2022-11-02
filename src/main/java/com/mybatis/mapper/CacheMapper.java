package com.mybatis.mapper;

import com.mybatis.bean.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author JLLStart
 * 2022/11/2 19:07
 */
public interface CacheMapper {
    /**
     * 测试一级缓存
     */
    Emp getEmpById(@Param("eid") Integer eid);
}
