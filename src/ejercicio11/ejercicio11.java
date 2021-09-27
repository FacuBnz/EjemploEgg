
package ejercicio11;

import java.util.Scanner;


public class ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar una palabra");
        String pal = leer.next();
        
        /* CONDICION NORMAL */
        
        if("A".equals( pal.substring(0,1) ) ){
            System.out.println("Correcto!");
        }else{
            System.out.println("Incorrecto!");
        }
        
        /* CONDICION TERNARIA */
        
        String result = ("A".equals( pal.substring(0,1) ) ) ? "Correcto!" : "Incorrecto!";
        System.out.println(result);
    }
    
}
