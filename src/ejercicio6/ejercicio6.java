
package ejercicio6;

import java.util.Scanner;

public class ejercicio6 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar un numero entero");
        int num = leer.nextInt();
        
        System.out.println("El doble del numero es : "+num*2);
        System.out.println("El triple del numero es : "+num*3);
        System.out.println("la raiz cuadrada del numero es : "+Math.sqrt(num));
    }
    
}
