package cn.demo.service0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2016/11/21 23:01
 * @Description:
 */
@SpringBootApplication(scanBasePackages = "cn.demo.service0")
@EnableEurekaClient
@EnableWebMvc
public class Service0Application {

    public static void main(String[] args) {
        SpringApplication.run(Service0Application.class, args);
    }
}
