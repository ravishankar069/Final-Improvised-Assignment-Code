package com.cts.rabocustomerrecordsprocessor;

import java.util.List;

/**
 * 
 * this class gets the duplicates from the validateData class.
 */
public class Duplicates {
	
	/**
	 * 
	 * @param dupeList
	 */
	public static void duplicates(List<String> dupeList){
		 String repeatedReference[] = dupeList.toArray(new String[dupeList.size()]);
		 
		 System.out.println("\n\n\nDuplicated : ");
         System.out.println("------------");
         for(String repeat : repeatedReference){
        	 String dupes[] = repeat.split(",");
             System.out.println("\nRecord \nTransaction Reference : "+dupes[0]);
             System.out.println("Description : "+dupes[4]);
         }
	}
}
