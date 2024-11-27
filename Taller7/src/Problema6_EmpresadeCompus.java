/*
 *  Una empresa de comercialización de computadoras realiza el proceso de venta haciendo un descuento por tipo de cliente:
 *  Si es cliente tipo 1 hay un descuento del 10% Si es cliente tipo 2 hay un descuento del 20%
 *  En caso que sea otro tipo de cliente, no hay descuento. Generar un proceso que permita ingresar 7 ventas:
 *  por cada venta preguntar los siguiente datos:

 *  Nombre del cliente
 *  Costo de la computadora (solo se vende una computadora por transacción)
 *  Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra computadora con precio $100
 * 
 */

/**
 *
 * @author Chente15
 */
import java.util.Scanner;

    public class Problema6_EmpresadeCompus {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre;        
        int cont = 0, limite = 7, tipoCliente;
        double costo_Compu, descuento = 0, valor_total;
        while (cont < limite) {
            System.out.println("Venta #" + (cont + 1));
            System.out.print("INGRESA EL NOMBRE DEL CLIENTE: ");
            nombre = tcl.nextLine();
            System.out.print("INGRESA EL COSTO DE LA COMPUTADORA: ");
            costo_Compu = tcl.nextDouble();
            System.out.print("INGRESA EL TIPO DE CLIENTE (1 o 2): ");
            tipoCliente = tcl.nextInt();
            tcl.nextLine();
            if (tipoCliente == 1) {
                descuento = costo_Compu * 0.10; 
            }
            if (tipoCliente == 2) {
                descuento = costo_Compu * 0.20; 
            }

            valor_total = costo_Compu - descuento;

            System.out.println("Cliente: " + nombre + ", compra computadora con precio $" + costo_Compu + " y paga $" + valor_total);
            System.out.println();

           cont++;
        }

    }
}
/**
 * Venta #1
 *  INGRESA EL NOMBRE DEL CLIENTE: Carlos
 *  INGRESA EL COSTO DE LA COMPUTADORA: 100
 *  INGRESA EL TIPO DE CLIENTE (1 o 2): 1
 *  Cliente: Carlos, compra computadora con precio $100.0 y paga $90.0

 *  Venta #2
 *  INGRESA EL NOMBRE DEL CLIENTE: Robert
 *  INGRESA EL COSTO DE LA COMPUTADORA: 300
 *  INGRESA EL TIPO DE CLIENTE (1 o 2): 2
 *  Cliente: Robert, compra computadora con precio $300.0 y paga $240.0

 *  Venta #3
 *  INGRESA EL NOMBRE DEL CLIENTE: Camilo
 *  INGRESA EL COSTO DE LA COMPUTADORA: 500
 *  INGRESA EL TIPO DE CLIENTE (1 o 2): 1
 *  Cliente: Camilo, compra computadora con precio $500.0 y paga $450.0

 *  Venta #4
 *  INGRESA EL NOMBRE DEL CLIENTE: Daniel
 *  INGRESA EL COSTO DE LA COMPUTADORA: 700
 *  INGRESA EL TIPO DE CLIENTE (1 o 2): 1
 *  Cliente: Daniel, compra computadora con precio $700.0 y paga $630.0

 *  Venta #5
 *  INGRESA EL NOMBRE DEL CLIENTE: Viche
 *  INGRESA EL COSTO DE LA COMPUTADORA: 800
 *  INGRESA EL TIPO DE CLIENTE (1 o 2): 2
 *  Cliente: Viche, compra computadora con precio $800.0 y paga $640.0

 *  Venta #6
 *  INGRESA EL NOMBRE DEL CLIENTE: David
 *  INGRESA EL COSTO DE LA COMPUTADORA: 600
 *  INGRESA EL TIPO DE CLIENTE (1 o 2): 1
 *  Cliente: David, compra computadora con precio $600.0 y paga $540.0

 *  Venta #7
 *  INGRESA EL NOMBRE DEL CLIENTE: Juan
 * INGRESA EL COSTO DE LA COMPUTADORA: 900
 *  INGRESA EL TIPO DE CLIENTE (1 o 2): 1
 *  Cliente: Juan, compra computadora con precio $900.0 y paga $810.0
 */
