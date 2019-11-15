package com.zzdz.shardingjdbc.service;

import com.zzdz.shardingjdbc.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    EmployeeService employeeService;

    @Test
    public void findById() {
        Employee employee1 = employeeService.findById(402044393562832896L);
        Employee employee2 = employeeService.findById(402044394464608256L);
        System.out.println(employee1);
        System.out.println(employee2);
    }

    @Test
    public void save() {
        for (int i = 0; i < 10; i++) {
            Employee employee = new Employee()
                    .setNickName("zs"+i)
                    .setAge(i)
                    .setAddTime(System.currentTimeMillis())
                    .setSalary(new BigDecimal(9999.12345678999))
                    ;
            Employee save = employeeService.save(employee);
            System.out.println(save);
        }
    }

    @Test
    public void findByIds() {
        List<Long> ids = new ArrayList<>();
        ids.add(402044393562832896L);
        ids.add(402044394913398785L);
        List<Employee> employees = employeeService.findByIds(ids);
        System.out.println(employees);
    }
}