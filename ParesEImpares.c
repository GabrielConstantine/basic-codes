#include<stdio.h>
#include<stdlib.h>

int main () {
    int numberPar; 
    int numberImpar;

    printf("\nNumeros Pares:");
    for(numberPar = 0; numberPar <= 50; numberPar = numberPar + 2) {
        printf("\n%d", numberPar);
    }

    printf("\n------------------");
    printf("\nNumeros Impares:");

    for(numberImpar = 1; numberImpar <= 50; numberImpar = numberImpar + 2) {
        printf("\n%d", numberImpar);
    }
    return 0;
}