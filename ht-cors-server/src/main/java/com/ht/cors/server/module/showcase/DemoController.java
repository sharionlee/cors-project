package com.ht.cors.server.module.showcase;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 演示示例
 *
 * @author Administrator
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    /**
     * 演示输出
     *
     * @param keyWords 接口入参
     * @return
     */
    @RequestMapping(value = "sayHello", method = RequestMethod.GET)
    public String sayHello(String keyWords) {
        return "服务端接收到参数：" + keyWords;
    }
}
