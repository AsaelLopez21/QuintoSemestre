/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miempresa.contactos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumnos
 */
public class GestorContactos {
    private List<Contacto> contactos;
    public GestorContactos() {
        contactos = new ArrayList<>();
    }
    
    public void añadirContacto(Contacto contacto) {
        contactos.add(contacto);
    }
    
    public List<Contacto> listarContactos() {
        return contactos;
    }
    
    public Contacto buscarContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return contacto;
            }
        }
        return null; // Si no se encuentra el contacto
    }
    
}
