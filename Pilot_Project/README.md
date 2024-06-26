# Pilot Project

This is a simple Java project generated by the Gradle 'init' task. The project contains a basic Java application and a corresponding JUnit test.
Here it can be used to determined if Java with Gradle build tool is successfully installed and configured in your Project or not.

## Project Structure

- `src/main/java/pilot_project/App.java`: The main class of the application.
- `src/test/java/pilot_project/AppTest.java`: The test class for the main application.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Gradle 6.0 or higher

### Building the Project

To build the project, navigate to the project root directory and run:

```sh
./gradlew build
```

### Running the Application

To run the application, use the following command:

```sh
./gradlew run
```

This will compile the source code and run the `App` class, printing the greeting message to the console.

### Running the Tests

To run the tests, use the following command:

```sh
./gradlew test
```

This will compile the test classes and run the `AppTest` class to verify that the `App` class works as expected.

### Project Contents

- `build.gradle`: The Gradle build file containing project configuration and dependencies.
- `settings.gradle`: The Gradle settings file.
- `src/main/java`: Directory containing the main source code.
- `src/test/java`: Directory containing the test source code.
