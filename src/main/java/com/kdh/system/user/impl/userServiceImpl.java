package com.kdh.system.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kdh.system.user.companyVO;
import com.kdh.system.user.managerVO;
import com.kdh.system.user.userService;

@Service
public class userServiceImpl implements userService{
	@Autowired
	private userDAO dao;

	@Override
	public managerVO loginManager(managerVO vo) {
		// TODO Auto-generated method stub
		return dao.loginManager(vo);
	}

	@Override
	public int insertCompany(companyVO vo) {
		// TODO Auto-generated method stub
		return dao.insertCompany(vo);
	}

}
