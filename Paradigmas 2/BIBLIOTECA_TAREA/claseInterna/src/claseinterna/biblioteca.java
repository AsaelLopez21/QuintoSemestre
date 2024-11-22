//SJ_LopezRamosAsaelEfrain_501
package claseinterna;

import java.util.ArrayList;

public class biblioteca {
    
    
    //Crear una biblioteca
    private ArrayList<libro> libros;
    
    public biblioteca(){
        libros=new ArrayList<>();
    }
    
    //Clase interna
    
    class libro{
        private String titulo; 
        private String autor; 

        public libro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }
        
        public String getDetalles(){
            String mensaje= "Titulo: " + titulo + ", Autor: " + autor;
            return mensaje; 
        }
        
    }
    
    //Agregar un libro a la biblioteca
    public void agregarLibro(String titulo, String autor) {
        libro nuevoLibro = new libro(titulo, autor); 
        libros.add(nuevoLibro);
        System.out.println("Se ha agregado el libro: " + titulo + " de " + autor);
    }
    
    // Mostrar los libros de la biblioteca
    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca no tiene libros.");
        } else {
            System.out.println("Libros en la biblioteca:");
            for (libro libro : libros) {
                System.out.println(libro.getDetalles()); 
            }
        }
    }
    
    //Metodo para eliminar un libro 
    public void eliminarLibro(String titulo){
        if (libros.isEmpty()) {
            System.out.println("La biblioteca no tiene libros.");
        }else{
            for (libro libro : libros) {
                if(libro.titulo.equals(titulo)){
                    libros.remove(libro);
                    System.out.println("Se a eliminado "+titulo);
                    break;
                } 
            }
        }
    }
    
    //Metodo para buscar un libro 
    public void buscarLibro(String titulo){
        if (libros.isEmpty()) {
            System.out.println("La biblioteca no tiene libros.");
        }else{
            for (libro libro : libros) {
                if(libro.titulo.equals(titulo)){
                    System.out.println(libro.getDetalles());
                    return;
                } 
            }
        }
    }
    
    //Metodo para contar libros
    public void contarLibros(){
        int tamanio = libros.size();
        System.out.println("Numero de libros: "+tamanio);
    }
  
}
