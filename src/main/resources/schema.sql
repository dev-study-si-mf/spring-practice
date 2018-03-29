CREATE TABLE IF NOT EXISTS customer (
      id char(32) PRIMARY KEY,
      email varchar(256) UNIQUE,
      name varchar(256)
  );