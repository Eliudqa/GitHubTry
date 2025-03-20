/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Perro.Perro;
import Persona.Persona;

/**
 *
 * @author aycardie
 */
public class Main {
    public static void main(String[] args) {

   Persona persona = new Persona(123,"Eliud",18);
        System.out.println(persona);

   Perro perro = new Perro("Chocolisto",5,persona,"Bulldog");
        System.out.println(perro);
    }
}
