/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio18;


public class ejercicio18 {


    public static void main(String[] args) {
        
        String s1;
        String s2;
        String s3;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    
                    s1 = (i == 3) ? "E" : Integer.toString(i); 
                    s2 = (j == 3) ? "E" : Integer.toString(j); 
                    s3 = (k == 3) ? "E" : Integer.toString(k); 
                    
                    System.out.println(s1+"-"+s2+"-"+s3);
                }
            }
        }
    }

}
