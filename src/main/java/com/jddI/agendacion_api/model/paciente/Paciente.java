package com.jddI.agendacion_api.model.paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Paciente")
@Table(name = "pacientes")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String documento;
    private Boolean activo;

    public void actualizar(ActualizarPacienteDTO datos) {
        if(datos.nombre() != null) this.nombre = datos.nombre();
        if(datos.apellido() != null) this.apellido = datos.apellido();
    }

    public void eliminar() {
        this.activo = false;
    }
}
