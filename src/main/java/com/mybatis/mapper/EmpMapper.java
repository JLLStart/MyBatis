package com.mybatis.mapper;

import com.mybatis.bean.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author JLLStart
 * 2022/10/30 18:55
 */
public interface EmpMapper {
    /**
     *  所有Emp
     */
    List<Emp> getAllEmp();


    /**
     * 获取Emp和Dept
     */
    List<Emp> getEmpAndDept();


    /**
     * 分步查询
     *  1.查询员工信息
     */
    Emp getEmpAndDeptByStepOne(@Param("eid") Integer eid);

    /**
     * 分步查询
     *  2.查询部门信息
     */
    Emp getDeptAndEmpByStepTwo(@Param("did") Integer did);
}
