create table telefono_pacientes(
    id bigint not null auto_increment,
    paciente_id bigint not null,
    telefono_id bigint not null,
    principal boolean not null,

    primary key (id),

    constraint fk_telefono_pacientes_paciente_id foreign key (paciente_id) references pacientes(id),
    constraint fk_telefono_pacientes_telefono_id foreign key (telefono_id) references telefonos(id)
);