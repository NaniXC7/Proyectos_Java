/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero_primo;

import java.util.*;

/**
 *
 * @author danie
 */
public class Numero_Primo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("ES NUMERO PRIMO?");
        System.out.println("INGRESE NUMERO");
        int num = tec.nextInt();
        int cont = 0;
        
        for (int i = 1; i <= num; i++) {
            
            if(i%num == 0){
            
                cont++;
                
            }
            
        }
        
        if(cont > 2){
                
            System.out.println(num + "NO ES PRIMO");
                
        }else{
                
            System.out.println(num + " ES PRIMO");
                
        }
        
    }
    
}
