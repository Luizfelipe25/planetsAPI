CREATE SCHEMA planet;

CREATE TABLE planet.planet (
    id      SERIAL           PRIMARY KEY,
    nome    VARCHAR(100)     NOT NULL,
    clima   VARCHAR(100)     NOT NULL,
    terreno VARCHAR(100)     NOT NULL
);