create table telefono_doctores(
                                   id bigint not null auto_increment,
                                   doctor_id bigint not null,
                                   telefono_id bigint not null,
                                   principal boolean not null,

                                   primary key (id),

                                   constraint fk_telefono_doctores_doctor_id foreign key (doctor_id) references doctores(id),
                                   constraint fk_telefono_doctores_telefono_id foreign key (telefono_id) references telefonos(id)
);