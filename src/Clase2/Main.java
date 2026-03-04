/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase2;

/**
 *
 * @author mathew
 */
public class Main {
     public static void main(String[] args) {
         //Objeto 1 
         Televisor tv1 = new Televisor ("Samsung", 4000, "oled");
         System.out.println(tv1.toString());
         
         //Objeto 2
         Televisor tv2 = new Televisor("LG", 1000, "IPS");
         System.out.println(tv1.toString());
     }
    
}
