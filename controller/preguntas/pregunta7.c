#include <stdio.h>
int main() {
    int numero=6;
    printf("NUMERO ORIGINAL %d\n", numero);
    sumar5(numero);
    printf("NUMERO DESPUES DE UTILIZAR LA FUNCION %d\n", numero);

    return 0;
}
int sumar5(int num) {
    num += 5;
    return num;
}