
public class ColaLigada {
    NODO inicio;
    NODO fin;
    
    class NODO
    {
        String item;
        NODO liga;
        //Cuando se crea el nodo
        //Se asigna el dato
        public NODO(String miDato)
        {
            item = miDato;
            liga = null;
        } 
    }
    
    ColaLigada()
    {
        inicio = fin = null;
    }
    
    public void push(String miDato)
    {
        NODO nuevoNodo = new NODO(miDato);
        nuevoNodo.liga = fin;
        fin = nuevoNodo;
        if (inicio == null)
            inicio = nuevoNodo;
        
        
    }
    public String pop()
    {
        String miDato="";
        NODO aux;
        //Estructura vacia?
        if (inicio != null)
        {
            miDato = inicio.item;
            
            // Si hay más de un dato
            if(inicio != fin && inicio != null && fin != null)
            {
                // Se recorre toda la lista
                // Busca quie apunta al nodo de inicio
                aux = fin;
                while (aux.liga != inicio)
                    aux = aux.liga;

                inicio = aux;
                if (inicio == null)
                    fin = null;
                else
                    inicio.liga = null;
        }
        else 
            inicio = fin = null;
        }
    
        return miDato;
    }
 
}
    