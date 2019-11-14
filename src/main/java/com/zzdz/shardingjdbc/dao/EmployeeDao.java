package com.zzdz.shardingjdbc.dao;

import com.zzdz.shardingjdbc.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

public interface EmployeeDao {
    boolean save(Employee employee);

    Employee findById(Long id);
}
