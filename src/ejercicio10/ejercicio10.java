package ejercicio10;

import java.util.Scanner;


public class ejercicio10 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar una palabra");
        String pal = leer.next();
        
        /* CONDICION NORMAL */
        
        if(pal.length() == 8){
            System.out.println("Correcto!");
        }else{
            System.out.println("Incorrecto!");
        }
        
        /* CONDICION TERNARIA */
        
        String result = (pal.length() == 8) ? "Correcto!" : "Incorrecto!";
        System.out.println(result);
        
    }
    
}
