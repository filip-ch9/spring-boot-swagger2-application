# Spring Boot application using openAPI 3 
Most simple basic spring boot application, openAPI 3 configuration (basic), connection to mariadb, workbench, cassandra and postman

## Installation 

[Download](https://github.com/filip-ch9/spring-boot-openAPI3-application.git) the code, import the project in your IDE as existing maven project. 
To run the application read the usage part.

```demo-application```

## Usage
```python

open cassandras bin folder and start cmd in that directory # write the next word to start cassandra: cassandra
open new cmd in that directory and write # cqlsh
create keyspace copy paste the bellow line 
# [create keyspace yourDatabaseName with replication={'class':'SimpleStrategy', 'replication_factor':1};
open mariadb directory start cmd there and type # mysql -u root -p 
next on the same cmd terminal write # create demoapplication;
run the application 

go to your localhost port and add this - swagger-ui.html # you should be able to see the swagger ui 
write crud operations # try out the methods database demoApplication

to import the project into postman copy the url  
open postman app select import and select link
paste the url and that's it # play around with different inputs and tests
 
```

## Contributing

I want to learn more about openAPI 3 usage and implementation so any help is welcomed. 
The application will be updated as I learn along the different configurations and use cases.
