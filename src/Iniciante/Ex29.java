package Iniciante;

import java.util.Scanner;

public class Ex29 {
    static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int[] original = new int[3];
            int[] ordenado = new int[3];

            // 1. Lendo os 3 valores e salvando em ambos os arrays
            for (int i = 0; i < 3; i++) {
                int valor = scanner.nextInt();
                original[i] = valor;
                ordenado[i] = valor;
            }

            // 2. Lógica de ordenação (Bubble Sort) usando 'for' no array 'ordenado'
            for (int i = 0; i < ordenado.length - 1; i++) {
                for (int j = 0; j < ordenado.length - 1 - i; j++) {
                    if (ordenado[j] > ordenado[j + 1]) {
                        // Troca de posição (swap)
                        int temp = ordenado[j];
                        ordenado[j] = ordenado[j + 1];
                        ordenado[j + 1] = temp;
                    }
                }
            }

            // 3. Imprimindo os valores em ordem crescente
            for (int n : ordenado) {
                System.out.println(n);
            }

            // 4. Linha em branco conforme solicitado
            System.out.println();

            // 5. Imprimindo os valores na ordem original
            for (int n : original) {
                System.out.println(n);
            }

            scanner.close();
        }

}
