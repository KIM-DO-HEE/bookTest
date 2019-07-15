package com.kdh.system.order.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kdh.system.order.orderVO;
import com.kdh.system.order.testVO;

@Repository
public class orderDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public int addOrderBook(orderVO vo)
	{
		System.out.println("mybatis addOrderBook");
		return mybatis.insert("orderDAO.addOrderBook",vo);
	}
	
	public int addOrderDetail(testVO vo)
	{
		System.out.println("mybatis addOrderDetail");
		//System.out.println(map.get("isbn"));
		return mybatis.insert("orderDAO.addOrderDetail", vo);
	}

}
