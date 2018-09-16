package com.cts.rabocustomerrecordsprocessor;

import java.util.List;

/**
 * 
 * this class gets the validation failed records from the validator class.
 */
public class InvalidEndBalance {
	
	/**
	 * 
	 * @param failedList
	 */
	public static void invalidEndBalance(List<String> failedList){
	System.out.println("\n\n\nValidation Failed Records : ");
    System.out.println("---------------------------");  
    for(String strValid : failedList){
  	  System.out.println(strValid);
    }
  }
}