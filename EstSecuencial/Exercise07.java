package EstSecuencial;

import java.util.Scanner;
//grados sexagesimales a centesimales
public class Exercise07 {
    public static void main(String[] args) {
        //Variables
        double s,c;

        //Entradas
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese grados sexagesimales: ");
        s = teclado.nextDouble();

        //Proceso
        c = (10 * s)/9;

        //Salida
        System.out.println("");
        System.out.println("Su conversion a centesimales es: "+ c);





        
    }
    
}
