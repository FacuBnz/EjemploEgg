
package ej_extra_5;

import java.util.Scanner;

public class ej_extra_5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingresar una clase de socio");
        String tipo = leer.next();
        System.out.println("Ingresar costo del tratamiento");
        double costo = leer.nextDouble();
        double res = descuento(tipo, costo);
        
        if(res != 0){
            System.out.println("El importe a pagar : "+res);
        }else{
            System.out.println("Ingreso invalido");
        }
        
        
    }
    
    public static double descuento(String tipo, double costo){
        
        switch (tipo) {
            case "A":
                return (costo - (costo * 0.5));
            case "B":
                return (costo - (costo * 0.35));
            case "C":
                return costo;
        }
        
        return 0;
    }
}
