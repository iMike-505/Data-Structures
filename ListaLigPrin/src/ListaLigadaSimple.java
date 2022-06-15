
/**
 *
 * @author imike
 */
public class ListaLigadaSimple {
    
    NODO inicio;
    NODO fin;
    NODO actual;
    
    class NODO
    {
        String item;
        NODO   liga;
        // Cuando se crea el nodo
        // Se asigna el dato
        public NODO(String miDato)
        {
            item = miDato;
            liga = null;
        }  
    }
    public ListaLigadaSimple()
    {
        inicio = fin = actual = null;
    }
    public boolean esVacia()
    {
        return inicio == null;
    }
    private NODO anterior(NODO miNodo)
    {
        NODO aux;
        
        aux = inicio;
        while (aux.liga != miNodo )
            aux = aux.liga;
        
        return aux;
    }
    
    public void insertar(String miDato)
    {
        NODO nuevoNodo = new NODO(miDato);
        
        if(esVacia())
        {
            //Soy el primer nodo de la lista
            fin = inicio = nuevoNodo;
        }
        else
        {
            if(actual == inicio)
            {
                //Estoy al inicio de la lista
                nuevoNodo.liga = inicio;
                inicio = nuevoNodo;
            }
            else
            {
                //Estoy a mitad de la lista
                nuevoNodo.liga = actual;
                NODO elAnterior = anterior(actual);
                elAnterior.liga = nuevoNodo;
            }
        }
        actual = nuevoNodo;
    }        
   
    public void mostrar()
    {
        NODO aux;
        aux = inicio;
        while (aux != null)
        {
            System.out.println(aux.item + " ");
            aux = aux.liga;
        }
    }
    public void anterior()
    {
        
        actual = anterior(actual); 
        if(actual == null)
            actual = inicio;
    }
    public void siguiente()
    {
        actual = actual.liga;
        if(actual == null)
            actual = fin;
    }
    public String miDato()
    {
        return actual.item;
    }
    
    
}




