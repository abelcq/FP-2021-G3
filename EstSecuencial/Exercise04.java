package EstSecuencial;

import java.util.Scanner;
//Area y perimetro de un cuadrado
public class Exercise04 {
    public static void main(String[] args) {
        //Variable
        int a,p,l;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado: ");
        l = teclado.nextInt();

        //Proceso
        a = (int)Math.pow((double)l,(double)2);
        p = l * 4;
        
        //Salida
        System.out.println("");
        System.out.println("Area: " + a);
        System.out.println("Perimetro: "+ p);

        

        
    }
    
}
