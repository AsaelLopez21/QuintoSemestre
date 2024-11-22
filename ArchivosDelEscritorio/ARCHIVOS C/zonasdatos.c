#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>

int main() {
    int i;
    int j;
    pid_t rf;

    rf = fork();

    switch (rf) {
        case -1:
            printf("\nNo he podido crear el proceso hijo");
        break;
        case 0:
            // printf("\nENTRA CASE 0_HIJO\n"); 
            sleep(10);
            i = 0;
            printf("\nSoy el hijo, mi PID es %d y mi variable i (inicialmente a %d) es par", getpid(), i);
            for (j = 0; j < 5; j++) {
                i++;
                i++;
                printf("\nSoy el hijo, mi variable i es %d", i);
            }
        break;
        default: 
            // printf("\nENTRA CASE DEFAULT_PADRE\n");
            i = 1;
            printf("\nSoy el padre, mi PID es %d y mi variable i (inicialmente a %d) es impar", getpid(), i);
            //sleep(10);
            for (j = 0; j < 5; j++) {
                i++;
                i++;
                printf("\nSoy el padre, mi variable i es %d", i);
            }
            
        break;
    }

    printf("\nFinal de ejecución de %d \n", getpid());
    exit(0);
}
