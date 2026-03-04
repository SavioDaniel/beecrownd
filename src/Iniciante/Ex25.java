package Iniciante;

import java.util.Scanner;

public class Ex25 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        double num = scanner.nextDouble();

        if (0 < num && num < 25){
            System.out.println("Intervalo (0,25]");
        } else if (num >= 25 && num < 50) {
            System.out.println("Intervalo (25,50]");
        } else if (num >= 50 && num < 75) {
            System.out.println("Intervalo (50,75]");
        } else if (num >= 75 && num < 100) {
            System.out.println("Intervalo (75,100]");
        }else {
            System.out.println("Fora de intervalo");
        }
    }
}
