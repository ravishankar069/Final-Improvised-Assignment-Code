package com.cts.rabocustomerrecordsprocessor;

import com.opencsv.CSVReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

/**
 * 
 * this class reads the csv file and converts each customer records into string and store that into array for further validation.
 */
@Component
public class CsvReader extends XmlReader{
	
	/**
	 * 
	 * @return raboCsv[] contains customer records in each index
	 */
	public String[] readData()throws Exception {		
		String []raboCsv = null;        
        InputStream csvFile = this.getClass().getClassLoader().getResourceAsStream("records.csv"); //records.csv file contains customer records       
        InputStreamReader streamReader = new InputStreamReader(csvFile);        
        CSVReader reader = new CSVReader(streamReader);        
        ArrayList<String> records = new ArrayList<String>();        
        try {
        	String[] tranData;
            while ((tranData = reader.readNext()) != null) {
             records.add(tranData[0] + "," + tranData[1] + "," + tranData[2] + "," + tranData[3] + "," + tranData[4] + "," + tranData[5]);
            }           
             raboCsv = records.toArray(new String[records.size()]); 
             System.out.println("RootElement : records");
             System.out.println("---------------------");
            }catch (IOException e){
            e.printStackTrace();
          }
          return raboCsv;
	 }
}
