package com.jddI.agendacion_api.dao.pacienteDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PacienteDAO {

    private final PacienteRepository repository;

    @Autowired
    public PacienteDAO(PacienteRepository repository) {
        this.repository = repository;
    }


}
