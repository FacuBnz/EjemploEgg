package ejercicio25;


public class ejercicio25 {

    public static void main(String[] args) {
        int[][] numeros = new int[4][4];
        
        /* RELLENO */
        
        rellenoMatriz(numeros);
        
        /* LECTURA */
        lecturaMatriz(numeros);


        
    }
    
    public static void rellenoMatriz(int vec[][]){
        
    
        for (int i = 0; i < vec.length; i++) {
            for (int j = 0; j < vec.length; j++) {
                
            vec[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
  
    }
    
    public static void lecturaMatriz(int vec[][]){
        
        for (int i = 0; i < vec.length; i++) {
            for (int j = 0; j < vec.length; j++) {
                
                System.out.print(vec[i][j]+" ");
            }
            
            System.out.println("\n");
        }
        
        
    }

}
