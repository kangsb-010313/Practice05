package com.javaex.ex23;

public class ShapeApp {

	public static void main(String[] args) {

		// Shape s01 = new Shape("빨강", "주황");
		// System.out.println(s01.toString());
		
		Triangle t01 = new Triangle("노랑", "초록", 10, 15);
		System.out.println(t01.toString());
		t01.draw();
		
		Rectangle r01 = new Rectangle("파랑", "남색", 20, 25);
		System.out.println(r01.toString());
		r01.draw();
		
		Circle c01 = new Circle("보라", "검정", 13);
		System.out.println(c01.toString());
		c01.draw();
		
		System.out.println("------------------------------------");
		
		Shape[] sArray = new Shape[3];
		
		Shape st = new Triangle("노랑", "초록", 10, 15);
		Shape sr = new Rectangle("파랑", "남색", 20, 25);
		Shape sc = new Circle("보라", "검정", 13);
		
		sArray[0] = st;
		sArray[1] = sr;
		sArray[2] = sc;
		
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].toString());
			sArray[i].draw();
		}
		
		System.out.println("------------------------------------");
		
		//업캐스팅
		Shape[] sArray2 = new Shape[3];
		sArray2[0] = t01;
		sArray2[1] = r01;
		sArray2[2] = c01;
		
		for(int i=0; i<sArray2.length; i++) {
			System.out.println(sArray2[i].toString());
			sArray2[i].draw();
		}
		
		System.out.println("------------------------------------");
		
		//다운캐스팅
		System.out.println(((Triangle)sArray2[0]).getFillColor());
		System.out.println(((Circle)sArray[2]).getRadius());
	}

}
