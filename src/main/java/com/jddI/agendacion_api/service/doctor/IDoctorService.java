package com.jddI.agendacion_api.service.doctor;

import com.jddI.agendacion_api.model.doctor.ActualizarDoctorDTO;
import com.jddI.agendacion_api.model.doctor.CrearDoctorDTO;
import com.jddI.agendacion_api.model.doctor.Doctor;

import java.util.List;

public interface IDoctorService {
    Doctor crear(CrearDoctorDTO datos);

    List<Doctor> listarTodos();

    Doctor listarPorId(Long id);

    Doctor actualizar(Long id, ActualizarDoctorDTO datos);

    void eliminar(Long id);
}
