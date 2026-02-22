package Iniciante;
import java.util.Scanner;
public class Ex22 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        int ano = valor / 365;
        int resto = valor % 365;
        int mes = resto / 30;
        int dia = resto % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");

        scanner.close();
    }
}
