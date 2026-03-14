package Iniciante;

import java.util.Scanner;

public class Ex36 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();

        if (a.equals("vertebrado")) {

            if (b.equals("ave")) {

                if (c.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }

            } else if (b.equals("mamifero")) {

                if (c.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }

            }

        } else if (a.equals("invertebrado")) {

            if (b.equals("inseto")) {

                if (c.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }

            } else if (b.equals("anelideo")) {

                if (c.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }

            }

        }

        scanner.close();
    
    }
}
