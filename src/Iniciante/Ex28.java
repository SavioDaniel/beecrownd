package Iniciante;

import java.util.Scanner;

public class Ex28 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor eixo X: ");
        double X = scanner.nextDouble();
        System.out.print("Valor eixo Y: ");
        double Y = scanner.nextDouble();

        if (X > 0 && Y > 0){
            System.out.println("Q1");
        }else if (X <= 0 && Y > 0){
            System.out.println("Q2");
        }else if (X < 0 && Y < 0){
            System.out.println("Q3");
        } else if (X > 0 && Y <= 0) {
            System.out.println("Q4");
        }else {
            System.out.println("Origem");
        }
    }
}
