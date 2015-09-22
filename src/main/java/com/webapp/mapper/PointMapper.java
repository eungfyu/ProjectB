package com.webapp.mapper;

import java.util.List;

import com.webapp.command.MemberNo;
import com.webapp.model.Point;

public interface PointMapper {

	//List<MemberNo> selectPoints();
	
	List<Point> selectAll();		//관리자용
	List<Point> pointHistory();		//사용자용
	
	
	
	
	
}
