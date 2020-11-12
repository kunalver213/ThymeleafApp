package com.kindsonthegenius.thymeleafapp;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.client.ClientProtocolException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rbi.errorhandler.RBIException;
import com.rbi.pojo.AdvancesDetails;
import com.rbi.pojo.Employee;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String test() {
		return "index";
	}
	
	@RequestMapping(value="/advdetails" , method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String getAdvDetails(){
		
		return "xxx";
	}

}
