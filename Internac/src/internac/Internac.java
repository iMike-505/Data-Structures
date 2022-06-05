
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InvalidClassException;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

public class Internac {

    public static void main(String[] args) {
        OutputStreamWriter archivoSalida;
        try{
        
            
            BufferedWriter salida = new BufferedWriter(
                    new OutputStreamWriter(
                    new FileOutputStream("FicheroSalidaUTF8.txt"),"utf-8"));
            salida.write("Esto es un fichero UTF8: ñ á é í ó ú");
            salida.close();
        } catch (IOException e){
            System.out.println("Error en la apertura de " + e.toString());
        }
    }
    
}
