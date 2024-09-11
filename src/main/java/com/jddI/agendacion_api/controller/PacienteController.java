package com.jddI.agendacion_api.controller;

import com.jddI.agendacion_api.model.paciente.ActualizarPacienteDTO;
import com.jddI.agendacion_api.model.paciente.CrearPacienteDTO;
import com.jddI.agendacion_api.model.paciente.Paciente;
import com.jddI.agendacion_api.service.paciente.IPacienteService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("paciente")
public class PacienteController {

    private final IPacienteService pacienteService;

    @Autowired
    public PacienteController(IPacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @PostMapping
    public ResponseEntity<Paciente> crear(@RequestBody CrearPacienteDTO datos){
        return ResponseEntity.ok(pacienteService.crear(datos));
    }

    @GetMapping
    public ResponseEntity<List<Paciente>> listarTodos(){
        return ResponseEntity.ok(pacienteService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> listarPorId(@PathVariable("id") Long id){
        return ResponseEntity.ok(pacienteService.listarPorId(id));
    }

    @PutMapping("/actualizar/{id}")
    @Transactional
    public ResponseEntity<Paciente> actualizar(@PathVariable("id") Long id, @RequestBody ActualizarPacienteDTO datos){
        return ResponseEntity.ok(pacienteService.actualizar(id, datos));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
        pacienteService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
