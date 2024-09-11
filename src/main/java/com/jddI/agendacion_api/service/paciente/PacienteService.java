package com.jddI.agendacion_api.service.paciente;

import com.jddI.agendacion_api.dao.pacienteDAO.PacienteRepository;
import com.jddI.agendacion_api.model.paciente.ActualizarPacienteDTO;
import com.jddI.agendacion_api.model.paciente.CrearPacienteDTO;
import com.jddI.agendacion_api.model.paciente.Paciente;
import com.jddI.agendacion_api.model.paciente.PacienteMapper;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService implements IPacienteService{

    private final PacienteRepository repository;
    private final PacienteMapper mapper;

    @Autowired
    public PacienteService(PacienteRepository repository, PacienteMapper pacienteMapper) {
        this.repository = repository;
        this.mapper = pacienteMapper;
    }

    @Override
    public Paciente crear(CrearPacienteDTO datos) {
        return repository.save(mapper.mapearPaciente(datos));
    }

    @Override
    public List<Paciente> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Paciente listarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Paciente actualizar(Long id, ActualizarPacienteDTO datos) {
        Paciente paciente = listarPorId(id);
        paciente.actualizar(datos);
        return repository.save(paciente);
    }

    @Override
    public void eliminar(Long id) {
        Paciente paciente = listarPorId(id);
        paciente.eliminar();
        repository.save(paciente);
    }
}
