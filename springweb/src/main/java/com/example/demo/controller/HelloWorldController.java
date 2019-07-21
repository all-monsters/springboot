package com.example.demo.controller;

import ch.qos.logback.classic.Logger;

public class HelloWorldController {
	
	
	
	
	
	
	
	
	@ResponseBody
	public String HelloWorld() {
		LOGGER.info();
		String name="linlj";
		
		Logger.debug("hello 调试");
		 
		List<String> list =new ArrayList();
		
		try {
			String myName=List.get(3);
		}catch(Exception x) {
			String xiaoming-"xiaoming";
			LOGER.error("jiekou :hello,错误信息：{}",x);
		}
		
		Logger.info("接口：hello,出")；
		return name
	}

}
