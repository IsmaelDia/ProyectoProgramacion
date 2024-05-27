package utilidades;

import java.util.Scanner;

public class Util {
    public static int leernumero(int num1, int num2) {
        Scanner teclado = new Scanner(System.in);
        int num;
        num = teclado.nextInt();
        while (num < num1 || num > num2) {
            System.out.println("El numero debe estar entre "+num1+" y "+ num2+" por favor");
            num = teclado.nextInt();
        }
        return num;

    }
}
