package com.kdh.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kdh.system.book.bookService;
import com.kdh.system.book.bookVO;

@RestController
public class bookController {
	@Autowired
	private bookService service;

//	@RequestMapping(value = "/")
//	public String test() {
//		return "index";
//	}

	
//	@PostMapping
//	public int add(@RequestBody bookVO vo)
//	{
//		int book = service.insertBook(vo);
//		return book;
//	}
	// ���� �߰�
	@RequestMapping(value = "/insertBook", method = RequestMethod.POST)
	public @ResponseBody String insertBook(@RequestBody bookVO vo) {
		int result = service.insertBook(vo);

		System.out.println(vo.getBookName());
		if (result == 0) {
			return "insert book fail";
		} else {
			return "insert book success";
		}
		// return "index";

	}
//	@PutMapping
//	public String update(@RequestBody bookVO vo)
//	{
//		int result = service.updateBook(vo);
//		if (result == 0) {
//			return "fail";
//		} else {
//			return "success";
//		}
//	}
	 //���� ����
	@RequestMapping(value = "/updateBook", method = RequestMethod.POST)
	public @ResponseBody String updateBook(@RequestBody bookVO vo) {
		int result = service.updateBook(vo);
		if (result == 0) {
			return "fail";
		} else {
			return "success";
		}

	}
	
//	@DeleteMapping("/{isbn}")
//	public String delete(@PathVariable("isbn") bookVO vo)
//	{
//		 int result = service.deleteBook(vo);
//		 if (result == 0) {
//				return "fail";
//			} else {
//				return "success";
//			}
//	}
//	 ���� ����
	@RequestMapping(value = "/deleteBook")
	public String deleteBook(@RequestBody bookVO vo) {
		int result = service.deleteBook(vo);
		if (result == 0) {
			return "fail";
		} else {
			return "success";
		}

	}

	// Ư�� ���� ��ȸ
	@RequestMapping(value = "/getBook")
	public bookVO getBook(@RequestBody bookVO vo) {
		bookVO result = service.getBook(vo);

		return result;

	}

//	@GetMapping
//	public List<bookVO> getBookList(){
//		return service.getBookList();
//	}
	// ���� ����Ʈ ��ȸ
	@RequestMapping(value = "/getBookList")
	public List<bookVO> getBookList() {
		System.out.println("���� ����Ʈ ��ȸ");
		List<bookVO> result = service.getBookList();
//		JSONArray jsonArray = new JSONArray();
//		jsonArray.fromObject(result);
		if (result == null) {
			return result;
		} else {
			return result;
		}

	}
	
//	@GetMapping
//	public List<bookVO> getStockBookList(){
//		return service.getStockBookList();
//	}
	// ����� ����Ʈ ��ȸ
	@RequestMapping(value = "/getStockBookList")
	public List<bookVO> getStockBookList() {
		List<bookVO> result = service.getStockBookList();
		if (result == null) {
			return result;
		} else {
			return result;
		}

		 //return "stockList";

	}

//	@GetMapping
//	public bookVO getStockBook(@RequestBody bookVO vo) {
//		return service.getStockBook(vo);
//	}
	// ��������� Ȯ��
	@RequestMapping(value = "/getStockBook")
	public bookVO getStockBook(@RequestBody bookVO vo) {
		bookVO result = service.getStockBook(vo);
//		if (result == null) {
//			return "StockBook is nothing";
//		} else {
//			return "StockBook is exist";
//		}
		return result;
	}

}
