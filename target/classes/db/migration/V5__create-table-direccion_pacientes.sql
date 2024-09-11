create table direccion_pacientes(
    id bigint not null auto_increment,
    paciente_id bigint not null,
    direccion_id bigint not null,
    principal boolean not null,

    primary key (id),

    constraint fk_direccion_pacientes_paciente_id foreign key (paciente_id) references pacientes(id),
    constraint fk_direccion_pacientes_direccion_id foreign key (direccion_id) references direcciones(id)
);