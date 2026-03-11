package Iniciante;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horaInicio = scanner.nextInt();
        int minutoInicio = scanner.nextInt();
        int horaFim = scanner.nextInt();
        int minutoFim = scanner.nextInt();

        int inicio = horaInicio * 60 + minutoInicio;
        int fim = horaFim * 60 + minutoFim;

        int duracaoMinutos;

        if (inicio == fim) {
            duracaoMinutos = 24 * 60;
        } else if (fim > inicio) {
            duracaoMinutos = fim - inicio;
        } else {
            duracaoMinutos = (24 * 60 - inicio) + fim;
        }

        int horas = duracaoMinutos / 60;
        int minutos = duracaoMinutos % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horas, minutos);

        scanner.close();
    }
}