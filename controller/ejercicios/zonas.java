package controller.ejercicios;

public enum zonas {
    AMERICA_DEL_NORTE(12, 2.75),
    AMERICA_CENTRAL(15, 1.89),
    AMERICA_DEL_SUR(18, 1.60),
    EUROPA(19, 3.5),
    ASIA(23, 4.5),
    AFRICA(25, 3.1),
    OCEANIA(29, 3),
    OTROS_LUGARES(31, 6);
    private int clave;
    private double precio;
    private zonas(int clave2, double precio2) {
        clave = clave2;
        precio = precio2;
    }
    public int getClave(){
        return clave;
    }
    public double getPrecio(){
        return precio;
    }
}
