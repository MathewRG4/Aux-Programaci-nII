/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author mathew
 */
public class Jugador {
    
    // ATRIBUTOS
    private String nombre;
    private int diamantes;
    
    // CONSTRUCTOR
    public Jugador(String nombre, int diamantes) {
        this.nombre = nombre;
        this.diamantes = diamantes;
    }
    
    // GETTERS
    public String getNombre() {
        return nombre;
    }
    
    public int getDiamantes() {
        return diamantes;
    }
    
    // TOSTRING
    @Override
    public String toString() {
        return "Jugador: " + nombre + " | Diamantes: " + diamantes;
    }
}
