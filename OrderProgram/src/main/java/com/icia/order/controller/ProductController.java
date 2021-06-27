package com.icia.order.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.icia.order.dto.ProductDTO;
import com.icia.order.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService ps;
	
	private ModelAndView mav;
	
	// 상품등록 페이지 요청
	@RequestMapping(value="/pwrite")
	public String pwrite() {
		return "productwrite";
	}
	
	// 상품 등록
	@RequestMapping(value="/productwrite")
	public ModelAndView productWrite(@ModelAttribute ProductDTO product) throws IllegalStateException, IOException {
		mav = ps.productWrite(product);
		return mav;
	}
	
	// 상품 목록 조회
	@RequestMapping(value="/orderpage")
	public ModelAndView orderPage() {
		mav = ps.orderPage();
		return mav;
	}

}
