/* Установить кодировку Windows */
\encoding WIN1251

/* Создать базу данных Jaegers */
DROP DATABASE IF EXISTS Jaegers;

CREATE DATABASE Jaegers;

/* Создать базу данных Jaegers */
DROP TABLE IF EXISTS Jaegers;
CREATE TABLE Jaegers (
    id SERIAL PRIMARY KEY,
    modelName TEXT,
    mark CHAR(6),
    height INTEGER,
    weight INTEGER,
    status CHAR(16),
    origin CHAR(64),
    launch DATE,
    kaijuKill INTEGER
);

\ir init_db.sql
\ir queries.sql