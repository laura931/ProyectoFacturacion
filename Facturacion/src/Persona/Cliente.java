/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author laura
 */
public class Cliente extends Persona{
    private String dirEntrega;
    private int dni;
    
    /*--------------------------------------------------------------------------
     * ------------------ constructor -----------------------------------------
     */
    public Cliente(String nombre, String direccion, String dirEntrega, int dni){
        super(nombre, direccion);
        this.dirEntrega = dirEntrega;
        this.dni = dni;
    }
    
    /*--------------------------------------------------------------------------
     * ------------- getters y setters -----------------------------------------
     */
    /**
     * @return the dirEntrega
     */
    public String getDirEntrega() {
        return dirEntrega;
    }

    /**
     * @param dirEntrega the dirEntrega to set
     */
    public void setDirEntrega(String dirEntrega) {
        this.dirEntrega = dirEntrega;
    }
    
    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dirEntrega the dirEntrega to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }
    
    /*--------------------------------------------------------------------------
     * ----------------------- metodos -----------------------------------------
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        sb.append(super.toString());
        sb.append("\n DNI: ").append(this.getDni());
        sb.append("\n Direcccion: ").append(this.getDirEntrega());
        sb.append(" \n_______________________________________________________________\n");
        return sb.toString();
    }

    
    
}
