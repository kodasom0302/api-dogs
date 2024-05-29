package com.javaex.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.NoticeService;
import com.javaex.vo.NoticeVo;

@RestController
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	//리스트2(검색X,페이징 O)
		@GetMapping(value="/api/notice/list2")
		public Map<String, Object> list2(@RequestParam(value="crtPage", required = false, defaultValue="1") int crtPage) {
			//파라미터 crtPage가 없으면 1(페이지)로 처리
			System.out.println("TboardController.list2()");
			
			//boardService를 통해서 리스트를 가져온다
			Map<String, Object> pMap=noticeService.exeList2(crtPage);
			
			return pMap;
		}
	
	//수정
	@PutMapping("/api/notice/modify")
	public String noticeModify(@RequestBody NoticeVo noticeVo) {
		System.out.println("NoticeController.noticeModify()");
		
		int count=noticeService.exeModify(noticeVo);
		
		String result=count+"건 수정 되었습니다.";
		
		return result;
	}
	
	//등록
	@PutMapping("/api/notice/write")
	public String noticeWrite() {
		System.out.println("NoticeController.noticeWrite()");
		
		int count=noticeService.exeWrite();
		
		String result=count+"건 등록 되었습니다.";
		
		return result;
	}
	
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
