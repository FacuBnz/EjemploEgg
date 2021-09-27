package ej_extra_2;

public class ej_extra_2 {


  public static void main(String[] args) {
    int A = 1;
    int B = 2;
    int C = 3;
    int D = 4;
    int aux;
    
    System.out.println("A : "+A);
    System.out.println("B : "+B);
    System.out.println("C : "+C);
    System.out.println("D : "+D);
    
    aux = B;
    B = C;
    C = A;
    A = D;
    D = aux;
    
    System.out.println("A : "+A);
    System.out.println("B : "+B);
    System.out.println("C : "+C);
    System.out.println("D : "+D);
  }
  
}
