package com.sahil.TransactionReport;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import TransactionData.TransactionReader;

@RestController
public class LogController {

	@GetMapping("/log")
	public String greeting() throws IOException {
		TransactionReader.read();
	    String log = LogGenerator.printLog();
		return log;
	}

}
