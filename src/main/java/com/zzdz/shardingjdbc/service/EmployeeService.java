package com.zzdz.shardingjdbc.service;

import com.zzdz.shardingjdbc.entity.Employee;

public interface EmployeeService {
    Employee save(Employee employee);

    Employee findById(Long id);
}
