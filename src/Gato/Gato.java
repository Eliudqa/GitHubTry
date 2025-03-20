/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gato;

import Persona.Persona;

/**
 *
 * @author aycardie
 */
public class Gato {
private String name;
private int age;
private Persona dueño;

    public Gato(String name, int age, Persona dueño) {
        this.name = name;
        this.age = age;
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "Gato{" + "name=" + name + ", age=" + age + ", due\u00f1o=" + dueño + '}';
    }



}
