package AD_HOC;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLong()) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();

            long resultado = a ^ b;
            System.out.println(resultado);
        }

        scanner.close();
        }
}
