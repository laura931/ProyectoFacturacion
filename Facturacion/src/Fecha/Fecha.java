/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fecha;

/**
 *
 * @author laura
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    
    
    /*--------------------------------------------------------------------------
     * ------------------ constructor -----------------------------------------
     */
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    /*--------------------------------------------------------------------------
     * ------------- getters y setters -----------------------------------------
     */
    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
    /*--------------------------------------------------------------------------
     * ----------------------- metodos -----------------------------------------
     */
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.dia).append("/");
        sb.append(this.mes).append("/");
        sb.append(this.anio);
        return sb.toString();
    }
    
}
