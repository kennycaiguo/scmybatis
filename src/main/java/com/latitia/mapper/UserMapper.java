package com.latitia.mapper;

import com.latitia.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description xml方式和注解方式混合
 * @Author: guxiao
 * @Date: 2019/9/7 10:53
 */
@Component
public interface UserMapper {
    List<User> find();

    @Select("select * from user where id=#{id}")
    User get(@Param("id") Integer id);

    @Insert("insert into user(name,birthday,address) values(#{user.name},#{user.birthday},#{user.address})")
    void insert(@Param("user") User user);

    @Update("update user set name=#{user.name},birthday=#{user.birthday},address=#{user.address} where id=#{user.id}")
    void update(@Param("user") User user);

    @Delete("delete from user where id=#{id}")
    void delete(@Param("id") Integer id);
}
