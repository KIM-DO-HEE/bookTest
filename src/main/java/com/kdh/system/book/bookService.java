package com.kdh.system.book;

import java.util.List;

import org.springframework.stereotype.Service;

public interface bookService {
	public int insertBook(bookVO vo);
	public int updateBook(bookVO vo);
	public int deleteBook(bookVO vo);
	public bookVO getBook(bookVO vo);
	public List<bookVO> getBookList();
	public List<bookVO> getStockBookList();
	public bookVO getStockBook(bookVO vo);
	
}
