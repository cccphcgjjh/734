package com.itheima.pojo;

import java.util.List;

/**
 * ClassName:User
 * Package:com.itheima.pojo
 * Description:
 *
 * @Author 张皓然
 * @Create 2024/10/8 19:40
 * @Version 1.0
 */
public class User {
    private Integer id;
    private String username;
    private Integer age;

    //当前用户存在哪些订单
    private List<Order> orderList;

    //当前用户具备哪些角色
    private List<Role> roleList;

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //一对多
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", orderList=" + orderList +
                '}';
    }

    /*//多对多
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", roleList=" + roleList +
                '}';
    }*/
}
