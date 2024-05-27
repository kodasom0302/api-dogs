package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.NoticeDao;
import com.javaex.vo.NoticeVo;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeDao noticeDao;
	
	//삭제
	public int exeDelete(int no) {
		System.out.println("NoticeService.exeDelete()");
		
		return noticeDao.deleteNotice(no);
	}
	
	//읽기
	public NoticeVo exeRead(int no) {
		System.out.println("NoticeService.exeRead()");
		
		NoticeVo nVo=noticeDao.selectOneNotice(no);
		
		return nVo;
	}
	
	//리스트
	public List<NoticeVo> exeList() {
		System.out.println("NoticeService.exeList()");
		
		List<NoticeVo> nList=noticeDao.selectList();
		
		return nList;
	}

}
