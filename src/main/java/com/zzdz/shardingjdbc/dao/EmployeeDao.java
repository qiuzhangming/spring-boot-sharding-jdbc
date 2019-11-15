package com.zzdz.shardingjdbc.dao;

import com.zzdz.shardingjdbc.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {

    boolean save(Employee employee);

    Employee findById(Long id);

    List<Employee> findByIds(@Param("ids") List<Long> ids);
}
