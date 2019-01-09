CREATE TABLE CREDIT_LOCK (
ID INT not null references subject (ID),
LOCK INT NOT NULL
);