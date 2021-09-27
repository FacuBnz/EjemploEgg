
package ejercicio24;


public class ejercicio24 {


    public static void main(String[] args) {
        int n = (int) (Math.random() * 100) + 1;
        
        int[] numeros = new int[n];
        
        int cont = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        
        int num;
        
        /* RELLENO */
        
        relleno(numeros);
        
        
        /* LECTURA */
        
        lectura(numeros);
        
        for (int i = 0; i < n; i++) {
            
            num = Integer.toString(numeros[i]).length();
         
            switch (num) {
                case 1:
                    cont++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
            }
        }
        
        System.out.println("Cantidad de numeros de 1 digito: "+cont);
        System.out.println("Cantidad de numeros de 2 digito: "+cont2);
        System.out.println("Cantidad de numeros de 3 digito: "+cont3);
        System.out.println("Cantidad de numeros de 4 digito: "+cont4);
        System.out.println("Cantidad de numeros de 5 digito: "+cont5);
        
        
    }
    
    
    public static void relleno(int vec[]){
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) (Math.random() * 12000) + 1;
        }
    }
    
    public static void lectura(int vec[]){
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i]+" ");
        }
        
        System.out.println("\n");
    }
}
