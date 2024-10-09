package com.itheima.mapper;

import com.itheima.pojo.Role;
import com.itheima.pojo.User;

import java.util.List;

/**
 * ClassName:UserMapper
 * Package:com.itheima.mapper
 * Description:
 *
 * @Author 张皓然
 * @Create 2024/10/8 19:41
 * @Version 1.0
 */
public interface UserMapper {
    public List<User> findAll();

    public List<User> findUserAndRoleAll();
}
