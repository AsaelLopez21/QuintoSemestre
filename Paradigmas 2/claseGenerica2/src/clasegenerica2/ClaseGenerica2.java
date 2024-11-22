package clasegenerica2;

public class ClaseGenerica2 {
    public static void main(String[] args) {
    // Crear un elemento de tipo Libro
    Elemento<Libro> libro = new Elemento<>(new Libro("1984", "George Orwell"), "1984");
    libro.mostrarInformacion(); // Salida: T�tulo: 1984, Material: Libro

    // Crear un elemento de tipo Revista
    Elemento<Revista> revista = new Elemento<>(new Revista("National Geographic", 2023), "National Geographic");
    revista.mostrarInformacion(); // Salida: T�tulo: National Geographic, Material: Revista
    
    // Crear un elemento de tipo DVD
    Elemento<Dvd> dvd = new Elemento<>(new Dvd("Inception", "Christopher Nolan"), "Inception");
    dvd.mostrarInformacion(); // Salida: T�tulo: Inception, Material: DVD
    
    
   }
}
