import java.util.Scanner;
import java.util.Random;

public class SorteioDeNumero {
    public static void main (String[] args) {
    Random sorteio = new Random();
    int numeroAleatorio = sorteio.nextInt(10)+1;
    Scanner scan = new Scanner(System.in);
    int numeroDaSorte;
    
    System.out.println("O numero sorteio fica entre 1 e 10, me diga, qual foi o numero sorteado? ");
    numeroDaSorte = scan.nextInt();
        
    if (numeroDaSorte == numeroAleatorio) {
        System.out.println("Parabéns você acertou!! O numero sorteado foi: "+numeroAleatorio);
    }
    else {
        System.out.println("Infelizmente você errou!! O numero sorteado foi: "+numeroAleatorio);
    }
    }
}