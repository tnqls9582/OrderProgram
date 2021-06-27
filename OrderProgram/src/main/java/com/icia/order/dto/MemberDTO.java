package com.icia.order.dto;

public class MemberDTO {
	// ID, PW
	private String id;
	private String pw;
	
	// 구매자
	private String brnumber;
	private String bid;
	private String bpassword;
	private String bname;
	private String bphone;
	private String baddress;
	private int bmoney;
	private int bgnumber;
	
	// 판매자
	private String srnumber;
	private String sid;
	private String spassword;
	private String sname;
	private String sphone;
	private String saddress;
	
	// 등급
	private int gnumber;
	private String gname;
	
	// 회원타입
	private String mCode;

	// getter setter toString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getBrnumber() {
		return brnumber;
	}

	public void setBrnumber(String brnumber) {
		this.brnumber = brnumber;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getBpassword() {
		return bpassword;
	}

	public void setBpassword(String bpassword) {
		this.bpassword = bpassword;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBphone() {
		return bphone;
	}

	public void setBphone(String bphone) {
		this.bphone = bphone;
	}

	public String getBaddress() {
		return baddress;
	}

	public void setBaddress(String baddress) {
		this.baddress = baddress;
	}

	public int getBmoney() {
		return bmoney;
	}

	public void setBmoney(int bmoney) {
		this.bmoney = bmoney;
	}

	public int getBgnumber() {
		return bgnumber;
	}

	public void setBgnumber(int bgnumber) {
		this.bgnumber = bgnumber;
	}

	public String getSrnumber() {
		return srnumber;
	}

	public void setSrnumber(String srnumber) {
		this.srnumber = srnumber;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSpassword() {
		return spassword;
	}

	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSphone() {
		return sphone;
	}

	public void setSphone(String sphone) {
		this.sphone = sphone;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public int getGnumber() {
		return gnumber;
	}

	public void setGnumber(int gnumber) {
		this.gnumber = gnumber;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getmCode() {
		return mCode;
	}

	public void setmCode(String mCode) {
		this.mCode = mCode;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", brnumber=" + brnumber + ", bid=" + bid + ", bpassword="
				+ bpassword + ", bname=" + bname + ", bphone=" + bphone + ", baddress=" + baddress + ", bmoney="
				+ bmoney + ", bgnumber=" + bgnumber + ", srnumber=" + srnumber + ", sid=" + sid + ", spassword="
				+ spassword + ", sname=" + sname + ", sphone=" + sphone + ", saddress=" + saddress + ", gnumber="
				+ gnumber + ", gname=" + gname + ", mCode=" + mCode + "]";
	}

}
