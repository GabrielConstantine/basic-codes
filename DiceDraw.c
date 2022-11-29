#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

int main() {
	int qtdDados, ladosDados, i;

	printf("Informe a quantidade de dado a ser rolado:  ");
	scanf("%d", &qtdDados);
	printf("Informe a quantidade de lados do dados:  ");
	scanf("%d", &ladosDados);

	for(i = 1; i <= qtdDados;) {
		int resultado = (rand() %	ladosDados);
		
		if (resultado > 0) {
		printf("%dd%d: %d\n", qtdDados, ladosDados, resultado);
		i++;
		}
	}
	
	return 0;
}
