/*
 * Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados. 
 * Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo del día trabajo. 
 * Calcular el valor a cancelar por la empresa para cada empleado. Presentar un reporte como el siguiente:

 * Nombre 1	10	$2.5	$25
 * Nombre 2	11	$2	$22
 * Nombre 3	9	$3	$27
 * Nombre 4	5	$4	$20
 * Nombre 5	12	$2	$24
 */

/**
 *
 * @author Chente15
 */
import java.util.Scanner;

public class Problema3_Empleados {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int contador = 1, limite, dias_trabajados;
        String nombre;
        double costo_Dia, valor_Total;
        System.out.print("DAME EL LIMIMTE DE EMPLEADOS: ");
        limite = tcl.nextInt();
        while (contador <= limite) {
            System.out.print("DAME EL NOMBRE DEL EMPLEADO: ");
            nombre = tcl.next();
            System.out.print("DAME EL NUMERO DE DIAS TRABAJADOS: ");
            dias_trabajados = tcl.nextInt();
            System.out.print("DAME EL COSTO DEL DIA: ");
            costo_Dia = tcl.nextDouble();
            valor_Total = dias_trabajados * costo_Dia;
            System.out.printf("|\t%s\t | %s | %s | %s | \n", "NOMBRE", "DIAS TRABAJADOS", "COSTO DIA", "VALOR TOTAL");
            System.out.printf("|\t%s\t |       %2d        |    %.2f   |    %.2f    | \n", nombre, dias_trabajados, costo_Dia, valor_Total);
            contador++;
        }
    }
}
/**
 * run:
 *  DAME EL LIMIMTE DE EMPLEADOS: 5
 *  DAME EL NOMBRE DEL EMPLEADO: Robert
 *  DAME EL NUMERO DE DIAS TRABAJADOS: 10
 *  DAME EL COSTO DEL DIA: 2,5
 *  |	NOMBRE	 | DIAS TRABAJADOS | COSTO DIA | VALOR TOTAL | 
 *  |	Robert	 |       10        |    2,50   |    25,00    | 
 *  DAME EL NOMBRE DEL EMPLEADO: Carlos
 *  DAME EL NUMERO DE DIAS TRABAJADOS: 11
 *  DAME EL COSTO DEL DIA: 2
 *  |	NOMBRE	 | DIAS TRABAJADOS | COSTO DIA | VALOR TOTAL | 
 *  |	Carlos	 |       11        |    2,00   |    22,00    | 
 *  DAME EL NOMBRE DEL EMPLEADO: Juan
 *  DAME EL NUMERO DE DIAS TRABAJADOS: 9
 *  DAME EL COSTO DEL DIA: 3
 *  |	NOMBRE	 | DIAS TRABAJADOS | COSTO DIA | VALOR TOTAL | 
 *  |	Juan	 |        9        |    3,00   |    27,00    | 
 *  DAME EL NOMBRE DEL EMPLEADO: Jhandry
 *  DAME EL NUMERO DE DIAS TRABAJADOS: 5
 *  DAME EL COSTO DEL DIA: 4
 *  |	NOMBRE	 | DIAS TRABAJADOS | COSTO DIA | VALOR TOTAL | 
 *  |	Jhandry	 |        5        |    4,00   |    20,00    | 
 *  DAME EL NOMBRE DEL EMPLEADO: David
 *  DAME EL NUMERO DE DIAS TRABAJADOS: 12
 *  DAME EL COSTO DEL DIA: 2
 *  |	NOMBRE	 | DIAS TRABAJADOS | COSTO DIA | VALOR TOTAL | 
 *  |	David	 |       12        |    2,00   |    24,00    | 
 * 
 */
