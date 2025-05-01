package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member member01 = new Member("jws", "정우성", 50000);
		member01.showInfo();
		
		Member member02 = new Member("yjs", "유재석", 30000);
		member02.showInfo();
		
		Member member03 = new Member("lhr", "이효리", 40000);
		member03.showInfo();
	}

}
