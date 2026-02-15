package Exercicios;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int SOMA = A + B;

        System.out.printf("SOMA = %d%n", SOMA);

        scanner.close();
    }
}