package com.kangyonggan.mp;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kangyonggan.mp.mapper.UserMapper;
import com.kangyonggan.mp.entity.User;
import com.kangyonggan.mp.service.IUserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

/**
 * @author kyg
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SampleTest {

    @Autowired
    private IUserService userService;

    @Autowired
    private UserMapper userMapper;

    /**
     * 测试查询
     */
    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

    /**
     * 测试分页
     */
    @Test
    public void testPage() {
        IPage<User> page = new Page<>();
        page = userService.selectPageVo(page);
        System.out.println(page);
    }
}
