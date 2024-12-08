package controller.ejercicios;

import java.util.Scanner;

import controller.util.utilidades;

public class agua {
    public void consumodeagua() {
        Scanner ag = new Scanner(System.in);
        double pagar_consumo=0.0;
        double total=0.0;
        double porcentaje=0.0;
        double alcantarillado=0.0;
        int discapacidad ;
        int terceraedad;
        System.out.println("INGRESE EL CONSUMO DE AGUA");
        float consumo = ag.nextFloat();
        if (consumo>=0  && consumo<=15){
            pagar_consumo = 15 - consumo;
            if (pagar_consumo==0){
                pagar_consumo=consumo * 3;
            }else {
                pagar_consumo = consumo *3;
            }
        }else if(consumo>15 && consumo <=25){
            pagar_consumo = 25 - consumo;
            if (pagar_consumo==0){
                pagar_consumo=46;
            }else {
                pagar_consumo = (consumo-15) * 0.10;
                pagar_consumo+=45;
            }
        }else if(consumo>25 && consumo <=40){
            pagar_consumo = 40 - consumo;
            if (pagar_consumo==0){
                pagar_consumo=49;
            }else {
                pagar_consumo = (consumo-25) * 0.20;
                pagar_consumo+=46;
            }
        }else if(consumo>40 && consumo <=60){
            pagar_consumo = 60 - consumo;
            if (pagar_consumo==0){
                pagar_consumo=55;
            }else {
                pagar_consumo = (consumo-40) * 0.30;
                pagar_consumo+=46;
            }
        }else if(consumo>60){
            pagar_consumo = consumo-60;
            pagar_consumo=pagar_consumo*0.35;
            pagar_consumo= pagar_consumo+55;
        }
    System.out.println("INGRESE 1 SI PERTENECE A LA TERCERA EDAD CASO CONTRARIO INGRESE 0");
    terceraedad = ag.nextInt();
    if (terceraedad==1){
        if (pagar_consumo>45){
            total=pagar_consumo*30/100;
            total = pagar_consumo-total;
        }else{
            total=pagar_consumo/2;
        }
    }
    System.out.println("INGRESE 1 SI TIENE DISCAPACIDAD CASO CONTRARIO INGRESE 0");
    discapacidad = ag.nextInt();
    if (discapacidad==1){
        System.out.println("INGRESE EL PORCENTAJE DE DISCAPACIDAD");
        porcentaje =ag.nextDouble();
        total =pagar_consumo*porcentaje/100;
        total =pagar_consumo-total;
    }
    if (discapacidad==0 && terceraedad==0){
        total=pagar_consumo;
    }
    alcantarillado= total*35/100;
    total=total +alcantarillado+0.75+0.50;
    System.out.println("EL IMPUESTO DE ALCANTARILLADO ES: "+utilidades.redondear((float)alcantarillado)+" $");
    System.out.println("TASA POR RECOLECCIÓN DE BASURA: 0.75 $");
    System.out.println("COSTO DE PROCESAMIENTO DE DATOS: 0.50 $");
    System.out.println("EL TOTAL A PAGAR ES DE: "+utilidades.redondear((float)total)+" $");
    }
}