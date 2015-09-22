package com.webapp.model;

import java.sql.Date;

public class Point {
    
	private	Integer SAVE_POINT;			//적립포인트           
	private	String POINT_USGSTT;		//사용여부           
	private	Date SAVE_REG_TIME;			//포인트적립시간     
	private	String SAVE_REGISTER;		//포인트등록인       

	private Member member;

	
	public Integer getSAVE_POINT() {
		return SAVE_POINT;
	}

	public void setSAVE_POINT(Integer sAVE_POINT) {
		SAVE_POINT = sAVE_POINT;
	}

	public String getPOINT_USGSTT() {
		return POINT_USGSTT;
	}

	public void setPOINT_USGSTT(String pOINT_USGSTT) {
		POINT_USGSTT = pOINT_USGSTT;
	}

	public Date getSAVE_REG_TIME() {
		return SAVE_REG_TIME;
	}

	public void setSAVE_REG_TIME(Date sAVE_REG_TIME) {
		SAVE_REG_TIME = sAVE_REG_TIME;
	}

	public String getSAVE_REGISTER() {
		return SAVE_REGISTER;
	}

	public void setSAVE_REGISTER(String sAVE_REGISTER) {
		SAVE_REGISTER = sAVE_REGISTER;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
	

	
	
	
	
	
	

}
