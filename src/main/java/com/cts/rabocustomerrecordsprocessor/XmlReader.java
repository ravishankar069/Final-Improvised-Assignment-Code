package com.cts.rabocustomerrecordsprocessor;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.InputStream;

/**
 * 
 * this class reads the xml file and converts each customer records into string and store that into array for further validation.
 */
@Component
public class XmlReader implements FileReader{
	TransactionRecords trXml = new TransactionRecords();	
	String raboXml[] = null;

	/**
	 * 
	 * @return raboXml[] contains customer records in each index
	 */
     public String[] readData()throws Exception{        	
          try {        	  
           InputStream xmlFile = this.getClass().getClassLoader().getResourceAsStream("records.xml"); //records.xml file contains customer records
           DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
           DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
           Document parser = dBuilder.parse(xmlFile);              
           parser.getDocumentElement().normalize();

           System.out.println("Root element :" + parser.getDocumentElement().getNodeName());

           NodeList nList = parser.getElementsByTagName("record");
           System.out.println("----------------------");
           raboXml = new String[nList.getLength()];

           for (int temp = 0; temp < raboXml.length; temp++) {
                    Node nNode = nList.item(temp);
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {                    	
                    	Element eElement = (Element) nNode;
                    	trXml.setReference(eElement.getAttribute("reference"));
                    	trXml.setAccNumber(eElement.getElementsByTagName("accountNumber").item(0).getTextContent());                          
                    	trXml.setStartBalance(eElement.getElementsByTagName("startBalance").item(0).getTextContent()); 
                    	trXml.setMutation(eElement.getElementsByTagName("mutation").item(0).getTextContent());
                    	trXml.setDescription(eElement.getElementsByTagName("description").item(0).getTextContent());
                    	trXml.setEndBalance(eElement.getElementsByTagName("endBalance").item(0).getTextContent());;
                         
                        raboXml[temp] = (trXml.getReference()+","+trXml.getAccNumber()+","+trXml.getStartBalance()+","+trXml.getMutation()+","+trXml.getDescription()+","+trXml.getEndBalance());
                    }
               }             
          } catch (Exception e){
             e.printStackTrace();
          }
   	      return raboXml;      
     }
}