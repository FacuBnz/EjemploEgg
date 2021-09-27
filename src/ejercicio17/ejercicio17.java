package ejercicio17;

import java.util.Scanner;


public class ejercicio17 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int corr = 0;
        int incorr = 0;
        String frase ;
        
        do {
            System.out.println("Ingresar una frase");
            frase = leer.next();
            
            if(frase.length() == 5 && "X".equals(frase.substring(0, 1)) && "O".equals(frase.substring(4, 5))){
                
                corr++;
                
            }else if(!"&&&&&".equals(frase)){
       
                incorr++;
            }
            
        } while (!"&&&&&".equals(frase));
        
        System.out.println("Lecturas correctas : "+corr);
        System.out.println("Lecturas incorrectas : "+incorr);
        
    }

}
