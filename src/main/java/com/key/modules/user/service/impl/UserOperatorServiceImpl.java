package com.key.modules.user.service.impl;

import com.key.modules.user.mapper.UserOperatorMapper;
import com.key.modules.user.service.IUserOperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户信息Service
 */
@Service("userOperatorService")
public class UserOperatorServiceImpl implements IUserOperatorService {

    @Autowired
    UserOperatorMapper userOperatorMapper;


}
