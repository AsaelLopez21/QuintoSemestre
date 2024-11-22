#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
#include<wait.h>

int main() {
    pid_t rf;
    
    rf = fork();
    rf = fork();
    rf = fork();
    // for(int i=0;i<4;i++){
    //     rf=fork();
    //     printf("<%d>,",i);
    // }  



    switch (rf){
        case -1:
            printf ("No he podido crear el proceso hijo \n");
        break;

        case 0:
            printf ("Soy el hijo, mi PID es %d y el PPID de mi padre es %d \n", getpid(), getppid());
            sleep (5);
            exit(0);
        break;

        default:
            printf ("Soy el padre, mi PID es %d y el PID de mi hijo es %d \n", getpid(), rf);
            sleep (8);
    }


    // if (rf == 0) {
    //     printf("Soy el hijo, mi PID es %d y el PPID de mi padre es %d \n", getpid(), getppid());
    //     sleep(5);
    // }else{
    //     printf("Soy el padre, mi PID es %d\n", getpid());
    // }
    
    printf("Final de ejecucion de %d \n\n", getpid());
    exit(0);
}