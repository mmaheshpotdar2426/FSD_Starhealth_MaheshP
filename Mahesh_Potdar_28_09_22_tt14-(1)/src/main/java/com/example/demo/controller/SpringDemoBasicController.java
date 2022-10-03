package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class SpringDemoBasicController {

	@RequestMapping("hello")
	@ResponseBody
	public String star() {
		return "Hello Star Health....";
	}
	
	@RequestMapping(value="get",method = RequestMethod.GET)
	@ResponseBody
	public String getInfo() {
		return "Inforamation from server recieved.....";
	}
}
