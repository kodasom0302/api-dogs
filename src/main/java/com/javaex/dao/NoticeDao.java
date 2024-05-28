package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.NoticeVo;

@Repository
public class NoticeDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	//등록
	public int updateNotice() {
		System.out.println("NoticeDao.updateNotice()");
		
		return sqlSession.update("notice.update");
	}
	
	//등록
	public int insertNotice() {
		System.out.println("NoticeDao.insertNotice()");
		
		return sqlSession.insert("notice.insert");
	}
	
	//삭제
	public int deleteNotice(int no) {
		System.out.println("NoticeDao.deleteNotice()");
		
		return sqlSession.delete("notice.delete", no);
	}
	
	//읽기
	public NoticeVo selectOneNotice(int no) {
		System.out.println("NoticeDao.selectOneNotice()");
		
		NoticeVo nVo=sqlSession.selectOne("notice.selectOne", no);
		
		return nVo;
	}
	
	//리스트
	public List<NoticeVo> selectList() {
		System.out.println("NoticeDao.selectList()");
		
		List<NoticeVo> nList=sqlSession.selectList("notice.selectList");
		
		return nList;
	}

}
