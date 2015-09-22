package com.webapp.model;

import java.sql.Date;
import java.util.List;

public class Member {

		
	private	Integer MBER_NO;		//회원번호    			
	private	String MBER_ID;			//아이디    			
	private	String MBER_PW;			//비밀번호  			
	private	String MBER_NM;			//이름      			
	private	String MBER_PHON;		//전화번호  			
	private	String MBER_ADRES;		//주소    			
	private	Date MBER_REG_TIME;		//등록시간			
	private	String MBER_REGISTER;	//등록인  			
	private	Date MBER_UPDT_TIME;	//수정일  			
	private	String MBER_UPDUSR;		//수정인  
	
	private List<Point> points;
	private List<MemberOption> mberOps;
	
	
	
	public Integer getMBER_NO() {
		return MBER_NO;
	}
	public void setMBER_NO(Integer mBER_NO) {
		MBER_NO = mBER_NO;
	}
	public String getMBER_ID() {
		return MBER_ID;
	}
	public void setMBER_ID(String mBER_ID) {
		MBER_ID = mBER_ID;
	}
	public String getMBER_PW() {
		return MBER_PW;
	}
	public void setMBER_PW(String mBER_PW) {
		MBER_PW = mBER_PW;
	}
	public String getMBER_NM() {
		return MBER_NM;
	}
	public void setMBER_NM(String mBER_NM) {
		MBER_NM = mBER_NM;
	}
	public String getMBER_PHON() {
		return MBER_PHON;
	}
	public void setMBER_PHON(String mBER_PHON) {
		MBER_PHON = mBER_PHON;
	}
	public String getMBER_ADRES() {
		return MBER_ADRES;
	}
	public void setMBER_ADRES(String mBER_ADRES) {
		MBER_ADRES = mBER_ADRES;
	}
	public Date getMBER_REG_TIME() {
		return MBER_REG_TIME;
	}
	public void setMBER_REG_TIME(Date mBER_REG_TIME) {
		MBER_REG_TIME = mBER_REG_TIME;
	}
	public String getMBER_REGISTER() {
		return MBER_REGISTER;
	}
	public void setMBER_REGISTER(String mBER_REGISTER) {
		MBER_REGISTER = mBER_REGISTER;
	}
	public Date getMBER_UPDT_TIME() {
		return MBER_UPDT_TIME;
	}
	public void setMBER_UPDT_TIME(Date mBER_UPDT_TIME) {
		MBER_UPDT_TIME = mBER_UPDT_TIME;
	}
	public String getMBER_UPDUSR() {
		return MBER_UPDUSR;
	}
	public void setMBER_UPDUSR(String mBER_UPDUSR) {
		MBER_UPDUSR = mBER_UPDUSR;
	}
	                                              

	public List<Point> getPoints() {
		return points;
	}
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	public List<MemberOption> getMberOps() {
		return mberOps;
	}
	public void setMberOps(List<MemberOption> mberOps) {
		this.mberOps = mberOps;
	}

	
	
}
