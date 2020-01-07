package com.cors.client.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    @RequestMapping("index")
    public String toIndex() {
        return "showcase/index";
    }

    /**
     * 演示输出
     *
     * @return
     */
    @RequestMapping("sayHello")
    public String sayHello() {
        return "服务端接收到参数";
    }
}
