package com.jddI.agendacion_api.dao.doctorDAO;

import com.jddI.agendacion_api.model.doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
