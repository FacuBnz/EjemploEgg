package ej_extra_1;

import java.util.Scanner;


public class ej_extra_1 {

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    int dia = 0;
    int hora = 0;
    
    System.out.println("Ingresar minutos");
    int m = leer.nextInt();
    
    
    while (m >= 60) {
      
      if(m >= 1440){
        dia++;
        m = m - 1440;
      }else if( m >= 60){
        hora++;
        m = m - 60;
      }
    }
    
    System.out.println("dias : "+dia+"\nhoras: "+hora);

  }
  
}
