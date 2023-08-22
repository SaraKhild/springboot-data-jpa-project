# SpringBoot with Spring Data JPA CUDR Concept.

<br>

## Overview
 The project is about the employee's so it can display employees, add new employee, updates employee info and delete employee as JSON.
 
<br>

## Usages
-  SpringBoot
-  SpringJPA
-  MySQL
  
## Architecture of the Project

 ### 1- src folders
   - Controllers folder
   - Entities folder
   - DAO folder
   - Services folder

 ### 2-Maven pom.xml
<br>

```
 <dependencies>

       <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>

        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <scope>runtime</scope>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>

</dependencies>
 ```
<br>

### 3-Application.properties.yml

```
server.port=8081
spring.datasource.url = jdbc:mysql://localhost:3306/employee-directory?useSSL=false&serverTimezone=UTC
spring.datasource.username=springemployee
spring.datasource.password= springemployee

 ```

## Let's Start :mechanical_arm:
### • Display Empoyees
### • Add new Employee
### • Update Empoyee:
### • Delete Employee:

---

### Good Luck <img src="https://media.giphy.com/media/hvRJCLFzcasrR4ia7z/giphy.gif" width="30px"> 
