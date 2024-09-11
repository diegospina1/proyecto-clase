package com.jddI.agendacion_api.model.doctor;

public record CrearDoctorDTO(
        String nombre,
        String apellido,
        String documento,
        Especialidad especialidad
) {
}
