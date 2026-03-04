/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author mathew
 */
public class Main {
    public static void main(String[] args) {
        //OBJETO 1
        Anime anime1 = new Anime("Naruto ","Accion", 228);
        System.out.println("Nombre: " + anime1.nombre);
        System.out.println("Genero: " + anime1.genero);
        //OBJETO 2
        Anime anime2 = new Anime("Drangon ball ","Accion", 666);
        System.out.println("Nombre: " + anime2.nombre);
        System.out.println("Genero: " + anime2.genero);
    }
}
