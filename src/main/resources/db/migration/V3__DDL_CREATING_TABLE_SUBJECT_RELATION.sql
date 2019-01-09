CREATE TABLE subject_relation (
SUBJECT_ID INT,
REQUISITE INT not null references subject (ID)
);

