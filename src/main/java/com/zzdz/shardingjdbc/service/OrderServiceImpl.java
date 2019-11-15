package com.zzdz.shardingjdbc.service;

import com.zzdz.shardingjdbc.dao.OrderDao;
import com.zzdz.shardingjdbc.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDao orderDao;

    @Override
    public Order save(Order order) {
        orderDao.save(order);
        return order;
    }

    @Override
    public List<Order> findByIds(List<Long> ids) {
        return orderDao.findByIds(ids);
    }

    @Override
    public List<Order> findByIdsAndCreatTime(List<Long> ids, Long sTime, Long eTime) {
        return orderDao.findByIdsAndCreatTime(ids, sTime, eTime);
    }
}
