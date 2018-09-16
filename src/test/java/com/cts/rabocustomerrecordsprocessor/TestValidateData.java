package com.cts.rabocustomerrecordsprocessor;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class TestValidateData
{
    String[] record = {"123456abc", "123456xyz"};
    ValidateData testData = new ValidateData();
    ArrayList<String> dataList = new ArrayList<String>();
    
    @Before
    public void setUp(){
    dataList.add("123456xyz");
    }
    
    @Test
	public void testValidateData() throws Exception
	{
	assertEquals(dataList, testData.validateData(record));
	}
}
