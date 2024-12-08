enum semana_laboral {LUNES=1, MARTES=2, MIERCOLES=3, JUEVES=4, VIERNES=5};

int main() {
    printf("Ingrese un dia de 1 a 5: ");
    int dia = 1;
    scanf("%d", &dia);
    for (int i = LUNES; i <= VIERNES; i++) {
        printf("El dia de la semana es: %d\n", i);
        if (i % 2 == 0) {
            printf("Hoy es un gran dia para Teoria de la Programacion\n",dia);
        }
        if (dia == i) {
            break;
        }
    }
}