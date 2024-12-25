# Build a REST API in 15 Minutes with Spring Boot

This repository demonstrates how to create a simple REST API using Spring Boot in just 15 minutes. The application includes basic CRUD (Create, Read, Update, Delete) operations for a `User` resource.

---

## Features

- Create new users
- Retrieve all users
- Retrieve a user by ID
- Minimal setup and boilerplate code
- Mock repository for simplicity

---

## Prerequisites

Before running the project, ensure you have the following installed:

- **Java Development Kit (JDK)**: Version 8 or higher
- **Maven or Gradle**: To manage dependencies
- **IDE**: IntelliJ IDEA, Eclipse, or any text editor of your choice

---

## Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/HiruInnovate/springboot.tutorial.git
cd springboot.tutorial
```

### 2. Import the Project

    Open the project in your favorite IDE.
    Ensure all dependencies are resolved.
### 3. Run the Application

Run the application using your IDE's run option or the command below:
```
mvn spring-boot:run
```
### API Endpoints

You can test the API using tools like Postman, cURL, or your browser.
### Base URL
```
http://localhost:8080/api/users
```
### Endpoints

### Get All Users
        Method: GET
        URL: http://localhost:8080/api/users
        Response: List of users

### Create User
        Method: POST
        URL: http://localhost:8080/api/users
#### Body:
```aidl
{
    "id": 1,
    "name": "John Doe",
    "email": "john.doe@example.com"
}

```
### Get User by ID

    Method: GET
    URL: http://localhost:8080/api/users/{id}
    Response: User details
### Project Structure
```
src/main/java/com/example/restapi
│
├── controller
│   └── UserController.java
│
├── model
│   └── User.java
│
├── repository
│   └── UserRepository.java
│
└── RestApiApplication.java

```
# About me
I am `Hiranmoy Goswami`, I am passionate about `AI/ML/DL` , `Generative AI applications` and their use in different domains, I also love to build `web applications` using `Java, React`, I have backend development experience with Java[Microservices]. For any work, you can reach out to me at...

* [LinkedIn](https://www.linkedin.com/in/hiranmoy-goswami-1997-dev/)
* [Youtube](https://www.youtube.com/channel/UCzQ9e6BsI1XiBWD3wlBRfrQ)
