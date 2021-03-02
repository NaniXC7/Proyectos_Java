/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.util.Scanner;

public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int op = 0, indi = 0, fin = 0, op2 = 0;
        String cadena1 = "", cadena2 = "",apoyo = "", cad1 = "", cad2 = "";
        
        System.out.println("BIENVENIDO AL OPERADOR DE CADENAS\n");
        
        do{
        
            System.out.println("1. Tamaño de la cadena\n2. Generar Subcadena\n3. Comparar cadenas\n4. Comparar tamaño de cadenas\n5. Salir"
                    + "\n\nIngresa una opción disponible: ");
            
            op = tec.nextInt();
            
            switch(op){
            
                case 1:
                    
                    System.out.println("Ingreda la cadena para obtener su tamaño: ");
                    tec.nextLine();
                    cadena1 = tec.nextLine();
                    System.out.println("El tamaño de la cadena es de: " + cadena1.length() + " caracteres\n");

                    break;
                    
                case 2:
                    
                    System.out.println("Ingreda la cadena para generar una Subcadena");
                    tec.nextLine();
                    cadena1 = tec.nextLine();
                    System.out.println("Ingresa el índice para generar la Subcadena");
                    indi = tec.nextInt();
                        
                    while(indi < 0 || indi > cadena1.length()-1){
                        
                        System.out.println("El índice no puede ser menor que 0\nIngreselo nuevamente\n");
                        System.out.println("Ingresa el índice para generar la Subcadena");
                        indi = tec.nextInt();
                        
                    }

                    System.out.println("Ingresa el fin de la Subcadena");
                    fin = tec.nextInt();
                        
                    while(fin > cadena1.length()-1 || fin <= 0){
                        
                        System.out.println("El fin de la cadena no puede exceder al tamaño original " + (cadena1.length()-1) + "\nIngreselo nuevamente\n");
                        System.out.println("Ingresa el fin de la Subcadena");
                        fin = tec.nextInt();
                        
                    }
                    
                    System.out.println("La Subcadena generada es :" + cadena1.substring(indi, fin+1)+"\n");
                    break;
                    
                case 3:
                    
                    System.out.println("Desea ignorar los caracteres mayúsculas?\n1. Sí     2. No");
                    op2 = tec.nextInt();
                    
                    switch (op2){
                    
                        case 1:
                            
                            System.out.println("Ingresa la primer palabra: ");
                            tec.nextLine();
                            cadena1 = tec.nextLine();
                            System.out.println("Ingresa la segunda palabra: ");
                            cadena2 = tec.nextLine();
                             
                            if(cadena1.equalsIgnoreCase(cadena2)){
                             
                               System.out.println("Las palabras " + "'" + cadena1 + "' y " + "'" + cadena2 + "' son iguales\n");
                             
                            }else{
                             
                               System.out.println("Las palabras " + "'" + cadena1 + "' y " + "'" + cadena2 + "' no son iguales\n");
                             
                            }
                            break;
                            
                        case 2:
                            
                            System.out.println("Ingresa la primer palabra: ");
                            tec.nextLine();
                            cadena1 = tec.nextLine();
                            System.out.println("Ingresa la segunda palabra: ");
                            cadena2 = tec.nextLine();
                             
                            if(cadena1 == cadena2){
                             
                                System.out.println("Las palabras " + "'" + cadena1 + "' y " + "'" + cadena2 + "' son iguales\n");
                             
                            }else{
                             
                                System.out.println("Las palabras " + "'" + cadena1 + "' y " + "'" + cadena2 + "' no son iguales\n");
                             
                            }
                            break;
                            
                        default:
                            System.out.println("Opción ingreada no disponible");
                    
                    }
                    
                    
                    break;
                    
                case 4:
                    
                    System.out.println("Desea ignorar los espacios?\n1. Sí     2. No");
                    op2 = tec.nextInt();
                    
                    switch (op2){
                    
                        case 1:

                            System.out.println("Ingresa la primer cadena: ");
                            tec.nextLine();
                            cad1 = tec.nextLine();
                            System.out.println("Ingresa la segunda cadena: ");
                            cad2 = tec.nextLine();
                            
                            
                            
                            if(cad1.replace(" ", "").length() == cad2.replace(" ", "").length()){
                             
                               System.out.println("Las cadenas " + "'" + cad1 + "' y " + "'" + cad2 + "' son del mismo tamaño, " + cad1.length() + " caracteres\n");
                             
                            }else{
                             
                               System.out.println("Las cadenas " + "'" + cad1 + "' y " + "'" + cad2 + "' no son del mismo tamaño\n");
                             
                            }
                            break;
                            
                        case 2:
                            
                            System.out.println("Ingresa la primer cadena: ");
                            tec.nextLine();
                            cad1 = tec.nextLine();
                            System.out.println("Ingresa la segunda cadena: ");
                            cad2 = tec.nextLine();
                             
                            if(cad1.length() == cad2.length()){
                             
                                System.out.println("Las cadenas " + "'" + cad1 + "' y " + "'" + cad2 + "' son del mismo tamaño, " + cadena1.trim().length() + " caracteres\n");
                             
                            }else{
                             
                                System.out.println("Las cadenas " + "'" + cad1 + "' y " + "'" + cad2 + "' no son del mismo tamaño\n");
                             
                            }
                            break;
                            
                        default:
                            System.out.println("Opción inhgreada no disponible");
                    
                    }
                    
                    
                    break;
                    
                case 5:
                    
                    System.out.println("Ha salido del Operador de cadenas\nHasta la próxima!!");
                    break;
                    
                default:
                    
                    System.out.println("Opción ingresada no disponible\nInténtelo nuevamente\nIngresa una opción disponible: ");
                    op = tec.nextInt();
            
            }
            
        }while(op != 5);
    }
    
}
