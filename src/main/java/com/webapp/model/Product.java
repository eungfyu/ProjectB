package com.webapp.model;

import java.util.Date;

public class Product {
	
	private Integer PRDUCT_NO; 				//상품번호, pk
	private String PRDUCT_CODE;			//상품코드, pk
	
	private String PRDUCT_NM;			//상품명
	private Integer PRDUCT_PC;				//가격
	private Integer PRDUCT_QY;				//수량
	private String PRDUCT_CTGRY;		//카테고리
	private String PRDUCT_IMG_URL;		//이미지URL
	private Date PRDUCT_REG_TIME;		//등록시간
	private String PRDUCT__REGISTER;	//등록한 사람
	private Date PRDUCT_UPDT_TIME;		//수정날짜
	private String PRDUCT_UPDUSR;		//수정한 사람
	public Integer getPRDUCT_NO() {
		return PRDUCT_NO;
	}
	public void setPRDUCT_NO(Integer pRDUCT_NO) {
		PRDUCT_NO = pRDUCT_NO;
	}
	public String getPRDUCT_CODE() {
		return PRDUCT_CODE;
	}
	public void setPRDUCT_CODE(String pRDUCT_CODE) {
		PRDUCT_CODE = pRDUCT_CODE;
	}
	public String getPRDUCT_NM() {
		return PRDUCT_NM;
	}
	public void setPRDUCT_NM(String pRDUCT_NM) {
		PRDUCT_NM = pRDUCT_NM;
	}
	public Integer getPRDUCT_PC() {
		return PRDUCT_PC;
	}
	public void setPRDUCT_PC(Integer pRDUCT_PC) {
		PRDUCT_PC = pRDUCT_PC;
	}
	public Integer getPRDUCT_QY() {
		return PRDUCT_QY;
	}
	public void setPRDUCT_QY(Integer pRDUCT_QY) {
		PRDUCT_QY = pRDUCT_QY;
	}
	public String getPRDUCT_CTGRY() {
		return PRDUCT_CTGRY;
	}
	public void setPRDUCT_CTGRY(String pRDUCT_CTGRY) {
		PRDUCT_CTGRY = pRDUCT_CTGRY;
	}
	public String getPRDUCT_IMG_URL() {
		return PRDUCT_IMG_URL;
	}
	public void setPRDUCT_IMG_URL(String pRDUCT_IMG_URL) {
		PRDUCT_IMG_URL = pRDUCT_IMG_URL;
	}
	public Date getPRDUCT_REG_TIME() {
		return PRDUCT_REG_TIME;
	}
	public void setPRDUCT_REG_TIME(Date pRDUCT_REG_TIME) {
		PRDUCT_REG_TIME = pRDUCT_REG_TIME;
	}
	public String getPRDUCT__REGISTER() {
		return PRDUCT__REGISTER;
	}
	public void setPRDUCT__REGISTER(String pRDUCT__REGISTER) {
		PRDUCT__REGISTER = pRDUCT__REGISTER;
	}
	public Date getPRDUCT_UPDT_TIME() {
		return PRDUCT_UPDT_TIME;
	}
	public void setPRDUCT_UPDT_TIME(Date pRDUCT_UPDT_TIME) {
		PRDUCT_UPDT_TIME = pRDUCT_UPDT_TIME;
	}
	public String getPRDUCT_UPDUSR() {
		return PRDUCT_UPDUSR;
	}
	public void setPRDUCT_UPDUSR(String pRDUCT_UPDUSR) {
		PRDUCT_UPDUSR = pRDUCT_UPDUSR;
	}
	
	
	
		
}
