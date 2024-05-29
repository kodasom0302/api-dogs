package com.javaex.vo;

public class NoticeVo {
	
	private int no;
	private String name;
	private String title;
	private String content;
	private String regDate;
	private int total;	//총 개수
	
	public NoticeVo() {
	}
	public NoticeVo(int no, String name, String title, String content, String regDate, int total) {
		this.no = no;
		this.name = name;
		this.title = title;
		this.content = content;
		this.regDate = regDate;
		this.total = total;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "NoticeVo [no=" + no + ", name=" + name + ", title=" + title + ", content=" + content + ", regDate="
				+ regDate + ", total=" + total + "]";
	}

}
