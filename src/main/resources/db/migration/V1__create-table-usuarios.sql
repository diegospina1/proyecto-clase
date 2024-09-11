create table usuarios(
    id bigint not null auto_increment,
    username varchar(100) not null unique,
    password varchar(255) not null,
    nombre varchar(100) not null,
    apellido varchar(100) not null,

    primary key (id)
);