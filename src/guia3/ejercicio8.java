package guia3;

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese n: ");
        n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == 0 || i == n - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }

    }

}
