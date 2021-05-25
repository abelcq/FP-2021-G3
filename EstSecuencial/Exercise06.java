package EstSecuencial;

import java.util.Scanner;
//Exercise 2.6
public class Exercise06 {
    public static void main(String[] args) {
        //Variables
        float C,A,B;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la CO: ");
        A = teclado.nextInt();
        System.out.println("Ingrese la CA: ");
        B = teclado.nextInt();
        
        //Proceso
        A = (float)Math.pow((double)A,(double)2);
        B = (float)Math.pow((double)B,(double)2);
        C = (float)Math.pow((double)A + B,1/(double)2);

        //Salida
        System.out.println("");
        System.out.println("La HIP es: "+ C);







        
        

    }
    
}
