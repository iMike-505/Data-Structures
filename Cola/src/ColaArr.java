
public class ColaArr {
    
    String arr[];
    int inicio, fin;
    
    public ColaArr(){
        inicio = fin = 0;
        arr = new String[10];
    }
    public int siguiente(int indice)
    {
        int sig;
        sig = indice+1;
        
        if(sig >= arr.length)
            sig=0;
        return sig;
    }
    public void push (String item){
        if(siguiente(inicio)==fin)
            System.out.println("Se excedio el numero de datos \n Intentelo más tarde.");
        else{
            arr[inicio]=item;
            inicio=siguiente(inicio);
        }
    }
    public String pop(){
        String dato=null;
        if(inicio==fin)
            System.out.println("No hay nada que mostrar \n Intentelo más tarde.");
        else{
            dato=arr[fin];
            fin = siguiente(fin);
        }
        return dato;
    }
    
}
