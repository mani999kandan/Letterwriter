set projectLocation=D:\GatorsFinal\SmokeTestLetterWriter
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG \C:\Users\manikandan.m\AppData\Local\Temp\testng-eclipse--1947134384\testng-customsuite.xml
pause