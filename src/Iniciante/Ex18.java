package Iniciante;
import java.util.Scanner;
public class Ex18 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tempo = scanner.nextInt();
        int gasto = scanner.nextInt();

        double soma = (double) (tempo * gasto) / 12;

        System.out.printf("%.3f%n", soma );

    }
}
