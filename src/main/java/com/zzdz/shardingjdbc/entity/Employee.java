package com.zzdz.shardingjdbc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Accessors(chain = true)
public class Employee {

    private Long id;

    private String nickName;

    private Integer age;

    private BigDecimal salary;

    private Long addTime;
}
