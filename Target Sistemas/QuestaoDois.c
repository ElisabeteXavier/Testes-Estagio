#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() {

    setlocale(LC_ALL, "Portuguese");

    int a = 0, b =1, auxiliar = 0, i, numero = 0;

    a = 0;
    b = 1;
    printf("FIBONACCI\n\n");
    printf("Informe um número: ");
    scanf("%d",&numero);
    printf("Sequência Fibonacci : %d %d ", a,b);


    for(i=0;auxiliar<numero;i++){

        auxiliar = a + b;

        a = b;
        b = auxiliar;
        printf("%d ", auxiliar);

    }

   printf(auxiliar == numero ? "\nEsse número pertence a sequência fibonacci\n" : "\nEsse número não pertence a sequência fibonacci\n");
   
}
