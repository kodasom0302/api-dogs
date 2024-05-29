package com.javaex.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.NoticeVo;

@Repository
public class NoticeDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	//글 전체 갯수 //리스트(검색O, 페이징O)
	public int selectTotalCnt(String keyword) {
		System.out.println("PagingDao.selectTotalCnt()");

		int totalCount = sqlSession.selectOne("notice.selectTotalCnt", keyword);
		
		System.out.println(totalCount);

		return totalCount;
	}

	//리스트2(검색O, 페이징O)
	public List<NoticeVo> selectList2(Map<String, Object> limitMap) {
		System.out.println("PagingDao.selectList2()");

		List<NoticeVo> nList = sqlSession.selectList("notice.selectList2", limitMap);
		
		System.out.println(nList);

		return nList;
	}
	
	//수정
	public int updateNotice(NoticeVo noticeVo) {
		System.out.println("NoticeDao.updateNotice()");
		
		return sqlSession.update("notice.update", noticeVo);
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
