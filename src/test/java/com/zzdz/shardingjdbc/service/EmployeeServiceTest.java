package com.zzdz.shardingjdbc.service;

import com.zzdz.shardingjdbc.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    EmployeeService employeeService;

    @Test
    public void findById() {
        Employee employee = employeeService.findById(401777196001132545L);
        System.out.println(employee);
    }

    @Test
    public void save() {

        for (int i = 0; i < 20; i++) {
            Employee employee = new Employee()
                    .setNickName("zs"+i)
                    .setAge(i)
                    .setAddTime(System.currentTimeMillis())
                    .setSalary(new BigDecimal(9999.123456789))
                    ;

            Employee save = employeeService.save(employee);
            System.out.println(save);
        }
    }
}