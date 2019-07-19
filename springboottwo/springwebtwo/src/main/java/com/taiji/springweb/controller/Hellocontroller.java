package com.taiji.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hellocontroller {
	
	@GetMapping(value="/hello")
   public String hello() {
	   
	   return "helloworld";
   }
}
