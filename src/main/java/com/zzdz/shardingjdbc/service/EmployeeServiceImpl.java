package com.zzdz.shardingjdbc.service;

import com.zzdz.shardingjdbc.dao.EmployeeDao;
import com.zzdz.shardingjdbc.entity.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public Employee save(Employee employee) {
        employeeDao.save(employee);
        return employee;
    }

    @Override
    public Employee findById(Long id) {
        return employeeDao.findById(id);
    }
}
