import edu.epromero.util.*;
public class ColaPrin {

    public static void main(String[] args) 
    {
        
        ColaArr miQ = new ColaArr();
        while(! StdIn.estaVacia())
        {
            String s = StdIn.leeString();
        
                if (s.equals("-"))
                {
                    StdOut.print( miQ.pop() );       
                }
                else
                {
                    miQ.push(s);
                }
        }   
    }
}
