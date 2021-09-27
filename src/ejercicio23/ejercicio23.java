
package ejercicio23;

import java.util.Scanner;


public class ejercicio23 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n = (int) (Math.random() * 100) + 1;
        
        int[] numeros = new int[n];
        
        
        /* RELLENO */
        
        relleno(numeros);
        
        /* LECTURA */
        
        lectura(numeros);
        
        /* BUSQUEDA DE UN NUMERO Y SUS REPETICIONES */
        
        System.out.println("Ingresar un numero a buscar");
        int bus = leer.nextInt();
        int enc = busquedaSecuencial(numeros, bus);
        
        if(enc != -1){
            System.out.println("El numero se encuntra en la posicion "+enc);
            System.out.println("El numero está repetido "+cantidadRepetidos(numeros, bus)+" veces");
            
        }else{
            System.out.println("El numero no se encontró");
        }
        
        
        
    }
    
    public static void relleno(int vec[]){
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) (Math.random() * 100) + 1;
        }
    }
    
    
    public static void lectura(int vec[]){
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i]+" ");
        }
        
        System.out.println("\n");
    }
    
    
    public static int busquedaSecuencial(int vec[], int b){
        
        
        for (int i = 0; i < vec.length; i++) {
            if(vec[i] == b ){
                return i;
            }
        }
        
        return -1;
    }
    
    
    public static int cantidadRepetidos(int numeros[], int b){

        int cont = 0;

        for (int i = 0; i < numeros.length; i++) {

            if(numeros[i] == b){
                cont++;
            }
        }

        return cont;
    }
    

    
    /*
        public static void ordenamiento(int numeros[], int n){

            int aux;

            for (int i = 0; i < n-1 ; i++) {
                for (int j = 0; j < n-i-1; j++) {

                    if(numeros[j] > numeros[j+1]){

                        aux = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j+1] = aux;
                    }
                }
            }
        }
    */
    
    /*
        public static int busquedaBinaria(int numeros[], int n, int b){

            int bajo, med, alto;

            bajo = 0;
            alto = n - 1;

            while (bajo <= alto) {
                med = (int) (bajo + alto)/2;

                if(numeros[med] == b) return med;

                if(b < numeros[med]){
                    alto = med - 1;
                }else{
                    bajo = med + 1;
                }

            }

            return -1;
    }
    */
    
}