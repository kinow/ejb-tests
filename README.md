# EJB Tests

Experiments with EJB 3 and Apache TomEE 7. The goal is to use Jersey and DI with annotations
(what is not as straightforward as it seems...).

## Running

```
cd ejb-web
mvn clean install org.apache.tomee.maven:tomee-maven-plugin:run
```

The web application will be available at `http://localhost:8080/ejb-web/`.
