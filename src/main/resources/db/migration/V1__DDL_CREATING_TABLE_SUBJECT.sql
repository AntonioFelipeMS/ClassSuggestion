CREATE TABLE subject (
ID SERIAL PRIMARY KEY ,
DESCRIPTION VARCHAR(60) NOT NULL,
SEMESTER INT NOT NULL,
WEIGHT INT NOT NULL,
CREDIT_LOCKABLE BOOLEAN NOT NULL DEFAULT FALSE
);