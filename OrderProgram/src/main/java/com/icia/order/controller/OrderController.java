package com.icia.order.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.icia.order.dto.OrderDTO;
import com.icia.order.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	private OrderService os;
	
	private ModelAndView mav;
	
	// 장바구니 담기
	@RequestMapping(value="/basket")
	public ModelAndView basket(@ModelAttribute OrderDTO order) {
		System.out.println("장바구니 ");
		mav = os.basket(order);
		System.out.println("장바구니 ");
		System.out.println("장바구니아이디:"+order.getBid());
		return mav;
	}
	
	// 발주목록 화면 요청
	@RequestMapping(value="/orderview")
	public ModelAndView orderView(@ModelAttribute OrderDTO order) {
		mav = os.orderView(order);
		return mav;
	}
	
}
