package controller.ejercicios;

import java.util.Scanner;

import controller.util.utilidades;

public class telefonia {
    public void telefono() {
        Scanner sc = new Scanner(System.in);
        System.out.println("CLAVE DE LAS ZONAS");
        for (zonas e : zonas.values()) {
            System.out.println(e.toString() + "   CLAVE (" + e.getClave()+")");
        }
        Double precio;
        System.out.println("INGRESE LA CLAVE DE LA ZONA QUE DESEA LLAMAR");
        String cla = sc.nextLine();
        int clave = utilidades.transformStringInt(cla);

        System.out.println("INGRESE LOS MINUTOS QUE DESEA HABLAR");
        String min =sc.nextLine();
        float minutos = utilidades.transformStringFloat(min);
        switch (clave) {
            case 12:
                precio = (zonas.AMERICA_DEL_NORTE.getPrecio() * minutos);
                System.out.println("EL PRECIO ES: " + precio);
                break;
            case 15:
                precio = (zonas.AMERICA_CENTRAL.getPrecio() * minutos);
                System.out.println("EL PRECIO ES: " + precio);
                break;
            case 18:
                precio = (zonas.AMERICA_DEL_SUR.getPrecio() * minutos);
                System.out.println("EL PRECIO ES: " + precio);
                break;
            case 19:
                precio = (zonas.EUROPA.getPrecio() * minutos);
                System.out.println("EL PRECIO ES: " + precio);
                break;
            case 23:
                precio = (zonas.ASIA.getPrecio() * minutos);
                System.out.println("EL PRECIO ES: " + precio);
                break;
            case 25:
                precio = (zonas.AFRICA.getPrecio() * minutos);
                System.out.println("EL PRECIO ES: " + precio);
                break;
            case 29:
                precio = (zonas.OCEANIA.getPrecio() * minutos);
                System.out.println("EL PRECIO ES: " + precio);
                break;
            case 31:
                precio = (zonas.OTROS_LUGARES.getPrecio() * minutos);
                System.out.println("EL PRECIO ES: " + precio);
                break;
            default:
                break;
        }
    }
}