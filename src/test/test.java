
package test;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Definir tipo de datos
        
        int numero = 0; 
        double decimal = 0.0;
        String cadena = ""; 
        char letra = ' ';
        
        //Ingreso numero entero
        System.out.println("Ingresar un numero");
        numero = leer.nextInt();
        int mult = numero*2;
        System.out.println("El numero ingresado es "+numero);
        System.out.println("El doble del numero es: "+mult);
        
        
        System.out.println("Ingrese una frase");
        cadena = leer.next();
        System.out.println("La cadena ingresa es "+cadena);
    }
    
}
