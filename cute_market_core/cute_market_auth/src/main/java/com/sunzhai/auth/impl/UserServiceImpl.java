package com.sunzhai.auth.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunzhai.auth.entity.User;
import com.sunzhai.auth.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhai
 * @since 2020-04-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
