package com.jddI.agendacion_api.service.paciente;

import com.jddI.agendacion_api.model.paciente.ActualizarPacienteDTO;
import com.jddI.agendacion_api.model.paciente.CrearPacienteDTO;
import com.jddI.agendacion_api.model.paciente.Paciente;

import java.util.List;

public interface IPacienteService {
    Paciente crear(CrearPacienteDTO datos);

    List<Paciente> listarTodos();

    Paciente listarPorId(Long id);

    Paciente actualizar(Long id,ActualizarPacienteDTO datos);

    void eliminar(Long id);
}
