public class PilaLigada {
    NODO  tope;    
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
    
    public PilaLigada()
    {
        tope=null;
    }
    
    //push(item)
    public void push(String miDato)
    {
        //crear un nodo
        NODO nuevoNodo = new NODO(miDato);
        //liga del nodo le asigno el valor tope
        nuevoNodo.liga = tope;               
        //tope apunte al nuevo nodo
        tope = nuevoNodo;
    }
    public String pop()
    {
        String miDato;
        //el dato de retorno se recupera de tope
        miDato = tope.item;
        //asigno a tope el siguiente nodo
        tope = tope.liga;        
        return miDato;
    }
}