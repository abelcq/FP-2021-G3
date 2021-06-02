package EstSelectiva;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        //Variables
        int a;
        String b ="";
        
        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        a = teclado.nextInt();

        //Proceso
        if (a < 18) {
            b = "Usted es menor de edad";
        }
        if (a >= 18) {
            b = "Usted es mayor de edad";
        }
        //Salida
        System.out.println("");
        System.out.println(""+ b);

        


        
        
        
        
    }
    
}
