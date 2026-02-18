package Iniciante;
import java.util.Scanner;
public class Ex16 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double X1 = scanner.nextDouble();
        double X2 = scanner.nextDouble();
        double Y1 = scanner.nextDouble();
        double Y2 = scanner.nextDouble();

        double soma = ((X1 - X2) * (X1 - X2) ) + ( (Y1 - Y2) * (Y1 - Y2));
        double raiz = Math.sqrt(soma);

        System.out.printf("%.4f%n",raiz);

    }
}
