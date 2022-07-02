/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibreriaFunciones;

import Comprobantes.Factura;
import Fecha.Fecha;
import Persona.Cliente;
import Persona.Vendedor;
import Producto.Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author laura
 */
public class FuncionesCarga {
    /**
     * randomInt()
     * Funcion que devuelce un nro random entre 1 y 999999
     * @return int
     */
    public static int randomInt() {
	Random claseRandom = new Random();
        int randomInt = 1 + claseRandom.nextInt(1000000 - 1); 
        return randomInt;
    }
    
    
    /**
     * cargarString(String texto)
     * Funcion para cargar textos
     * @param texto
     * @return txt
     */
    public static String cargarString(String texto){
        Scanner sn = new Scanner(System.in);
        System.out.println(texto);
        String txt=sn.nextLine();
        
        return txt;   
    }
    
    /**
     * cargarNumeroInt(String texto)
     * Funcion que permite la carga de números enteros
     * @param texto
     * @return 
     */
    public static int cargarNumeroInt(String texto){
        Scanner sn = new Scanner(System.in);
        System.out.println(texto);
        int numero=sn.nextInt();
        
        return numero;
    }
    
    /**
     * cargarNumeroDouble(String texto)
     * Funcion que permite la carga de números tipo double
     * @param texto
     * @return 
     */
    public static double cargarNumeroDouble(String texto){
        Scanner sn = new Scanner(System.in);
        System.out.println(texto);
        double numero=sn.nextDouble();
        
        return numero;
    }
    
    /**
     * cargarFecha()
     * Metodo para cargar la fecha de la factura
     * @return 
     */
    public static Fecha cargarFecha(){
        Fecha fech = null;
        
        do{
            try {
                int dia = cargarNumeroInt("Ingrese el día: ");
                int mes = cargarNumeroInt("Ingrese el mes: ");
                int anio = cargarNumeroInt("Ingrese el año: ");
            
                if ((dia > 31 || dia < 1) || (mes < 1 || mes > 12) || (anio < 1950 || anio > 2050) )
                    System.out.println("Error! Ha ingresado una fecha inválida, intente nuevamente.");
                else
                    fech = new Fecha(dia,mes,anio);
            } catch (Exception e) {
                System.out.println("Error al cargar fecha, no ingresó solo números enteros");
            }
        }while(fech == null);
        
        return fech;
    }
    
    /**
     * cargarVendedor()
     * funcion que permite realizar la carga de un vendedor
     * @return 
     */
    public static Vendedor cargarVendedor(){
        String nombre = null;
        String direccion = null;
        String categoria = null;
        int legajo = 0;
        int cargaVen = -1;
        Vendedor ven = null;
        
        //Verificamos si se desea cargar o no un vendedor
        do{
            try{
                  cargaVen= cargarNumeroInt("Cargar vendedor? Ingrese 1 para NO o  cualquier numero para SI: ");

            }catch (Exception e) {
                    System.out.println("No ha ingresado un numero.");
                    System.out.println(e);
            }
        }while(cargaVen == -1);


        // Si se indica que se quiere cargar un vendedor, lo cargamos
        while (cargaVen != 1 && ven == null){
            try {  
                    nombre = cargarString("Ingrese el nombre del vendedor: ");
                    direccion = cargarString("Ingrese la direccion del vendedor: ");
                    legajo = cargarNumeroInt("Ingrese el legajo del vendedor: ");
                    categoria = cargarString("Ingrese la categoría del vendedor");

                    ven = new Vendedor(nombre, direccion, legajo, categoria);
            } catch (Exception e) {
                System.out.println("Error al ingresar datos del vendedor, intente nuevamente");
                System.out.println(e);
            }
        }
        return ven;
    }
    
    
    /**
     * cargarCliente()
     * metodo para cargar el cliente
     * @return 
     */
    public static Cliente cargarCliente(){
        String nombre = null;
        String direccion = null;
        String dirEnt = null;
        int dni = 0;
        Cliente cli = null;
        
                
        do{
            try {
                nombre = cargarString("Ingrese el nombre del cliente: ");
                direccion = cargarString("Ingrese la direccion del cliente: ");
                dni = cargarNumeroInt("Ingrese el DNI del cliente: ");
                dirEnt = cargarString("Ingrese la direccion de entrega del cliente");
                cli = new Cliente(nombre,direccion, dirEnt, dni);
            
            }  catch (Exception e) {
                System.out.println("Error al ingresar datos del cliente, intente nuevamente.");
                System.out.println(e);
            }
        }while (cli == null);   
        
        return cli;
    }
    
    /**
     * cargarProducto()
     * Metodo que permite la carga de productos
     * @return 
     */
    public static Producto cargarProducto(){
        Producto prod = null;
        int codigo;
        String descripcion;
        double precio;
        
        do {
            try {
                codigo = randomInt();
                descripcion = cargarString("Ingrese la descripcion del producto: ");
                precio = cargarNumeroDouble("ingrese el precio del producto: ");

                prod = new Producto(codigo, descripcion, precio);
            } catch (Exception e) {
                System.out.println("Error al cargar el producto, intente nuevamente.");
                System.out.println(e);
            }
        } while (prod == null);

        return prod;
    }
    
    
    /**
     * Metodo para cargar la lista de productos
     * @param lista 
     */
    public static void cargarListaProd(List<Producto> lista){
        //inicializamos variables
        String texto=  "Ingrese un (1) "
                + "para salir o cualquier numero para continuar con la carga de productos: ";
        boolean continuaCarga=true;
        int opcion = -1;
        Producto prod;
        
        System.out.println("\nComienza la carga de Productos....");
        
        while(continuaCarga){
            //reseteamos el objeto producto para prevenir conflictos
            prod = null;
            
            try {
                //generamos el nuevo producto para la factura
                prod= cargarProducto();
                
                //si se genera correctamente se lo añade a la lista de productos de la factura
                if (prod != null)
                    lista.add(prod);
                
                //Consultamos si se desean agregar más productos
                opcion=cargarNumeroInt(texto);
                if (opcion==1)
                     continuaCarga=false;
                               
            } catch (Exception e) {
                System.out.println("Ingrese  un numero no una letra");
            }
        }

        System.out.println("\nFin de carga de productos... \nRegresando al menú principal");
        
        return;
   }
    
    
    /**
     * Metodo para cargar facturas
     * @param fact 
     */
    public static void cargarFacturas(List<Factura> listaFact){
        String texto=  "Ingrese un (1) para salir o cualquier numero para continuar con la carga de facturas";
        int opcion =2;
        List<Producto> listaProds= new ArrayList<>();
        Factura fact;
        try{
            while (opcion!=1) {
                //reseteamos el objeto factura
                fact = null;
                
                System.out.println("Comienza con la carga de facturas..... ");
                
                //Cargamos los datos de la cabecera
                char tipo = cargarString("Ingrese el tipo de factura: ").toUpperCase().charAt(0);
                int numFact = randomInt();
                Fecha fecha= cargarFecha();              
                Vendedor vendedor = cargarVendedor();
                Cliente cliente = cargarCliente();
                
                // cargamos el detalle (lista de productos)
                cargarListaProd(listaProds);
                
                //calculamos el total
                double total = calcularTotal(listaProds);
                
                
                //Creamos la nueva factura con los valores insertados
                fact = new Factura(tipo, fecha, listaProds, numFact, total, cliente, vendedor);
                
                
                //Si la factura se generó de forma correcta, la añadimos a la lista
                if (fact != null){
                    System.out.println("Factura Nro " + fact.getNumero() + " generada correctamente.");
                    listaFact.add(fact);
                }
                
                //Preguntamos si desea continuar con la carga de facturas o no
                opcion = cargarNumeroInt(texto);
            } 
            System.out.println("Fin de carga de facturas. \nRegresando al menu principal");
        }
        catch (Exception e) {
               System.out.println("Carga abortada, ha ingresado un número en lugar de una letra.");
        }    
        
        return;
    }
    
    
    /**
     * Metodo que muestra todo el listado de facturas
     * @param listaFact 
     */
    public static void mostrarFacturas(List<Factura> listaFact){
        System.out.println("---------------- FACTURAS -----------------------------");
        
        for (Factura unaFactura : listaFact){
            System.out.println("_____________________________________________________");
            unaFactura.mostrarFactura();
        }
    }
    
    
    /**
     * Metodo para calcular el total de la factura
     * @param lista
     * @return 
     */
    public static double calcularTotal(List<Producto> lista){
        double total = 0;
        
        for(Producto unProd : lista){
            total += unProd.getPrecio();
        }
        
        return total;
    }
    
    
    /**
     * Metodo que muestra lista de facturas por dni del cliente
     * @param listaFact 
     */
    public static void mostrarFacturasCli(List<Factura> listaFact){
       
        try {
            int dni = cargarNumeroInt("Ingrese el DNI del cliente a buscar: ");
            
            System.out.println("---------------- FACTURAS DEL CLIENTE DNI " + dni + "-----------------------------");
            
            boolean encuentra = false;
            for (Factura unaFactura : listaFact){
                if (unaFactura.getCliente().getDni() == dni){
                    System.out.println("_____________________________________________________");
                    unaFactura.mostrarFactura();
                    
                    encuentra = true;
                }
            }
            
            if(!encuentra)
                System.out.println("\nNo se hallaron facturas del cliente!");
            
        } catch (Exception e) {
            System.out.println("Ha cargado un valor erróneo. Debe ingresar un número entero (sin puntos ni espacios).");
        }
    }
    
    /**
     * Metodo que muestra lista de facturas por LEGAJO del Vendedor
     * @param listaFact 
     */
    public static void mostrarFacturasVend(List<Factura> listaFact){
        
        try {
            int legajo = cargarNumeroInt("Ingrese el lagejo del Vendedor a buscar: ");
        
            System.out.println("---------------- FACTURAS DEL VENDEDOR LEG. " + legajo + "-----------------------------");
            
            boolean encuentra = false;
            for (Factura unaFactura : listaFact){
                if (unaFactura.getCliente().getDni() == legajo){
                    System.out.println("_____________________________________________________");
                    unaFactura.mostrarFactura();
                    
                    encuentra = true;
                }
            }
            
            if(!encuentra)
                System.out.println("\nNo se hallaron facturas del Vendedor!");
        
        } catch (Exception e) {
            System.out.println("Ha cargado un valor erróneo. Debe ingresar un número entero (sin puntos ni espacios).");
        }
    }
    
    /**
     * Metodo que busca y muestra facturas que tengan un total comprendido en un rango de valores
     * @param listaFact
     * @param totMin
     * @param totMax 
     */
    public static void buscarFacturaPorRango(List<Factura> listaFact){
        
        try {
            double totMin = cargarNumeroDouble("Ingrese el valor total mínimo: ");
            double totMax = cargarNumeroDouble("Ingrese el valor total máximo: ");
            
            System.out.println("\nBuscando facturas.... ");
            
            boolean encuentra = false;
            for (Factura unaFactura : listaFact){
                if (unaFactura.getTotal() >= totMin && unaFactura.getTotal() <= totMax){
                    System.out.println("_____________________________________________________");
                    unaFactura.mostrarFactura();
                    
                    encuentra = true;
                }
            }
            
            if(!encuentra)
                System.out.println("\nNo se hallaron facturas en el rango !");
        
        } catch (Exception e) {
            System.out.println("Ha cargado un valor erróneo. Debe ingresar un número entero positivo (sin puntos ni espacios).");
        }
    }
}
