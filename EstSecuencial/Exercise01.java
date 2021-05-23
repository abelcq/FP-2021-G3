package EstSecuencial;

import java.util.Scanner;
//Suma y resta de dos numeros enteros(int)
public class Exercise01 {
    public static void main(String[] args) {
        //Variables
        int s,r,a,b;
        
        //Entradas
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        a = teclado.nextInt();
        System.out.println("Ingrese el segundo numero:");
        b = teclado.nextInt();

        //Proceso
        s = a + b;
        r = a - b;

        //Salida
        System.out.println("Su suma y resta son:");
        System.out.println("Suma:" + s);
        System.out.println("Resta:" + r);
        

    }
    
}
