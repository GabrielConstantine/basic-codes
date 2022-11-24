import java.util.Scanner;
import java.util.Date;

public class TelaDeLogin {
    public static void main(String[] args) {
    Date data = new Date();
    Scanner scan = new Scanner(System.in);
    String login, senha;
    String loginl, senhal;

    System.out.println("                    -------- CONSTANTINE ENTERPRISE --------      ");
    System.out.println("Olá usuário, seja muito bem vindo ao sistema de login da Constantine Enterprise.");
    System.out.println("Querido usuário, antes de prosserguimos você deve criar um login e senha.");
    System.out.println("\nCrie o seu login local:");
    login = scan.nextLine();
    System.out.println("Crie a sua senha de login local: ");
    senha = scan.nextLine();
    System.out.println("                                                       " + data);
    System.out.println("\n                       -------- TELA DE LOGIN • CE --------        ");

    System.out.println("\n        -------- CONSTANTINE ENTERPRISE • TELA DE LOGIN --------        ");
    System.out.println("Para acessar a sua conta local, você deve fornecer as suas credenciais.");
    System.out.println("\nlogin local: ");
    loginl = scan.nextLine();
    System.out.println("Senha local: ");
    senhal = scan.nextLine();
    System.out.println("\n        -------- CONSTANTINE ENTERPRISE • SEDE NEW YORK --------        ");

    if (login == loginl) {
        System.out.println("Seja bem vindo a sua conta local da Constantine Enterprise!!");
    } else {
        System.out.println("Senha ou login errado, por favor retorne pra tela de login.");
    }
    }
}