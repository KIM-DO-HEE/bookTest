package com.kdh.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kdh.system.order.orderService;
import com.kdh.system.order.testVO;

@RestController
public class orderController {
	@Autowired
	private orderService service;
	
//	@RequestMapping(value="/addOrder")
//	public int addOrder(@RequestBody companyVO company, @RequestBody bookVO book)
//	{
//		return service.addOrderBook(company, book);
//	}
	
	
	@RequestMapping(value="/addOrder")
	public int addOrder(@RequestBody testVO vo)
	{
//		System.out.println(company);
//		System.out.println(vo);
		System.out.println("addOrder ø‰√ª");
		return service.addOrderBook(vo);
	}

}
