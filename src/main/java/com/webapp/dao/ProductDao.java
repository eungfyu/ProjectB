package com.webapp.dao;

import java.util.List;

import com.webapp.mapper.ProductMapper;
import com.webapp.model.Product;

public interface ProductDao extends ProductMapper {
	
	List<Product> select(int firstItem, int lastItem);
	
	void deleteByPRDUCT_NOWithPRDUCT_CODE(int prduct_no, String prduct_code);

	/*
	 * Member DML
	 */
	static final String SELECT_PRODUCT =
						" select PRDUCT_NO,        " + 
						"        PRDUCT_CODE,     " +
						"	     PRDUCT_NM,  " +
						"	     PRDUCT_PC,      " +
						"	     PRDUCT_QY,      " +
						"	     PRDUCT_CTGRY,      " +
						"	     PRDUCT_IMG_URL,      " +
						"	     PRDUCT_REG_TIME,      " +
						"	     PRDUCT_REGISTER,      " +
						"	     PRDUCT_UPDT_TIME,      " +
						"	     PRDUCT_UPDUSR    " +
						"   from th_product     ";
	static final String SELECT_ALL = SELECT_PRODUCT;

	static final String SELECT_BY_PRDUCT_NO = SELECT_PRODUCT +
						"  where PRDUCT_NO = ?     ";
	static final String SELECT_BY_PRDUCT_CODE = SELECT_PRODUCT +
						"  where PRDUCT_CODE = ?  ";
	
	static final String PAGING_MYSQL =
						SELECT_PRODUCT + 
						" order by PRDUCT_NO desc " +
						" limit ?, ?       ";  // #{offset}, #{count}

	
	
	
	static final String INSERT_BY_GENERATOR_TABLE =		// Oracle or MySQL
						"	insert into th_product  " +
						"	(                   " +
						"		PRDUCT_NO,             " +
						"		PRDUCT_CODE,          " +
						"	    PRDUCT_NM,  " +
						"	    PRDUCT_PC,      " +
						"	    PRDUCT_QY,      " +
						"	    PRDUCT_CTGRY,      " +
						"	    PRDUCT_IMG_URL,      " +
						"	    PRDUCT_REG_TIME,      " +
						"	    PRDUCT_REGISTER,      " +
						"	    PRDUCT_UPDT_TIME,      " +
						"	    PRDUCT_UPDUSR    " +
						"	)                   " +
						"	values              " +
						"	(                   " +
						"		?,              " +	// #{PRDUCT_NO}
						"		?,              " +	// #{PRDUCT_CODE}
						"		?,              " +	// #{PRDUCT_NM}
						"		?,              " +	// #{PRDUCT_PC}
						"		?,              " +	// #{PRDUCT_QY}
						"		?,              " +	// #{PRDUCT_CTGRY}
						"		?,              " +	// #{PRDUCT_IMG_URL}
						"		?,              " +	// #{PRDUCT_REG_TIME}
						"		?,              " +	// #{PRDUCT_REGISTER}
						"		?,              " +	// #{PRDUCT_UPDT_TIME}
						"		?               " +	// #{PRDUCT_UPDUSR}
						"	)                   ";
	static final String INSERT_BY_AUTOINCREMENT =						// MySQL
						"	insert into th_product  " +
						"	(                   " +
						"		PRDUCT_CODE,          " +
						"	    PRDUCT_NM,  " +
						"	    PRDUCT_PC,      " +
						"	    PRDUCT_QY,      " +
						"	    PRDUCT_CTGRY,      " +
						"	    PRDUCT_IMG_URL,      " +
						"	    PRDUCT_REG_TIME,      " +
						"	    PRDUCT_REGISTER,      " +
						"	    PRDUCT_UPDT_TIME,      " +
						"	    PRDUCT_UPDUSR    " +
						"	)                   " +
						"	values              " +
						"	(                   " +
						"		?,              " +	// #{PRDUCT_CODE}
						"		?,              " +	// #{PRDUCT_NM}
						"		?,              " +	// #{PRDUCT_PC}
						"		?,              " +	// #{PRDUCT_QY}
						"		?,              " +	// #{PRDUCT_CTGRY}
						"		?,              " +	// #{PRDUCT_IMG_URL}
						"		?,              " +	// #{PRDUCT_REG_TIME}
						"		?,              " +	// #{PRDUCT_REGISTER}
						"		?,              " +	// #{PRDUCT_UPDT_TIME}
						"		?               " +	// #{PRDUCT_UPDUSR}
						"	)                   ";
	static final String DELETE =
						" delete from th_product ";
	static final String DELETE_BY_PRDUCT_NO = 
						DELETE +
						"  where PRDUCT_NO = ?      ";	// #{PRDUCT_NO}
	static final String DELETE_BY_PRDUCT_CODE =
						DELETE +
						"  where PRDUCT_CODE = ?   ";	// #{PRDUCT_CODE}
	
	
	
}
