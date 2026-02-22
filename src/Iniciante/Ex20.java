package Iniciante;
import java.util.Scanner;
public class Ex20 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempo = scanner.nextInt();

        int horas = tempo / 3600;
        int resto = tempo % 3600;
        int min = resto / 60;
        int seg = resto % 60;

        System.out.println(horas + ":" + min + ":" + seg);

        scanner.close();
    }
}
