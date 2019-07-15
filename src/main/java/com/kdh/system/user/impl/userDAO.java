package com.kdh.system.user.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kdh.system.user.companyVO;
import com.kdh.system.user.managerVO;

@Repository
public class userDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public managerVO loginManager(managerVO vo)
	{
		return mybatis.selectOne("userDAO.loginManager", vo);
	}
	
	public int insertCompany(companyVO vo)
	{
		return mybatis.insert("userDAO.insertCompany",vo);
	}
}
