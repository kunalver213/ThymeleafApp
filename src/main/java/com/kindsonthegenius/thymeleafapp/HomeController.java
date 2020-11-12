package com.kindsonthegenius.thymeleafapp;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String test() {
		return "index";
	}

	@RequestMapping("/abc")
	public String test1() {
		return "abc";
	}
	
	@RequestMapping(value="/advdetails" , method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String getAdvDetails(){
		
		return "xxx";
	}

}
