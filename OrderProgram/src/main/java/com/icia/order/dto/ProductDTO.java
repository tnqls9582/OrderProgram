package com.icia.order.dto;

import org.springframework.web.multipart.MultipartFile;

public class ProductDTO {
	// 카테고리
	private int ccode;
	private String ccname;
	
	// 상품
	private int pcode;
	private String psrnumber;
	private String pname;
	private int pccode;
	private String pcountry;
	private int pprice;
	private String pexdate;
	private int pstock;
	private String pdate;
	private String pdetail;
	private MultipartFile pimgfile;
	private String pimg;
	
	// 판매자 이름
	private String sname;

	// getter setter toString
	public int getCcode() {
		return ccode;
	}

	public void setCcode(int ccode) {
		this.ccode = ccode;
	}

	public String getCcname() {
		return ccname;
	}

	public void setCcname(String ccname) {
		this.ccname = ccname;
	}

	public int getPcode() {
		return pcode;
	}

	public void setPcode(int pcode) {
		this.pcode = pcode;
	}

	public String getPsrnumber() {
		return psrnumber;
	}

	public void setPsrnumber(String psrnumber) {
		this.psrnumber = psrnumber;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPccode() {
		return pccode;
	}

	public void setPccode(int pccode) {
		this.pccode = pccode;
	}

	public String getPcountry() {
		return pcountry;
	}

	public void setPcountry(String pcountry) {
		this.pcountry = pcountry;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	public String getPexdate() {
		return pexdate;
	}

	public void setPexdate(String pexdate) {
		this.pexdate = pexdate;
	}

	public int getPstock() {
		return pstock;
	}

	public void setPstock(int pstock) {
		this.pstock = pstock;
	}

	public String getPdate() {
		return pdate;
	}

	public void setPdate(String pdate) {
		this.pdate = pdate;
	}

	public String getPdetail() {
		return pdetail;
	}

	public void setPdetail(String pdetail) {
		this.pdetail = pdetail;
	}

	public MultipartFile getPimgfile() {
		return pimgfile;
	}

	public void setPimgfile(MultipartFile pimgfile) {
		this.pimgfile = pimgfile;
	}

	public String getPimg() {
		return pimg;
	}

	public void setPimg(String pimg) {
		this.pimg = pimg;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "ProductDTO [ccode=" + ccode + ", ccname=" + ccname + ", pcode=" + pcode + ", psrnumber=" + psrnumber
				+ ", pname=" + pname + ", pccode=" + pccode + ", pcountry=" + pcountry + ", pprice=" + pprice
				+ ", pexdate=" + pexdate + ", pstock=" + pstock + ", pdate=" + pdate + ", pdetail=" + pdetail
				+ ", pimgfile=" + pimgfile + ", pimg=" + pimg + ", sname=" + sname + "]";
	}
	
	
	

}
