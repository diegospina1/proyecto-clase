create table email_pacientes(
    id bigint auto_increment not null,
    paciente_id bigint not null,
    email_id bigint not null,
    principal boolean not null,

    primary key(id),

    constraint fk_email_pacientes_paciente_id foreign key (paciente_id) references pacientes(id),
    constraint fk_email_pacientes_email_id foreign key (email_id) references email(id)
);