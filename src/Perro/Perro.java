/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perro;

import Persona.Persona;

/**
 *
 * @author aycardie
 */
public class Perro {
    private String name;
    private int age;
    private Persona dueño;
    private String raza;

    public Perro(String name, int age, Persona dueño, String raza) {
        this.name = name;
        this.age = age;
        this.dueño = dueño;
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "name=" + name + ", age=" + age + ", due\u00f1o=" + dueño + ", raza=" + raza + '}';
    }
    
    
}
