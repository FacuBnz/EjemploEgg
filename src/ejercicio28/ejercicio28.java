package ejercicio28;

public class ejercicio28 {

  public static void main(String[] args) {
    
    int[][] matA = new int[10][10];
    int[][] matB = new int[3][3];
    
    
    rellenoMatriz(matA);
    
    matA[4][4] = 36;
    matA[4][5] = 5;
    matA[4][6] = 67;
    matA[5][4] = 89;
    matA[5][5] = 90;
    matA[5][6] = 75;
    matA[6][4] = 14;
    matA[6][5] = 22;
    matA[6][6] = 26;
    
    matB[0][0] = 36;
    matB[0][1] = 5;
    matB[0][2] = 67;
    matB[1][0] = 89;
    matB[1][1] = 90;
    matB[1][2] = 75;
    matB[2][0] = 14;
    matB[2][1] = 22;
    matB[2][2] = 26;
    
    lecturaMatriz(matA);
    
  }
  
  public static void rellenoMatriz(int mat[][]){
    
    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat.length; j++) {

          mat[i][j] = (int) (Math.random() * 100) + 1;
        }
    }
  }
  
  public static void lecturaMatriz(int mat[][]){

    System.out.println("");
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat.length; j++) {
        System.out.print(mat[i][j]+" ");
      }
      System.out.println("");
    }
    System.out.println("");
  }
  
  
}
