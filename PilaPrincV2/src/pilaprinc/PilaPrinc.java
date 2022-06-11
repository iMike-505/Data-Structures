package pilaprinc;

import edu.epromero.util.*;
import java.nio.BufferOverflowException;
import java.util.NoSuchElementException;
public class PilaPrinc {
    public static void main(String[] args) {
        PilaArreglo miPila = new PilaArreglo(3);
        while(! StdIn.estaVacia())
        {
            String s = StdIn.leeString();
            try {
                if(s.equals("-"))   {
                    //Realiza una extracción
                    StdOut.print( miPila.pop());
                }else   {
                    //Realiza una inserción
                    miPila.push(s);
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
