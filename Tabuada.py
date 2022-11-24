numTabuada = int(input('Informe o numero da tabuada: '));
numero = int(1);

print('-----------------');
while (numero <= 10): 
    resultado = numTabuada * numero;
    print('{} * {} = {}'.format(numTabuada, numero, resultado));
    numero+=1;
print('-----------------');