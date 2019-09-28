package com.key.modules.account.service;


import com.github.pagehelper.PageInfo;
import com.key.modules.account.model.AccountInformation;
import com.key.modules.sys.model.User;

public interface IAccountInformationService {
    /**
     * 分野获取所有账号信息
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<AccountInformation> findAllAccount(int pageNum, int pageSize);
}
