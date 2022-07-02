/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Producto;

/**
 *
 * @author laura
 */
public class Producto {
    private int codigo;
    private String descripcion;
    private double precio;
    
    
    
    /*--------------------------------------------------------------------------
     * ------------------ constructor -----------------------------------------
     */
    public Producto(int codigo, String descripcion, double precio){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    
    /*--------------------------------------------------------------------------
     * ------------- getters y setters -----------------------------------------
     */
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    /*--------------------------------------------------------------------------
     * ----------------------- metodos -----------------------------------------
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //sb.append("Producto { ");
        sb.append("\n ").append(getCodigo());
        sb.append("\t\t\t\t\t\t ").append(getDescripcion());
        sb.append("\t\t\t\t\t\t $").append(getPrecio());
        //sb.append(" }");
        return sb.toString();
    }

    
}
