package com.kdh.system.book.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kdh.system.book.bookService;
import com.kdh.system.book.bookVO;

@Service
public class bookServiceImpl implements bookService{

	@Autowired
	private bookDAO dao;
	//private orderDAO order;
	
	public int insertBook(bookVO vo) {
		return dao.insertBook(vo);
	}

	@Override
	public int updateBook(bookVO vo) {
		// TODO Auto-generated method stub
		return dao.updateBook(vo);
	}

	@Override
	public int deleteBook(bookVO vo) {
		// TODO Auto-generated method stub
		return dao.deleteBook(vo);
	}

	@Override
	public bookVO getBook(bookVO vo) {
		// TODO Auto-generated method stub
		return dao.getBook(vo);
	}

	@Override
	public List<bookVO> getBookList() {
		// TODO Auto-generated method stub
		return dao.getBookList();
	}
	
	@Override
	public List<bookVO> getStockBookList() {
		// TODO Auto-generated method stub
		return dao.getStockBookList();
	}

	@Override
	public bookVO getStockBook(bookVO vo) {
		// TODO Auto-generated method stub
		return dao.getStockBook(vo);
	}


}

