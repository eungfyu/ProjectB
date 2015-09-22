package com.webapp.mapper;

import java.util.List;

import com.webapp.model.Member;

public interface MemberMapper {

	List<Member> selectAllMembers();

	Member selectByNo(int no);
	Member selectById(String id);
	Member selectByPhone(String phone);

	int selectTotalCoint();
	
	int insert(Member member);
	int update(Member member);
	
	int deleteById(String id);
	
	
}
