/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria.utilidades;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author lizbello
 */
public class Utilidad {
    public static void mostrarAlertaSimple(int tipoMensaje, String titulo, String contenido){
        JOptionPane.showMessageDialog(null, contenido, titulo, tipoMensaje);
    }
    
    public static boolean checharNumeroEntero(String textoNumero){
        
        try{
            int numero = Integer.parseInt(textoNumero);
            return true;
            
        }catch(NumberFormatException e){
            return false;
        }
        
    }
    
    public static boolean checarNumeroDecimal(String textoNumero){
        
        try{
            double numero = Double.parseDouble(textoNumero);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    
    public static boolean checarFecha(LocalDate fecha){
        LocalDate hoy = LocalDate.now();
        boolean resultado = true;
        
        if(fecha.isAfter(hoy)){
            resultado = false;
        }
        
        if(fecha.isBefore(hoy.minusYears(20))){
            resultado = false;
        }
        
        return resultado;
    }
    
    public static LocalDate convertirFecha(String fechaTexto) throws DateTimeParseException{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(fechaTexto,formatter);
 
    }
}
