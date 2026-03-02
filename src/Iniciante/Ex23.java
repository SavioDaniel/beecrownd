package Iniciante;

import java.util.Scanner;

public class Ex23 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Valor A
        int A = scanner.nextInt();

        //Valor B
        int B = scanner.nextInt();

        //Valor C
        int C = scanner.nextInt();

        //valor D
        int D = scanner.nextInt();

        if (B > C && D > A){
            if (C + D > A + B){
                if (C > 0 && D > 0){
                    if (A % 2 == 0){
                        System.out.printf("Valores aceitos");
                    }
                }
            }
        }

        System.out.printf("Valores nao aceitos");
    }
}
