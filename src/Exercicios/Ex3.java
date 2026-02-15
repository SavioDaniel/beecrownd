package Exercicios;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor do raio: ");
        Double raio = scanner.nextDouble();

        double area = 3.14 * (raio * raio);

        System.out.println("O valor da area: " + area);

        scanner.close();
    }
}

