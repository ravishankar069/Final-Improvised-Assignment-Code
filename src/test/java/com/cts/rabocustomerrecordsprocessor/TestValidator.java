package com.cts.rabocustomerrecordsprocessor;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestValidator 
{
	Validator validCheck = new Validator();
	ArrayList<String> validCheckList = new ArrayList<String>();
	ArrayList<String> validFailList = new ArrayList<String>();
	
	@Before
	public void setUp(){
		validCheckList.add("123,abc,1.0,1.0,tuv,2.0");
		validCheckList.add("456,def,1.2,-0.2,xyz,1.5");
		validFailList.add("\nRecord\nTransaction Reference : "+456+"\nAccount Number : "+"def"+"\nStart Balance : "+1.2+"\nMutation : "+-0.2+"\nDescription : "+"xyz"+"\nEnd Balance : "+1.5);
	}
	
	@Test
	public void testValidator() 
	{
		assertEquals(validFailList,validCheck.findFalseRecords(validCheckList));
	}
}
