package com.dpc.demo;

import com.dpc.demo.pojo.User;
import com.dpc.demo.utils.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class RedisSpringbootDemoApplicationTests {

    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate redisTemplate;

    @Autowired
    RedisUtil redisUtil;

    @Test
    public void test() {
       User user = new User("杜鹏程",26);
        redisTemplate.opsForValue().set("user",user);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }

    @Test
    public void test1(){
        redisUtil.set("user","lihaiyan");
        System.out.println(redisUtil.get("user"));
    }

}
