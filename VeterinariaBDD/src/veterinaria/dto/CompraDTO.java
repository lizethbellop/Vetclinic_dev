/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria.dto;

import java.util.*;

/**
 *
 * @author lizbello
 */
public class CompraDTO {
    private int idDuenio;
    private int idProducto;
    private Date fecha;
    private int cantidad;

    public CompraDTO() {
    }

    public CompraDTO(int idDuenio, int idProducto, Date fecha, int cantidad) {
        this.idDuenio = idDuenio;
        this.idProducto = idProducto;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public int getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Compra {" + "idDuenio=" + idDuenio + ", idProducto=" + idProducto + ", fecha=" + fecha + ", cantidad=" + cantidad + '}';
    }
    
}
