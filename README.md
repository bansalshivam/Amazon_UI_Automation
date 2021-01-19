# PageObjectModel_Maven_TestNG
This framework is about executing web application test cases using TestNG and Java. Written all the given test cases with execution reports.

# Pre-Requisites:
Mac/Windows System.
Java
plugins - Maven, TestNG, Surefire, extended reports, selenium


# Framework Structure:
Just need to run from any CI/CD pipeline by adding below command.
<Your Maven runner> (mvn clean install)

# Features or capabilities of this Framework
1. Anybody, without any language knowledge can write selenium test cases.
2. Very easy debugging of test results with concise html report.
3. All test cases are written in separate files, So if any new test case need to be added by some user in future, he/she just need to add a new file and name of file in test_selector.ini file.
4. Locators are separated from test cases, so that if there's any change in locator, it can be easily changed in that common file.
5. Reports are generating in seperate folder with time stamp in order to get historical report of any test case.
6. [For Future] This framework can easily be integrated with jenkins for end to end testing.
7. [For Future] We can easily add support for mobile devices with appium library.
