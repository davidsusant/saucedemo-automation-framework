# SauceDemo Test Automation Framework

A test automation framework for SauceDemo.

## Tech Stack

- Programming language: Java
- Browser automation: Selenium WebDriver
- BDD framework: Cucumber
- Testing framework: TestNG
- Build tool: Gradle
- Driver management: WebDriverManager
- Design pattern: Page Object Model

## Project Structure

```
src/
└── test/
    ├── java/
    │   ├── pages/
    │   │   ├── BasePage.java
    │   │   ├── LoginPage.java
    │   │   └── ProductsPage.java
    │   ├── stepdefinitions/
    │   │   ├── LoginStepDefinitions.java
    │   ├── hooks/
    │   │   └── Hooks.java
    │   ├── runners/
    │   │   ├── TestRunner.java
    │   │   └── testng.xml
    │   ├── utils/
    │   │   ├── ConfigReader.java  
    │   │   └── DriverManager.java  
    └── resources/
        ├── features/
        │   ├── login.feature
        └── config.properties   
```

## Running Tests

### Run all tests

```bash
gradle test
```

### Run specific feature

```bash
./gradlew runFeature -Pfeature="login.feature"
```