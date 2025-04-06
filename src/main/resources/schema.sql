DROP TABLE IF EXISTS AUTHOROFTHEBOOK;
DROP TABLE IF EXISTS BOOK;
DROP TABLE IF EXISTS AUTHOR;
DROP TABLE IF EXISTS PUBLISHER;

CREATE TABLE Publisher(
    idPublisher BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(30),
    country VARCHAR(100),
    email VARCHAR(50),
    phoneNo VARCHAR(20)
);

CREATE TABLE Book(
    idBook BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100),
    genre VARCHAR(50),
    price DOUBLE,
    idPublisher BIGINT,
    FOREIGN KEY (idPublisher) REFERENCES Publisher(idPublisher)
);

CREATE TABLE Author(
    idAuthor BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(70),
    age INT
);

CREATE TABLE AuthorOfTheBook(
    idBook BIGINT,
    idAuthor BIGINT,
    PRIMARY KEY (idBook, idAuthor),
    FOREIGN KEY (idBook) REFERENCES Book(idBook),
    FOREIGN KEY (idAuthor) REFERENCES Author(idAuthor)
);

