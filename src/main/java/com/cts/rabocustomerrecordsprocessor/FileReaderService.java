package com.cts.rabocustomerrecordsprocessor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * this is a configuration class which also provides the bean by scanning the components in the package.
 */
@Configuration
@ComponentScan(basePackages = "com.cts.rabocustomerrecordsprocessor")
public class FileReaderService {

}
