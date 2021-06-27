package com.icia.order.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.icia.order.dto.MemberDTO;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSessionTemplate sql;

	// 구매자 회원가입
	public int bmemberJoin(MemberDTO bmember) {
		return sql.insert("mm.bmemberjoin", bmember);
	}
	
	// 판매자 회원가입
	public int smemberJoin(MemberDTO smember) {
		return sql.insert("mm.smemberjoin", smember);
	}
	
	// 구매자 아이디 중복확인
	public String bidCheck(String bid) {
		return sql.selectOne("mm.bidcheck", bid);
	}
	
	// 판매자 아이디 중복확인
	public String sidCheck(String sid) {
		return sql.selectOne("mm.sidcheck", sid);
	}

	// 구매자 로그인
	public String bmemberLogin(MemberDTO member) {
		return sql.selectOne("mm.bmemberlogin", member);
	}
	
	// 판매자 로그인
	public String smemberLogin(MemberDTO member) {
		return sql.selectOne("mm.smemberlogin", member);
	}

	// 구매자 회원정보 수정 요청
	public MemberDTO bmemberUpdate(String loginId) {
		return sql.selectOne("mm.bmemberupdate", loginId);
	}

	// 구매자 회원정보 수정 처리
	public int bupdateProcess(MemberDTO bmember) {
		return sql.update("mm.bupdateprocess", bmember);
	}
	
	// 판매자 회원정보 수정 요청
	public MemberDTO smemberUpdate(String loginId) {
		return sql.selectOne("mm.smemberupdate", loginId);
	}

	// 판매자 회원정보 수정 처리
	public int supdateProcess(MemberDTO smember) {
		return sql.update("mm.supdateprocess", smember);
	}

	

	

	

}
