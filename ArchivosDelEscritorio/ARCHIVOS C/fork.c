#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
#include<wait.h>

int main() {
    pid_t rf;
    rf = fork();
    int varfork = 0;

    if (rf == 0) {
        sleep(5);
        printf("Soy el hijo");  
        for (int i = 0; i < 10; i++){
            varfork+=2;
        }
        printf("\nValor final de la variable en el proceso hijo: %d\n",varfork);
    } else {
        printf("\nSoy el padre");
        for (int i = 0; i < 10; i++){
            varfork+=5;
        }
        printf("\nValor final de la variable en el proceso padre: %d\n",varfork);
    }

    printf("Final de ejecucion de %d \n\n", getpid());
    exit(0);
}
