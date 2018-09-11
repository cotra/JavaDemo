package com.silvertb.mapper;

import com.silvertb.entity.User;
import com.silvertb.utils.Common;
import com.silvertb.utils.Time;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.security.provider.MD5;

import java.sql.Timestamp;
import java.util.Date;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindByPK() {
        System.out.println(userMapper.findByPK(18).getUsername());
    }

    @Test
    public void testSave() {
        User user = new User(null, "test2", Common.toMD5("sdfsdf"), "1500526845", "fws1ef@qq.com", Time.dateToTimestamp(), Time.dateToTimestamp());
        userMapper.save(user);
        System.out.println(user.getId());
    }
}
