
package ejercicio21;


public class ejercicio21 {


    public static void main(String[] args) {
        convertir(12.52, "yenes");
    }
    
    public static void convertir(double euros, String moneda){
        
        double libras = 0.86;
        double dolares = 1.28611;
        double yenes = 129.852;
        
        switch (moneda) {
            case "libras":
                System.out.println("Son : "+(euros*libras)+" libras" );
                
                break;
            case "yenes":
                System.out.println("Son : "+(euros*yenes)+" yenes" );
                
                break;
            case "dolares":
                System.out.println("Son : "+(euros*dolares)+" dolares" );
                
                break;
            default:
                System.out.println("No es valido!");
        }
    }

}
