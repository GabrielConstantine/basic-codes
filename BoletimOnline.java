
import java.util.Scanner;
import java.util.Date;

public class BoletimOnline {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Date data = new Date();
    float primeiraProva, segundaProva, terceiraProva, quartaProva;
    float mediaFinal;
    String nome, turma, nomePai, nomeMae;

    System.out.println("      -------- BOLETIM ONLINE - ORGAO SEDUC --------      ");
    System.out.println("Nome do aluno: ");
    nome = scan.nextLine();
    System.out.println("Nome da mãe: ");
    nomeMae = scan.nextLine();
    System.out.println("Nome do pai: ");
    nomePai = scan.nextLine();
    System.out.println("Turma do aluno: ");
    turma = scan.nextLine();
    System.out.println("      ----------------------------------------------      ");

    System.out.println("Digite a nota da primeira avaliação: ");
    primeiraProva = scan.nextFloat()*2;
    System.out.println("Digite a nota da segunda avaliação: ");
    segundaProva = scan.nextFloat()*3;
    System.out.println("Digite a nota da terceira avaliação: ");
    terceiraProva = scan.nextFloat()*2;
    System.out.println("Digite a nota da quarta avaliação: ");
    quartaProva = scan.nextFloat()*3;

    mediaFinal = (primeiraProva + segundaProva + terceiraProva + quartaProva) / 10;

    if (mediaFinal >= 7.0) {
        System.out.println("      -------- BOLETIM ONLINE - RESULTADO 2022 --------        ");
        System.out.println("                                   " + data);
        System.out.println("Aluno: "+nome+". | Turma: "+turma+".");
        System.out.println("Mãe: "+nomeMae+". | Pai: "+nomePai+".");
        System.out.println("Primeira avaliação: "+primeiraProva);
        System.out.println("Segunda avaliação: "+segundaProva);
        System.out.println("Terceira avaliação: "+terceiraProva);
        System.out.println("Quarta avaliação: "+quartaProva);
        System.out.println("Media final: "+mediaFinal+". | Resultado: Aprovado.");
        System.out.println("      -------- BOLETIM ONLINE - ORGAO SEDUC - 2022 --------      ");
    } else {
        System.out.println("      -------- BOLETIM ONLINE - RESULTADO 2022 --------        ");
        System.out.println("                                   " + data);
        System.out.println("Aluno: "+nome+". | Turma: "+turma+".");
        System.out.println("Mãe: "+nomeMae+". | Pai: "+nomePai+".");
        System.out.println("Primeira avaliação: "+primeiraProva);
        System.out.println("Segunda avaliação: "+segundaProva);
        System.out.println("Terceira avaliação: "+terceiraProva);
        System.out.println("Quarta avaliação: "+quartaProva);
        System.out.println("Media final: "+mediaFinal+". | Resultado: Reprovado.");
        System.out.println("      -------- BOLETIM ONLINE - ORGAO SEDUC - 2022 --------      ");
    }
    }
}