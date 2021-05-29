//Exercise 10:suma de dos numeros al cuadrado. 

package EstSecuencial; 
//package = paquete = carpeta 

import java.util.Scanner;
/*import = importar = traer - saca de la carpeta 
o paquete  de java.util para indicarle sacar el 
scanner para que este pueda leer lo que escribamos
del teclado (import de la clase Scanner)*/

public class Exercise10 {
    public static void main(String[] args) {
        //Variables
        float s,a,b; 
        
        //Entradas
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        a = teclado.nextFloat();
        System.out.println("Ingrese el segundo numero:");
        b = teclado.nextFloat();

        //Proceso
        s = (float)Math.pow((double)a + b,(double)2);

        //Salida
        System.out.println("Su suma y resta son:");
        System.out.println("Suma:" + s);

    }
    
}

      