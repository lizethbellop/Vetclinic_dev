/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria.dao;
import veterinaria.dto.AnimalCompaniaDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ana Georgina
 */
public class AnimalCompaniaDAO {
    
    Connection conn = ConexionBD.abrirConexion();
    
    public void crearAnimal(AnimalCompaniaDTO animal) {
        String sql = "INSERT INTO animalcompania (nombre, color, peso, tamanio, fecha_nacimiento, duenio, especie, raza) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        if(conn != null){
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {

                stmt.setString(1, animal.getNombre());
                stmt.setString(2, animal.getColor());
                stmt.setDouble(3, animal.getPeso());
                stmt.setDouble(4, animal.getTamanio());
                stmt.setDate(5, Date.valueOf(animal.getFechaNacimiento()));
                stmt.setInt(6, animal.getDuenio());
                stmt.setString(7, animal.getEspecie());
                stmt.setString(8, animal.getRaza());

                stmt.executeUpdate();
                System.out.println("Animal de compañía creado con éxito.");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error al crear mascota: " + e.getMessage());
            }
        } else{
            System.out.println("No hay conexion");
        }
        
    }

public List<AnimalCompaniaDTO> obtenerAnimalesPorDuenio(int duenioId) {
    List<AnimalCompaniaDTO> lista = new ArrayList<>();
    String sql = "SELECT * FROM animal_compania WHERE duenio = ?";

    try (Connection conn = ConexionBD.abrirConexion();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, duenioId);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            AnimalCompaniaDTO animal = new AnimalCompaniaDTO();
            animal.setIdAnimal(rs.getInt("idAnimal"));
            animal.setNombre(rs.getString("nombre"));
            animal.setColor(rs.getString("color"));
            animal.setPeso(rs.getDouble("peso"));
            animal.setTamanio(rs.getDouble("tamanio"));
            animal.setFechaNacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
            animal.setDuenio(rs.getInt("duenio"));
            animal.setEspecie(rs.getString("especie"));
            animal.setRaza(rs.getString("raza"));

            lista.add(animal);
        }
    } catch (SQLException e) {
        System.out.println("Error al obtener mascotas del dueño: " + e.getMessage());
    }

    return lista;
}


    public AnimalCompaniaDTO obtenerAnimalPorId(int id) {
        AnimalCompaniaDTO animal = null;
        String sql = "SELECT * FROM animal_compania WHERE idAnimal = ?";

        try (Connection conn = ConexionBD.abrirConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                animal = new AnimalCompaniaDTO();
                animal.setIdAnimal(rs.getInt("idAnimal"));
                animal.setNombre(rs.getString("nombre"));
                animal.setColor(rs.getString("color"));
                animal.setPeso(rs.getDouble("peso"));
                animal.setTamanio(rs.getDouble("tamanio"));
                animal.setFechaNacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                animal.setDuenio(rs.getInt("duenio"));
                animal.setEspecie(rs.getString("especie"));
                animal.setRaza(rs.getString("raza"));
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener mascota: " + e.getMessage());
        }

        return animal;
    }

    public void actualizarAnimal(AnimalCompaniaDTO animal) {
        String sql = "UPDATE animal_compania SET nombre = ?, color = ?, peso = ?, tamanio = ?, fecha_nacimiento = ?, duenio = ?, especie = ?, raza = ? WHERE idAnimal = ?";

        try (Connection conn = ConexionBD.abrirConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, animal.getNombre());
            stmt.setString(2, animal.getColor());
            stmt.setDouble(3, animal.getPeso());
            stmt.setDouble(4, animal.getTamanio());
            stmt.setDate(5, Date.valueOf(animal.getFechaNacimiento()));
            stmt.setInt(6, animal.getDuenio());
            stmt.setString(7, animal.getEspecie());
            stmt.setString(8, animal.getRaza());
            stmt.setInt(9, animal.getIdAnimal());

            stmt.executeUpdate();
            System.out.println("Animal actualizado con éxito.");
        } catch (SQLException e) {
            System.out.println("Error al actualizar animal: " + e.getMessage());
        }
    }

    public void eliminarAnimal(int id) {
        String sql = "DELETE FROM animal_compania WHERE idAnimal = ?";

        try (Connection conn = ConexionBD.abrirConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Mascota eliminado con éxito.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar mascota: " + e.getMessage());
        }
    }
    
    public List<AnimalCompaniaDTO> obtenerAnimales() {
    List<AnimalCompaniaDTO> lista = new ArrayList<>();
    String sql = "SELECT * FROM animalcompania";

    try (Connection conn = ConexionBD.abrirConexion();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {

        while (rs.next()) {
            AnimalCompaniaDTO animal = new AnimalCompaniaDTO(
                rs.getInt("idAnimal"),
                rs.getString("nombre"),
                rs.getString("color"),
                rs.getDouble("peso"),
                rs.getDouble("tamanio"),
                rs.getDate("fecha_nacimiento").toLocalDate(),
                rs.getInt("duenio"),
                rs.getString("especie"),
                rs.getString("raza")
            );
            lista.add(animal);
        }

    } catch (SQLException e) {
        System.out.println("Error al leer animales: " + e.getMessage());
    }

    return lista;
    }
}