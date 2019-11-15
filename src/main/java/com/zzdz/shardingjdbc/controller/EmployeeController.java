package com.zzdz.shardingjdbc.controller;

import com.zzdz.shardingjdbc.entity.Employee;
import com.zzdz.shardingjdbc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/save")
    public Employee save(Employee employee) {
        System.out.println("创建用户："+employee);
        return employeeService.save(employee);
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable("id") Long id) {
        return employeeService.findById(id);
    }

    @PostMapping("/findByIds")
    List<Employee> findByIds(@RequestBody List<Long> ids) {
        return employeeService.findByIds(ids);
    }


}
