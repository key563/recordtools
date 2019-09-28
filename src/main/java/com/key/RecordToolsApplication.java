package com.key;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@AutoConfigurationPackage
@MapperScan({"com.key.modules.*.mapper","tk.mybatis.mapper.common.Mapper"})
public class RecordToolsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecordToolsApplication.class, args);
        RecordToolsApplication m = new RecordToolsApplication();
    }

}
