/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author mathew
 */
public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(40);
        // Subir pasajeros
        bus.subirPasajeros(15);
        // Mostrar estado
        System.out.println(bus);
    }
}
