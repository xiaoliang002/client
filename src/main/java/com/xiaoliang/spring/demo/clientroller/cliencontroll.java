package com.xiaoliang.spring.demo.clientroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class cliencontroll {
//    打印端口
    @Value("${server.port}")
    private String port;
    @GetMapping("/msg")
    @ResponseBody
    public String msg(){
        return "xiaoliang" + port;
    }
}
