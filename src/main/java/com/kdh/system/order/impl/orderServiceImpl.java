package com.kdh.system.order.impl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kdh.system.order.orderDetailVO;
import com.kdh.system.order.orderService;
import com.kdh.system.order.orderVO;
import com.kdh.system.order.testVO;

@Service("orderService")
public class orderServiceImpl implements orderService {
	@Autowired
	private orderDAO orderdao;

	@Override
	public int addOrderBook(testVO vo) {
		// TODO Auto-generated method stub
//		System.out.println("Service -> company"+company);
//		System.out.println("Service -> book"+book);
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		orderVO ordervo = new orderVO();
		orderDetailVO orderdetail = new orderDetailVO();
		
//		ordervo.setCompanyId(company.getId());
//		System.out.println(company.getId());
		ordervo.setCompanyId(vo.getId());
		System.out.println("company 등록");
		
		int result = orderdao.addOrderBook(ordervo);
		
		System.out.println("companyId 등록 후 id"+ordervo.getCompanyId());
		
		if (result == 0) {
			return 0;
		} else {
//			System.out.println("service -> orderDetail");
//			System.out.println(vo.getIsbn());
//			orderdetail.setIsbn(vo.getIsbn());
//			orderdetail.setBookName(vo.getBookName());
//			orderdetail.setType("발송신청");
//			
//			System.out.println(ordervo.getCompanyId());
//			map.put("companyId", ordervo.getCompanyId());
//			map.put("isbn", orderdetail.getIsbn());
//			map.put("bookName", orderdetail.getBookName());
//			map.put("type", orderdetail.getType());
			
			return orderdao.addOrderDetail(vo);	
		}
		
		// orderdao.addOrderDetail(vo);
	}
}
