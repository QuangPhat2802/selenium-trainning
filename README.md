# Selenium BDD Automation Project

This project is the demo automated testing framework using **Selenium WebDriver**, **BDD (Cucumber)**, **Page Object Model (POM)**, **Maven**, and **Java 17**. It provides a structured way to write and maintain tests for web applications.

## Prerequisites

Make sure you have the following installed:

- **Java JDK 17 or higher**: [Download here](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- **Maven** (for dependency management): [Install Maven](https://maven.apache.org/install.html) 
- **An IDE** (e.g., IntelliJ IDEA) is recommended
- **Jira Trail Account**: [Signup here](https://www.atlassian.com/try/cloud/signup?bundle=jira-software&edition=standard) 

## Usage

1. Run `mvn clean install -DskipTests` to install the dependencies.
2. Create two environment variable `JIRA_EMAIL` and `JIRA_PASSWORD`
   - export JIRA_EMAIL="user@example.com"
   - export JIRA_PASSWORD="password"
3. Run test using command `mvn test`

## Reference
- https://cucumber.io/docs/cucumber/api/?lang=java
- https://www.selenium.dev/documentation/overview/
- https://www.lambdatest.com/blog/xpath-vs-css-selectors/
- https://www.browserstack.com/guide/page-object-model-in-selenium
- https://support.atlassian.com/jira-software-cloud/resources/
