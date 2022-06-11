
package pilaprinc;
import java.nio.BufferOverflowException;
import java.util.NoSuchElementException;
public class PilaArreglo {
    private String[] s;
    private int tope = 0;
    
    public PilaArreglo(int capacidad)   {
        s = new String[capacidad];
    }
    public void push (String item) throws BufferOverflowException 
    {
        try{
            s[tope++] = item;
        }
        catch(ArrayIndexOutOfBoundsException e)
            {
                tope--;
                throw new BufferOverflowException(); //Es un objeto disfrazado :D
            }
    }
    public String pop() throws NoSuchElementException  
    {
        String dato;
        try{
            dato = s[--tope];
        }catch(ArrayIndexOutOfBoundsException e){
            tope++;
            throw new java.util.NoSuchElementException();
        }
        return dato;
    }
}
