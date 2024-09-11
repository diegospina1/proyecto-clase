create table consultas(
    id bigint not null auto_increment,
    paciente_id bigint not null,
    doctor_id bigint not null,
    fecha datetime not null,
    sede varchar(50) not null,
    cancelada boolean not null,

    primary key (id),

    constraint fk_consultas_paciente_id foreign key (paciente_id) references pacientes(id),
    constraint fk_consultas_doctor_id foreign key (doctor_id) references doctores(id)
);