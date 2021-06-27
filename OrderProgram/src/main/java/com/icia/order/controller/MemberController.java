package com.icia.order.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.icia.order.dto.MemberDTO;
import com.icia.order.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService ms;
	private ModelAndView mav;
	
	@Autowired
	private HttpSession session;
	
	// 구매자 회원가입 페이지 요청
	@RequestMapping(value="/bmemjoin")
	public String bmemJoin() {
		return "bmemberjoin";
	}
		
	// 구매자 회원가입
	@RequestMapping(value="/bmemberjoin")
	public ModelAndView bmemberJoin(@ModelAttribute MemberDTO bmember) {
		mav = ms.bmemberJoin(bmember);
		return mav;
	}
	
	// 판매자 회원가입 페이지 요청
	@RequestMapping(value="/smemjoin")
	public String smemJoin() {
		return "smemberjoin";
	}
	
	// 판매자 회원가입
	@RequestMapping(value="/smemberjoin")
	public ModelAndView smemberJoin(@ModelAttribute MemberDTO smember) {
		mav = ms.smemberJoin(smember);
		return mav;
	}
	
	// 구매자 아이디 중복확인
	@RequestMapping(value="/bidcheck")
	public @ResponseBody String bidCheck(@RequestParam("bid") String bid) {
		System.out.println("입력 id값 "+bid);
		String result = ms.bidCheck(bid);
		return result;
	}
	
	// 판매자 아이디 중복확인
	@RequestMapping(value="/sidcheck")
	public @ResponseBody String sidCheck(@RequestParam("sid") String sid) {
		System.out.println("입력 id값 "+sid);
		String result = ms.sidCheck(sid);
		return result;
	}
	
	// 로그인
	@RequestMapping(value="/")
	public ModelAndView memberLogin(@ModelAttribute MemberDTO member) {
		mav = ms.memberLogin(member);
		member.getmCode();
		System.out.println(member.getmCode());
		System.out.println(member.getId());
		System.out.println(member.getPw());
		return mav;
	}
	
	// 로그아웃
	@RequestMapping(value="logout")
	public String logout() {
		session.invalidate();
		return "home";
	}
	
	// 구매자 회원정보 수정 요청
	@RequestMapping(value="/bmemberupdate")
	public ModelAndView bmemberUpdate() {
		mav = ms.bmemberUpdate();
		return mav;
	}
		
	// 구매자 회원정보 수정 처리
	@RequestMapping(value="/bupdateprocess")
	public ModelAndView bupdateProcess(@ModelAttribute MemberDTO bmember) {
		mav = ms.bupdateProcess(bmember);
		return mav;
	}
	
	// 판매자 회원정보 수정 요청
	@RequestMapping(value="/smemberupdate")
	public ModelAndView smemberUpdate() {
		mav = ms.smemberUpdate();
		return mav;
	}
	
	// 판매자 회원정보 수정 처리
	@RequestMapping(value="/supdateprocess")
	public ModelAndView supdateProcess(@ModelAttribute MemberDTO smember) {
		mav = ms.supdateProcess(smember);
		return mav;
	}
	
	//---------------
	
//	
//	// 상품수정 페이지 요청
//	@RequestMapping(value="/pupdate")
//	public String pupdate() {
//		return "productupdate";
//	}
//		
//	// 판매자 마이페이지 요청
//	@RequestMapping(value="/smypageform")
//	public String sMyPageForm() {
//		return "smypage";
//	}
//	
//	// 주문조회 페이지 요청
//	@RequestMapping(value="/oview")
//	public String oview() {
//		return "orderview";
//	}
//	
//	// 구매자 마이페이지 요청
	@RequestMapping(value="/bmypage")
	public String bMyPageForm() {
		return "bmypage";
	}

}
