package com.sahil.TransactionReport;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import TransactionData.TransactionReader;
import TransactionData.Transactions;

@RestController
public class LogController {

	@GetMapping("/log")
	public List<Log> greeting() throws IOException {
		List<Transactions> list = TransactionReader.read();
		return LogGenerator.calculate(list);
	}

}
