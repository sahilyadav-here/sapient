package com.sahil.mobile.beanclass;

public class Mobile {
	
	private Speaker speaker;
	private Screen screen;
	private Camera camera;
	
	public Mobile() {
	}
	
	public Speaker getSpeaker() {
		return this.speaker;
	}
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public Mobile(Speaker speaker, Screen screen, Camera camera) {
		this.speaker = speaker;
		this.setScreen(screen);
		this.setCamera(camera);
	}

	public Screen getScreen() {
		return screen;
	}

	@Override
	public String toString() {
		return "Mobile [speaker=" + speaker + ", screen=" + screen + ", camera=" + camera + "]";
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

}
