package com.cts.rabocustomerrecordsprocessor;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @param recordList
 * @param duplicateList
 * this class compares the reference of each customer and stores the unique customer into recordlist and duplicates into duplicatelist.
 */
public class ValidateData {	
	public static List<String> recordList;
    public static List<String> duplicateList;
	public static int dataLength;
    
	/**
	 * 
	 * @param data
	 * @return recordList which contains unique customers based on reference number.
	 * @throws Exception
	 */
	public List<String> validateData(String data[]) throws Exception{
		recordList = new ArrayList<String>();
		duplicateList = new ArrayList<String>();     
 		dataLength = data.length;
        int cnt= 0;
           for(int i=0;i<dataLength;i++){
             for(int j=i+1;j<dataLength;j++){
                if((data[i].substring(0,6)).equals((data[j].substring(0,6)))){
                  cnt+=1;
             }      
           }
           if(cnt<1){
              recordList.add(data[i]);
             }else if(cnt == 1){
              duplicateList.add(data[i]);
             }
             cnt=0;
             }
			return recordList;
      }
}
