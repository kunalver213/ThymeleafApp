package com.kindsonthegenius.thymeleafapp;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String test() {
		return "index";
	}

	@RequestMapping(value="/abc", produces = "application/json")
	public String test1() {
		return "{ \"empId\" :	\"123\" }";
	}
	
	@GetMapping("/abc1")
	String abc() {
		return "abc";
	}

}
