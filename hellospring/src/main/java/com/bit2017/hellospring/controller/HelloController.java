package com.bit2017.hellospring.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	//얘도 비추천 
	@RequestMapping("/hello3")
	public ModelAndView hello3(
			@RequestParam(value="name", required=true, defaultValue="")String name){
		System.out.println(name);
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", name);
		mav.setViewName("/WEB-INF/views/hello.jsp");
		return mav;
	}

	//추천방식!!!!!!!!!!!!!!!!!!!!!!!!!!
	@RequestMapping("/hello")
	public String hello(
			@RequestParam(value="name", required=true, defaultValue="")
			String name,
			Model model
			){
		System.out.println(name);
		
		model.addAttribute("name", name);
		return "/WEB-INF/views/hello.jsp";
	}
	
	//비추천: 기술 침투는 바람직 하지않다.
	@RequestMapping("/hello2")
	public void hello2(HttpServletRequest request, PrintWriter out){
		String name = request.getParameter("name");
		out.println("<h1>hello" + name + "</h1>");
		
	}
}
