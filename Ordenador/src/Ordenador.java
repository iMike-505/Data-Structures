import edu.epromero.util.Cronometro;
import edu.epromero.util.StdRandom;
public class Ordenador {
    
    public static void main(String[] args){
        Ordenador sheldon = new Ordenador(); 
        String arrCad[] = new String[20];
        //Esto genera n cantidad de cadenas
        for (int i=0; i<arrCad.length; i++)
        {
            //Genera una cadena de 120 caracteres
            String s="";
            for (int j=0; j<120; j++){
                char c = (char)('A'+(int)StdRandom.uniforme(26));
                s=s+c;
                }
            //Esa cadena se almacena en esta variable
            arrCad[i]=s;
        }
        //Se muestran todas las cadenas en la pantalla
        for (int i=0; i<arrCad.length; i++)
            System.out.println(arrCad[i]);
       
        float arr[] = new float[10000];
        for (int i=0; i<10000; i++)
        {
            //arr[i] =10000-i;
            arr[i] = StdRandom.uniforme(arr.length);
            
        }
        Cronometro reloj = new Cronometro();
        sheldon.Burbuja(arr);
        double tiempo = reloj.elapsedTime();
        for (int i=0; i<arr.length; i++)
            System.out.println(arr[i] + "\t");
        System.out.println("El tiempo de ejecución fue: "+tiempo);
            
    }
    public void Burbuja(float []arr)
    {
        int numPasada;
        int indice;
        float aux;
        
        //Para cada una de las pasadas
        for(numPasada = 0; numPasada<arr.length; numPasada++)
        {
            // Arranca el puntero en el primer elemento
            indice = 0;
            // Mientras el puntero no haya comparado todos los elementos
            while (indice < arr.length-1)
            {
                //Si (elemento i es mayor que el siguiente) entonces
                if(arr[indice] > arr[indice+1])
                {
                    // Intercambio
                    aux = arr[indice];
                    arr[indice] = arr[indice+1];
                    arr[indice+1] = aux;
                }
                indice++;
            }
        }
    }
}
