
package pilaprinc;

public class PilaArreglo {
    private String[] s;
    private int tope = 0;
    
    public PilaArreglo(int capacidad)
    {
        s = new String[capacidad];
    }
    public void push (String item)
    {
        s[tope++] = item;
    }
    public String pop()
    {
        return s [--tope];
    }
}
