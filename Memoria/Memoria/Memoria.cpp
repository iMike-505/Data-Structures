// Memoria.cpp : Este archivo contiene la función "main". La ejecución del programa comienza y termina ahí.
//


#include <iostream>

void fa(int *arr) 
{
    for (int i = 0; i < 10; i++)
    {
        printf("%i \n", arr[i]);
   
    }
}
void fb(int arr[][3])//La primera dimensión no esta involucradda a la formula de mapeo
{
    for (int i = 0; i < 10; i++)
    {
        scanf_s("%i", &arr[0][i]);
    }
}

int main()
{
    int i;
    int i2;
    int* pi;
    int* pi2;
    int arr[10];//Este arreglo tiene direccion una de memoria (dirección base) y eso unico se guarda en la variable "arr"
    int arr2[2][3];
    int* pv3;//Un puntero void, no apunta a ningún tipo de dato en particular
    //pv3 = arr2;

    for (i = 0; i < 10; i++)
    {
        arr[i] = i;
        //scanf_s("%i", &arr[i]); - Otra manera de hacerlo
    }
    fa(arr); //Mandar a llamar la función +  arreglo, proporcionando su dirección base
    fb(arr2); //Nueva función para arreglo Bidimensional
    pi2 = arr;
    pi = &i; //Recupera la dirección de memoria
    
    printf("Dato: ");
    scanf_s("%i", pi);
    (*pi)++; //Es practicamente lo mismo que i++
    printf("\n");
    pi2 = arr; //Se copia arr en el puntero "pi2"
    pi = arr;
    //pv = arr;
    for (i = 0; i < 10; i++)
    {
        printf("%i %i %i %x %i\n", arr[i], *pi2, pi[i], pi2, sizeof(arr[i]));
        pi2++;//Incrementa el valor del puntero a un dato entero (de 4 a 4 celdas)
    }


    printf("%i %x %i\n", i, pi, sizeof(i));
    printf("%i %x %i\n", pi2, pi2, sizeof(pi2));
    printf("%x %x %i\n", pi, &pi, sizeof(pi));
    printf("%x %x %i\n", pi2, &pi2, sizeof(arr));

    return 0;
}

