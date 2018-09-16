package com.cts.rabocustomerrecordsprocessor;

/**
 * 
 * this interface contains a method to be overriden by xml reader and csv reader class.
 */
interface FileReader {
	public String[] readData() throws Exception;
}
