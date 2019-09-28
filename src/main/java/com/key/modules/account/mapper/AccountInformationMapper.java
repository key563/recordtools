package com.key.modules.account.mapper;

import com.key.modules.account.model.AccountInformation;
import com.key.modules.sys.model.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface AccountInformationMapper extends Mapper<AccountInformation> {
    /**
     * 获取账号列表
     * @return
     */
    List<AccountInformation> findAllAccount();
}