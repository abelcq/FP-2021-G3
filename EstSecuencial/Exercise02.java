package EstSecuencial;

import java.util.Scanner;
//Area de un triangulo
public class Exercise02 {
    public static void main(String[] args) {
        //Variables
        double a,b,h;

        //Entradas
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la base:");
        b = teclado.nextDouble();
        System.out.println("Ingrese la altura:");
        h = teclado.nextDouble();

        //Proceso
        a = (b * h) / 2;

        //Salida
        System.out.println("");
        System.out.println("area: "+ a);

    


        
    }
    
}
