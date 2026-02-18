package Iniciante;
import java.util.Scanner;
public class Ex11 {
    static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int codigo1 = scaner.nextInt();
        int numero1 = scaner.nextInt();
        double valorUnitario1 = scaner.nextDouble();

        int codigo2 = scaner.nextInt();
        int numero2 = scaner.nextInt();
        double valorUnitario2 = scaner.nextDouble();

        double valor = numero1 * valorUnitario1 + numero2 * valorUnitario2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor);
    }
}
