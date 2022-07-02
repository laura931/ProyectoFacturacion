/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Comprobantes.Factura;
import LibreriaFunciones.FuncionesCarga;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

/**
 *
 * @author laura
 */
public class Ventas {
    
    public static void main(String[] args) {
        
        menu();

    }
    
    public static void menu(){

        int opciones;
        boolean ban = true;
        
        List<Factura> listaFacturas = new ArrayList<>();
        
        String  texto="----------------\n"
                + "Ingrese una de estas opciones:\n"
                + "(1) Cargar Facturas\n"
                + "(2) Mostrar Factura\n"
                + "(3) Mostrar Facturas por dni del cliente\n"
                + "(4) Mostrar Facturas por legajo de vendedor\n"
                + "(5) Buscar Facturas por rangos de precios totales\n"
                + "(0) Escriba 0 para salir\n"
                + "----------------\n";
        while(ban){
            try {
                 //Accion
                opciones = FuncionesCarga.cargarNumeroInt(texto);
                switch(opciones){

                    case 1: // Carga de Facturas

                        FuncionesCarga.cargarFacturas(listaFacturas);

                        if (!listaFacturas.isEmpty())
                            System.out.println("Lista de facturas cargada correctamente.");
                        else
                            System.out.println("La lista de facturas no se cargó de forma correcta. Intentar nuevamente.");

                        break;


                    case 2: // Muestra de facturas 
                        if (listaFacturas.isEmpty()){
                            System.out.println("Lista de Facturas vacía, pasar por la opción (1) primero.");
                            break;
                        }
                        
                        FuncionesCarga.mostrarFacturas(listaFacturas);

                        break;
                        
                    case 3: // Muestra de facturas por dni de cliente
                        if (listaFacturas.isEmpty()){
                            System.out.println("Lista de Facturas vacía, pasar por la opción (1) primero.");
                            break;
                        }
                 
                        FuncionesCarga.mostrarFacturasCli(listaFacturas);
                        
                        break;
                    
                    case 4: // Muestra de facturas por legajo de vendedor
                        if (listaFacturas.isEmpty()){
                            System.out.println("Lista de Facturas vacía, pasar por la opción (1) primero.");
                            break;
                        }
                        
                        FuncionesCarga.mostrarFacturasVend(listaFacturas);
                                               
                        break;

                    case 0 :
                        System.out.println("Hasta Luego!");
                        return;

                    default:
                        System.out.println("Opción incorrecta");

                }
            
            } catch (InputMismatchException e) {
                System.out.println("Error"+e);
            }

        }
         
    }
    

    
}
