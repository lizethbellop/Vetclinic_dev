package veterinaria.dao;

import java.sql.*;
import java.time.LocalDate;
import veterinaria.dto.DuenioDTO;
import veterinaria.dto.ProductoDTO;

/**
 *
 * @author lizbello
 */
public class CompraDAO {
    
    public static boolean registrarCompra(int id, String emailDuenio, int cantidad){
        Connection conexionBD = ConexionBD.abrirConexion();
        PreparedStatement insert = null;
        ProductoDTO producto = new ProductoDTO();
        DuenioDTO duenio = new DuenioDTO();       
        
        try{
            conexionBD.setAutoCommit(false);
            
            producto = ProductoDAO.obtenerProducto(id);
            duenio = DuenioDAO.obtenerDuenioEmail(emailDuenio);
            
            if(duenio == null){
                throw new SQLException("Cliente no encontrado");
          
            }
            
            String sqlInsert = "INSERT INTO compra (idProducto, idDuenio, fecha_compra, cantidad) VALUES(?, ?, ?, ?)";
            insert = conexionBD.prepareStatement(sqlInsert);
            insert.setInt(1, producto.getIdProducto());
            insert.setInt(2, duenio.getIdDuenio());
            insert.setDate(3, java.sql.Date.valueOf(LocalDate.now()));
            insert.setInt(4, cantidad);
            
            int filas = insert.executeUpdate();
            if(filas == 0){
                throw new SQLException("Fallo al insertar compra");
            }
            conexionBD.commit();
            return true;
            
        }catch(SQLException e){
            try{
                if(conexionBD != null) conexionBD.rollback();
                
            }catch (SQLException ex2) {
            ex2.printStackTrace();
            }
            e.printStackTrace();
            return false;
        }finally {
        try { if (insert != null) insert.close(); } catch (Exception e) {}
        try { if (conexionBD != null) conexionBD.setAutoCommit(true); conexionBD.close(); } catch (Exception e) {}
        }
    }
    
}
