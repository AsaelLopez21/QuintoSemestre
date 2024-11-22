#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>

int main() {
    pid_t rf;
    rf = fork();
    int varfork = 10;

    switch (rf) {
        case -1:
            printf("No he podido crear el proceso hijo \n");
            break;
        case 0:
            printf("Soy el hijo, mi PID es %d y el PPID de mi padre es %d \n, valor de varfork: %d ", getpid(), getppid(),varfork);
            for(int i=0;i<10;i++){
                varfork+=1;
                printf("Valor del varfork del hijo: %d\n",varfork);
                sleep(4);
            }
            break;
        default:
            printf("Soy el padre, mi PID es %d y el PID de mi hijo es %d \n, valor del varfork:%d ", getpid(), rf,varfork);
            for(int i=0;i<10;i++){
                varfork+=10;
                printf("Valor del varfork del padre: %d\n",varfork);
                sleep(6);
            }   
    }

    printf("Final de ejecucion de %d \n", getpid());
    exit(0);
}
