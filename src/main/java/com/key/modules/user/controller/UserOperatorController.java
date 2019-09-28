package com.key.modules.user.controller;

import com.key.modules.user.service.IUserOperatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户信息Controller
 *
 */
@RestController
@RequestMapping(value = "/userOperator")
public class UserOperatorController {

    private static final Logger logger = LoggerFactory.getLogger(UserOperatorController.class);

    @Autowired
    IUserOperatorService userOperatorService;


}
