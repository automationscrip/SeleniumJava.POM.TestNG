
# SeleniumJava.POM.TestNG
## Introduction
This is a basic test automation framework for **Selenium WebDriver** with *Java*, *maven* and *TestNG* based on Page object model. 
It helps a beginner to understand the concepts of *Page object model* based automation framework design. 
Note :

> This framework uses **public static instance of WebDriver**


Contrary to belief of some SDETs,  using **public static WebDriver** is not wrong, untill it fulfills our requirement.


Please refer to limitations to know more about the area where this framework will be 

## Test Scenario
For the purpose of understanding the framework, We have taken a very simple test scenario.
	Search a keyword on google and validate if the keyword appears as the first result on search results page.
	
	### Test Steps:
	1. Open google search application: url- www.google.com
	2. Enter a keyword in the search box
	3. On the search results page, validate if the keyword appears as the first result.
## Plugins

 1. **Eclipse Plugin** - If you want to run your tests from Eclipse as *TestNG Suite*, you need to download TestNG in Eclipse through *available software site*-  [TestNG](https://dl.bintray.com/testng-team/testng-eclipse-release/).

2. **Maven Dependencies** - This framework has been designed with following maven dependencies as defined further in the *pom.xml*.
	| Dependency | Version | Purpose |
	|--|--|--|
	| Selenium WebDriver|3.141| It automates the testing of web application.|
	| TestNG|7.3.0|To run the tests as a suite.|
	| Extent Reports|5.0.6|To genarate Enhanced html reports after test run.|
	| APACHE Commons IO|2.8.0|To perform file opeartions.|
	| webdrivermanager|4.3.1| WebDriverManager is a library which allows to automate the management of the drivers (e.g. _chromedriver_, _geckodriver_, etc.) required by Selenium WebDriver. [bonigarcia/webdrivermanager: Automated driver management for Selenium WebDriver (github.com)](https://github.com/bonigarcia/webdrivermanager#basic-usage)|


	*pom.xml*

			<dependency>
				<groupId>org.seleniumhq.selenium</groupId>
				<artifactId>selenium-java</artifactId>
				<version>3.141.59</version>
			</dependency>
			<dependency>
				<groupId>org.testng</groupId>
				<artifactId>testng</artifactId>
				<version>7.3.0</version>
				<scope>test</scope>
			</dependency>
			<dependency>
				<groupId>com.aventstack</groupId>
				<artifactId>extentreports</artifactId>
				<version>5.0.6</version>
			</dependency>
			<dependency>
				<groupId>commons-io</groupId>
				<artifactId>commons-io</artifactId>
				<version>2.8.0</version>
			</dependency>
			<dependency>
			    <groupId>io.github.bonigarcia</groupId>
			    <artifactId>webdrivermanager</artifactId>
			    <version>4.3.1</version>	    
			</dependency>

## How to use

 1. ### Download Dependencies


	First of all, you need to download your maven depenedencies using any of the maven commands such as 
	Go to-
		 1. *Eclipse> Project Explorer*
		 2. Right click on the project.
		 3. *Maven> Update Project*.
 

 2. ### What is BasePage
	It is a Java class written for initialising the following components of the framework as *public static*.

	 1. Setup the Selenium WebDriver
	 2. Before the test, launch an instance of WebDriver.
	 3. After completing the test, quit the instance of WebDriver.
	 4. Initialize Extent Reports

	After all the above mentioned components are initialised, they can be accessed in any of the class through the concept of Inheritance (remember ***extends*** keyword) in Java. In our project we have following Base Page class.
	

> `SeleniumJava.POM.TestNG> src/main/java> quickstart.pages> BasePage.java`

3. ### What are Page classes
	We create page classes for each of the page of our application. These page classes inherit the BasePage to access the instance of above mentioned components. In our project we have following page class.
	

> `SeleniumJava.POM.TestNG> src/main/java> quickstart.pages> GooglePage.java`

4. ### What is DemoTest
	 DemoTest is a class written for our test methods. every Test method has annotation *@test*. This is the place where we have all the checkpoints.
	 In our project we have following Test class.
	

> `SeleniumJava.POM.TestNG> src/test/java> quickstart.tests> DemoTest.java`

 5. ### Run tests through testng.xml
	 If you want to run your tests through testng.xml , You can perform following steps.

		

	 1. Eclipse>Project Explorer
	 2. Open/Expand the project
	 3. Right click on the *testng.xml*
	 4. *Run As> TestNG Suite*

	It will run all the tests as per defined classes in the the file.
	 
 6. ### Run tests through maven
	 If you want to run your tests through maven, You can perform following steps.
	1. *Eclipse> Project Explorer*
	2. Right click on the project.
	3. *Run As> Maven test*.

			 
	It will automatically run all the tests as per below convention.
	
	 1. Classes under src/test/java
	 2. Class name with text *Test* in the beginneing or end
	 3. Test methods with annotation @test



## Limitations
This framework has some limitations and you need to analyze your requirements before using it in your project. 

 1. It doesn't handle multi-threading and parallel test execution well.
 2. It doesn't support test execution on Selenium Grid(Remote).
 

These limitations are similar in nature as *"A TDD framework doesn't work with BDD development."* 

Every program has a certain outcome and to achieve a different outcome, you need to program in a different way.
