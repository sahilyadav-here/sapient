package TransactionData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import com.sahil.TransactionReport.*;

public class TransactionReader {

	public static final String delimiter = ",";

	public static void read()
	   {
	      try {
	    	 String csvFile = System.getProperty("user.dir") + "/src/main/java/TransactionData/input.csv";
	         File file = new File(csvFile);
	         FileReader fr = new FileReader(file);
	         BufferedReader br = new BufferedReader(fr);
	         String line = "";
	         String[] tempArr;
	         int i=0;
	         while((line = br.readLine()) != null) {
	        	 if(i==0) i=i+1;
	        	 else
	        	 {
	        		LogGenerator.detailLog(line);
	            tempArr = line.split(delimiter);
	            for(String tempStr : tempArr) {
	               System.out.print(tempStr + " ");
	            }
	            System.out.println();
	        	 }
	         }
	         br.close();
	         } catch(IOException ioe) {
	            ioe.printStackTrace();
	         }
	   }

}