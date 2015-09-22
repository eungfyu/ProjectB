package com.webapp.model;

public class MemberOption {

	private String MBER_BRTHDY;			//생일
	private String MBER_SEXDSTN;		//성별
	private String MBER_EMAIL;			//이메일
	private String MBEROP_REG_TIME;		//등록시간
	private String MBEROP_REGISTER;		//등록인
	private String MBEROP_UPDT_TIME;	//수정일
	private String MBEROP_UPDUSR;		//수정인
	
	private Member member;

	
	public String getMBER_BRTHDY() {
		return MBER_BRTHDY;
	}

	public void setMBER_BRTHDY(String mBER_BRTHDY) {
		MBER_BRTHDY = mBER_BRTHDY;
	}

	public String getMBER_SEXDSTN() {
		return MBER_SEXDSTN;
	}

	public void setMBER_SEXDSTN(String mBER_SEXDSTN) {
		MBER_SEXDSTN = mBER_SEXDSTN;
	}

	public String getMBER_EMAIL() {
		return MBER_EMAIL;
	}

	public void setMBER_EMAIL(String mBER_EMAIL) {
		MBER_EMAIL = mBER_EMAIL;
	}

	public String getMBEROP_REG_TIME() {
		return MBEROP_REG_TIME;
	}

	public void setMBEROP_REG_TIME(String mBEROP_REG_TIME) {
		MBEROP_REG_TIME = mBEROP_REG_TIME;
	}

	public String getMBEROP_REGISTER() {
		return MBEROP_REGISTER;
	}

	public void setMBEROP_REGISTER(String mBEROP_REGISTER) {
		MBEROP_REGISTER = mBEROP_REGISTER;
	}

	public String getMBEROP_UPDT_TIME() {
		return MBEROP_UPDT_TIME;
	}

	public void setMBEROP_UPDT_TIME(String mBEROP_UPDT_TIME) {
		MBEROP_UPDT_TIME = mBEROP_UPDT_TIME;
	}

	public String getMBEROP_UPDUSR() {
		return MBEROP_UPDUSR;
	}

	public void setMBEROP_UPDUSR(String mBEROP_UPDUSR) {
		MBEROP_UPDUSR = mBEROP_UPDUSR;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
	
}
