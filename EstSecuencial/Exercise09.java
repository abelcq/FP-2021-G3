package EstSecuencial;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        
    //Variables
    int a,b,c,d;

    //Entradas
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese el 1er entero:");
    a = teclado.nextInt();
    System.out.println("Ingrese el 2do entero:");
    b = teclado.nextInt();

    //Proceso 
    d = (b - a)- 1;

    //Salida
    System.out.println("");
    System.out.println("Entre a y b hay:" + d);
    

    }





    
}
