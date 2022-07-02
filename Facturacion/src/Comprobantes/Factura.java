/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comprobantes;

import Fecha.Fecha;
import java.util.List;
import Producto.Producto;
import Persona.Cliente;
import Persona.Vendedor;
import java.util.Random;

/**
 *
 * @author laura
 */
public class Factura extends Comprobante{
    private List<Producto> listaProductos;
    private double total;
    private Cliente cliente;
    private Vendedor vendedor;
    
    
    
    /*--------------------------------------------------------------------------
     * ------------------ constructor -----------------------------------------
     */
    public Factura(char tipo, Fecha fecha, 
            List<Producto> listaProductos, int numero, double total, Cliente cliente, 
            Vendedor vendedor){
        super(tipo, numero, fecha);
        this.listaProductos = listaProductos;
        this.total = total;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }
    
    public Factura(char tipo, int numero, Fecha fecha, 
            List<Producto> listaProductos, double total, Cliente cliente){
        super(tipo, numero, fecha);
        this.listaProductos = listaProductos;
        this.total = total;
        this.cliente = cliente;
        this.vendedor = null;
    }
    
    
    /*--------------------------------------------------------------------------
     * ------------- getters y setters -----------------------------------------
     */
    /**
     * @return the listaProductos
     */
    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    /**
     * @param listaProductos the listaProductos to set
     */
    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the vendedor
     */
    public Vendedor getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    
    /*--------------------------------------------------------------------------
     * ----------------------- metodos -----------------------------------------
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Factura \n Cabecera: {\n");
        if ((vendedor) == null)
            sb.append("Vendedor: -----");
        else
            sb.append("Vendedor: ").append(vendedor.getNombre());
        
        sb.append("\n _______________________________________________________________\n");
        sb.append("Datos del cliente: \n").append(cliente.toString());
        sb.append("} \n");
        
        sb.append("Detalle: {\n");
        sb.append("\n _______________________________________________________________\n");
        sb.append(mostrarListaProd());
        sb.append("\n _______________________________________________________________\n");
        
        sb.append("\n TOTAL: $").append(total);
        
        return sb.toString();
    }
    
    public String mostrarListaProd(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n Codigo \t\t\t Descripcion \t\t\t Precio ($)");
        sb.append("\n _______________________________________________________________\n");
        
        try {
            for (Producto unProducto : listaProductos)
                sb.append(unProducto.toString());
            
        } catch (NullPointerException e) {
            System.out.println("Lista de productos sin cargar");
            System.out.println(e);
        }
        return sb.toString();
    }
    
    public void mostrarFactura(){
        System.out.println(toString());
    }
    
    /**
     * agregarProducto(Producto prod)
     * @param p 
     */
    public void agregarProducto(Producto prod){
        listaProductos.add(prod);
        setTotal(getTotal() + prod.getPrecio());
    }
    
    
    

    
}
