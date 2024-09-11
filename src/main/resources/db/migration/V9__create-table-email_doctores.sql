create table email_doctores(
                                id bigint auto_increment not null ,
                                doctor_id bigint not null,
                                email_id bigint not null,
                                principal boolean not null,

                                primary key (id),

                                constraint fk_email_doctores_doctor_id foreign key(doctor_id) references doctores(id),
                                constraint fk_email_doctores_email_id foreign key(email_id) references email(id)
);