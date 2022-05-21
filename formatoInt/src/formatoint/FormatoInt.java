package formatoint;

import java.util.Scanner;

public class FormatoInt {

    public static void main(String[] args) {
        // TODO code application logic here
        {
            // Variables enteras. Distinto Tipo
            int iNumero;
            long lNumero;
            Scanner teclado = new Scanner(System.in);
// Variables para almacenar la representacion
            String str;
            String strBin;
            try {/* Obtener los valores desde la linea de comandos*/ 
                iNumero = teclado.nextInt();
                lNumero = teclado.nextInt();
                /* Mostrar formatos enteros*/
                System.out.println("Entero numérico:" + iNumero);
                str = Integer.toHexString(iNumero);
                System.out.println("Entero hexadecimal:" + str);
                strBin = Integer.toBinaryString(iNumero);
                System.out.println("Entero binario:" + strBin);
                /* Mostrar los formatos long */
                System.out.println("Largo numérico:" + lNumero);
                str = Long.toHexString(lNumero);
                System.out.println("Largo hexadecimal:" + str);
                strBin = Long.toBinaryString(lNumero);
                System.out.println("Largo binario:" + strBin);

            } // En caso de que no se proporcione el argumento desde la linea de comandos
            catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Use: FormatoEntero numero");

            }
        }
    }

}
