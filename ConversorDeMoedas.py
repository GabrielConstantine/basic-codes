dinheiro = float(input('Informe o seu saldo monetario: '));
moeda = str(input('Você quer converter ele pra que tipo de moeda?'));

if (moeda == 'dolar'):
    dolar = dinheiro / 5.32;
    print(round(dolar,2));
    
if (moeda == 'euro'):
    euro = dinheiro / 5.51;
    print(round(euro,2));
    
if (moeda == 'iene'):
    iene = dinheiro / 0.038;
    print(round(iene,2));