/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.progra;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class programa {
 
    public static void main(String[] args){
    
        Scanner tec = new Scanner(System.in);
        estudiantes[] listaestudiantes = new estudiantes[5];
        
        int cont = 0;
        
        while(cont < 5){
            
            System.out.println("Ingrese nombre: ");
            String nombre = tec.nextLine();
            System.out.println("Ingresa la edad: ");
            int edad = Integer.parseInt(tec.nextLine());
            System.out.println("Ingresa el carnet: ");
            String carnet = tec.nextLine();
            System.out.println("Indique si está solvente: ");
            boolean solvente = Boolean.parseBoolean(tec.nextLine());
        
            estudiantes Estudiantes = new estudiantes(nombre, edad, carnet, solvente);
            
            listaestudiantes[cont] = Estudiantes;
            
            cont++;
        
        }
        
        System.out.println("Lista*******");
        
        for (int i = 0; i < 5; i++) {
            estudiantes Estudiantes = listaestudiantes[i];
            System.out.println("nombre del estudiante: "+Estudiantes.nombre+" Carnet: "+Estudiantes.carnet);
        }
        
    }
    
}