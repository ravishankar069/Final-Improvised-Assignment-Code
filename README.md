Rabobank Customer Statement Processor
--------------------------------------
This assignment's main objective is that rabobank receives monthly deliveries of customer statement records and those information is delivered in two formats, CSV and XML, so that these records need to be validated.

Abstract
--------
First of all, the records has been read from the Xml or Csv file and each customer records has been stored in the indexes of the string array to check the duplicate reference number and bigdecimal class has been used to validate the start balance and mutation with end balance.

Precautions
-----------
Pojo has been used for secure and appropriate usage of customer records and annotations concept is used to wire the readed record and to do the validation.

XmlReader
---------
Eventhough the saxparser has appropriate advantage than the domparser, here chosen domparser because it is easy to implement with less code and most using technique among the professionals.

CsvReader
---------
Usually its a good practice to use libraries in the code because it reduces the code length hence here used OpenCsv library.
