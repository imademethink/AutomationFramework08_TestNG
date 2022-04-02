dir /s /B *.java > sources.txt
set CLASSPATH=D:\TonyStark\Framework08_TestNG\external_jar\testng\*;D:\TonyStark\Framework08_TestNG;D:\TonyStark\Framework08_TestNG\bin;
RMDIR /Q/S bin
MKDIR bin
javac @sources.txt -d bin
java -cp %CLASSPATH% org.testng.TestNG testng.xml
REM D:\TonyStark\Framework08_TestNG\bin\com\ecom\electronics;
REM D:\TonyStark\Framework08_TestNG\bin\com\ecom;
REM D:\TonyStark\Framework08_TestNG\bin\com;
REM D:\TonyStark\Framework08_TestNG\src;
REM D:\TonyStark\Framework08_TestNG\src\com