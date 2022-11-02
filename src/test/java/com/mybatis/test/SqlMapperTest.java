package com.mybatis.test;

import com.mybatis.mapper.SqlMapper;
import com.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author JLLStart
 * 2022/10/28 12:53
 */
public class SqlMapperTest {

    @Test
    public void testSqlMapper(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        System.out.println(mapper.getUserByLike("admin"));
    }

    @Test
    public void testDeleteMore(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        System.out.println(mapper.deleteMore("1,2,3,4,5,6"));
    }


}
