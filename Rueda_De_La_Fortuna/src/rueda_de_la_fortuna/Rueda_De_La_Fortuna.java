/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rueda_de_la_fortuna;

import java.util.*;

/**
 *
 * @author danie
 */
public class Rueda_De_La_Fortuna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random aleatorio = new Random();
        Scanner tec = new Scanner(System.in);
        int op, rm;

        String[] premio = new String[5];

        premio[0] = "Nada, Siga participando xd";
        premio[1] = "$20";
        premio[2] = "$50";
        premio[3] = "$100";
        premio[4] = "$1000";

        System.out.println("Bienvernido a la rueda de la fortuna");

        do {

            System.out.println("Desea probar su suerte?\n1. Si    2. No");

            op = tec.nextInt();

            switch (op) {

                case 1:
                    
                    rm = aleatorio.nextInt(5);
                    System.out.println("Felicidades!!\nSu premio es: " + premio[rm] + "\n");
                    break;
                case 2:

                    System.out.println("Ha salido de la rueda de la fortuna\nEsperamos que vuelva pronto :D");
                    break;

                default:
                    System.out.println("Opción inválida");

            }

        } while (op != 2);

    }

}
