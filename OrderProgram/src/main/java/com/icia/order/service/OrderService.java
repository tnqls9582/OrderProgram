package com.icia.order.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.icia.order.dto.OrderDTO;
import com.icia.order.dao.OrderDAO;

@Service
public class OrderService {

	@Autowired
	private OrderDAO odao;
	
	private ModelAndView mav;
	
	@Autowired
	private HttpSession session;
	
	// 장바구니 담기
	public ModelAndView basket(OrderDTO order) {
		System.out.println("장바구니2 ");
		mav = new ModelAndView();
		String bid = session.getAttribute("loginMember").toString();
		order.setBid(bid);
		System.out.println("장바구니아이디서비스:"+order.getBid());
		int result = odao.basket(order);
		//System.out.println("장바구니아이디서비스:"+order.getBid());
		System.out.println(result);
		if(result > 0) {
			order.setBid(bid);
			List<OrderDTO> basketList = odao.basketList();
			System.out.println("JANG"+basketList);
			mav.addObject("basketList", basketList);
			mav.setViewName("basket");
		} else {
			mav.setViewName("orderpage");
		}
		return mav;
	}

	// 장바구니 리스트
	public ModelAndView orderView(OrderDTO order) {
		mav = new ModelAndView();
		String bid = session.getAttribute("loginMember").toString();
		order.setBid(bid);
		List<OrderDTO> basketList = odao.basketList();
		mav.addObject("basketList", basketList);
		mav.setViewName("basket");
		return mav;
	}

}
