/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author mathew
 */
public class Servidor {
    
    // ATRIBUTOS
    private Jugador[] jugadores;
    private int totalJugadores;
    
    // CONSTRUCTOR
    public Servidor() {
        jugadores = new Jugador[10];
        totalJugadores = 0;
    }
    
    // a) 
    public void agregarJugador(String nombre, int diamantes) {
        if (totalJugadores < 10) {
            jugadores[totalJugadores] = new Jugador(nombre, diamantes);
            totalJugadores++;
        } else {
            System.out.println("Servidor lleno, no pueden agregar mas jugadores");
        }
    }
    
    // b) 
    public void stacksDiamantes() {
        for (int i = 0; i < totalJugadores; i++) {
            int stacks = jugadores[i].getDiamantes() / 64;
            System.out.println(jugadores[i].getNombre() + 
                             " tiene " + stacks + " stacks de diamantes");
        }
    }
    
    // c) 
    public String jugadorMasDiamantes() {
        Jugador mayor = jugadores[0];
        for (int i = 1; i < totalJugadores; i++) {
            if (jugadores[i].getDiamantes() > mayor.getDiamantes()) {
                mayor = jugadores[i];
            }
        }
        return "Jugador con mas diamantes: " + mayor.getNombre() + 
               " con " + mayor.getDiamantes() + " diamantes";
    }
    
    // d)
    public int totalDiamantes() {
        int total = 0;
        for (int i = 0; i < totalJugadores; i++) {
            total += jugadores[i].getDiamantes();
        }
        return total;
    }
    
    // TOSTRING
    @Override
    public String toString() {
        return "=== Servidor Minecraft ===" + "\nJugadores activos: " + totalJugadores + "\nTotal diamantes: " + totalDiamantes();
    }
}
