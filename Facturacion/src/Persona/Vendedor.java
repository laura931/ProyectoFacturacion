/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author laura
 */
public class Vendedor extends Persona{
    private int legajo;
    private String categoria;
    
    /*--------------------------------------------------------------------------
     * ------------------ constructor ------------------------------------------
     */
    public Vendedor(String nombre, String direccion, int legajo, String categoria){
        super(nombre, direccion);
        this.legajo = legajo;
        this.categoria = categoria;
    }
    
    
    /*--------------------------------------------------------------------------
     * ------------- getters y setters -----------------------------------------
     */
    /**
     * @return the legajo
     */
    public int getLegajo() {
        return legajo;
    }

    /**
     * @param legajo the legajo to set
     */
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    /*--------------------------------------------------------------------------
     * ----------------------- metodos -----------------------------------------
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vendedor { ");
        sb.append(super.toString());
        sb.append("Legajo: ").append(this.getLegajo());
        sb.append("Categoria: ").append(this.getCategoria());
        sb.append(" }");
        return sb.toString();
    }

    
}
