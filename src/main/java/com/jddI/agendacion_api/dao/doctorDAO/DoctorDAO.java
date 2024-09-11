package com.jddI.agendacion_api.dao.doctorDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DoctorDAO {

    private final DoctorRepository repository;

    @Autowired
    public DoctorDAO(DoctorRepository repository) {
        this.repository = repository;
    }
}
