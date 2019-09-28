package com.key.modules.business.controller;

import com.key.modules.business.service.IBussinessInformationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 业务单Controller
 */
@RestController
@RequestMapping(value = "/businessInformation")
public class BussinessInformationController {

    private static final Logger logger = LoggerFactory.getLogger(BussinessInformationController.class);

    @Autowired
    IBussinessInformationService bussinessInformationService;


}
