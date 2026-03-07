package Iniciante;

import java.util.Scanner;

public class Ex31 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if ((a > b && a % b == 0) || (b > a && b % a ==0)){
            System.out.println("Sao Multiplos");
        }else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
