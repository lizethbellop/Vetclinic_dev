/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria.dto;

/**
 *
 * @author lizbello
 */
public class MedicoVeterinarioDTO {
    private int idMedico;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String telefonoCelular;
    private String telefonoEmergencia;
    private String calle;
    private int numero;
    private String colonia;
    private String nombre_usuario;
    private String contrasenia;
    private String cedula;

    public MedicoVeterinarioDTO() {
    }

    public MedicoVeterinarioDTO(int idMedico, String nombre, String apellidoPaterno, String apellidoMaterno, String telefonoCelular, String telefonoEmergencia, String calle, int numero, String colonia, String nombre_usuario, String contrasenia, String cedula) {
        this.idMedico = idMedico;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefonoCelular = telefonoCelular;
        this.telefonoEmergencia = telefonoEmergencia;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.nombre_usuario = nombre_usuario;
        this.contrasenia = contrasenia;
        this.cedula = cedula;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
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

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getTelefonoEmergencia() {
        return telefonoEmergencia;
    }

    public void setTelefonoEmergencia(String telefonoEmergencia) {
        this.telefonoEmergencia = telefonoEmergencia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "MedicoVeterinario {" + "idMedico=" + idMedico + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", telefonoCelular=" + telefonoCelular + ", telefonoEmergencia=" + telefonoEmergencia + ", calle=" + calle + ", numero=" + numero + ", colonia=" + colonia + ", nombre_usuario=" + nombre_usuario + ", contrasenia=" + contrasenia + ", cedula=" + cedula + '}';
    }
    
    
    
}
