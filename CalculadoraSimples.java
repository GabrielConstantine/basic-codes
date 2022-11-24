import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numeradorPrimario, numeradorSecundario;
    int resultado;
    String operador;

    System.out.println("Informe o primeiro numero: ");
    numeradorPrimario = scan.nextInt();
    System.out.println("Informe o segundo numero: ");
    numeradorSecundario = scan.nextInt();
    System.out.println("Informe o operador do seu calculo: ");
    operador = scan.next();

    switch (operador) {
        case ("+"):
            resultado = numeradorPrimario + numeradorSecundario;
            System.out.println("Resultado: " + resultado);
            break;
        case ("-"):
            resultado = numeradorPrimario - numeradorSecundario;
            System.out.println("Resultado: " + resultado);
            break;
        case ("*"):
            resultado = numeradorPrimario * numeradorSecundario;
            System.out.println("Resultado: " + resultado);
        break;
        case ("/"):
            resultado = numeradorPrimario / numeradorSecundario;
            System.out.println("Resultado: " + resultado);
            break;
    }
    }
}