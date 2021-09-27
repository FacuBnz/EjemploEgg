package ejercicio20;


public class ejercicio20 {


    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            int numero = (int) (Math.random() * 20) + 1;
            
            System.out.print(numero+" ");
            
            for (int j = 0; j < numero; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
