package com.latitia.service;

import com.latitia.pojo.User;

import java.util.List;

/**
 * @ClassName UserService
 * @Description
 * @Author: guxiao
 * @Date: 2019/9/7 10:54
 */
public interface UserService {
    List<User> find();
    User get(Integer id);
    void insert(User user);
    void update(User user);
    void delete(Integer id);
}
