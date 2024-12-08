package controller.preguntas;

import java.util.Scanner;

public class bandera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean fin = false;
        int num;
        do {
            System.out.println("INGRESE UN NUMERO:");
            num = sc.nextInt();
            if (num < 0) {
                fin = true;
            }
            System.out.println("EL NUMERO ES: " + num);
        } while (!fin);
    }
}
