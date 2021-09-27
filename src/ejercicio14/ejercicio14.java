
package ejercicio14;

import java.util.Scanner;


public class ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar valor limite");
        int limite = leer.nextInt();
        
        int num = 0;
       
        do{
            System.out.println("Ingresar una nota");
            num += leer.nextInt();
            
        }while(num <= limite);
    }
    
}
