CREATE TABLE IF NOT EXISTS shareholder_brand (
    id int REFERENCES brand (id),
    shareid int REFERENCES shareholder (shareid)
);