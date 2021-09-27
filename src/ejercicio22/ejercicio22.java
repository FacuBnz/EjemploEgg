
package ejercicio22;


public class ejercicio22 {


    public static void main(String[] args) {
       
       int[] numeros = new int[100];
       
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i+1;
        }
        
        for (int j = numeros.length - 1; j >= 0; j--) {
            
            System.out.println(numeros[j]);
        }
    }

}
