package com.icia.order.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.icia.order.dao.MemberDAO;
import com.icia.order.dto.MemberDTO;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO mdao;
	
	private ModelAndView mav;
	
	@Autowired
	private HttpSession session;

	// 구매자 회원가입
	public ModelAndView bmemberJoin(MemberDTO bmember) {
		mav = new ModelAndView();
		int insertResult = mdao.bmemberJoin(bmember);
		if(insertResult > 0) {
			mav.setViewName("home");
		} else {
			mav.setViewName("bmemberjoin");
		}
		return mav;
	}
		
	// 판매자 회원가입
	public ModelAndView smemberJoin(MemberDTO smember) {
		mav = new ModelAndView();
		int insertResult = mdao.smemberJoin(smember);
		if(insertResult > 0) {
			mav.setViewName("home");
		} else {
			mav.setViewName("smemberjoin");
		}
		return mav;
	}
	
	// 구매자 아이디 중복확인
	public String bidCheck(String bid) {
		String checkResult = mdao.bidCheck(bid);
		String result = "";
		if(checkResult == null) {
			result = "ok";
		} else {
			result = "no";
		}
		System.out.println("서비스 클래스 체크결과 "+result);
		return result;
	}
	
	// 판매자 아이디 중복확인
	public String sidCheck(String sid) {
		String checkResult = mdao.sidCheck(sid);
		String result = "";
		if(checkResult == null) {
			result = "ok";
		} else {
			result = "no";
		}
		System.out.println("서비스 클래스 체크결과 "+result);
		return result;
	}
	
	// 로그인
	public ModelAndView memberLogin(MemberDTO member) {
		mav = new ModelAndView();
		switch(member.getmCode()){
		// 구매자
		case "buyer" :
			String buyId = mdao.bmemberLogin(member);
			if(buyId != null) {
				session.setAttribute("loginMember", buyId);
				mav.setViewName("orderpage");
			} else {
				mav.setViewName("home");
			}
			break;
		// 판매자
		case "seller" :
			String sellId = mdao.smemberLogin(member);
			if(sellId != null) {
				session.setAttribute("loginMember", sellId);
				mav.setViewName("productwrite");
			} else {
				mav.setViewName("home");
			}
			break;
		}
		return mav;
	}

	// 구매자 회원정보 수정 요청
	public ModelAndView bmemberUpdate() {
		mav = new ModelAndView();
		String loginId = (String) session.getAttribute("loginMember");
		MemberDTO bmemberUpdate = mdao.bmemberUpdate(loginId);
		mav.addObject("bmemberUpdate", bmemberUpdate);
		mav.setViewName("bmemberupdate");
		return mav;
	}

	// 구매자 회원정보 수정 처리
	public ModelAndView bupdateProcess(MemberDTO bmember) {
		mav = new ModelAndView();
		int updateResult = mdao.bupdateProcess(bmember);
		if(updateResult > 0) {
			mav.setViewName("bmypage");
		} else {
			mav.setViewName("bmemberupdate");
		}
		return mav;
	}
	
	// 판매자 회원정보 수정 요청
	public ModelAndView smemberUpdate() {
		mav = new ModelAndView();
		String loginId = (String) session.getAttribute("loginMember");
		MemberDTO smemberUpdate = mdao.smemberUpdate(loginId);
		mav.addObject("smemberUpdate", smemberUpdate);
		mav.setViewName("smemberupdate");
		return mav;
	}

	// 판매자 회원정보 수정 처리
	public ModelAndView supdateProcess(MemberDTO smember) {
		mav = new ModelAndView();
		int updateResult = mdao.supdateProcess(smember);
		if(updateResult > 0) {
			mav.setViewName("smypage");
		} else {
			mav.setViewName("smemberupdate");
		}
		return mav;
	}

	
}
