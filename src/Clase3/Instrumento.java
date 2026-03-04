/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase3;

/**
 *
 * @author mathew
 */
public class Instrumento {
    //ATRIBUTOS
    public String nombre;
    private String material;
    private String tipo;
    //CONSTRUCTOR

    public Instrumento(String nombre, String material, String tipo) {
        this.nombre = nombre;
        this.material = material;
        this.tipo = tipo;
    }
    //METODOS

    @Override
    public String toString() {
        return "Instrumento{" + "nombre=" + nombre + ", material=" + material + ", tipo=" + tipo + '}';
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    } 
}
