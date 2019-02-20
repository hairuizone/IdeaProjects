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



