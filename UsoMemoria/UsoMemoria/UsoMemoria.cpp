
#include <iostream>
#include <stdio.h>

class cosa
{
    int i;
};

int main()
{
    int i;
    int i2;
    int* pi; //Un puntero a un entero
    int* pi2;
    int arr[10];
    int arr2[2][3];
    int* pv3;
    char szCadena[10];
    cosa miCosa;

    printf("%i \n", sizeof(int));
    printf("%i \n", sizeof(char));
    printf("%i \n", sizeof(float));
    printf("%i \n", sizeof(long));
    printf("%i \n", sizeof(double));
    printf("%i \n", sizeof(int*));
    printf("%i \n", sizeof(arr));
    printf("%i \n", sizeof(arr2));
    printf("%i \n", sizeof(miCosa));
}
