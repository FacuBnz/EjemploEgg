
package ej_extra_3;

import java.util.Scanner;


public class ej_extra_3 {

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingresar una letra");
    char letra = leer.next().charAt(0);
    
    String res = (letra != 'A'&& letra != 'E'&& letra != 'I' && letra != 'O' && letra != 'U') ? "No es una vocal" : "Es una vocal";
    
    System.out.println(res);
  }
  
}
