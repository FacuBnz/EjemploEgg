
package ejercicio7;


public class ejercicio7 {

    public static void main(String[] args) {
        
        int num1 = (int) (Math.random() * 100) + 1;
        int num2 = (int) (Math.random() * 100) + 1;
        
        System.out.println(num1);
        System.out.println(num2);
        
        if(num1 > num2){
            System.out.println("El numero mayor es "+num1);
        }else{
            System.out.println("El numero mayor es "+num2);
        }
        
       
    }
    
}
