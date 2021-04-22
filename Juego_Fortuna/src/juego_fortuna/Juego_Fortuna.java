/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fortuna;

import java.util.*;

/**
 *
 * @author danie
 */
public class Juego_Fortuna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        String array[][] = new String[5][5];
        String aux = "", posi;
        int conta = 0, contc = 0, contx = 0, colum = 0, fila = 0;

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                array[i][j] = "X";

            }
        }

        array[3][0] = "A";
        array[2][2] = "A";
        array[4][3] = "A";
        array[0][1] = "C";
        array[4][1] = "C";
        array[1][4] = "C";

        do {
            System.out.println("SELECCIONE UNA CASILLA");
            posi = tec.nextLine();

            if (posi.length() > 2) {

                System.out.println("CASILLA INVALIDA");

            } else {

                aux = posi.substring(0, 1);
                colum = Integer.parseInt(posi.substring(1, 2));

                if (aux.equals("A") && aux.equals("B") && aux.equals("C") && aux.equals("D") && aux.equals("E") || colum <= 5) {

                    
                    if (aux.equals("A")) {

                        fila = 0;

                    } else {
                        if (aux.equals("B")) {

                            fila = 1;

                        } else {

                            if (aux.equals("C")) {

                                fila = 2;

                            } else {

                                if (aux.equals("D")) {

                                    fila = 3;

                                } else {

                                    fila = 4;
                                }

                            }

                        }

                    }
                    
                    if(colum > 6){
                    
                        System.out.println("CASILLA INVALIDA");
                    
                    }else{
                    
                        System.out.println(array[fila][colum-1]);
                    
                    }

                    if (array[fila][colum - 1].equals("X")) {

                        contx++;
                        if (contx == 3) {

                            System.out.println("HAS PERDIDO :(");
                            break;

                        }

                    } else {

                        if (array[fila][colum - 1].equals("A")) {

                            conta++;
                            if (conta == 3) {

                                System.out.println("GANASTE UN AUTO!!!");
                                break;

                            }

                        } else {

                            contc++;
                            if (contc == 3) {

                                System.out.println("GANASTE UNA CASA!!!");
                                break;

                            }

                        }

                    }

                } else {

                    System.out.println("CASILLA INVALIDA");

                }

            }

        } while (conta != 3 || contc != 3 || contx != 3);

    }

}
