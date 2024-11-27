/*Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:

*  Nombre el jugador
*  Posición en el campo de juego
*  Edad
*  Estatura
*  El ciclo de ingreso de información deberá terminar cuando el usuario lo decida. Se debe imprimir el siguiente reporte 
*  (usar una cadena de acumulación):

 *  Listado de Jugadores
 * 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
 * 2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
 * 3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
 * 4. Ángel Mena -Delantero-, edad 32, estatura 1.75
 * 5. Michael Estrada -Delantero-, edad 27, estatura 1.93
 * Promedio de edades:  26.8
 * Promedio de estaturas: 1.87
 */

/**
 *
 * @author Chente15
 */
import java.util.Scanner;

public class Problema4_jugadoresdefutbol {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, posi_campoJuego, respuesta;
        String list_jugadores = "Listado de jugadores\n";
        double estatura, sumaedad = 0, suma_Estatu = 0, promedio_Edad, prome_Estatu;
        int edad, contador = 1;
        boolean otro = true;

        while (otro) {
            System.out.print("DAME EL NOMBRE DEL JUGADOR: ");
            nombre = tcl.nextLine();
            System.out.print("DAME LA POSICION EN EL CAMPO DE JUEGO: ");
            posi_campoJuego = tcl.nextLine();
            System.out.print("DAME LA EDAD DEL JUGADOR: ");
            edad = tcl.nextInt();
            System.out.print("DAME LA ESTATURA DEL JUGADOR: ");
            estatura = tcl.nextDouble();
            tcl.nextLine();

            sumaedad += edad;
            suma_Estatu += estatura;
            list_jugadores += (String.format("%d. %s -%s-, edad %d, estatura %.2f\n",
                    contador, nombre,posi_campoJuego , edad, estatura));

            System.out.print("Desea ingresar mas jugadores? (si/no): ");
            respuesta = tcl.nextLine();
            otro = respuesta.equalsIgnoreCase("si");
            if (otro == false) {
                break;
            }
            contador++;
        }
        promedio_Edad = (sumaedad / contador);
        prome_Estatu = (suma_Estatu / contador);
        System.out.print(list_jugadores);
        System.out.printf("Promedio de edades: %.2f\n", promedio_Edad);
        System.out.printf("Promedio de estaturas: %.2f\n", prome_Estatu);

    }
}
 /**
 * run:
 * Listado de jugadores
 *  1. Alexander Dominguez -Arquero-, edad 32, estatura 1,95
 *  2. Xavier Arreaga -Defensa-, edad 24, estatura 1,85
 *  3. Mois�s Caicedo -Mediocentro-, edad 19, estatura 1,88
 *  4. Angel Mena -Delantero-, edad 32, estatura 1,75
 *  5. Michael Estrada -Delantero-, edad 27, estatura 1,93
 *  Promedio de edades: 26,80
 *  Promedio de estaturas: 1,87
 * 
 */       

