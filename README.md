# Calculator API

This is a demo project for Spring Boot, built with Java and Maven.

## Project Overview

The project is a simple calculator API, built using Spring Boot and packaged as a standalone JAR. It uses Maven for dependency management.

## Technologies Used

- Java 17
- Spring Boot 3.2.2
- Maven
- Docker
- OpenAPI for API documentation

## Building the Project

To build the project, run the following command in the project root directory:

mvn clean install

This will compile the code, run the tests, and package the application into a JAR file.

## Running the Project

To run the project, you can use the following command:


java -jar target/calculator-api-0.0.1-SNAPSHOT.jar

Alternatively, you can use Docker to build and run the project. To do this, run the following commands:docker build -t calculator-api .
docker run -p 8080:8080 calculator-api


## API Documentation
The API documentation is available at http://3.132.216.26/swagger-ui/index.html#/ .