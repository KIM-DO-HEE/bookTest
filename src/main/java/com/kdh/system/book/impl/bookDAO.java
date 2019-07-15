package com.kdh.system.book.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kdh.system.book.bookVO;

@Repository
public class bookDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public int insertBook(bookVO vo)
	{
		return mybatis.insert("bookDAO.insertBook",vo);
	}
	
	public int updateBook(bookVO vo)
	{
		return mybatis.update("bookDAO.updateBook",vo);
	}
	
	public int deleteBook(bookVO vo)
	{
		return mybatis.delete("bookDAO.deleteBook",vo);
	}
	
	public bookVO getBook(bookVO vo)
	{
		return mybatis.selectOne("bookDAO.getBook",vo);
	}
	
	public List<bookVO> getBookList()
	{
		return mybatis.selectList("bookDAO.getBookList");
	}
	
	public List<bookVO> getStockBookList()
	{
		return mybatis.selectList("bookDAO.getStockBookList");
	}
	
	public bookVO getStockBook(bookVO vo)
	{
		return mybatis.selectOne("bookDAO.getStockBook",vo);
	}
	
}
