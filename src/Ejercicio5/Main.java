/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author mathew
 */
public class Main {
    public static void main(String[] args) {
        
        // Crear servidor
        Servidor servidor = new Servidor();
        
        // Agregar jugadores
        servidor.agregarJugador("Carlos", 130);
        servidor.agregarJugador("Pablo", 65);
        servidor.agregarJugador("Oliver", 200);
        servidor.agregarJugador("Hector", 320);
        
        // Mostrar stacks de diamantes
        System.out.println("Stacks de diamantes");
        servidor.stacksDiamantes();
        
        // Jugador con mas diamantes
        System.out.println("\n" + servidor.jugadorMasDiamantes());
        
        // Total diamantes
        System.out.println("Total diamantes: " + servidor.totalDiamantes());
        
        // Estado del servidor
        System.out.println("\n" + servidor);
    }
}
