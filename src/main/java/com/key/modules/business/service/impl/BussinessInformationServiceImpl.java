package com.key.modules.business.service.impl;

import com.key.modules.business.mapper.BussinessInformationMapper;
import com.key.modules.business.service.IBussinessInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bussinessInformationService")
public class BussinessInformationServiceImpl implements IBussinessInformationService{

    @Autowired
    BussinessInformationMapper bussinessInformationMapper;


}
