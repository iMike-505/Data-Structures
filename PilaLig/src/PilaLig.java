import edu.epromero.util.*;
public class PilaLig {

    public static void main(String[] args) 
    {
        
        PilaLigada miPila = new PilaLigada();
        while(! StdIn.estaVacia())
        {
            String s = StdIn.leeString();
        
                if (s.equals("-"))
                {
                    StdOut.print( miPila.pop() );       
                }
                else
                {
                    miPila.push(s);
                }
        }   
    }
}