package com.javaex.ex01;

public class Member {

	
	//필드
	private String id;
	private String name;
	private int point;

	
	
	//생성자
	public Member() {
		
	}	
	public Member(String id, String name, int point) {
		this.id = id;
		this.name = name;
		this.point = point;
	}	
	
	
	//메소드 gs
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	//메소드 일반
}
