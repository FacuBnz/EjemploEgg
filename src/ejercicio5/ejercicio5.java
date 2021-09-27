package ejercicio5;

import java.util.Scanner;


public class ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      
        System.out.println("Ingresar grados centigrados");
        
        double temp = leer.nextDouble();
        
        double fahren = 32 + (9 * temp/5);
        
        System.out.println("La temperatura en fahrenhrit es "+fahren);
    }
    
}
