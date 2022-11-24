print ( 'Olá, seja bem vindo ao Analisador Social, um programa cujo objetivo é determinar a sua classe social' ); 
nome  =  input ( 'Para prosseguirmos, informe o seu nome: ' ); 
renda  =  float ( input ( 'Informe a sua renda mensal: ' )); 

if renda <= 1.500 : 
    print (nome, ' a sua classe social é rank E.' ); 
    
elif renda >=   1.600 and renda <= 2.800: 
    print (nome, ' a sua classe social é rank D.' ); 
    
if renda >=  3.200 and renda <= 7.000: 
    print (nome, ' a sua classe social é rank C.' ); 
    
elif renda >= 8.000 and renda <= 15.000: 
    print (nome, ' a sua classe social é rank D.' ); 
    
if renda >= 16.200 and renda <= 25.000: 
    print (nome, ' a sua classe social é rank A.' ); 
    
elif renda >= 30.000: 
    print (nome, ' a sua classe social é rank A+.'); 