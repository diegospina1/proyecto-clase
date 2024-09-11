package com.jddI.agendacion_api.service.doctor;

import com.jddI.agendacion_api.dao.doctorDAO.DoctorRepository;
import com.jddI.agendacion_api.model.doctor.ActualizarDoctorDTO;
import com.jddI.agendacion_api.model.doctor.CrearDoctorDTO;
import com.jddI.agendacion_api.model.doctor.Doctor;
import com.jddI.agendacion_api.model.doctor.DoctorMapper;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService implements IDoctorService{

    private final DoctorRepository repository;
    private final DoctorMapper mapper;

    @Autowired
    public DoctorService(DoctorRepository repository, DoctorMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    public Doctor crear(CrearDoctorDTO datos) {
        Doctor doctor = mapper.mapearDoctor(datos);
        return repository.save(doctor);
    }

    @Override
    public List<Doctor> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Doctor listarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Doctor actualizar(Long id, ActualizarDoctorDTO datos) {
        Doctor doctor = listarPorId(id);
        doctor.actualizar(datos);
        return repository.save(doctor);
    }

    @Override
    public void eliminar(Long id) {
        Doctor doctor = listarPorId(id);
        doctor.eliminar();
        repository.save(doctor);
    }
}
