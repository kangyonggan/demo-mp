package com.kangyonggan.mp.service.impl;

import com.kangyonggan.mp.entity.LoginLog;
import com.kangyonggan.mp.mapper.LoginLogMapper;
import com.kangyonggan.mp.service.ILoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录日志表 服务实现类
 * </p>
 *
 * @author kyg
 * @since 2020-11-27
 */
@Service
public class LoginLogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLog> implements ILoginLogService {

}
