package com.kangyonggan.mp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.kangyonggan.mp.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author kyg
 * @since 2020-11-27
 */
public interface IUserService extends IService<User> {

    /**
     * 分页查询
     *
     * @param page
     * @return
     */
    IPage<User> selectPageVo(IPage<User> page);
}
