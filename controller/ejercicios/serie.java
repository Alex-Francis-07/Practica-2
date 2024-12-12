package controller.ejercicios;

import java.util.Scanner;

import controller.util.utilidades;

public class serie {
    public void serie1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO DE TERMINOS");
        String termino = sc.nextLine();
        int ter = utilidades.transformStringInt(termino);
        boolean signo = true;
        int num1 = 1, num2 = 2;
        double ss = 0;
        double suma = 0;
        int a = 1;
        int b = 1;
        String d = "+";
        for (int i = 0; i < ter; i++) {
            if (signo) {
                d = "+";
            } else {
                d = "-";
            }
            if ((i + 1) % 2 == 0) {
                signo = !signo;
            }
            System.out.print(d + "(" + a + "/" + num1 + ")^" + num2 + " ");
            ss = Math.pow((double) a / num1, num2);
            if (d == "-") {
                suma = suma - ss;
            } else {
                suma = suma + ss;
            }
            num1 += 2;
            num2 += 2;
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
        System.out.println("EL RESULTADO ES: " + utilidades.redondearDouble(suma));
    sc.close();
    }
}