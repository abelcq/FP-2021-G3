package EstSecuencial;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        //Exercise08-N6
        //Variables
        Double a,b,c,d;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la variable a: ");
        a = teclado.nextDouble();
        System.out.println("Ingrese la variable b: ");
        b = teclado.nextDouble();

        //Proceso
        c = (4 *((double)Math.pow((double)a,(double)4)) + 3 * b * a + b * b);
        c = c/(a * a - b * b);
        d = (3 *((double)Math.pow((double)c,(double)2)) + a + b);
        d = d/4;

        //Salida
        System.out.println("Los resultados son: ");
        System.out.println(""+ c);
        System.out.println(""+ d);

        
        



        

        
    }
    
}
