package controller.ejercicios;

import java.util.Scanner;

import controller.util.utilidades;

public class autos {
    public void carros() {
        Scanner sc = new Scanner(System.in);
        float c = 0.0f;
        int d = 0;
        double total = 0.0;
        double b;
        float sueldo = 2500;
        while (true) {
            c++;
            System.out.println("INGRESE (1) SI DESEA TERMINAR");
            System.out.println("INGRESE EL PRECIO DEL AUTO VENDIDO");
            String e = sc.nextLine();
            float a = utilidades.transformStringFloat(e);
            if (a < 0) {
                System.out.println("INGRES NUMEROS POSITIVOS Y MAYORES A 0");
                break;
            }
            if (a >= 10000) {
                sueldo += 250;
                d++;
            }
            total = total + a;
            if (a == 1) {
                break;
            }

        }
        c -= 1;
        b = (total * 0.05) - 0.05;
        int comision = d * 250;
        System.out.println("EL SUELDO ES DE " + sueldo);
        System.out.println("LA COMISION ES DE " + comision + " POR " + d + " AUTOS");
        System.out.println("AUTOS VENDIDOS " + c);
        System.out.println("PRECIO TOTAL DE LOS AUTOS VENDIDOS " + (total - 1));
        System.out.println("UTILIDAD DEL 5% ES DE " + utilidades.redondear((float) b));
        sc.close();
    }
}