
package pilaprinc;
import java.nio.BufferOverflowException;
import java.util.NoSuchElementException;
public class PilaArreglo {
    private String[] s;
    private int tope = 0;
    //Ya no se necesita que el usuario especifique la capacidad del arreglo
    public PilaArreglo()   {
        s = new String[1];
    }
    public boolean estavacia(){
        return tope==0;
    }
    private void redimensiona (int capacidad)
    {
        String []copia = new String[capacidad];
        for (int i = 0; i<s.length; i++)
        {
            copia[i] = s[i];
        }
            s = copia;
    }
    public void push (String item) 
    {//Esta versión se cambia por if
        if(tope == s.length)
            redimensiona(s.length*2);
            s[tope++] = item;
    }
        
    public String pop() throws NoSuchElementException  
    {
        //Para eficientar arreglos
       String dato;
       if (tope < s.length/4)
           redimensiona(s.length/2);
           
                dato = s[--tope];
        
            return dato;
    }
}
