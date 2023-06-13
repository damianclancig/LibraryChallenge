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

select * from categoria

insert into categoria (id_categoria, nombre) values (1, 'terror');
insert into categoria (id_categoria, nombre) values (2, 'suspenso');
insert into categoria (id_categoria, nombre) values (3, 'acción');


select * from usuario

insert into usuario (id_usuario, nombre) values (1, 'Damian');
insert into usuario (id_usuario, nombre) values (2, 'Mayra');
insert into usuario (id_usuario, nombre) values (3, 'Onix');


select * from autor

insert into autor (id_autor, nombre) values (1, 'stephen');
insert into autor (id_autor, nombre) values (2, 'stallone');
insert into autor (id_autor, nombre) values (3, 'otroAutor');


select * from libro;

insert into libro (id_libro, nombre, autor_pkey, categoria_pkey, usuario_pkey) values
(1, 'avatar', 1, 3, 2);
insert into libro (id_libro, nombre, autor_pkey, categoria_pkey, usuario_pkey) values
(2, 'terminantor', 2, 1, 3);
insert into libro (id_libro, nombre, autor_pkey, categoria_pkey, usuario_pkey) values
(3, 'algun libro', 3, 2, 1);

