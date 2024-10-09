package com.itheima.mapper;

import com.itheima.pojo.Order;

import java.util.List;

/**
 * ClassName:OrderMapper
 * Package:com.itheima.mapper
 * Description:
 *
 * @Author 张皓然
 * @Create 2024/10/8 20:30
 * @Version 1.0
 */
public interface OrderMapper {
    public List<Order> findAll();
}
