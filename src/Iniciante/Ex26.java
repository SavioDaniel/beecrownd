package Iniciante;

import java.util.Scanner;

public class Ex26 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo = scanner.nextInt();
        int qtd = scanner.nextInt();

        double cachorro_quente = 4.00;
        double x_salada = 4.50;
        double x_becon = 5.00;
        double torrada = 2.00;
        double refrigerante = 1.50;

        if (codigo == 1){
            System.out.printf("Total: R$ %.2f%n", (cachorro_quente * qtd));
        } else if (codigo == 2) {
            System.out.printf("Total: R$ %.2f%n", (x_salada * qtd));
        }else if (codigo == 3) {
            System.out.printf("Total: R$ %.2f%n", (x_becon * qtd));
        }else if (codigo == 4) {
            System.out.printf("Total: R$ %.2f%n", (torrada * qtd));
        } else if (codigo == 5){
            System.out.printf("Total: R$ %.2f%n", (refrigerante * qtd));
        }


    }
}
