CREATE TABLE IF NOT EXISTS shareholder(
    shareId SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(50) NOT NULL,
    phoneNumber int NOT NULL,
    nationalCode VARCHAR(10)NOT NULL
);