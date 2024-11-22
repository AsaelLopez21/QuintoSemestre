/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miempresappii.vehiculos;

/**
 *
 * @author Alumnos
 */
public class Automovil extends vehiculos{
    private int numeroPuertas;
    public Automovil(String marca, String modelo, int velocidadMaxima, int numeroPuertas) {
        super(marca, modelo, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de puertas: " + numeroPuertas);
    }
    public void tocarClaxon() {
        System.out.println("Bip Bip! El automovil esta tocando el claxon.");
    }
}
