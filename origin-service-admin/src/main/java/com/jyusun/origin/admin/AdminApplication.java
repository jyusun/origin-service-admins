package com.jyusun.origin.admin;

import com.jyusun.origin.core.common.constant.SystemConstant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 基础服务引导启动类
 *
 * @author jyusun at 2021-04-15 20:54:54
 */
@SpringBootApplication(scanBasePackages = SystemConstant.BASE_PACKAGE)
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

}
