=======================
springServiceExampleParent
=======================

The main purpose of the springServiceExampleParent project is show how you can use a Maven with 3 options of the Service Implementation 
- in the web module we have only a REST service with a interface from commons, so we DON'T have here any concrete implemenation
- in the default we have default service implementation
- in the ing module we have a concrete implemation for ING
- in the pkobp module we have a PKO BP implementation

So we have independent implemenation and we can switch compilation and what more important use in the runtime concrete implementation of the service 
e.g if we have 2 clients + 1 default option

In the Spring Service Example have 3 service implementations
- default
- ing
- pkobp


=======================
Compilation 
=======================

Here we have 2 options
-  compile everything - you have to uncomment modules in the parent pom
-  compile concrete module: default or ing or pkobp

How to compile (here we compile concrete module and after that we whant to run concrete service implementations)

Default compilation 
mvn clean install -Pdefault

ING compilation
mvn clean install -Ping

PKO BP compilation
mvn clean install -Ppkobp

=======================
How to run
=======================

<your_directory>/springServiceExampleParent>java -jar springExampleWeb\target\springExampleWeb-1.0-SNAPSHOT.jar

How to check services:
http://localhost:8080/money
http://localhost:8080/currency