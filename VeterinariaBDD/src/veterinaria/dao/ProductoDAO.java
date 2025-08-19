package veterinaria.dao;

import com.sun.jdi.connect.spi.Connection;
import veterinaria.dto.ProductoDTO;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ProductoDAO {
    
    public static ProductoDTO obtenerProducto(int id){
        ProductoDTO producto = null;
        String sql = "SELECT * FROM producto WHERE idProducto = ?";
        
       try (java.sql.Connection conn = ConexionBD.abrirConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                producto = convertirRegistroProducto(rs);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener producto: " + e.getMessage());
        }
       
       return producto;
    }
    
    private static ProductoDTO convertirRegistroProducto(ResultSet rs){
        ProductoDTO producto = new ProductoDTO();
        
        try {
            producto.setIdProducto(rs.getInt("idProducto"));
            producto.setNombre(rs.getString("nombre"));
            producto.setTipoProducto(rs.getString("tipoProducto"));
            producto.setEspecie(rs.getString("especie"));
            producto.setMarca(rs.getString("marca"));
            producto.setPrecio(rs.getDouble("precio"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return producto;
    }
    
}
