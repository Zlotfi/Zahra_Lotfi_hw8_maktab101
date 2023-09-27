CREATE TABLE IF NOT EXISTS product(
    id SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(50)NOT NULL,
    createDate DATE NOT NULL,
    categoryId int REFERENCES category(id),
    brandId int REFERENCES brand(id)
);