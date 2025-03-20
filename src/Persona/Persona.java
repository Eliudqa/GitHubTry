/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author aycardie
 */
public class Persona {
    
    private long ident;
    private String name;
    private int age;

    public Persona(int ident, String name, int age) {
        this.ident = ident;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persona{" + "ident=" + ident + ", name=" + name + ", age=" + age + '}';
    }
 
    
    
}
