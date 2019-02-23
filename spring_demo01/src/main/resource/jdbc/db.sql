CREATE TABLE
    spring_employee
    (
        ID INT NOT NULL,
        NAME VARCHAR(40),
        EMAIL VARCHAR(40),
        DEPT_ID INT,
        PRIMARY KEY (ID)
    );

  CREATE TABLE
    spring_dept
    (
        DEPT_ID INT NOT NULL,
        ADDRESS VARCHAR(80),
        NAME VARCHAR(40),
        PRIMARY KEY (DEPT_ID)
    );

CREATE TABLE
    book
    (
        serno VARCHAR(20) PRIMARY KEY,
        book_name VARCHAR(100) ,
        price INT
    );

CREATE TABLE
    book_stock
    (
        serno VARCHAR(20) PRIMARY KEY,
        stock INT
    );

CREATE TABLE
    account
    (
        useraccount VARCHAR(20) PRIMARY KEY,
        username VARCHAR(40) ,
        balance INT
    );


















