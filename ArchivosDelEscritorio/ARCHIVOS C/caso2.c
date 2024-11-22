#include<unistd.h>
#include<stdlib.h>
#include<stdio.h>
#include<wait.h>

int main(){
    pid_t rf;
    rf = fork();
    int varfork=10;
    
    switch(rf){
        case -1:
            printf("/nNo he podido crear el proceso hijo");
        break;

        case 0:
            printf("Soy el hijo, mi PID es %d y mi PPID es %d\n",getpid(),getppid());
            //wait(0);
            for(int i=0;i<10;i++){
                varfork+=1;
                printf("Valor del varfork del hijo: %d\n",varfork);
                sleep(1);
            }
        break;

        default:
            printf("Soy el padre, mi PID es %d y el PID de mi hijo es %d\n",getpid(),rf);
            sleep(3);
            for(int i=0;i<10;i++){
                varfork+=10;
                printf("Valor del varfork del padre: %d\n",varfork);
            }   
    }

    printf("\nFinal de ejecucion de %d \n",getpid());
    exit(0);
}