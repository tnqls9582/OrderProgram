package com.icia.order.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.icia.order.dao.ProductDAO;
import com.icia.order.dto.OrderDTO;
import com.icia.order.dto.ProductDTO;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO pdao;
	
	private ModelAndView mav;
	
	@Autowired
	private HttpSession session;

	// 상품 등록
	public ModelAndView productWrite(ProductDTO product) throws IllegalStateException, IOException {
		mav = new ModelAndView();
		MultipartFile pimgfile = product.getPimgfile();
		String pimg = pimgfile.getOriginalFilename();
		pimg = System.currentTimeMillis()+"-"+pimg;
		String savePath = "";
		if(!pimgfile.isEmpty()) {
			pimgfile.transferTo(new File(savePath));
		}
		product.setPimg(pimg);
		pdao.productWrite(product);
		mav.setViewName("productupdate");
		return mav;
	}
	
	// 상품 목록 조회
	public ModelAndView orderPage() {
		mav = new ModelAndView();
		List<ProductDTO> productList = pdao.orderPage();
		System.out.println(pdao.orderPage());
		System.out.println(productList);
		mav.addObject("bid", session.getAttribute("loginMember").toString());
		mav.addObject("productList", productList);
		mav.setViewName("orderpage");
		return mav;
	}

	

}
