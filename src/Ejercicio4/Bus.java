/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author mathew
 */
public class Bus {
    // ATRIBUTOS
    private int capacidad;
    private int pasajeros;
    private double totalRecaudado;
    
    // CONSTRUCTOR
    public Bus(int capacidad) {
        this.capacidad = capacidad;
        this.pasajeros = 0;
        this.totalRecaudado = 0;
    }
    
    // SUBIR PASAJEROS
    public void subirPasajeros(int x) {
        if (pasajeros + x <= capacidad) {
            pasajeros = pasajeros + x;
        } else {
            System.out.println("No hay suficientes asientos");
        }
    }
  
    // COBRAR PASAJE
    public double cobrarPasaje() {
        totalRecaudado = pasajeros * 1.50;
        return totalRecaudado;
    }
    
    // ASIENTOS DISPONIBLES
    public int asientosDisponibles() {
        return capacidad - pasajeros;
    }
    
    // TOSTRING
    @Override
    public String toString() {
        return "Estado del Bus" + "\nCapacidad total: " + capacidad + "\nPasajeros: " + pasajeros + "\nAsientos libres : " + asientosDisponibles() + "\nTotal recaudado : Bs. " + cobrarPasaje();
    }
}