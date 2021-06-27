package com.icia.order.dto;

public class OrderDTO {

	// 장바구니
	private String jbrnumber;
	private int jpcode;
	private int jamount;
	
	// 주문
	private int onumber;
	private String obrnumber;
	private String odate;
	
	// 주문상세
	private int opcode;
	private String osrnumber;
	private int oamount;
	private int oprice;
	private String odeldte;
	
	// 구매자
	private String bid;
	private String brnumber;
	
	// 장바구니 리스트
	private String pname;
	private String sname;
	private int price;
	private String exdate;
	
	// getter setter toString
	public String getJbrnumber() {
		return jbrnumber;
	}
	public void setJbrnumber(String jbrnumber) {
		this.jbrnumber = jbrnumber;
	}
	public int getJpcode() {
		return jpcode;
	}
	public void setJpcode(int jpcode) {
		this.jpcode = jpcode;
	}
	public int getJamount() {
		return jamount;
	}
	public void setJamount(int jamount) {
		this.jamount = jamount;
	}
	public int getOnumber() {
		return onumber;
	}
	public void setOnumber(int onumber) {
		this.onumber = onumber;
	}
	public String getObrnumber() {
		return obrnumber;
	}
	public void setObrnumber(String obrnumber) {
		this.obrnumber = obrnumber;
	}
	public String getOdate() {
		return odate;
	}
	public void setOdate(String odate) {
		this.odate = odate;
	}
	public int getOpcode() {
		return opcode;
	}
	public void setOpcode(int opcode) {
		this.opcode = opcode;
	}
	public String getOsrnumber() {
		return osrnumber;
	}
	public void setOsrnumber(String osrnumber) {
		this.osrnumber = osrnumber;
	}
	public int getOamount() {
		return oamount;
	}
	public void setOamount(int oamount) {
		this.oamount = oamount;
	}
	public int getOprice() {
		return oprice;
	}
	public void setOprice(int oprice) {
		this.oprice = oprice;
	}
	public String getOdeldte() {
		return odeldte;
	}
	public void setOdeldte(String odeldte) {
		this.odeldte = odeldte;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getBrnumber() {
		return brnumber;
	}
	public void setBrnumber(String brnumber) {
		this.brnumber = brnumber;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getExdate() {
		return exdate;
	}
	public void setExdate(String exdate) {
		this.exdate = exdate;
	}
	@Override
	public String toString() {
		return "OrderDTO [jbrnumber=" + jbrnumber + ", jpcode=" + jpcode + ", jamount=" + jamount + ", onumber="
				+ onumber + ", obrnumber=" + obrnumber + ", odate=" + odate + ", opcode=" + opcode + ", osrnumber="
				+ osrnumber + ", oamount=" + oamount + ", oprice=" + oprice + ", odeldte=" + odeldte + ", bid=" + bid
				+  ", brnumber=" + brnumber + ", pname=" + pname + ", sname=" + sname + ", price="
				+ price + ", exdate=" + exdate + "]";
	}
	
	
	
	
	
}
