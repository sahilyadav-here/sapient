package com.sahil.TransactionReport;

import java.util.HashMap;

public class Rate {
	
	public static float getRates(String str, boolean isP) {
		HashMap<String, Float> rates = new HashMap<String, Float>();
			rates.put("high" , (float) 500.0);
			rates.put("BUY" , (float) 50.0);
			rates.put("SELL" , (float) 100.0);
			rates.put("DEPOSIT" , (float) 50.0);
			rates.put("WITHDRAW" , (float) 100.0);
			rates.put("INTRADAY" , (float) 10.0);
			String key = "";
			if(isP == true) {
				key = "high";
			}
			else {
				key = str;
				System.out.println(key);
			}
			if(rates.containsKey(key))
				return rates.get(key);
			
			return (float) 0.0;
	}

}
