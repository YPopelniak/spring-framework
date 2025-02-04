# Spring Framework & Spring Boot Projects Collection  

<p>This repository contains a series of Spring Framework and Spring Boot projects covering <strong>Core Spring, Dependency Injection, Spring MVC, ORM, REST APIs, Security, and Unit Testing</strong>. Each project is structured to focus on a specific concept or functionality.</p>

## 📌 Projects Overview  

### 🔹 Spring Core & Dependency Injection (IoC)  
<ul>
  <li><a href="Spring-01-Core-IoC">Spring-01-Core-IoC</a> – Introduction to Dependency Injection (Abstraction)</li>
  <li><a href="Spring-02-Core-Wiring">Spring-02-Core-Wiring</a> – Understanding Dependency Injection (DI)</li>
  <li><a href="Spring-03-Core-DI">Spring-03-Core-DI</a> – Advanced DI concepts</li>
  <li><a href="Spring-04-Abstraction">Spring-04-Abstraction</a> – Deep dive into Dependency Injection and Abstraction</li>
  <li><a href="Spring-05-Core-BeanScope">Spring-05-Core-BeanScope</a> – Exploring Bean Definitions and Scopes</li>
</ul>

### 🔹 Spring Boot & MVC  
<ul>
  <li><a href="Spring-06-SpringBoot-Demo">Spring-06-SpringBoot-Demo</a> – Introduction to Spring Boot with Thymeleaf</li>
  <li><a href="Spring-07-Spring-MVC-Controller">Spring-07-Spring-MVC-Controller</a> – Understanding Spring MVC Controllers</li>
  <li><a href="Spring-08-MVC-Model">Spring-08-MVC-Model</a> – Spring MVC with Thymeleaf</li>
  <li><a href="Spring-09-Spring-Thymeleaf">Spring-09-Spring-Thymeleaf</a> – Unit Testing with Mockito in a Spring Application</li>
</ul>

### 🔹 Spring ORM & Database Mapping  
<ul>
  <li><a href="Spring-10-ORM-TableCreation">Spring-10-ORM-TableCreation</a> – ORM concepts & One-to-One Cascade Type annotation</li>
  <li><a href="Spring-11-ORM-Mapping-OneToOne">Spring-11-ORM-Mapping-OneToOne</a> – Deep dive into One-to-One mapping</li>
  <li><a href="Spring-12-OneToOne-ManyToMany">Spring-12-OneToOne-ManyToMany</a> – Cinema Lab – Understanding Entity Relationships</li>
  <li><a href="Spring-13-ORM-CinemaLab">Spring-13-ORM-CinemaLab</a> – CinemaRepository starter project</li>
  <li><a href="Spring-14-ORM-Queries">Spring-14-ORM-Queries</a> – Advanced ORM Queries</li>
</ul>

### 🔹 REST APIs & Web Services  
<ul>
  <li><a href="Spring-15-REST">Spring-15-REST</a> – Basic CRUD operations with REST API (GET, POST, PUT, DELETE)</li>
  <li><a href="Spring-16-REST-Jackson">Spring-16-REST-Jackson</a> – REST API consumption with Jackson</li>
  <li><a href="Spring-17-Rest-ConsumingApis">Spring-17-Rest-ConsumingApis</a> – Reactive WebClient with Mono & GetMapping</li>
  <li><a href="Spring-18-REST-OpenApi3">Spring-18-REST-OpenApi3</a> – OpenAPI 3 integration with Keycloak modules</li>
  <li><a href="Spring-19-REST-Security-Keycloak-LicenseApp">Spring-19-REST-Security-Keycloak-LicenseApp</a> – Security with Keycloak (License Application)</li>
  <li><a href="Spring-19-REST-Security-Keycloak-OrganizationsApp">Spring-19-REST-Security-Keycloak-OrganizationsApp</a> – Security with Keycloak (Organizations Application)</li>
</ul>

### 🔹 Unit Testing in Spring  
<ul>
  <li><a href="Spring-21-UnitTesting-JUnit5">Spring-21-UnitTesting-JUnit5</a> – Exploring Unit Test Annotations in JUnit 5</li>
  <li><a href="Spring-22-UnitTesting-Mockito">Spring-22-UnitTesting-Mockito</a> – Unit Testing with Mockito (UserService)</li>
  <li><a href="Spring-23-UnitTesting-MockMvc">Spring-23-UnitTesting-MockMvc</a> – StudentControllerTest using MockMvc</li>
</ul>

### 🔹 Review & Additional Projects  
<ul>
  <li><a href="Spring-review-IoC">Spring-review-IoC</a> – Recap of Dependency Injection & Abstraction</li>
  <li><a href="bank-simulation-app">bank-simulation-app</a> – A transaction service implementation</li>
</ul>

---

## 🚀 Getting Started  
Each project can be cloned and run independently. Ensure you have the following installed:  

- Java 17+  
- Maven or Gradle  
- Spring Boot (depending on the project)  
- Database (if applicable)  

### Clone the repository:  
```bash
git clone <repository-url>
cd <project-folder>
mvn spring-boot:run
