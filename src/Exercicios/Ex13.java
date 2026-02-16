package Exercicios;
import java.util.Scanner;
public class Ex13 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Triangulo
        double baseTriangulo = scanner.nextDouble();
        double alturaTriangulo = scanner.nextDouble();
        //Raio circulo
        double raioCirculo = scanner.nextDouble();
        //Base Maior --- Base menor --- alturaTrapezio
        double BaseMaior = scanner.nextDouble();
        double BaseMenor = scanner.nextDouble();
        double alturaTrapezio = scanner.nextDouble();
        //lado Quadrado
        double ladoQuadrado = scanner.nextDouble();
        //base retangulo --- altura retangulo
        double baseRetangulo = scanner.nextDouble();
        double alturaRetangulo = scanner.nextDouble();

        //a) a área do triângulo retângulo que tem A por base e C por altura.
        double areaTriangulo = (baseTriangulo * alturaTriangulo)/2;
        //b) a área do círculo de raio C. (pi = 3.14159)
        double areaCirculo = 3.14159 * (raioCirculo * raioCirculo);
        //c) a área do trapézio que tem A e B por bases e C por altura.
        double areaTrapezio = (BaseMaior + BaseMenor) * alturaTrapezio / 2;
        //d) a área do quadrado que tem lado B.
        double areaQuadrado = ladoQuadrado * ladoQuadrado;
        //e) a área do retângulo que tem lados A e B.
        double areaRetangulo = baseRetangulo * alturaRetangulo;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

    }
}
