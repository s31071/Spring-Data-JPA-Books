# Spring Data JPA Books Repository

A simple Spring Boot application demonstrating CRUD operations for a Book entity using Spring Data JPA and H2 Database.

## 📌 Features

<h5>CRUD Operations:</h5> Create, Read, Update, and Delete books.

<h5>Spring Data JPA:</h5> Leverages JPA repositories for database interactions.
<h5>H2 In-Memory Database:</h5> No external database setup required (automatically configured).
<h5>RESTful API:</h5> Exposes endpoints for book management.
<h5>Swagger UI:</h5> API documentation available at runtime.


## 🛠️Project Structure
```
src/
├── main/
│   ├── java/
│   │   └── com/example/books/
│   │       ├── model/           # Entity classes (Book)
│   │       ├── repository/      # JPA Repositories
│   │       ├── controller/      # REST Controllers
│   │       └── BooksApplication.java
│   └── resources/
│       ├── application.properties
│       └── data.sql            # Optional initial data
```
