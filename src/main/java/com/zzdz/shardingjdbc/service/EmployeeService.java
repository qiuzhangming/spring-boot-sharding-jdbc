package com.zzdz.shardingjdbc.service;

import com.zzdz.shardingjdbc.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);

    Employee findById(Long id);

    List<Employee> findByIds(List<Long> ids);
}
