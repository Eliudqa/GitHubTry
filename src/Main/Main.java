/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Gato.Gato;
import Persona.Persona;

/**
 *
 * @author aycardie
 */
public class Main {
    public static void main(String[] args) {

   Persona persona = new Persona(123,"Eliud",18);
        System.out.println(persona);
        
   Gato gato = new Gato("Fransisca",2,persona);
        System.out.println(gato);

    }
}
