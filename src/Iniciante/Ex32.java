package Iniciante;

import java.util.Scanner;
import java.util.Arrays;
public class Ex32 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] v = new double[3];

        v[0] = scanner.nextDouble();
        v[1] = scanner.nextDouble();
        v[2] = scanner.nextDouble();

        Arrays.sort(v);

        double A = v[2];
        double B = v[1];
        double C = v[0];

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {

            if (A * A == B * B + C * C)
                System.out.println("TRIANGULO RETANGULO");

            if (A * A > B * B + C * C)
                System.out.println("TRIANGULO OBTUSANGULO");

            if (A * A < B * B + C * C)
                System.out.println("TRIANGULO ACUTANGULO");

            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
                System.out.println("TRIANGULO ISOSCELES");
            }
            else if (A == B || A == C || B == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        scanner.close();
    }
}
