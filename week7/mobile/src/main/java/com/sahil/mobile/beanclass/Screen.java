package com.sahil.mobile.beanclass;

public class Screen {
	private int height;
	private int width;
	public Screen(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}
	@Override
	public String toString() {
		return "Screen [height=" + height + ", width=" + width + "]";
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
}
