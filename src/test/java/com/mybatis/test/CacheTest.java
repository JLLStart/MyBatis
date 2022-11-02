package com.mybatis.test;

import com.mybatis.bean.Emp;
import com.mybatis.mapper.CacheMapper;
import com.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author JLLStart
 * 2022/11/2 19:12
 */
public class CacheTest {
    /**
     * 测试一级缓存
     */
    @Test
    public void testCache1(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp emp1 = mapper.getEmpById(1);
        System.out.println(emp1);
        Emp emp2 = mapper.getEmpById(1);
        System.out.println(emp2);
    }
}
