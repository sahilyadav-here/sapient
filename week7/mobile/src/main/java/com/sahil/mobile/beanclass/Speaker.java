package com.sahil.mobile.beanclass;

public class Speaker {
	
	private int levels;
	@Override
	public String toString() {
		return "Speaker [levels=" + levels + ", type=" + type + "]";
	}
	private String type;
	public Speaker(int levels, String type) {
		super();
		this.levels = levels;
		this.type = type;
	}
	public int getLevels() {
		return levels;
	}
	public void setLevels(int levels) {
		this.levels = levels;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
