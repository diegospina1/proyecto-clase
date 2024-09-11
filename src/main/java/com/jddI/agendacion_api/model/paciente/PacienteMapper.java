package com.jddI.agendacion_api.model.paciente;

import org.springframework.stereotype.Component;

@Component
public class PacienteMapper {

    public Paciente mapearPaciente(CrearPacienteDTO datos){
        return Paciente.builder()
                .nombre(datos.nombre())
                .apellido(datos.apellido())
                .documento(datos.documento())
                .activo(true)
                .build();

    }
}
