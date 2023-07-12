# TOGETHER FOR HER

# Overview
This repository provides code for automating mobile application(Together For Her) using the Appium tool. Appium is an open-source automation tool that supports native, hybrid, and mobile web applications for both iOS and Android platforms.
To design this framework, I used page object model(POM) for the reusability of the code and maintaining our test scripts easily.


## Tools Used

| Tool             | Version                                                                |
| ----------------- | ------------------------------------------------------------------ |
| Appium|  2.0 |
| Selenium | 4.9 |
| Maven | 3.9 |
| Jenkins | 2.85 |



## Structure 
src/main/java : Directory contains three packages.
1) BasePage   : This package have only one class i.e               BasePage which is responsible for initialize Android driver and read the .properties file.

2) Pages      : This package contains classess according to the webpages i.e each webpage having a different class and class contains locators,methods, and constructor.

3) Util       : This package contains the Utilities, customListner, and ExtentReportorNG classess.


src/main/resources : Directory contains config.properties file which contains environment variables.

src/test/java  : Directory contains the actual test scripts.

src/test/resources : Directory contains the extent report.

POM.XML             : Contains the following dependencies
1)Selenium
2)TestNG
3)ExtentReport
4)Java client
5)Maven surefire plugin

## Roadmap

- Start Appium server add the respective desired capabilities.

- To Run the framework use maven(command line)/Jenkins(CI/CD).(Profiler_Id: "1").


## Running Tests

To run tests, run the following commands

```bash
  mvn clean
```
```bash
  mvn compile
```
```bash
  mvn test -P1
```

## Clone Repository 

To clone, run the following command on your git bash

```bash
  git clone https://github.com/swapnil9096/TFH_Framework.git
```

## 🛠 Skills
Java, Selenium


## Reporting (ExtentReport)
The framework generates detailed reports for test execution. After running the tests, the reports can be found in the "Reports" folder. These reports provide all information about test results, including pass/fail status, execution time, and any captured screenshots.


## 🚀 About Me
I'm Automation Tester...!


## Author

- [@swapnil9096](https://www.github.com/swapnil9096)

