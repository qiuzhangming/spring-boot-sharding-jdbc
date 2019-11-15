package com.zzdz.shardingjdbc.dao;

import com.zzdz.shardingjdbc.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao {
    boolean save(Order order);

    List<Order> findByIds(@Param("ids") List<Long> ids);

    List<Order> findByIdsAndCreatTime(@Param("ids") List<Long> ids, @Param("sTime") Long sTime, @Param("eTime") Long eTime);
}
