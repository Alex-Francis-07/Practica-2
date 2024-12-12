package controller.ejercicios;

import java.util.Scanner;

import controller.util.utilidades;

public class agua {
    public void consumodeagua() {
        Scanner ag = new Scanner(System.in);
        double pagar_consumo = 0.0;
        double total = 0.0;
        float porcentaje = 0.0f;
        float consumo =0.0f;
        double alcantarillado = 0.0;
        while (true) {
            System.out.println("INGRESE EL CONSUMO DE AGUA");
            String con = ag.nextLine();
            consumo = utilidades.transformStringInt(con);
            if(consumo > 0)
            break;
            else{
                System.out.println("INGRESE NUMEROS POSITIVOS Y MAYORES A 0");
            }
        }

        if (consumo > 0 && consumo <= 15) {
            pagar_consumo = 3;
        } else if (consumo > 15 && consumo <= 25) {
            pagar_consumo = 25 - consumo;
            if (pagar_consumo == 0) {
                pagar_consumo = 4;
            } else {
                pagar_consumo = (consumo - 15) * 0.10;
                pagar_consumo += 3;
            }
        } else if (consumo > 25 && consumo <= 40) {
            pagar_consumo = 40 - consumo;
            if (pagar_consumo == 0) {
                pagar_consumo = 7;
            } else {
                pagar_consumo = (consumo - 25) * 0.20;
                pagar_consumo += 4;
            }
        } else if (consumo > 40 && consumo <= 60) {
            pagar_consumo = 60 - consumo;
            if (pagar_consumo == 0) {
                pagar_consumo = 13;
            } else {
                pagar_consumo = (consumo - 40) * 0.30;
                pagar_consumo += 7;
            }
        } else if (consumo > 60) {
            pagar_consumo = consumo - 60;
            pagar_consumo = pagar_consumo * 0.35;
            pagar_consumo = pagar_consumo + 13;
        }
        System.out.println("1:PERTENECE A LA TERCERA EDAD");
        System.out.println("0:NO PERTENECE A LA TERCERA EDAD");
        String ter = ag.next();
        int terceraedad = utilidades.transformStringInt(ter);
        System.out.println("1:TIENE DISCAPACIDAD");
        System.out.println("0:NO TIENE DISCAPACIDAD");
        String dis = ag.next();
        int discapacidad = utilidades.transformStringInt(dis);
        if (terceraedad == 1 && discapacidad == 1) {
            total = pagar_consumo / 2;

        } else if (terceraedad == 1) {
            if (pagar_consumo > 3) {
                total = pagar_consumo * 30 / 100;
                total = pagar_consumo - total;
            } else {
                total = pagar_consumo / 2;
            }
        } else if (discapacidad == 1) {
            System.out.println("PORCENTAJE DE DISCAPACIDAD");
            porcentaje = ag.nextInt();
            total = pagar_consumo * porcentaje / 100;
            total = pagar_consumo - total;
        }
        if (discapacidad == 0 && terceraedad == 0) {
            total = pagar_consumo;
        }
        alcantarillado = total * 35 / 100;
        total = total + alcantarillado + 0.75 + 0.50;
        System.out.println("EL IMPUESTO DE ALCANTARILLADO ES: " + utilidades.redondear((float) alcantarillado) + " $");
        System.out.println("TASA POR RECOLECCIÓN DE BASURA: 0.75 $");
        System.out.println("COSTO DE PROCESAMIENTO DE DATOS: 0.50 $");
        System.out.println("EL TOTAL A PAGAR ES DE: " + utilidades.redondear((float) total) + " $");
    }
}