-- Creating 'departments' table
CREATE TABLE departments (
                             id NUMBER(10) PRIMARY KEY,
                             name VARCHAR2(50) NOT NULL
);

-- Creating 'employees' table
CREATE TABLE employees (
                           id NUMBER(10) PRIMARY KEY,
                           name VARCHAR2(100) NOT NULL,
                           gender VARCHAR2(10) NOT NULL,
                           department_id NUMBER(10),
                           CONSTRAINT fk_department_id FOREIGN KEY (department_id) REFERENCES departments(id)
);

CREATE SEQUENCE DEP_SEQ START WITH 1 MAXVALUE 999999999 NOCACHE ORDER ;
CREATE SEQUENCE EMP_SEQ START WITH 1 MAXVALUE 999999999 NOCACHE ORDER ;