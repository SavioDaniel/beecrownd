package Iniciante;
import java.util.Scanner;

public class Ex9 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NUMBER = scanner.nextInt();
        int horas = scanner.nextInt();
        double valor = scanner.nextDouble();

        double SALARY = horas * valor;

        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", NUMBER, SALARY);
    }
}
