package controller.menu;

import java.util.Scanner;

import controller.ejercicios.telefonia;
import controller.util.utilidades;
import controller.ejercicios.autos;
import controller.ejercicios.serie;
import controller.ejercicios.agua;

public class menupractica {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        autos car = new autos();
        telefonia tel = new telefonia();
        agua agua1 = new agua();
        serie serie = new serie();
        int opci;

        do {
            System.out.println(
                    "-----------------------------------------------(MENU)-----------------------------------------------");
            System.out.println("1: INFORME DE AUTOS");
            System.out.println("2: TELEFONIA");
            System.out.println("3: AGUA");
            System.out.println("4: SERIE");
            System.out.println("0: SALIR");
            String opcion = menu.nextLine();
            opci = utilidades.transformStringInt(opcion);
            if (opci !=1 && opci !=2 && opci !=3 && opci !=4){
                System.out.println("INGRESE LOS NUMEROS INDICADOS EN EL MENU");
            }
            switch (opci) {
                case 0:
                    break;
                case 1:
                    System.out.println(
                            "----------------------------------------(INFORME DE AUTOS)------------------------------------------");
                    car.carros();
                    break;
                case 2:
                    System.out.println(
                            "--------------------------------------------(TELEFONIA)---------------------------------------------");
                    tel.telefono();
                    break;
                case 3:
                    System.out.println(
                            "-----------------------------------------------(AGUA)-----------------------------------------------");
                    agua1.consumodeagua();
                    break;
                case 4:
                    System.out.println(
                            "-----------------------------------------------(SERIE)----------------------------------------------");
                    serie.serie1();
                    break;
                default:
                    opci = 0;
                    break;
            }
        }

        while (opci != 0);
    }
}