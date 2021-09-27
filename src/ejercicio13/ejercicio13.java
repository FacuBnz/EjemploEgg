
package ejercicio13;

import java.util.Scanner;


public class ejercicio13 {


    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       int num = 0;
       
        do{
            System.out.println("Ingresar una nota");
            num = leer.nextInt();
            
        }while(num < 0 || num > 9);
    }
    
}
