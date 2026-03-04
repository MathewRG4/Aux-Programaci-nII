/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;
/**
 *
 * @author mathew
 */
public class Anime {
    //ATRIBUTOS
    public String nombre;
    public String genero;
    private int nroEpisodios;
    private String[] episodios;
    //METODOS

    public Anime(String nombre, String genero, int nroEpisodios) {
        this.nombre = nombre;
        this.genero = genero;
        this.nroEpisodios = nroEpisodios;
    }
}
