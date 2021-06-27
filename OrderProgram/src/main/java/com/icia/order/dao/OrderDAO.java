package com.icia.order.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.order.dto.OrderDTO;

@Repository
public class OrderDAO {
	
	@Autowired
	private SqlSessionTemplate sql;

	// 장바구니 담기
	public int basket(OrderDTO order) {
		return sql.insert("om.basket", order);
	}

	// 장바구니 목록
	public List<OrderDTO> basketList() {
		return sql.selectList("om.basketlist");
	}

}
