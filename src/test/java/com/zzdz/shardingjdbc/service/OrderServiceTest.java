package com.zzdz.shardingjdbc.service;

import com.zzdz.shardingjdbc.entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTest {

    @Autowired
    OrderService orderService;

    @Test
    public void save() {
        for (int i = 1; i <= 10; i++) {
            Order order = new Order()
                    .setId((long) i)
                    .setName("order")
                    .setCreatTime(System.currentTimeMillis() / 1000)
                    ;
            orderService.save(order);
        }
    }

    @Test
    public void findByIds() {
        List<Long> ids = new ArrayList<>();
        ids.add(402061686539812864L);

        List<Order> orders = orderService.findByIds(ids);
        System.out.println(orders);
    }

    @Test
    public void findByIdsAndCreatTime() {
        List<Long> ids = new ArrayList<>();
        ids.add(402068251548319745L);

        List<Order> orders = orderService.findByIdsAndCreatTime(ids,1573790140L,1573790219L);
        System.out.println(orders);
    }
}