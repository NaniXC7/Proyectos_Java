/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String palabra, aux = "";
        System.out.println("INGRESAR PALABRA");
        palabra = tec.nextLine();
        
        
        palabra = palabra.replace(" ", "");
        
        int i = palabra.length();
        
        while(i!=0){
        
            aux += palabra.charAt(i-1);
            i--;
        
        }
        
        if(palabra.equalsIgnoreCase(aux)){
        
            System.out.println("ES PALINDROMO");
        
        }else{
        
            System.out.println("NO ES PALINDROMO");
        
        }
        
    }
    
}
