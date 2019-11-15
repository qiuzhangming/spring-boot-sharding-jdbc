package com.zzdz.shardingjdbc.controller;

import com.zzdz.shardingjdbc.entity.Order;
import com.zzdz.shardingjdbc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//http://192.168.1.237:8080/swagger-ui.html
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/")
    Order save(Order order){
        return orderService.save(order);
    }

    @PostMapping("/findByIds")
    List<Order> findByIds(@RequestBody List<Long> ids) {
        return orderService.findByIds(ids);
    }

    @PostMapping("/findByIdsAndCreatTime")
    List<Order> findByIdsAndCreatTime(@RequestBody List<Long> ids, Long sTime, Long eTime) {
        return orderService.findByIdsAndCreatTime(ids,sTime,eTime);
    }
}
