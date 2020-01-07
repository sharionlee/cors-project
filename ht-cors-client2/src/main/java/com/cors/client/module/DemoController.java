package com.cors.client.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 */
@Controller
@RequestMapping("demo")
public class DemoController {

    @Autowired
    @RequestMapping("index")
    public String toIndex(){
        return "showcase/index";
    }
}
