CREATE TABLE IF NOT EXISTS users(
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    userName VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS brand(
    id SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(50)NOT NULL,
    website VARCHAR(200)NOT NULL,
    description TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS category(
    id SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(50)NOT NULL,
    description TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS product(
    id SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(50)NOT NULL,
    createDate VARCHAR(50) NOT NULL,
    categoryId int REFERENCES category(id),
    brandId int REFERENCES brand(id)
);

CREATE TABLE IF NOT EXISTS shareholder(
    shareId SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(50) NOT NULL,
    phoneNumber VARCHAR(50) NOT NULL,
    nationalCode VARCHAR(10)NOT NULL
);

CREATE TABLE IF NOT EXISTS shareholder_brand (
    id int REFERENCES brand (id),
    shareid int REFERENCES shareholder (shareid)
);