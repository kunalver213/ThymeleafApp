package com.kindsonthegenius.thymeleafapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kindsonthegenius.thymeleafapp.models.Jsons;
import com.kindsonthegenius.thymeleafapp.models.LfcContinue;
import com.kindsonthegenius.thymeleafapp.models.Student;
import com.kindsonthegenius.thymeleafapp.services.StudentService;



@Controller
@RequestMapping("/sap")
public class StudentController2 {
	
	
	@RequestMapping(value="/advtypelist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getAdvTypeList(@RequestBody String empId) {
		return new Jsons().advtypelist();
	}
	
	@RequestMapping(value="/advreasonlist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getAdvReasonList(@RequestBody String empId) {
		return new Jsons().advreasonlist();
	}
	
	@RequestMapping(value="/advdetailset", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getAdvDetails(@RequestBody String empId) {
		return new Jsons().advdetailset();
	}
	
	@RequestMapping(value="/advcurremi", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getAdvCurrEmi(@RequestBody String pernr,  String dlart,  String extdl) {
		return new Jsons().advcurremi();
	}
	
	@RequestMapping(value="/advrepayifsc", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getAdvRepayIfsc(@RequestBody String pernr,  String loanAccNo) {
		return new Jsons().advrepayifsc();
	}

	
	@RequestMapping(value="/advchangeemi", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String chnageEmi(@RequestBody String pernr,  String dlart,  String extdl, String newemi) {
		return new Jsons().advchangeemi();
	}
		
	/**
	 * LFC TFA 
	 */
	
	@RequestMapping(value="/lfcsetlist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getLfcSetList(@RequestBody String empId) {
		return new Jsons().getLfcSetList();
	}
	
	@RequestMapping(value="/lfcrellist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getLfcRelList(@RequestBody String pernr,  String lfsSetCCode) {
		return new Jsons().getLfcRelList();
	}
	
	@RequestMapping(value="/lfcsetdetaillist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getLfcSetDetailList(@RequestBody String empId) {
		return new Jsons().getLfcSetDetailList();
	}
	
	@RequestMapping(value="/lfcsetmoredetaillist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getLfcSetMoreDetailList(@RequestBody String pernr,  String fromDate,  String toDate) {
		return new Jsons().getLfcSetMoreDetailList();
	}
	
	@RequestMapping(value="/lfcschemelist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getLfcSchemeList(@RequestBody String empId) {
		return new Jsons().getLfcSchemeList();
	}
	
	
	@RequestMapping(value="/lfcentitlelist", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getLfcEntitleList(@RequestBody String empId) {
		return new Jsons().getLfcEntitleList();
	}
	
	
	@RequestMapping(value="/lfccontsubmit", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String onlfcContinue(@RequestBody LfcContinue lfc) {
		return new Jsons().onlfcContinue();
	}	
	
}
