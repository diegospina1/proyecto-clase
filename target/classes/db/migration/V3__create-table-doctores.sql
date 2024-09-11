create table doctores(
    id bigint not null auto_increment,
    nombre varchar(100) not null,
    apellido varchar(100) not null,
    documento varchar(10) not null unique,
    especialidad varchar(50) not null,
    activo boolean not null,

    primary key (id)
);