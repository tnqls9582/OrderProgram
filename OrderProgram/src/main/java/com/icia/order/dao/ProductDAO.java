package com.icia.order.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.order.dto.ProductDTO;

@Repository
public class ProductDAO {
	
	@Autowired
	private SqlSessionTemplate sql;

	// 상품 등록
	public void productWrite(ProductDTO product) {
		sql.insert("pm.productwrite", product);
	}
	
	// 상품 목록 조회
	public List<ProductDTO> orderPage() {
		return sql.selectList("pm.productlist");
	}

	

}
