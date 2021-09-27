package ejercicio27;

import java.util.Scanner;


public class ejercicio27 {


  public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
   
   int[][] mat = new int[3][3];
   int sum;
  
   if(ingreso(mat, leer)){
     lecturaMatriz(mat);
     sum = numeroAComprobar(mat);
     
     String res = (filasColumnasyDiagonales(mat, sum)) ? "Es un cuadrado magico" : "No es un cuadrado magico";
     
     System.out.println(res);
     
   }else{
     System.out.println("Ingreso incorrecto!");
   }
   
   
  }
  
  public static boolean ingreso(int mat[][], Scanner leer){
    
    int n;
    
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat.length; j++) {
        System.out.println("Ingresar un numero entre 1-9 en la posicion "+(i+1)+" "+(j+1));
        n = leer.nextInt();
        
        if(n > 10 || n < 1){
          return false;
        }else{
          mat[i][j] = n;
        }
      }
    }
    return true;
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
  
  public static int numeroAComprobar(int mat[][]){
    int sum = 0;
    
    for (int i = 0; i < mat.length; i++) {
      sum += mat[0][i];
    }
    
    return sum;
  }
  
  public static boolean filasColumnasyDiagonales(int mat[][], int comp){
    
    int sumF = 0;
    int sumC = 0;
    int diag1 = 0;
    int diag2 = 0;
    int k = mat.length - 1;
    
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat.length; j++) {
        sumF += mat[i][j];
        sumC += mat[j][i];
      }
      if(sumF != comp || sumC != comp) return false;
      sumF = 0;
      sumC = 0;
      diag1 += mat[i][i];
      diag2 += mat[i][k];
      k--;
    }
    
    return !(diag1 != comp || diag2 != comp);
  }

}
