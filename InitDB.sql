drop table if exists libro;
create table libro
(
	id_libro int NOT NULL UNIQUE,
	nombre varchar(20) NOT NULL,
	PRIMARY KEY (id_libro)
);

drop table if exists autor;
create table autor
(
	id_autor int NOT NULL UNIQUE,
	nombre varchar(20) NOT NULL,
	PRIMARY KEY (id_autor)
);

drop table if exists categoria;
create table categoria
(
	id_categoria int NOT NULL UNIQUE,
	nombre varchar(20) NOT NULL,
	PRIMARY KEY (id_categoria)
);

drop table if exists usuario;
create table usuario 
(
	id_usuario int not null unique,
	nombre varchar(20),
	primary key (id_usuario)
);