package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args){
		
		/*
		 Song(파라미터0개) //게터 세터 입력 시
		 
		 출력 =>
		 Song(파라미터5개)
		 Song(파라미터6개)
		 좋은날 아이유 Real 이민수 2010 3
		 
		 */
		
		Song s1 = new Song("좋은날", "아이유", "Real", "이민수", "2010", 3);
		s1.showInfo();
	}

}

