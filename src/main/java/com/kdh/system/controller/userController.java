package com.kdh.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kdh.system.user.companyVO;
import com.kdh.system.user.managerVO;
import com.kdh.system.user.userService;

@RestController
public class userController {
	@Autowired
	private userService service;
	
	@RequestMapping(value="/loginManager")
	public @ResponseBody String loginManager(@RequestBody managerVO vo)
	{
		managerVO result =  service.loginManager(vo);
		if(result == null)
		{
			return "login fail";
		}else {
			return "login success";
		}
	}
	
	@RequestMapping(value="/insertCompany", method = RequestMethod.POST)
	public @ResponseBody String insertCompany(@RequestBody companyVO vo)
	{
		int result = service.insertCompany(vo);
		if(result == 0)
		{
			return "insertCompany fail";
		}else {
			return "insertCompany success";
		}
	}
}
