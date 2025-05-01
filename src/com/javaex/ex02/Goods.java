package com.javaex.ex02;

public class Goods {

	//필드
	private String name;
	private int price;
	
	
	//생성자
	//기본 생성자
	public Goods() {
		//기본 생성자 만들었음
	}
	
	//생성자 (2)
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}


	//메소드 gs
	public String getName() {
		return name;
	}
	public void setName(String name) { //private => public 변경
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	//메소드 일반
	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격:" + price);
	}
	
	
}




