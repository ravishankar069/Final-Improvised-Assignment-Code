package com.cts.rabocustomerrecordsprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
	try {
	@SuppressWarnings("resource")
	ApplicationContext context = new AnnotationConfigApplicationContext(FileReaderService.class);	
	
	TransactionRecords transRecords = context.getBean(TransactionRecords.class);
	ValidateData dataValid = new ValidateData();
	dataValid.validateData(transRecords.recordsReader());
	Validator validator = new Validator();
	validator.findFalseRecords(ValidateData.recordList);
	InvalidEndBalance.invalidEndBalance(Validator.validFail);
	Duplicates.duplicates(ValidateData.duplicateList);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	}
}
   