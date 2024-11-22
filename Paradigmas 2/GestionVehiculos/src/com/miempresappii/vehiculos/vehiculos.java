/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miempresappii.vehiculos;

/**
 *
 * @author Alumnos
 */
public class vehiculos {
    protected String marca;
    protected String modelo;
    protected int velocidadMaxima;
    
    public vehiculos(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad maxima: " + velocidadMaxima + " km/h");
    }
    
    public void acelerar() {
        System.out.println("El vehiculo esta acelerando...");
    }
}
