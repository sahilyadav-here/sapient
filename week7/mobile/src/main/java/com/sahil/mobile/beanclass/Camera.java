package com.sahil.mobile.beanclass;

public class Camera {
	
private int no_pixel;

public Camera(int no_pixel) {
	super();
	this.no_pixel = no_pixel;
}

public int getNo_pixel() {
	return no_pixel;
}

public void setNo_pixel(int no_pixel) {
	this.no_pixel = no_pixel;
}

@Override
public String toString() {
	return "Camera [no_pixel=" + no_pixel + "]";
}


}
