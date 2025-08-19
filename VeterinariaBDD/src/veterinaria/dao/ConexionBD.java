/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria.dao;

import java.sql.*;

/**
 *
 * @author lizbello
 */
public class ConexionBD {
   private static final String IP = "localhost";
   private static final String PUERTO = "3306";
   private static final String NOMBRE_BD = "ClinicaVeterinaria";
   private static final String USUARIO = "vet_user";
   private static final String PASSWORD = "v3Ter1n4#$*";
   private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
   
   
   public static Connection abrirConexion(){
       Connection conexionBD = null;
       String URLConexion = String.format("jdbc:mysql://%s:%s/%s?allowPublicKeyRetrieval=true&useSSL=false", IP, PUERTO, NOMBRE_BD);
       
       try{
           Class.forName(DRIVER);
           conexionBD = DriverManager.getConnection(URLConexion, USUARIO, PASSWORD);
       }catch(ClassNotFoundException e){
           System.err.println("Error clase no encontrada");
       }catch(SQLException s){
          System.err.println("Error en la conexión con la base de datos: " + s.getMessage()); 
       }
       
       return conexionBD;
    }
   
}
