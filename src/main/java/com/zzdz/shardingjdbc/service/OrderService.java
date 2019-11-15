package com.zzdz.shardingjdbc.service;

import com.zzdz.shardingjdbc.entity.Order;

import java.util.List;

public interface OrderService {
    Order save(Order order);

    List<Order> findByIds(List<Long> ids);

    List<Order> findByIdsAndCreatTime(List<Long> ids, Long sTime, Long eTime);

}
