package cn.git.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
    @RequestMapping("/test")
    public String test(){
        System.out.println("这是一个测试");

        return "hello2345";

    }
}
