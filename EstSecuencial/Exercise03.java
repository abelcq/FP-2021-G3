package EstSecuencial;

import java.util.Scanner;
//Area y perimetro de un rectangulo
public class Exercise03 {
    public static void main(String[] args) {
        //Variables
        int b,h,a,p;
        
        //Entradas
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la base: ");
        b = teclado.nextInt();
        System.out.println("Ingrese la altura: ");
        h = teclado.nextInt();

        //Proceso
        a = b * h;
        p = (b + h) * 2;

        //Salida
        System.out.println("Su area y perimetro del restangulo es: ");
        System.out.println("area:" + a);
        System.out.println("perimetro:" + p);

    }
    
}
