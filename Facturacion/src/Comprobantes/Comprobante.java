/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comprobantes;

import Fecha.Fecha;

/**
 *
 * @author laura
 */
public class Comprobante {
    private char tipo ;
    private int numero;
    private Fecha fecha;
    
    /*--------------------------------------------------------------------------
     * ------------------ constructor -----------------------------------------
     */
    public Comprobante(char tipo, int numero, Fecha fecha){
        this.tipo = tipo;
        this.numero = numero;
        this.fecha = fecha;
    }
    
    /*--------------------------------------------------------------------------
     * ------------- getters y setters -----------------------------------------
     */
    
    /**
     * @return the tipo
     */
    public char getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the fecha
     */
    public Fecha getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    
    
    /*--------------------------------------------------------------------------
     * ----------------------- metodos -----------------------------------------
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo: ").append(this.tipo);
        sb.append("Numero: ").append(this.numero);
        sb.append("Fecha: ").append(this.fecha.toString());
        return sb.toString();
    }

    
}
