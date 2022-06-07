package pilaprinc;

import edu.epromero.util.*;
public class PilaPrinc {
    public static void main(String[] args) {
        PilaArreglo miPila = new PilaArreglo(3);
        while(! StdIn.estaVacia())
        {
            String s = StdIn.leeString();
            if(s.equals("-"))
            {
                //Realiza una extracción
                StdOut.print( miPila.pop());
            }
            else
            {
                //Realiza una inserción
                miPila.push(s);
            }
        }
    }
}