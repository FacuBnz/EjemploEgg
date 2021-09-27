/*
    Escribir un programa que pida dos números enteros por teclado y calcule la suma
    de los dos. El programa deberá después mostrar el resultado de la suma
*/
package ejercicio1;

import java.util.Scanner;


public class ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1 = 0;
        int num2 = 0;
        int suma = 0;
        
        System.out.println("Ingresar 2 numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        suma = num1 + num2;
        
        System.out.println("La suma de los numeros ingresados es : "+suma);
                
        
    }
    
}
