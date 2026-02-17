package Exercicios;
import java.util.Scanner;
public class Ex15 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        double Y = scanner.nextDouble();

        double gasto = X/Y;

        System.out.printf("%.3f km/l%n", gasto);
    }
}
