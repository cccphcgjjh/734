package com.itheima.pojo;

import java.util.Date;

/**
 * ClassName:Order
 * Package:com.itheima.pojo
 * Description:
 *
 * @Author 张皓然
 * @Create 2024/10/8 20:19
 * @Version 1.0
 */
public class Order {
    private Integer id;
    private Date odertime;
    private Double total;
    //在数据库中表与表之间的关系是通过主外键实现的，但是在Java中实体与实体之间的关系是通过实体的引用实现的
    //当前订单属于哪一个用户
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOdertime() {
        return odertime;
    }

    public void setOdertime(Date odertime) {
        this.odertime = odertime;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", odertime=" + odertime +
                ", total=" + total +
                ", user=" + user +
                '}';
    }
}
