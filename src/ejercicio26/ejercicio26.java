package ejercicio26;

import java.util.Scanner;

public class ejercicio26 {

  public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingresar dimesion de matriz cuadrada");
    int n = leer.nextInt();
    
    int[][] mat = new int[n][n];
    int[][] matT = new int[n][n];
    
    /* RELLENO */
    rellenoMatriz(mat);
    
    /* LECTURA MATRIZ */
    
    System.out.println("************ MATRIZ *************");
    
    lecturaMatriz(mat);
    
    /* TRANSPUESTA */
    transpuestaConSignoCambiado(mat, matT);
    
    
    /* LECTURA MATRIZ TRANSPUESTA */
    System.out.println("************ MATRIZ TRANSPUESTA CAMBIADA DE SIGNO *************");
    lecturaMatriz(matT);
    
    /* COMPROBACION DE MATRIZ ANTISEMETRICA */
    System.out.println("************ COMPROBACION *************"); 
    String res = (comprobarAntisimetria(mat, matT)) ? "La matriz es anti simétrica" : "La matriz no es antisimetrica";
    System.out.println(res);
   
  }
  
  public static void rellenoMatriz(int vec[][]){
    
    for (int i = 0; i < vec.length; i++) {
        for (int j = 0; j < vec.length; j++) {

          vec[i][j] = (int) (Math.random() * 10);
        }
    }
  }
  
  
  public static void transpuestaConSignoCambiado(int mat[][], int matT[][]){
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat.length; j++) {
        matT[j][i] = -mat[i][j];
      }
    }
  }
  
      
  public static void lecturaMatriz(int vec[][]){

    System.out.println("");
    for (int i = 0; i < vec.length; i++) {
      for (int j = 0; j < vec.length; j++) {
        System.out.print(vec[i][j]+" ");
      }
      System.out.println("");
    }
    System.out.println("");
  }
  
  public static boolean comprobarAntisimetria(int mat[][], int matT[][]){
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat.length; j++) {
        if(mat[i][j] != matT[i][j] * -1) return false;
      }
    }
    return true;
  }

  
  
}
