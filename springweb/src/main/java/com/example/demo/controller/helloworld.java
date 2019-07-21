package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller

//@RestController

public class helloworld {
	@RequestMapping("/hello")
	@ResponseBody
	public String HelloWorld() {
		return "hello world!";
	}

}
