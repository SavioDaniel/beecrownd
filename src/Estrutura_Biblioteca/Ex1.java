package Estrutura_Biblioteca;
import java.util.Scanner;
public class Ex1 {
    public static int mdc(int a, int b) {
        return b == 0 ? a : mdc(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            int n1 = sc.nextInt();
            sc.next(); // /
            int d1 = sc.nextInt();

            String op = sc.next();

            int n2 = sc.nextInt();
            sc.next(); // /
            int d2 = sc.nextInt();

            int num = 0, den = 0;

            switch (op) {
                case "+":
                    num = n1 * d2 + n2 * d1;
                    den = d1 * d2;
                    break;
                case "-":
                    num = n1 * d2 - n2 * d1;
                    den = d1 * d2;
                    break;
                case "*":
                    num = n1 * n2;
                    den = d1 * d2;
                    break;
                case "/":
                    num = n1 * d2;
                    den = n2 * d1;
                    break;
            }

            int mdc = mdc(Math.abs(num), Math.abs(den));

            int numS = num / mdc;
            int denS = den / mdc;

            System.out.println(num + "/" + den + " = " + numS + "/" + denS);
        }

        sc.close();
    }
}
