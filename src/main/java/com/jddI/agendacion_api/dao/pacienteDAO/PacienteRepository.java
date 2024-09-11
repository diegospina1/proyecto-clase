package com.jddI.agendacion_api.dao.pacienteDAO;

import com.jddI.agendacion_api.model.paciente.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
