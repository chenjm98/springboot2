package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springboot2
 * @Package: com.atguigu.boot.controller
 * @ClassName: HelloController
 * @Author: chenjm
 * @Description:
 * @Date: 2022/7/26 23:47
 */

@Controller
public class HelloController {

    @RequestMapping("/aaaa")
    public String hello(){
        System.out.println("hello");
        return "success";
    }
}
