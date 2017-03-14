package com.bit2017.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit2017.hellospring.vo.UserVo;

//@RequestMapping 메서드 단독 매핑
@Controller
public class UserController {
	
	
	@RequestMapping(value = "/user/join", method=RequestMethod.POST) //Post방식으로만 들어와야 할 때
	public String join(@ModelAttribute UserVo vo){
		//기술침투
		//대신 스프링에서 엔코딩 필터를 제공해 줌 web.xml에서
		//request.setCharacterEncoding("utf-8");  못씀 기술침투 안돼

		System.out.println(vo);
		
		return "redirect:/user/joinsuccess"; //hellospring- contextpath안 써 도 됨
	}
	
	@ResponseBody
	@RequestMapping("/user/joinsuccess")
	public String joinSuccess(){
		return"joinSuccess";
	}
	
	
	@ResponseBody
	@RequestMapping("/user/loginform")
	public String loginform(){
		return "loginform";
	}

	
	@RequestMapping("/user/joinform")
	public String joinForm(
			){
		
		return "/WEB-INF/views/joinform.jsp";
	}

	
	@ResponseBody
	@RequestMapping("/user/login")
	public String login(
//			@AuthUser UserVo authUser,
			@RequestParam("id") String id,
			@RequestParam("pwd") String password){
		return "login   "+id + ":"+password;
	}
	
	@ResponseBody
	@RequestMapping("/user/login2")
	public String login2(
			@RequestParam(value="id", required=true, defaultValue="") String id,
			@RequestParam(value="pwd", required=true, defaultValue="") String password,
			@RequestParam (value="no", required=true, defaultValue="-1") Long no){
		return "login   "+id + ": "+password+":"+no;
	}
	
	@ResponseBody
	@RequestMapping("/user/login3")
	public String login3(
			@RequestParam String id, 	//파라미터이름과 값을 저장할 변수 이름이 같으면 생략가능
			@RequestParam("pwd") String password){  //여기는 이름이 다르니까 생략 안됨
		return "login   "+id + ":"+password;
	}
}
