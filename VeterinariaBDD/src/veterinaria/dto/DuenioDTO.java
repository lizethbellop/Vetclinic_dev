/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria.dto;

/**
 *
 * @author lizbello
 */
public class DuenioDTO {
    private int idDuenio;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String direccionCalle;
    private int direccionNumero;
    private String direccionColonia;
    private String email;

    public DuenioDTO() {
    }

    public DuenioDTO(int idDuenio, String nombre, String apellidoPaterno, String apellidoMaterno, String direccionCalle, int direccionNumero, String direccionColonia, String email) {
        this.idDuenio = idDuenio;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.direccionCalle = direccionCalle;
        this.direccionNumero = direccionNumero;
        this.direccionColonia = direccionColonia;
        this.email = email;
    }

    public int getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDireccionCalle() {
        return direccionCalle;
    }

    public void setDireccionCalle(String direccionCalle) {
        this.direccionCalle = direccionCalle;
    }

    public int getDireccionNumero() {
        return direccionNumero;
    }

    public void setDireccionNumero(int direccionNumero) {
        this.direccionNumero = direccionNumero;
    }

    public String getDireccionColonia() {
        return direccionColonia;
    }

    public void setDireccionColonia(String direccionColonia) {
        this.direccionColonia = direccionColonia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Duenio {" + "idDuenio=" + idDuenio + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", direccionCalle=" + direccionCalle + ", direccionNumero=" + direccionNumero + ", direccionColonia=" + direccionColonia + ", email=" + email + '}';
    }
    
    
    
}
