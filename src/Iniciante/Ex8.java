package Iniciante;
import java.util.Scanner;
public class Ex8 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int DIFERENCA = (A * B - C * D);

        System.out.printf("DIFERENCA = %d%n", DIFERENCA);
    }
}
