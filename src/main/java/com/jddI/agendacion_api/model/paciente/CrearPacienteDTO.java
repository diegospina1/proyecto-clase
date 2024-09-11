package com.jddI.agendacion_api.model.paciente;

public record CrearPacienteDTO(
        String nombre,
        String apellido,
        String documento
) {
}
