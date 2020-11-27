package com.kangyonggan.mp.service.impl;

import com.kangyonggan.mp.entity.User;
import com.kangyonggan.mp.mapper.UserMapper;
import com.kangyonggan.mp.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author kyg
 * @since 2020-11-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
