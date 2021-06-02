package EstSecuencial; 

import java.util.Scanner;
//Exercise 10:suma de dos numeros al cuadrado. 
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
        System.out.println("");
        System.out.println("La suma de los numeros al cuadrado es: " + s);
    }
    
}
//Resumen de lo aprendido
//package = paquete = carpeta 

/*import = importar = traer - saca de la carpeta 
o paquete  de java.util para indicarle sacar el 
scanner para que este pueda leer lo que escribamos
del teclado (import de la clase Scanner)*/

/*En java es obligatrio crear una clase 
con el nombre del archivo(public class 
= clase publica)*/

/*argumentos de cadena principal vacía estática pública
public static void main(String[] args)*/

/*Tipos de variables:
int = N.enteros
float = N. reales
double = N. decimales*/
 
