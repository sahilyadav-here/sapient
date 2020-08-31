package com.sahil.TransactionReport;

import java.util.HashMap;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import TransactionData.Transactions;

public class LogGenerator {
	static HashMap<String, Transactions> transactionMap = new HashMap<String, Transactions>();
	static List<Log> reportList = new ArrayList<Log>();

	public static List<Log> calculate(List<Transactions> transactionList) throws IOException {

		for (Transactions transaction : transactionList) {
			String key = transaction.getcId() + "_" + transaction.getsId() + "_"
					+ transaction.gettDate().toString();
//			System.out.println(key);

			if (transactionMap.containsKey(key)) {
				Transactions previousTransaction = transactionMap.get(key);
				if (transaction.gettType().equals("SELL") && previousTransaction.gettType().equals("BUY")) {
					previousTransaction.settType("INTRADAY");

				}

			} else {
				transactionMap.put(key, transaction);
			}
		}
		System.out.println("**** log details ****");
		for (String key : transactionMap.keySet()) {

			Transactions transaction = transactionMap.get(key);
			String clientId = transaction.getcId();
			String type = transaction.gettType();
			String transactionDate = transaction.gettDate();
			boolean isPriority = transaction.isFlag();
			float processingFee = Rate.getRates(type, isPriority);
			Log reportItem = new Log(clientId, type, transactionDate, isPriority,
					processingFee);
			System.out.println(reportItem.toString());
			reportList.add(reportItem);
			
		}
		printLog(reportList);
		return reportList;
	}

	private static void printLog(List<Log> reportList2) throws IOException {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir") + "/src/main/java/TransactionData/logFile.txt";  
	        FileWriter fw=new FileWriter(path);
	        for(Log i : reportList2) {
	        	fw.write(i.toString());
	        	fw.write(System.getProperty("line.separator"));
	        }
	        fw.close();
	        System.out.println("Success with log file generation"); 
	       
		
	}

}
