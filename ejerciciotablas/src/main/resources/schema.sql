CREATE TABLE Pais (
   id   INTEGER      NOT NULL AUTO_INCREMENT,
   nombre VARCHAR(128) NOT NULL,
   PRIMARY KEY (id)
);


CREATE TABLE Producto (
   id   INTEGER      NOT NULL AUTO_INCREMENT,
   nombre VARCHAR(255) NOT NULL,
   precio REAL        NOT NULL,
   imagen TEXT,
   descripcion TEXT,
   PRIMARY KEY (id)
);
