package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {

	private final static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);
	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public String HelloWorld() {
		LOGGER.info("");
		String name = "";

		LOGGER.debug("hi 调试");

		List<String> list = new ArrayList();
		try {
			//String myName=list.get(3);
		} catch (Exception x) {
			String xiaoming = "xiaoming";
			LOGGER.error("接口 :hello,错误信息：{}", x);
		}
		LOGGER.info("接口：hi,出");
		return "hi";
	}
	
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/hellow")
	 // @ GetMapping(value="/hello")
	  @ResponseBody
	public String HelloWorld2() {
		LOGGER.info("");
		String name = "字符串";

		LOGGER.debug("hi2 调试");

		List<String> list = new ArrayList();
		try {
			 String myName=list.get(3); 
		} catch (Exception x) {
			String xiaoming = "xiaoming";
			LOGGER.error("接口 :hello,错误信息：{}", x);
		}
		LOGGER.info("接口：hi2,出");
		return "hello world";
	
	}
}