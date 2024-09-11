package com.jddI.agendacion_api.controller;

import com.jddI.agendacion_api.model.doctor.ActualizarDoctorDTO;
import com.jddI.agendacion_api.model.doctor.CrearDoctorDTO;
import com.jddI.agendacion_api.model.doctor.Doctor;
import com.jddI.agendacion_api.service.doctor.IDoctorService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("doctor")
public class DoctorController {

    private final IDoctorService doctorService;

    @Autowired
    public DoctorController(IDoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping
    public ResponseEntity<Doctor> crear(@RequestBody CrearDoctorDTO datos){
        return ResponseEntity.ok(doctorService.crear(datos));
    }

    @GetMapping
    public ResponseEntity<List<Doctor>> listarTodos(){
        return ResponseEntity.ok(doctorService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Doctor> listarPorId(@PathVariable("id") Long id){
        return ResponseEntity.ok(doctorService.listarPorId(id));
    }

    @PutMapping("/actualizar/{id}")
    @Transactional
    public ResponseEntity<Doctor> actualizar(@PathVariable("id") Long id, @RequestBody ActualizarDoctorDTO datos){
        return ResponseEntity.ok(doctorService.actualizar(id, datos));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
        doctorService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
