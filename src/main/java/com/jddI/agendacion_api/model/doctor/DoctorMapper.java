package com.jddI.agendacion_api.model.doctor;

import org.springframework.stereotype.Component;

@Component
public class DoctorMapper {

    public Doctor mapearDoctor(CrearDoctorDTO datos){
        return Doctor.builder()
                .nombre(datos.nombre())
                .apellido(datos.apellido())
                .documento(datos.documento())
                .especialidad(datos.especialidad())
                .activo(true)
                .build();
    }
}
