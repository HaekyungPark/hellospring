package com.bit2017.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/board/*") 		//  	/* -자동으로 메소드 이름으로 메핑됩니당
public class BoardController {
	
	@ResponseBody
	@RequestMapping
	public String list(){
		return "list";
	}
	
	@ResponseBody
	@RequestMapping
	public String write(){
		return "write";
	}
	
	@ResponseBody
	@RequestMapping
	public String delete(){
		return "delete";
	}
}
