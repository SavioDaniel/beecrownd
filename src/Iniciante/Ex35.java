package Iniciante;

import java.util.Scanner;

public class Ex35 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double quinze = 0.15;
        double doze = 0.12;
        double dez = 0.10;
        double sete = 0.07;
        double quatro = 0.04;

        if(salario >= 0 && salario <= 400.00){
            double novo_salario = (salario * quinze) + salario;
            double reajuste = novo_salario - salario;
            System.out.printf("Novo salario: %.2f%n", novo_salario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.print("Em percentual: 15 %");
        } else if (salario > 400.00 && salario <= 800.00) {
            double novo_salario = (salario * doze) + salario;
            double reajuste = novo_salario - salario;
            System.out.printf("Novo salario: %.2f%n", novo_salario);
            System.out.printf("Reajuste ganho: %.2f", reajuste);
            System.out.print("Em percentual: 12 %");
        } else if (salario > 800.00 && salario <= 1200.00) {
            double novo_salario = (salario * dez) + salario;
            double reajuste = novo_salario - salario;
            System.out.printf("Novo salario: %.2f%n", novo_salario);
            System.out.printf("Reajuste ganho: %.2f", reajuste);
            System.out.print("Em percentual: 10 %");
        }else if (salario > 1200.00 && salario <= 2000.00) {
            double novo_salario = (salario * sete) + salario;
            double reajuste = novo_salario - salario;
            System.out.printf("Novo salario: %.2f%n", novo_salario);
            System.out.printf("Reajuste ganho: %.2f", reajuste);
            System.out.print("Em percentual: 7 %");
        }else if (salario > 2000.00) {
            double novo_salario = (salario * quatro) + salario;
            double reajuste = novo_salario - salario;
            System.out.printf("Novo salario: %.2f%n", novo_salario);
            System.out.printf("Reajuste ganho: %.2f", reajuste);
            System.out.print("Em percentual: 4 %");
        }
    }
}
