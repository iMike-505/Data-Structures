import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjecutaWAV {//Clase que sigue la API del programa main
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeneraWAV Generar = new GeneraWAV();
        try{
            FileReader fr = new FileReader(args[0]);
            BufferedReader in = new BufferedReader(fr);
            //se leen los datos de un archivo proporcionado por consola
            try{
                String test = in.readLine(); ///lee la cadena pa que se pueda leer el resto de cosas 

                int frec = Integer.parseInt(in.readLine()); //extrae el siguiente entero, correspondiente a la frecuencia en hz
                int armo = Integer.parseInt(in.readLine()); //el ultimo entero extraído corresponde a la frecuencia que se quiere escuchar
                int tiempo = Integer.parseInt(in.readLine()); //extrae un entero de la cadena leída, que corresponde al tiempo

                //los datos se mandan tal cual a la función que maneja la generación del .wav
                Generar.escribe(test, tiempo, frec, armo);//método mágico no tan mágico pero si, mágico
            }
            catch(IOException | NumberFormatException error){//el reader requiere atrapar una posible excepción
                System.out.println("Excepción en la lectura del archivo:\n"+error);
            }
        }catch(IOException | NumberFormatException error){
            System.out.println("Excepción:\n"+error);
        }
        
        
    }
    
}
