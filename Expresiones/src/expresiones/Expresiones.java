/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresiones;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Expresiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String palabra, aux = "";
        System.out.println("INGRESAR EXPRESION");
        palabra = tec.nextLine();
        
        
        palabra = palabra.replace(" ", "");
        
        if(palabra.length()%2 != 0){
        
            System.out.println("EXPRESION INVALIDA");
        
        }else{
        
            for (int i = 0; i < palabra.length(); i++) {
            
                
            
            }
        
        }
        
        
    }
    
}
