/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria.dao;
import veterinaria.dto.SecretariaDTO;
import java.sql.*;

/**
 *
 * @author lizbello
 */
public class SecretariaDAO {
    public static SecretariaDTO verificarCredenciales(String usuario, String password) throws SQLException{
        
        SecretariaDTO secretariaSesion = null;
        Connection conexionBD = ConexionBD.abrirConexion();
        
        if(conexionBD != null){
            String consulta = "SELECT idSecretaria, nombre FROM secretaria WHERE nombre_usuario = ? AND contrasenia = ?";
            PreparedStatement sentencia = conexionBD.prepareStatement(consulta);
            
            sentencia.setString(1, usuario);
            sentencia.setString(2, password);
            
            ResultSet resultado = sentencia.executeQuery();
            
            if(resultado.next()){
                secretariaSesion = convertirSecretaria(resultado);
            }
        } else{
            throw new SQLException("Error: Sin conexion en la base de datos");
        }
        
        return secretariaSesion;
    }
    
    private static SecretariaDTO convertirSecretaria(ResultSet resultado) throws SQLException{
        SecretariaDTO secretaria = new SecretariaDTO();
        secretaria.setIdSecretaria(resultado.getInt("idSecretaria"));
        secretaria.setNombre(resultado.getString("nombre"));
        
        return secretaria;
    }
    
}
