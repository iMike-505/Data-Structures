
import edu.epromero.util.*;
import java.nio.BufferOverflowException;
import java.util.NoSuchElementException;
import java.util.Iterator;
public class ColaLig {
    
    public static void main(String[] args) {
        
        ColaLigada miCola = new ColaLigada();//Ya no se especifica la capacidad del arreglo
        while(! StdIn.estaVacia())
        {
            String s = StdIn.leeString();
            try {
                if(s.equals("-"))   {
                    //Realiza una extracción
                    StdOut.print( miCola.pop());
                }else   {
                    //Realiza una inserción
                    miCola.push(s);
                    
                }
            }
            catch(BufferOverflowException e)
            {
                System.out.println("Se excedio el numero de datos \n Intentelo más tarde.");
                e.printStackTrace();
            }
            catch(NoSuchElementException e)
            {
                System.out.println("No hay nada que mostrar \n Intentelo más tarde.");
            }
        }
    }
}
