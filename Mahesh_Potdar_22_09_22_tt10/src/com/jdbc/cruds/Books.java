package com.jdbc.cruds;

import java.sql.Date;

public class Books {
	
	private  int bid;
	private String bname;
	private double bprice;
	private  Date bdate;
	
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Books(int bid, String bname, double bprice, Date bdate) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bprice = bprice;
		this.bdate = bdate;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public double getBprice() {
		return bprice;
	}

	public void setBprice(double bprice) {
		this.bprice = bprice;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	@Override
	public String toString() {
		return "Books [bid=" + bid + ", bname=" + bname + ", bprice=" + bprice + ", bdate=" + bdate + "]";
	}
}
