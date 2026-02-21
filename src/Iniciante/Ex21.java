package Iniciante;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // tipo do chá

        int contador = 0;

        for (int i = 0; i < 5; i++) {
            int resposta = scanner.nextInt();
            if (resposta == T) {
                contador++;
            }
        }

        System.out.println(contador);

        scanner.close();
    }
}