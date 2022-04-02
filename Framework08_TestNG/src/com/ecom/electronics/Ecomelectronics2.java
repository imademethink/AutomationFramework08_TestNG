package com.ecom.electronics;

import org.testng.annotations.Test;

public class Ecomelectronics2 {

    @Test
    public void Test1(){
        System.out.println("Hello TestNG");
    }

}


//  Create simple project
//  Add TestNG jar files x 3 (bsh-2.0b4.jar, jcommander-1.48.jar, testng-6.9.10.jar)
//  Annotations were formally added to the Java language in JDK 5
//  Add @Test annotated method in a sample class
//  Get Testng.xml file template from https://testng.org/doc/documentation-main.html#testng-xml, https/ http correction
//  Add your sample class with proper package structure in xml file
//  Add header in xml file <?xml version="1.0" encoding="UTF-16"?>
//  Run the XML file (and not the java class), testng plugin by default installed in IntelliJ compare to Eclipse
//  Run using command line, batch file
//      dir /s /B *.java > sources.txt
//      set CLASSPATH=D:\TonyStark\Framework08_TestNG\external_jar\testng
//      javac @sources.txt -d bin
//      java -cp %CLASSPATH% org.testng.TestNG testng.xml