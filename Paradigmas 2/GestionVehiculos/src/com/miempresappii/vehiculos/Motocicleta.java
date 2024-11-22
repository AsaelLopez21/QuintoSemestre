/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miempresappii.vehiculos;

/**
 *
 * @author Alumnos
 */
public class Motocicleta extends vehiculos{
    private boolean tieneCasco;
    public Motocicleta(String marca, String modelo, int velocidadMaxima, boolean tieneCasco) {
        super(marca, modelo, velocidadMaxima);
        this.tieneCasco = tieneCasco;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Incluye casco?: " + (tieneCasco ? "Si" : "No"));
    }
    public void hacerAcrobacia() {
        System.out.println("La motocicleta esta haciendo una acrobacia.");
    }
}
