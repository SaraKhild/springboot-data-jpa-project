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
<img width="750" alt="Screenshot 1445-04-06 at 1 42 58 PM" src="https://github.com/SaraKhild/springboot-data-jpa-project/assets/67427643/da05f352-db59-4d2b-8429-e1c7a5d83449">

### • Add new Employee
<img width="750" alt="Screenshot 1445-04-06 at 1 41 06 PM" src="https://github.com/SaraKhild/springboot-data-jpa-project/assets/67427643/cc9b6394-2143-48d2-a87e-fedd185c1700">

### • Update Empoyee
<img width="750" alt="Screenshot 1445-04-06 at 1 45 43 PM" src="https://github.com/SaraKhild/springboot-data-jpa-project/assets/67427643/6e981758-f5cd-46f7-8e76-1b0c4a032ddc">

### • Delete Employee
<img width="750" alt="Screenshot 1445-04-06 at 1 42 39 PM" src="https://github.com/SaraKhild/springboot-data-jpa-project/assets/67427643/1a136dcd-61f6-47f4-a6c3-381ee6fc36c3">

---
<br>

### Good Luck <img src="https://media.giphy.com/media/hvRJCLFzcasrR4ia7z/giphy.gif" width="30px"> 
