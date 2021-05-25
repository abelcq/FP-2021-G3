package EstSecuencial;

import java.util.Scanner;
//Horas en minutos y segundos
public class Exercise05 {
    public static void main(String[] args) {
        //Variables
        int h,m,s;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese las horas: ");
        h = teclado.nextInt();

        //Proceso
        m = h * 60;
        s = h * 3600;
        
        //Salida
        System.out.println("");
        System.out.println("Minutos:" + m);
        System.out.println("Segundos:" + s);


    }
    
}
