package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.NoticeService;
import com.javaex.vo.NoticeVo;

@RestController
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	//삭제
	@DeleteMapping("/api/notice/delete/{no}")
	public String noticeDelete(@PathVariable("no") int no) {
		System.out.println("NoticeController.noticeDelete()");
		
		int count=noticeService.exeDelete(no);
		
		String result=count+"건 삭제 되었습니다.";
		
		return result;
	}
	
	//읽기
	@GetMapping("/api/notice/read/{no}")
	public NoticeVo noticeRead(@PathVariable("no") int no) {
		System.out.println("NoticeController.noticeRead()");
		
		NoticeVo nVo=noticeService.exeRead(no);
		
		return nVo;
	}
	
	//리스트
	@GetMapping("/api/notice/list")
	public List<NoticeVo> noticeList() {
		System.out.println("NoticeController.noticeList()");
		
		List<NoticeVo> nList=noticeService.exeList();
		
		return nList;
	}

}
