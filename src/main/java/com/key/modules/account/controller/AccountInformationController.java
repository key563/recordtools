package com.key.modules.account.controller;

import com.github.pagehelper.PageInfo;
import com.key.modules.account.model.AccountInformation;
import com.key.modules.account.service.IAccountInformationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 账号信息Controller
 *
 */
@RestController()
@RequestMapping(value = "/accountInformation")
public class AccountInformationController {

    private static final Logger logger = LoggerFactory.getLogger(AccountInformationController.class);

    @Autowired
    private IAccountInformationService accountInformationService;

    @GetMapping(value = "/test")
    public String test() {
        logger.info("test");
        return "success";
    }

    @RequestMapping(value = "/all/{pageNum}/{pageSize}")
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        PageInfo<AccountInformation> userList = accountInformationService.findAllAccount(pageNum,pageSize);
        return userList;
    }
}
