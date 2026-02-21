package Iniciante;
import java.util.Scanner;
public class Ex20 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tempo = scanner.nextInt();

        while (true){
            if (tempo >= 3600){
                int horas = tempo / 3600;
                System.out.println(horas);
            } else if (tempo >= 60) {
                int min = tempo / 60;
                System.out.println(min);
            } else if (tempo > 0 && tempo < 60) {
                int seg = tempo / 1;
                System.out.println(seg);
            }else {
                break;
            }
        }

    }
}
