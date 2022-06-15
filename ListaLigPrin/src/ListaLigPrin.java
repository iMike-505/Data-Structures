
import edu.epromero.util.*;

public class ListaLigPrin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaLigadaSimple miLista = new ListaLigadaSimple();//Ya no se especifica la capacidad del arreglo
        miLista.insertar("Mudno");
        miLista.insertar("Hello");
        miLista.insertar("Saludos: ");
        miLista.mostrar();
        miLista.siguiente();
        System.out.println(miLista.miDato());
        miLista.siguiente();
        System.out.println(miLista.miDato());
        miLista.siguiente();
        System.out.println(miLista.miDato());
        miLista.siguiente();
        System.out.println(miLista.miDato());
        //miLista.anterior();
        System.out.println(miLista.miDato());
        
        System.out.println("-----------");
        miLista.insertar(" cosa ");
        miLista.mostrar();
        
        
        while (!StdIn.estaVacia()) {
            String s = StdIn.leeString();

            if (s.equals("-")) {
                //Realiza una extracción
                miLista.mostrar();
            } else {
                //Realiza una inserción
                miLista.insertar(s);

            }
        }
    }
}
