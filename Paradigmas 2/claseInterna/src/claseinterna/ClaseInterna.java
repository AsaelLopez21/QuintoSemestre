package claseinterna;
import java.util.Scanner;
public class ClaseInterna {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op=15;
        String titulo,autor;
        
        biblioteca novaBiblioteca = new biblioteca();
        
        while(op!=0){
            System.out.println("________________MENU________________");
            System.out.println("1.Agregar un libro");
            System.out.println("2.Eliminar un libro");
            System.out.println("3.Buscar un libro");
            System.out.println("4.Mostrar libros");
            System.out.println("5.Contar libros");
            System.out.println("0. Salir del menu");
            op = entrada.nextInt();
            switch(op){
                case 1:
                    //System.out.println("Ingrese titulo libro");
                    titulo = "Quijote";
                    
                    entrada.nextLine();
                    
                    //System.out.println("Ingrese auto libro");
                    autor = "Miguel";
                    
                    novaBiblioteca.agregarLibro(titulo, autor);
                break;
                
                case 2:
                    entrada.nextLine();
                    System.out.println("Ingrese titulo de libro a eliminar");
                    titulo = entrada.nextLine();
                    
                    novaBiblioteca.eliminarLibro(titulo);
                break;
                
                case 3:
                    System.out.println("Ingrese nombre del titulo a buscar");
                    titulo = entrada.nextLine();
                    
                    novaBiblioteca.buscarLibro(titulo);
                break;
                
                case 4:
                    novaBiblioteca.mostrarLibros();
                break;
                
                case 5:
                    novaBiblioteca.contarLibros();
                break;
                
                
            }
        }
        
    }
    
}
