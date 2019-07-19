package com.gp.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloWorldController {

    private final static Logger LOGGER= LoggerFactory.getLogger(HelloWorldController.class);
    @RequestMapping(value="/hello")
    @ResponseBody
    public String HelloWorld() {
        LOGGER.info("接口：hello，入");
        String helloworld="helloworld";

        LOGGER.debug("接口：hello，调试");
        List<String> list=new ArrayList();
        try {
            String myName = list.get(3);
        }catch (Exception ex){
            String xiaoming="xiaoming";
            LOGGER.error("接口:hello，错误信息:{},执行者:{}",ex,xiaoming);
        }
        LOGGER.info("接口：hello，出");
        return helloworld;
    }
    @GetMapping("/hi")
   public String Hi(){
        return "hi";
   }
}

