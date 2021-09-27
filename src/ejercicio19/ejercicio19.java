package ejercicio19;


public class ejercicio19 {


    public static void main(String[] args) {
        int numero = (int) (Math.random() * 100) + 1;
        
        for (int i = 0; i < numero - 1; i++) {
            for (int j = 0; j < numero - 1; j++) {
                if ( (i > 0 && i < numero - 2) && (j > 0 && j < numero - 2) ) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

}
