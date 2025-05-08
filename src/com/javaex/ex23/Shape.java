package com.javaex.ex23;

public abstract class Shape {

	//필드
	protected String fillColor;
	protected String lineColor;
	
	
	//생성자
	public Shape() {

	}
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	
	//메소드 gs
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lintColor) {
		this.lineColor = lintColor;
	}

	
	//메소드 일반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lintColor=" + lineColor + "]";
	}
	/*
	public void draw() {
		
	}
	*/
	public abstract void draw(); //오버라이딩 용 메소드
	
}
