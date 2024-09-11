package com.jddI.agendacion_api.model.doctor;

public record ActualizarDoctorDTO(
        String nombre,
        String apellido,
        Especialidad especialidad
) {
}
