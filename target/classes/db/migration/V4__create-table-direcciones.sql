create table direcciones(
    id BIGINT not null auto_increment,
    pais VARCHAR(100) not null,
    ciudad VARCHAR(100) not null ,
    calle VARCHAR(20) not null,
    numero varchar(10) not null ,
    adicional VARCHAR(100) not null,

    primary key(id)

);