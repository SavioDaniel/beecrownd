package Iniciante;

import java.util.Scanner;

public class Ex30 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        if ((A + B > C) && (A + C > B) && (B + C > A)) {
            double perimetro = A + B + C;
            // Formatação com 1 casa decimal conforme pedido
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else {
            // 2. Se não for triângulo, calcula a área do trapézio
            double areaTrapezio = ((A + B) * C) / 2.0;
            System.out.printf("Area = %.1f%n", areaTrapezio);
        }
    }
}
