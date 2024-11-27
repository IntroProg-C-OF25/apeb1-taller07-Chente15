/*
 * Generar e imprimir la siguiente serie:

 *  sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 * 
 */

/**
 *
 * @author Chente15
 */
public class Problema7_Serie {

    public static void main(String[] args) {

        int num = 10, cont; 
        String serie = "sumatoria = ";

        for (cont = 1; cont <= num; cont++) {
            if (cont % 2 == 0) {
                serie += "+(1/" + cont + ")";
            } else {
                serie += "-(1/" + cont + ")";
            }
        }

        System.out.println(serie);
    }
}

/* 
* run:
* sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
*/