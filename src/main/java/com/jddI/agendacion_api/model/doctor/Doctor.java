package com.jddI.agendacion_api.model.doctor;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Doctor")
@Table(name = "doctores")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String documento;
    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;
    private Boolean activo;

    public void actualizar(ActualizarDoctorDTO datos) {
        if(datos.nombre() != null) this.nombre = datos.nombre();
        if(datos.apellido() != null) this.apellido = datos.apellido();
        if(datos.especialidad() != null) this.especialidad = datos.especialidad();
    }


    public void eliminar() {
        this.activo = false;
    }
}
