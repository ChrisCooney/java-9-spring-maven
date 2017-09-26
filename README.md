# Java 9 Spring MVC Example

This Repository is an example of how to use Spring with Java 9 modules, leveraging maven multi-modules for per module
dependency management.

## Intention for Writing

Interoperability between Spring and Java 9 is still very fiddly. This repository serves as a functioning example
that can be used to help diagnose some common issues.

## Running this example

**NOTE**: At the moment, you can't just dive on in and run the application inside an IDE. The support simply isn't there
yet.

From the root of the project:

```bash
mvn clean install
java -jar app/target/app-1.0-SNAPSHOT-exec.jar
```

This will spin up a spring boot application with a single endpoint, `/users/{id}` that you can fire a GET request at
to get some dummy output.