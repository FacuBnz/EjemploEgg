package ejercicio16;

import java.util.Scanner;


public class ejercicio16 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        boolean flag = false;
        int num = 0;
        int sum = 0;
        int cont = 1;
        
        do{
            System.out.println(cont+". Ingresar un numero:");
            num = leer.nextInt();
            if(num > 0){
                sum += num;
                cont++;
            }else break;
            
        }while(cont < 20);
        
        if(num == 0){
            System.out.println("Se capturó el cero");
            System.out.println("La suma es "+sum);
        }
        
    }

}
