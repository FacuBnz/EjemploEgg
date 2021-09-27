
package ej_extra_6;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class ej_extra_6 {

    public static void main(String[] args) {
        int n = (int)(Math.random() * 10)-1;
        
        double[] vec = new double[n];
        relleno(vec);
        mostrar(vec);
        
        System.out.println("Promedio de estaturas en general : "+promedioGeneral(vec));
        System.out.println("Promedio de estaturas menor a 1.60 : "+promedioMenorEstatura(vec));
        
    }
    
    public static void relleno(double vec[]){
        
        for (int i = 0; i < vec.length; i++) {
            /* numero decimal acotado con 2 decimales despues de la coma*/
            BigDecimal bigDecimal = new BigDecimal(Math.random()*(3.00-0.1)+0.1).setScale(2,RoundingMode.UP);
            vec[i] = bigDecimal.doubleValue();
        }
    }
    
    public static void mostrar(double vec[]){
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i]+" ");
        }
        System.out.println("");
    }
    
    public static double promedioGeneral(double vec[]){
        double sum = 0;
        for (int i = 0; i < vec.length; i++) {
            sum +=vec[i];
        }
        return sum/vec.length;
    }
    
    public static double promedioMenorEstatura(double vec[]){
        double sum = 0;
        int cont = 0;
        for (int i = 0; i < vec.length; i++) {
            if(vec[i] < 1.60){
                sum +=vec[i];
                cont++;
            }
        }
        return sum/cont;
    }
}
