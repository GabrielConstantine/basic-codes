import java.util.Scanner;
import java.util.ArrayList;;

public class FiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int ciclo = 1; ciclo <= 5; ciclo++) {
            System.out.printf("\nInforme o %d° numero: ", ciclo);
            int number = scan.nextInt();
            numbers.add(number);

            if (ciclo == 5) {
                int result = numbers.get(0)+numbers.get(1)+numbers.get(2)+numbers.get(3)+numbers.get(4);
                System.out.println(numbers.get(0)+" + "+numbers.get(1)+" + "+numbers.get(2)+" + "+numbers.get(3)+" + "+numbers.get(4)+" = "+result);
            }
        }
    }
}