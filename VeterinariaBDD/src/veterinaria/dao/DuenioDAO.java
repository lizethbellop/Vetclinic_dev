/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria.dao;

import java.sql.*;
import veterinaria.dto.DuenioDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author JOANA XCARET
 */
public class DuenioDAO {
    
    Connection conn = ConexionBD.abrirConexion();
    public void crearDuenio(DuenioDTO duenio) {
        String sql = "INSERT INTO duenio(nombre, apellidoPaterno, apellidoMaterno, direccionCalle, direccionNumero, direccionColonia, email) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        if(conn != null){
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            
                stmt.setString(1, duenio.getNombre());
                stmt.setString(2, duenio.getApellidoPaterno());
                stmt.setString(3, duenio.getApellidoMaterno());
                stmt.setString(4, duenio.getDireccionCalle());
                stmt.setInt(5, duenio.getDireccionNumero());
                stmt.setString(6, duenio.getDireccionColonia());
                stmt.setString(7, duenio.getEmail());
                        
                stmt.executeUpdate();
                System.out.println("Dueño creado");
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error al crear dueño: " + e.getMessage());
            }
        } else{
            System.out.println("nO hubo conexion");
        }
        
        
    }
    
    public List<DuenioDTO> obtenerDuenios() {
        List<DuenioDTO> lista = new ArrayList<>();
        String sql = "select* from duenio";
        
        try (Connection conn = ConexionBD.abrirConexion();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                DuenioDTO duenio = new DuenioDTO (
                    rs.getInt("idDuenio"),
                    rs.getString("nombre"),
                    rs.getString("apellidoPaterno"),
                    rs.getString("apellidoMaterno"),
                    rs.getString("direccionCalle"),
                    rs.getInt("direccionNumero"),
                    rs.getString("direccionColonia"),
                    rs.getString("email")  
                );
                lista.add(duenio);
            }
        } catch (SQLException e) {
            System.out.println("Error al leer dueños: " + e.getMessage());
        }
        return lista;
    }
    
    public DuenioDTO obtenerDuenioId(int id) {
        String sql = "select* from duenios where idDuenio = ?";
        DuenioDTO duenio = new DuenioDTO();
        
        try (Connection conn = ConexionBD.abrirConexion();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
                
            if (rs.next()) {
                duenio.setIdDuenio(rs.getInt("idDuenio"));
                duenio.setNombre(rs.getString("nombre"));
                duenio.setApellidoPaterno(rs.getString("apellidoPaterno"));
                duenio.setApellidoMaterno(rs.getString("apellidoMaterno"));
                duenio.setEmail(rs.getString("email"));
                duenio.setDireccionCalle(rs.getString("direccionCalle"));
                duenio.setDireccionColonia(rs.getString("direccionColonia"));
                duenio.setDireccionNumero(rs.getInt("direccionNumero"));       
            }
            
        if (duenio == null) {
            System.out.println("No se encontró ningún dueño con el ID: " + id);
        }
               
        } catch (SQLException e) {
            System.out.println("Error al buscar dueño: " + e.getMessage());
        }
        return duenio;
    }
    
    public static DuenioDTO obtenerDuenioEmail(String email) {
        String sql = "select * from duenio where email = ?";
        DuenioDTO duenio = null;
        
        try (Connection conn = ConexionBD.abrirConexion();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
                
            if (rs.next()) {
                duenio = new DuenioDTO (
                    rs.getInt("idDuenio"),
                    rs.getString("nombre"),
                    rs.getString("apellidoPaterno"),
                    rs.getString("apellidoMaterno"),
                    rs.getString("direccionCalle"),
                    rs.getInt("direccionNumero"),
                    rs.getString("direccionColonia"),
                    rs.getString("email")       
                );
            }
            
        if (duenio == null) {
            System.out.println("No se encontró ningún dueño con el Email: " + email);
        }
               
        } catch (SQLException e) {
            System.out.println("Error al buscar dueño: " + e.getMessage());
        }
        return duenio;
    }
    
    public void actualizarDuenio(DuenioDTO duenio) {
        String sql = "update duenios set nombre = ?, apellidoPaterno = ?, apellidoMaterno = ?, direccionCalle = ?, direccionNumero = ?, direccionColonia = ?, email = ? where idDuenio = ?";
        
        try (Connection conn = ConexionBD.abrirConexion();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, duenio.getNombre());
            stmt.setString(2, duenio.getApellidoPaterno());
            stmt.setString(3, duenio.getApellidoMaterno());
            stmt.setString(4, duenio.getDireccionCalle());
            stmt.setInt(5, duenio.getDireccionNumero());
            stmt.setString(6, duenio.getDireccionColonia());
            stmt.setString(7, duenio.getEmail());
            stmt.setInt(8, duenio.getIdDuenio());
            
            
            stmt.executeUpdate();
            System.out.println("Dueño actualizado");
            
        } catch (SQLException e) {
            System.out.println("Error al actualizar dueño: " + e.getMessage());
        }
    }
    
    public void eliminarDuenio(int id) {
        String sql = "delete from duenios where idDuenio = ?";
        
        try (Connection conn = ConexionBD.abrirConexion();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Dueño eliminado");
        } catch (SQLException e) {
            System.out.println("Error al eliminar dueño: " + e.getMessage());
        }
    }
    
    public static int obtenerDuenio(String email) throws SQLException{
        int idDuenio = 0;
        
        Connection conexionBD = ConexionBD.abrirConexion();
        
        if(conexionBD != null){
            String consulta = "SELECT idDuenio FROM duenio WHERE email = ?";
            PreparedStatement sentencia = conexionBD.prepareStatement(consulta);
            
           sentencia.setString(1, email);
            
            ResultSet resultado = sentencia.executeQuery();
            
            if(resultado.next()){
                idDuenio = resultado.getInt("idDuenio");
            }
        } else{
            throw new SQLException("No se encontro el dueño");
        }
        
        return idDuenio;
    }
}



