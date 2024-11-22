/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.miempresappii.vehiculos;
import com.miempresappii.vehiculos.Automovil;
import com.miempresappii.vehiculos.Motocicleta;
/**
 *
 * @author Alumnos
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Crear un automóvil
    Automovil miAuto = new Automovil("Toyota", "Corolla", 180, 4);
    System.out.println("Informacion del Automovil:");
    miAuto.mostrarInformacion();
    miAuto.tocarClaxon();
    miAuto.acelerar();
    // Crear una motocicleta
    Motocicleta miMoto = new Motocicleta("Honda", "CBR", 220, true);
    System.out.println("\nInformacion de la Motocicleta:");
    miMoto.mostrarInformacion();
    miMoto.hacerAcrobacia();
    miMoto.acelerar();
    }
    
}
