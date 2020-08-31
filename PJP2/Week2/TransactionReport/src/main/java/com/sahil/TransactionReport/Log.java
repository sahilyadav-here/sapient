package com.sahil.TransactionReport;

public class Log {
	private String cId;
	private String tType;
	private String tDate;
	private boolean flag;
	private float fee;
	
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String gettType() {
		return tType;
	}
	public void settType(String tType) {
		this.tType = tType;
	}
	public String gettDate() {
		return tDate;
	}
	public void settDate(String tDate) {
		this.tDate = tDate;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	public Log(String cId, String tType, String tDate, boolean flag, float fee) {
		super();
		this.cId = cId;
		this.tType = tType;
		this.tDate = tDate;
		this.flag = flag;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "LogGenerator [cId=" + cId + ", tType=" + tType + ", tDate=" + tDate + ", flag=" + flag + ", fee=" + fee
				+ "]";
	}
	

}
