/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

import java.util.Random;


/**
 *
 * @author laura
 */
public abstract class Persona {
    private int id;
    private String nombre;
    private String direccion;

    
    /*--------------------------------------------------------------------------
     * ------------------ constructor -----------------------------------------
     */
    public Persona(String nombre, String direccion){
        this.id = randomInt();
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    /*--------------------------------------------------------------------------
     * ------------- getters y setters -----------------------------------------
     */
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
     /*--------------------------------------------------------------------------
     * ----------------------- metodos -----------------------------------------
     */
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n id: ").append(this.getId());
        sb.append("\t\t Nombre: ").append(this.getNombre());
        sb.append("\n Direccion: ").append(this.getDireccion());
        return sb.toString();
    }
    
    private int randomInt() {
	Random claseRandom = new Random();
        int randomInt = 0 + claseRandom.nextInt(1000000 - 0); 
        return randomInt;
    }
    
}
