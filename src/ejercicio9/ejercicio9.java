
package ejercicio9;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar una palabra");
        String frase = leer.nextLine();
        
        /* CONDICION NORMAL */
        
        if(frase.equals("eureka")){
            System.out.println("Correcto!");
        }else{
            
            System.out.println("Incorrecto!");
        }
        
        /* CONDICION TERNARIA */
        
        String result = (frase.equals("eureka")) ? "Correcto!" : "Incorrecto!";
        System.out.println(result);
    }
    
}
