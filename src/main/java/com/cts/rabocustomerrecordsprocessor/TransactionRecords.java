package com.cts.rabocustomerrecordsprocessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 
 * @author RAVI  
 * @param reference
 * @param account number
 * @param description
 * @param start balance
 * @param mutation
 * @param end balance
 * this class holds the record parameters of the customers to be validated. 
 */
@Component
public class TransactionRecords {
	private String reference, accNumber, description, startBalance, mutation, endBalance;
	
	/**
	 * 
	 * here the interface file reader wired and the qualifier built to choose whether xml or csv file has been taken into action. 
	 */
	@Autowired
	@Qualifier("csvReader")
	private FileReader reader;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStartBalance() {
		return startBalance;
	}

	public void setStartBalance(String startBalance) {
		this.startBalance = startBalance;
	}

	public String getMutation() {
		return mutation;
	}

	public void setMutation(String mutation) {
		this.mutation = mutation;
	}

	public String getEndBalance() {
		return endBalance;
	}

	public void setEndBalance(String endBalance) {
		this.endBalance = endBalance;
	}
	
	public FileReader getReader() {
		return reader;
	}

	public void setReader(FileReader reader) {
		this.reader = reader;
	}
	
	public String[] recordsReader() throws Exception{
		return reader.readData();
	}
}
