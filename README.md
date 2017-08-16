# EJB Tests

Experiments with EJB 3 and Apache TomEE 7. The goal is to use Jersey and DI with annotations
(what is not as straightforward as it seems...).

An alternative approach explored here too, is to use JBoss Wildfly instead. Looking at the commit logs
one might be able to tell what happened when, what was tried, andwhatnot.

## Running

In order to run TomEE with Maven:

```
cd ejb-web
mvn clean install org.apache.tomee.maven:tomee-maven-plugin:run
```

The web application will be available at `http://localhost:8080/ejb-web/`.
