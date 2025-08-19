/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria.dto;

/**
 *
 * @author lizbello
 */
public class ProductoDTO {
     private int idProducto;
    private String nombre;
    private String tipoProducto;
    private String especie;
    private String marca;
    private double precio;
    private int existencia;

    public ProductoDTO() {
    }

    public ProductoDTO(int idProducto, String nombre, String tipoProducto, String especie, String marca, double precio, int existencia) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.especie = especie;
        this.marca = marca;
        this.precio = precio;
        this.existencia = existencia;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    @Override
    public String toString() {
        return "Producto {" + "idProducto=" + idProducto + ", nombre=" + nombre + ", tipoProducto=" + tipoProducto + ", especie=" + especie + ", marca=" + marca + ", precio=" + precio + ", existencia=" + existencia + '}';
    }
    
    
}
