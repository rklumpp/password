# README #

![alt text](https://raw.githubusercontent.com/rklumpp/password/master/src/main/resources/logo.png?raw=true)

This a code challenge of iti - Itaú use:

- Spring-Boot (Java 11), 
- Gradle build
- Swagger 2 (API Doc)

### About the challenge ###

Create an API Restful that provide the requirements: 

1 - Create a Password that match the rules:

    a) Nine or more characters

    b) At least one digit 0-9
    
    c) At least one downcase a-z

    d) At least one uppercase A-Z

    e) At least one special character
    
    f) No repeated characters within the set

### Requirements ###

To build and run we will need:

1 - Gradle

2 - Java 11

### How do I get set up? ###

1 - Run the followed codes in your terminal:
```
gradle build
```
*It will run unit tests and compile

2 - To run integrated tests:
```
gradle integrationTest
```

3 - To start Spring-Boot application:
```
java -jar build/libs/password-0.0.1-SNAPSHOT.jar
```

### Lets try ###

1 - API Documentation
http://localhost:8080/swagger-ui.html

![alt text](https://raw.githubusercontent.com/rklumpp/password/master/src/main/resources/iti-swagger.png?raw=true)

- #### Exposed API's ###

  - 1 - Create Password - (POST - http://localhost:8080/password) pass
  String password as RequestBody

### Credits ###

Raul Klumpp <raulklumpp@gmail.com>

https://www.linkedin.com/in/raulk/
