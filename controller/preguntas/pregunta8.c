#include <stdio.h>
int main() {
    int numero=4;
    printf("NUMERO ORIGINAL %d\n", numero);
    sumar3(&numero);
    printf("NUMERO DESPUES DE UTILIZAR LA FUNCION %d\n", numero);
    return 0;
}
int sumar3(int *num) {
    *num += 3;
    return num;
}