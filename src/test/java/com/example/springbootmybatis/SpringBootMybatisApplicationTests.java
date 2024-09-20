package com.example.springbootmybatis;

import com.example.springbootmybatis.mapper.UserMapper;
import com.example.springbootmybatis.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootMybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void testlistUser(){
        List<User> list =userMapper.list();
        list.forEach(user -> System.out.println(user));
    }


}
