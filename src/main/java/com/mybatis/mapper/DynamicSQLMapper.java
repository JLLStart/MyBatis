package com.mybatis.mapper;

/**
 * @author JLLStart
 * 2022/11/1 20:11
 */

import com.mybatis.bean.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 动态SQL
 */
public interface DynamicSQLMapper {
    /**
     * 多条件查询
     */
    List<Emp> getEmpByCondition(Emp emp);

    /**
     * 测试 choose  when  otherwise
     */
    List<Emp> getEmpByChoose(Emp emp);

    /**
     * foreach 批量删除
     */
    int deleteMoreByArray(@Param("eids") Integer[] eids);

}
