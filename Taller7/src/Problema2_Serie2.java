/*
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 *
 * 5/10
 * 10/12
 * 15/14
 * 20/16
 * 25/18
 * 30/20
 */

/**
 *
 * @author Chente15
 */
import java.util.Scanner;

public class Problema2_Serie2 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int cont = 5, limite;
        int cont2 = 10;
        System.out.print("Ingrese el limite: ");
        limite = tcl.nextInt();
        while (cont <= limite) {
            System.out.print(cont + "/" + (cont2) + ", ");
            cont = cont + 5;
            cont2 = cont2 + 2;
        }
        System.out.println("");
    }

}
/**
 * run:
 * Ingrese el limite: 30
 * 5/10, 10/12, 15/14, 20/16, 25/18, 30/20,
 * 
 */
