package com.example.taiji.helloworld2.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloWorldController {
    private final static Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);
    @RequestMapping("/hello")
    @ResponseBody
    public String helloworld(){
        LOGGER.info("接口:hello 入");

        LOGGER.debug("接口:hello 调试");
        List<String> list=new ArrayList<>();

        try {
            String myname=list.get(3);
        }catch(Exception x) {
            String xiaoming="xiaoming";
            LOGGER.error("接口:hello 错误信息:{},执行者{} ",x,xiaoming);
        }
        LOGGER.info("接口:hello 出");
        return "hello world!!";
    }

    @GetMapping(value="/hi")
    public String hi(){
        LOGGER.info("接口:hi 入");

        LOGGER.debug("接口:hi 调试");
        List<String> list=new ArrayList<>();

        try {
            String myname=list.get(3);
        }catch(Exception x) {
            String xiaozhang="xiaozhang";
            LOGGER.error("接口:hi 错误信息:{},执行者{} ",x,xiaozhang);
        }
        LOGGER.info("接口:hi 出");
        return "/hi";
    }
}
