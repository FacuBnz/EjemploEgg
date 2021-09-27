
package ejercicio8;


public class ejercicio8 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 100) + 1;
        
        System.out.println(num);
        
        /*
        if(num % 2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
        */
        
        String result = (num % 2 == 0) ? "par" : "impar";
        System.out.println("El resultado es : "+result);
    }
    
}
