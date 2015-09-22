package com.webapp.mapper;

import java.util.List;
import java.util.Map;

import com.webapp.model.Product;

public interface ProductMapper {

	List<Product> selectAll();
	List<Product> select(Map<String, Object> index);
	Product selectByPRDUCT_NO(int prduct_no);
	Product selectByPRDUCT_CODE(String prduct_code);
	int selectTotalCount();
	
	int insert(Product product);
	int insertGenerator(Product product);
	
	int update(Product product);
	
	int deleteByPRDUCT_NO(int prduct_no);
	int deleteByPRDUCT_CODE(String prduct_code);
}
