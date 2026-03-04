/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase2;

/**
 *
 * @author mathew
 */
public class Televisor {
    //Atributos
    private String marca;
    private int resolucion;
    private String tipo;
    //constructor

    public Televisor(String marca, int resolucion, String tipo) {
        this.marca = marca;
        this.resolucion = resolucion;
        this.tipo = tipo;
    }
    public Televisor() {
    }
    //Metodo
    @Override
    public String toString() {
        return "Televisor{" + "marca=" + marca + ", resolucion=" + resolucion + ", tipo=" + tipo + '}';
    }
}
