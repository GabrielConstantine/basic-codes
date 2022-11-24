import java.util.Scanner;

public class FichaDoJogador {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String nomePlayer, nomePersonagem;
    int idadePlayer, idadePersonagem;
    String personalidade, individualidade;
    String historia, aniversario, classPower;
    String lado, aparencia, rank;
    float forcaf, velof, resif, indif, yenef;

    System.out.println("     ------- Ficha -- My Hero Academy -------     ");
    System.out.println("        --------- Dados do Player ---------     ");
    System.out.println("\n--| Nome do Player: ");
    nomePlayer = scan.nextLine();
    System.out.println("--| Idade do Player: ");
    idadePlayer = scan.nextInt();
    System.out.println("\n      --------- Dados do Personagem ---------   ");
    System.out.println("\n--| Nome: ");
    nomePersonagem = scan.next();
    System.out.println("--| Idade: ");
    idadePersonagem = scan.nextInt();
    System.out.println("--| Individualidade: ");
    individualidade = scan.next();
    System.out.println("--| Classe da individualidade: ");
    classPower = scan.next();
    System.out.println("--| Personalidade: ");
    personalidade = scan.next();
    System.out.println("--| Historia (Opcional): ");
    historia = scan.next();
    System.out.println("-| Aniversario: ");
    aniversario = scan.next();
    System.out.println("--| Aparencia: ");
    aparencia = scan.next();
    System.out.println("--| Rank: ");
    rank = scan.next();
    System.out.println("--| Lado (Heroi ou vilão): ");
    lado = scan.next();
    System.out.println("--| Saldo de yenes: ");
    yenef = scan.nextFloat();
    System.out.println("\n    --- Atributos ---    ");
    System.out.println("\n- Força: ");
    forcaf = scan.nextFloat();
    System.out.println("- Velocidade: ");
    velof = scan.nextFloat();
    System.out.println("- Resistencia:");
    resif = scan.nextFloat();
    System.out.println("- Individualidade: ");
    indif = scan.nextFloat();
    System.out.println("\n     ------- Ficha -- My Hero Academy -------     ");
    }
}
