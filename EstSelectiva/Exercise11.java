package EstSelectiva;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        //Variables
        int n1,n2,me=0;

        //Entradas
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");// n1 = teclado.nextInt();
        n1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero:");
        n2 = teclado.nextInt();
        
        //Procesos
        if (n1 < n2) {// me = n1;}
            me = n1;
        }
        
        if (n2 < n1) {
            me = n2;
        }
        
        //Salida
        System.out.println("");
        System.out.println("El numero menor es ---> " + me);
        //Sistema.fuera.impresionln
        
        //???
        //if = Si
        //print =
        //println =
        //string =
        //char =
        //== =
        //else =
    }

    
    
}
