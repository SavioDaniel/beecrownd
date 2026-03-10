package Matematica;

import java.util.Scanner;

public class Ex01 {
    public static int mdc(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {

            int F1 = scanner.nextInt();
            int F2 = scanner.nextInt();

            int resultado = mdc(F1, F2);

            System.out.println(resultado);
        }

        scanner.close();
        }

}
