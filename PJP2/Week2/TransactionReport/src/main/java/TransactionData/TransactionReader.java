package TransactionData;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;


public class TransactionReader {

	public static final String delimiter = ",";
	static List<Transactions> transactionList = new ArrayList<Transactions>();

	public static List<Transactions> read() throws IOException
	   {
		String path = System.getProperty("user.dir") + "/src/main/java/TransactionData/input.csv";
		Reader reader = Files.newBufferedReader(Paths.get(path));
		try (CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT)) {
			for (CSVRecord csvRecord : csvParser) {
				String externalTransactionId = csvRecord.get(0);
				String clientId = csvRecord.get(1);
				String securityId = csvRecord.get(2);
				String transactionDate = csvRecord.get(4);
				String type = csvRecord.get(3);
				float marketValue = Float.parseFloat(csvRecord.get(5));
				Boolean isPriority = csvRecord.get(6)=="Y" ? true : false;
				Transactions t = new Transactions(externalTransactionId, clientId ,securityId, type, transactionDate, marketValue, isPriority);
				transactionList.add(t);
				System.out.println(t.toString());


			}
		}

		return transactionList;
		
	   }

}