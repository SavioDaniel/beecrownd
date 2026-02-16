package Exercicios;
import java.util.Scanner;
public class Ex10 {
    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.next();
        double salario = scanner.nextDouble();
        double vendas = scanner.nextDouble();

        double total = salario + (vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", total);

        scanner.close();
    }
}
