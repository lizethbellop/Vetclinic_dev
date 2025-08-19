package veterinaria.dto;


import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AnimalCompaniaDTO {
    private int idAnimal;
    private String nombre;
    private String color;
    private double peso;
    private double tamanio;
    private LocalDate fecha_nacimiento;
    private int duenio;
    private String especie;
    private String raza;

    public AnimalCompaniaDTO() {
    }

    public AnimalCompaniaDTO(int idAnimal, String nombre, String color, double peso, double tamanio, LocalDate fecha_nacimiento, int duenio, String especie, String raza) {
        this.idAnimal = idAnimal;
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.tamanio = tamanio;
        this.fecha_nacimiento = fecha_nacimiento;
        this.duenio = duenio;
        this.especie = especie;
        this.raza = raza;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public LocalDate getFechaNacimiento() {
        return fecha_nacimiento;
    }

    public void setFechaNacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getDuenio() {
        return duenio;
    }

    public void setDuenio(int duenio) {
        this.duenio = duenio;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "AnimalCompania:" + "idAnimal=" + idAnimal + ", nombre=" + nombre + ", color=" + color + ", peso=" + peso + ", tamanio=" + tamanio + ", fecha_nacimiento=" + fecha_nacimiento.format(formatter) + ", duenio=" + duenio + ", especie=" + especie + ", raza=" + raza + '}';
    }

}
