package ejercicio15;

import java.util.Scanner;

public class ejercicio15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        boolean bool = false;

        System.out.println("Ingresar un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingresar un numero");
        int num2 = leer.nextInt();
        

        do {
            System.out.println("***************** MENU *****************");
            System.out.println("1. SUMAR    ");
            System.out.println("2. RESTAR    ");
            System.out.println("3. MULTIPLICAR    ");
            System.out.println("4. DIVIDIR    ");
            System.out.println("5. SALIR    \n");
            System.out.println("ELIJA UNA OPCION:");

            int select = leer.nextInt();

            switch (select) {
                case 1:
                    System.out.println("\n" + "La suma de los numeros es " + (num1 + num2) + "\n");
                    break;
                case 2:
                    System.out.println("\n" + "La resta de los numeros es " + (num1 - num2) + "\n");
                    break;
                case 3:
                    System.out.println("\n" + "La multiplicacion de los numeros es " + (num1 * num2) + "\n");
                    break;
                case 4:
                    System.out.println("\n" + "La division de los numeros es " + (num1 / num2) + "\n");
                    break;
                case 5:
                    bool = true;
                    break;
            }

        } while (!bool);

    }

}
