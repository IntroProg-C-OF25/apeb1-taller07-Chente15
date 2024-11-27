/*
 * Generar un programa Java que permita ingresar 4 estudiantes;
 * por cada uno de ellos ingresar el nombre del estudiante, el promedio de ciclo.
 * Presentar el siguiente reporte
 * Estudiante1	10	Aprobado
 * Estudiante2	6.9	Reprobado
 * Estudiante3	7	Aprobado
 * Estudiante4	5	Reprobado
 * Atención; con base al valor del promedio, usted debe asignar en cada registro el tipo Aprobado o Reprobado.
 */

/**
 *
 * @author Chente15
 */
import java.util.Scanner;

public class Problema5_Promedios {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, estado;
        double promedio;
        int contador = 1;
        while (contador <= 4) {
            System.out.print("Dame nombre y promedio del est_" + contador + ":");
            nombre = tcl.next();
            promedio = tcl.nextDouble();
            if (promedio < 7) {
                estado = "Reprobado";
            } else {
                estado = "Aprobado";    
            }
            System.out.printf("| %s\t| %s | %s\t|\n", "Nombre", "Promedio", "Estado");
            System.out.printf("| %s\t| %.2f\t   | %s\t|\n", nombre, promedio, estado);
            contador++;

        }//Fin while

    }
}
/**
 * Dame nombre y promedio del est_1: Daniel
 *  10
 *  | Nombre	| Promedio | Estado	|
 *  | Daniel	| 10,00	   | Aprobado	|
 *  Dame nombre y promedio del est_2: Juan
 *  6,9
 *  | Nombre	| Promedio | Estado	|
 *  | Juan	| 6,90	   | Reprobado	|
 *  Dame nombre y promedio del est_3: Carlos
 *  7
 *  | Nombre	| Promedio | Estado	|
 *  | Carlos	| 7,00	   | Aprobado	|
 *  Dame nombre y promedio del est_4: Pedro
 *  5
 *  | Nombre	| Promedio | Estado	|
 *  | Pedro	| 5,00	   | Reprobado	|
 * 
 */
