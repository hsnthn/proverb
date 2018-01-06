# Proverb

Proverb is a project that where you can see common Turkish preverbs. There are basicly three process:

  - Filter proverbs via click letters
  - Comment
  - Share

### Tech

Proverb uses techs to work properly:

* [Java]
* [MongoDB] 
* [Maven] 
* [Spring Boot] 
* [Spring Data]
* [Spring MVC]
* [Apache Commons]
* [Logback] 


### Installation

You need installed Maven on your local:

And you can use maven commands basically.

The default mongodb connection properties are for the localhost. If you want to override them, you can give parameters as JVM arguments such as

-Dspring.data.mongodb.host=YOUR_MONGODB_HOST
-Dspring.data.mongodb.port=YOUR_MONGODB_PORT
-Dspring.data.mongodb.database=YOUR_MONGODB_DATABASE

The default settings can be found in src/main/resources/application.properties as

spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=proverb

### Deloyment

Build:
```bash
mvn clean install
```

Deploy:
```bash
mvn spring-boot:run
```

### Usage

* Go http://localhost:8080/search
* Click letters to filter proverbs
* Share proverb
* Comment (it has not storing comments behaviour)


