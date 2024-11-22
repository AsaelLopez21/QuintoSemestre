/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacioncontactos;
import com.miempresa.contactos.Contacto;
import com.miempresa.contactos.GestorContactos;
import java.util.Scanner;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author Alumnos
 */
public class AplicacionContactos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestorContactos gestor = new GestorContactos();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea
            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    gestor.añadirContacto(new Contacto(nombre, telefono,email));
                break;

                case 2:
                    System.out.println("Lista de contactos:");
                    for (Contacto contacto : gestor.listarContactos()) {
                        System.out.println(contacto);
                    }
                break;

                case 3:
                    System.out.print("Nombre del contacto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    Contacto contactoEncontrado =
                    gestor.buscarContacto(nombreBuscar);
                    if (contactoEncontrado != null) {
                        System.out.println("Contacto encontrado: " +
                        contactoEncontrado);
                    } else {
                        System.out.println("Contacto no encontrado.");
                    }
                break;

                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                return;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                break;

            }
        }    
        
    }
}
