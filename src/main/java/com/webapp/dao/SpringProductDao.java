package com.webapp.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.JdbcUpdateAffectedIncorrectNumberOfRowsException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.util.Assert;

import com.webapp.model.Product;

public class SpringProductDao implements ProductDao {

	static Log log = LogFactory.getLog(SpringProductDao.class);
	
	final static String mysql="MySQL";
	
	boolean useGeneratorTable;
	String DB_VENDER;
	JdbcTemplate template;
	
	public void setUseGeneratorTable(boolean use) {
		this.useGeneratorTable = use;
		log.info("useGeneratorTable = " + use);
	}
	
	public void setTemplate(JdbcTemplate template) throws SQLException  {
		this.template = template;
		Connection con=null;
		try {
			con = template.getDataSource().getConnection();
			DB_VENDER = con.getMetaData().getDatabaseProductName();
			log.info("DB_VENDER = " + DB_VENDER);
		} catch (SQLException e) {
			log.error("DB_VENDER error", e);
			throw e;
		} finally {
				try {
					if (con !=null)
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}
	
	RowMapper<Product> productMapper = new RowMapper<Product>() {

		@Override
		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
			Product p = new Product();
			p.setPRDUCT_NO(rs.getInt("PRDUCT_NO"));
			p.setPRDUCT_CODE(rs.getString("PRDUCT_CODE"));
			p.setPRDUCT_NM(rs.getString("PRDUCT_NM"));
			p.setPRDUCT_PC(rs.getInt("PRDUCT_PC"));
			p.setPRDUCT_QY(rs.getInt("PRDUCT_QY"));
			p.setPRDUCT_CTGRY(rs.getString("PRDUCT_CTGRY"));
			p.setPRDUCT_IMG_URL(rs.getString("PRDUCT_IMG_URL"));
			p.setPRDUCT_REG_TIME(rs.getDate("PRDUCT_REG_TIME"));
			p.setPRDUCT__REGISTER(rs.getString("PRDUCT_REGISTER"));
			p.setPRDUCT_UPDT_TIME(rs.getDate("PRDUCT_UPDT_TIME"));
			p.setPRDUCT_UPDUSR(rs.getString("PRDUCT_UPDUSR"));
			return p;
		}
	};
	
	@Override
	public List<Product> selectAll() {
		// Weaving(위빙)
		return template.query(SELECT_ALL, productMapper);
		
	}

	@Override
	public List<Product> select(Map<String, Object> index) {
		List<Product> list = new ArrayList<Product>();
		
		int offset = (int)index.get("offset");
		int count = (int)index.get("count");
		list = template.query(PAGING_MYSQL, productMapper, offset, count);
		return list;
	}

	@Override
	public List<Product> select(int firstItem, int lastItem) {
		Map<String, Object> index = new HashMap<String, Object>();
		index.put("firstItem", firstItem);
		index.put("lastItem", lastItem);
		int offset = firstItem - 1;
		int count = lastItem - firstItem + 1;
		index.put("offset", offset);
		index.put("count", count);
		return this.select(index);
	}
	
	
	@Override
	public Product selectByPRDUCT_NO(int PRDUCT_NO) {
		Product p = template.queryForObject(SELECT_BY_PRDUCT_NO, productMapper, PRDUCT_NO);
		return p;
	}

	@Override
	public Product selectByPRDUCT_CODE(String PRDUCT_CODE) {
		Product p = template.queryForObject(SELECT_BY_PRDUCT_CODE, productMapper, PRDUCT_CODE);
		return p;
	}
	
	@Override
	public int selectTotalCount() {
		return template.queryForObject("select count(*) from th_product", Integer.class);
	}

	@Override
	public int insert(Product product) {
		
		int rtn=0;
		log.info("insert by AutoIncrement QUERY");
		
		KeyHolder generatedKeyHolder = new GeneratedKeyHolder();
		
		final Product p = product;
		rtn = template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con)
					throws SQLException {
				PreparedStatement pstmt = con.prepareStatement(INSERT_BY_AUTOINCREMENT, Statement.RETURN_GENERATED_KEYS);
				pstmt.setString(1, p.getPRDUCT_CODE());
				pstmt.setString(2, p.getPRDUCT_NM());
				pstmt.setInt(3, p.getPRDUCT_PC());
				pstmt.setInt(4, p.getPRDUCT_QY());
				pstmt.setString(5, p.getPRDUCT_CTGRY());
				pstmt.setString(6, p.getPRDUCT_IMG_URL());
				pstmt.setTimestamp(7, new Timestamp(p.getPRDUCT_REG_TIME().getTime()));
				pstmt.setString(8, p.getPRDUCT__REGISTER());
				pstmt.setTimestamp(9, new Timestamp(p.getPRDUCT_UPDT_TIME().getTime()));
				pstmt.setString(10, p.getPRDUCT_UPDUSR());
				return pstmt;
			}
		}, generatedKeyHolder);
		product.setPRDUCT_NO(generatedKeyHolder.getKey().intValue());
		
		return rtn;
	}

	@Override
	public int insertGenerator(Product product) {
		Assert.isTrue(false, "insert() 을 대신 사용하세요.");
		return 0;
	}

	@Override
	public int update(Product product) {
		BEGIN();
		UPDATE("th_product");
		
		if (product.getPRDUCT_NM() != null)
			   SET("PRDUCT_NM = ?");
		if (product.getPRDUCT_PC() != null)
			   SET("PRDUCT_PC = ?");
		if (product.getPRDUCT_QY() != null)
			   SET("PRDUCT_QY = ?");
		if (product.getPRDUCT_CTGRY() != null)
			   SET("PRDUCT_CTGRY = ?");
		if (product.getPRDUCT_IMG_URL() != null)
			   SET("PRDUCT_IMG_URL = ?");
		if (product.getPRDUCT_REG_TIME() != null)
			   SET("PRDUCT_REG_TIME = ?");
		if (product.getPRDUCT__REGISTER() != null)
			   SET("PRDUCT_REGISTER = ?");
		if (product.getPRDUCT_UPDT_TIME() != null)
			   SET("PRDUCT_UPDT_TIME = ?");
		if (product.getPRDUCT_UPDUSR() != null)
			   SET("PRDUCT_UPDUSR = ?");
		 WHERE("PRDUCT_NO = ?");
		 WHERE("PRDUCT_CODE = ?");
		 
		String sql = SQL();
		log.info("\n" + sql);
		final Product p = product;
		int rtn = template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				int index=0;

				if (p.getPRDUCT_NM() != null)
					ps.setString(++index, p.getPRDUCT_NM());
				if (p.getPRDUCT_PC() != null)
					ps.setInt(++index, p.getPRDUCT_PC());
				if (p.getPRDUCT_QY() != null)
					ps.setInt(++index, p.getPRDUCT_QY());
				if (p.getPRDUCT_CTGRY() != null)
					ps.setString(++index, p.getPRDUCT_CTGRY());
				if (p.getPRDUCT_IMG_URL() != null)
					ps.setString(++index, p.getPRDUCT_IMG_URL());
				if (p.getPRDUCT_REG_TIME() != null)
					ps.setTimestamp(++index, new Timestamp(p.getPRDUCT_REG_TIME().getTime()));
				if (p.getPRDUCT__REGISTER() != null)
					ps.setString(++index, p.getPRDUCT__REGISTER());
				if (p.getPRDUCT_UPDT_TIME() != null)
					ps.setTimestamp(++index, new Timestamp(p.getPRDUCT_UPDT_TIME().getTime()));
				if (p.getPRDUCT_UPDUSR() != null)
					ps.setString(++index, p.getPRDUCT_UPDUSR());
				
				
				ps.setInt(++index, p.getPRDUCT_NO());
				ps.setString(++index, p.getPRDUCT_CODE());
			}
		});

		if (rtn != 1) {
			throw new JdbcUpdateAffectedIncorrectNumberOfRowsException("invalid update", 1, rtn);
		}
		
		return rtn;
	}

	@Override
	public int deleteByPRDUCT_NO(int prduct_no) {
		int rtn = template.update(DELETE_BY_PRDUCT_NO, prduct_no);
		if (rtn != 1) 
			throw new JdbcUpdateAffectedIncorrectNumberOfRowsException(prduct_no + "", 1, rtn);
		return rtn;
	}

	@Override
	public int deleteByPRDUCT_CODE(String prduct_code) {
		int rtn = template.update(DELETE_BY_PRDUCT_CODE, prduct_code);
		if (rtn != 1) 
			throw new JdbcUpdateAffectedIncorrectNumberOfRowsException(prduct_code, 1, rtn);
		return rtn;
	}

	@Override
	public void deleteByPRDUCT_NOWithPRDUCT_CODE(int prduct_no, String prduct_code) {
		// TODO Auto-generated method stub
		
	}

	
}
