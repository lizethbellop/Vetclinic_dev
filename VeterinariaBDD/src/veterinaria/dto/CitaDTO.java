/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria.dto;

import java.time.LocalTime;
import java.util.*;

/**
 *
 * @author lizbello
 */
public class CitaDTO {
    private int idCita;
    private String nombre_enfermedad;
    private String sintomas;
    private String tratamiento;
    private Date fecha;
    private LocalTime hora;
    private int idAnimalCompania;
    private int idSecretaria;
    private int idMedico;

    public CitaDTO() {
    }

    public CitaDTO(int idCita, String nombre_enfermedad, String sintomas, String tratamiento, Date fecha, LocalTime hora, int idAnimalCompania, int idSecretaria, int idMedico) {
        this.idCita = idCita;
        this.nombre_enfermedad = nombre_enfermedad;
        this.sintomas = sintomas;
        this.tratamiento = tratamiento;
        this.fecha = fecha;
        this.hora = hora;
        this.idAnimalCompania = idAnimalCompania;
        this.idSecretaria = idSecretaria;
        this.idMedico = idMedico;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getNombre_enfermedad() {
        return nombre_enfermedad;
    }

    public void setNombre_enfermedad(String nombre_enfermedad) {
        this.nombre_enfermedad = nombre_enfermedad;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getIdAnimalCompania() {
        return idAnimalCompania;
    }

    public void setIdAnimalCompania(int idAnimalCompania) {
        this.idAnimalCompania = idAnimalCompania;
    }

    public int getIdSecretaria() {
        return idSecretaria;
    }

    public void setIdSecretaria(int idSecretaria) {
        this.idSecretaria = idSecretaria;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    @Override
    public String toString() {
        return "Cita {" + "idCita=" + idCita + ", nombre_enfermedad=" + nombre_enfermedad + ", sintomas=" + sintomas + ", tratamiento=" + tratamiento + ", fecha=" + fecha + ", hora=" + hora + ", idAnimalCompania=" + idAnimalCompania + ", idSecretaria=" + idSecretaria + ", idMedico=" + idMedico + '}';
    }
    
    
    
}
