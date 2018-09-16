package com.cts.rabocustomerrecordsprocessor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @param validFail list
 * this class gets the uniques from validatedata class and validate the start balance and mutation with end balance.
 */
public class Validator {
	public static List<String> validFail = new ArrayList<String>();
	
	/**
	 * 
	 * @param validCheck 
	 * validator[] holds the validation passed records.
	 * validFail list contains the validation failed records.
	 */
    public List<String> findFalseRecords(List<String> validCheck){	
     String unique[] = validCheck.toArray(new String[validCheck.size()]);
		
	 for(String pass : unique){
		  String validator[] = pass.split(",");          
          if(((new BigDecimal(validator[2])).add(new BigDecimal(validator[3]))).equals(new BigDecimal(validator[5]))){
          System.out.println("\nRecord \nTransaction Reference : "+validator[0]);
          System.out.println("Account Number : "+validator[1]);
          System.out.println("Start Balance : "+validator[2]);
          System.out.println("Mutation : "+validator[3]);
          System.out.println("Description : "+validator[4]);
          System.out.println("End Balance : "+validator[5]);
          }
          else if(!(((new BigDecimal(validator[2])).add(new BigDecimal(validator[3]))).equals(new BigDecimal(validator[5])))){
          validFail.add("\nRecord\nTransaction Reference : "+validator[0]+"\nAccount Number : "+validator[1]+"\nStart Balance : "+validator[2]+"\nMutation : "+validator[3]+"\nDescription : "+validator[4]+"\nEnd Balance : "+validator[5]);	
          }
       }
	   return validFail;
	 }
}
