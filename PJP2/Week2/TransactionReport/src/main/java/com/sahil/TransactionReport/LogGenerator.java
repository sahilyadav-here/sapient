package com.sahil.TransactionReport;

import java.io.FileWriter;
import java.io.IOException;

public class LogGenerator {
	private String cId;
	private String tType;
	private String tDate;
	private boolean flag;
	private float fee;
	public static String log = "";
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
	public LogGenerator(String cId, String tType, String tDate, boolean flag, float fee) {
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
	
	public static void detailLog(String line)
	{
		String [] arr = line.split(",");
		System.out.println(arr[5]);
		if(arr[2].equals(""))
		{
			log  = log + arr[1] + "," + arr[3] + "," + arr[4] + "," + arr[6];
			if(arr[6].equals("N"))
				log = log + "," + "500";
			else
			{
				if(arr[3].equals("sell") || arr[3].equals("withdraw"))
					log = log + "," + "100";
				else
					log = log + "," + "50";
			}
			log = log + "\n";
		}
		else
		{
			log = log + arr[1] + "," + arr[3] + "," + arr[4] + "," + "N" +"," + "10" + "\n";
		}
	}
	public static String printLog() throws IOException
	{

		try{    
			String csvFile = System.getProperty("user.dir") + "/src/main/java/TransactionData/output.csv";
	        FileWriter fw=new FileWriter(csvFile);    
	        fw.write(log);  
	        System.out.println(log);
	        fw.close();
	       }catch(Exception e){System.out.println(e);}    
	       System.out.println("Success...");
	       return log;
	}
	

}
