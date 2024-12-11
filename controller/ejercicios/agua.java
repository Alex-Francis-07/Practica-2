package controller.ejercicios;

import java.util.Scanner;

import controller.util.utilidades;

public class agua {
    public void consumodeagua() {
        Scanner ag = new Scanner(System.in);
        double pagar_consumo = 0.0;
        double total = 0.0;
        double porcentaje = 0.0;
        double alcantarillado = 0.0;
        //int discapacidad;
        // terceraedad;
        System.out.println("INGRESE EL CONSUMO DE AGUA");
        String con =ag.nextLine();
        float consumo = utilidades.transformStringFloat(con);
        if (consumo<=0){
            System.out.println("INGRESE NUMEROS POSITIVOS Y MAYORES DE 0");
            return;
        }
        if (consumo > 0 && consumo <= 15) {
            pagar_consumo = 3;
        } else if (consumo > 15 && consumo <= 25) {
            pagar_consumo = 25 - consumo;
            if (pagar_consumo == 0) {
                pagar_consumo = 4;
            } else {
                pagar_consumo = (consumo - 15) * 0.10;
                pagar_consumo += 4;
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
        System.out.println("PERTENECE A LA TERCERA EDAD (si) o (no)");
        String terceraedad = ag.next();
        if (terceraedad.equalsIgnoreCase("si")) {
            if (pagar_consumo > 45) {
                total = pagar_consumo * 30 / 100;
                total = pagar_consumo - total;
            } else {
                total = pagar_consumo / 2;
            }
        }
        System.out.println("TIENE DISCAPACIDAD (si) o (no)");
        String discapacidad = ag.next();
        if (discapacidad.equalsIgnoreCase("si")) {
            System.out.println("PORCENTAJE DE DISCAPACIDAD");
            porcentaje = ag.nextDouble();
            total = pagar_consumo * porcentaje / 100;
            total = pagar_consumo - total;
        }
        alcantarillado = total * 35 / 100;
        total = total + alcantarillado + 0.75 + 0.50;
        System.out.println("EL IMPUESTO DE ALCANTARILLADO ES: " + utilidades.redondear((float) alcantarillado) + " $");
        System.out.println("TASA POR RECOLECCIÓN DE BASURA: 0.75 $");
        System.out.println("COSTO DE PROCESAMIENTO DE DATOS: 0.50 $");
        System.out.println("EL TOTAL A PAGAR ES DE: " + utilidades.redondear((float) total) + " $");
    }
}