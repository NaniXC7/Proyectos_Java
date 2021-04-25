/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package necflis;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class NecFlis {

    public final static int aumento = 1;
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int opmenu = 0, opclientes = 0, opcliente = 0, oppeliculas = 0, elegirpeli = 0, elegircliente = 0;
        int increclientes = 0, increpelis = 0, edad = 0, selecliente = 0;
        Clientes [] listaclientes = new Clientes[1];
        Peliculas [] listapelis = new Peliculas[1];
        String ps [] = new String[1];
        int contps [] = new int [1];
        String nombre = "", direccion = "", nombrepeli = "", tipo = "", genero = "", sinopsis = "", peli = "", enter = "", aux = "";
        
        
        do{
        
            System.out.println("============================");
            System.out.println("=   BIENVENIDO A NECFLIS   =");
            System.out.println("============================");
            System.out.println("1. Clientes\n2. Películas\n3. Salir");
            opmenu = tec.nextInt();
            
            System.out.println("\n-----------------------------------------------------------------------------------------------------------------\n");
            
            switch(opmenu){
            
                case 1:
                    
                    
                    do{
                        
                        System.out.println("==========================");
                        System.out.println("=        CLIENTES        =");
                        System.out.println("==========================");
                        System.out.println("1. Ver listado de clientes\n2. Crear nuevo cliente\n3. Seleccionar cliente\n4. Atrás");
                        opclientes = tec.nextInt();
                        
                        System.out.println("\n-----------------------------------------------------------------------------------------------------------------\n");
                        
                        switch(opclientes){
                        
                            case 1:
                                if(increclientes == 0){
                                    
                                    System.out.println("Aún no se registran clientes");
                                    System.out.println("Presione enter para continuar...");
                                    tec.nextLine();
                                    enter = tec.nextLine();
                                    System.out.println("-----------------------------------------------------------------------------------------------------------------\n");
                                    
                                }else{
                                    
                                    System.out.println("=================================");
                                    System.out.println("=      LISTADO DE CLIENTES      =");
                                    System.out.println("=================================");
                                    for (int i = 0; i < listaclientes.length-1; i++) {
                                        
                                        Clientes clientes = listaclientes[i];
                                        System.out.println(i+1+". Nombre: "+clientes.nombre+" Direccion: "+clientes.direccion+" Edad: "+clientes.edad);
                                    
                                    }
                                    
                                    System.out.println("\n-----------------------------------------------------------------------------------------------------------------\n");
                                
                                }
                                break;
                                
                            case 2:
                                
                                System.out.println("=================================");
                                System.out.println("=        CREANDO CLIENTE        =");
                                System.out.println("=================================");
                                tec.nextLine();
                                System.out.println("Ingresa el nombre del cliente: ");
                                nombre = tec.nextLine();
                                System.out.println("Ingresa la direccion del cliente: ");
                                direccion = tec.nextLine();
                                System.out.println("Ingresa la edad del cliente: ");
                                edad = tec.nextInt();
                                System.out.println("Cliente almacenado de forma exitosa!");
                                
                                System.out.println("\n-----------------------------------------------------------------------------------------------------------------\n");
                                
                                Clientes clientes = new Clientes(nombre, direccion, edad);
                                
                                listaclientes[increclientes] = clientes;
                                
                                increclientes++;
                                
                                listaclientes = redimensionar(listaclientes);
                                
                                System.out.println("================================================");
                                System.out.println("=      ACTUALIZACION DE LA LISTA CLIENTES      =");
                                System.out.println("================================================");
                                
                                for (int i = 0; i < listaclientes.length-1; i++) {
                                    
                                    clientes = listaclientes[i];
                                    System.out.println(i+1+". Nombre: "+clientes.nombre+" Direccion: "+clientes.direccion+" Edad: "+clientes.edad);
                                
                                }
                                
                                System.out.println("\n-----------------------------------------------------------------------------------------------------------------\n");
                                
                                ps = redimensionarplay(ps);
                                contps = redimensionarint(contps);
                                
                                break;
                                
                            case 3:
                                
                                if(increclientes == 0){
                                    
                                    System.out.println("Aún no se registran clientes");
                                    System.out.println("Presione enter para continuar...");
                                    tec.nextLine();
                                    enter = tec.nextLine();
                                    System.out.println("-----------------------------------------------------------------------------------------------------------------\n");
                                    
                                }else{
                                
                                    System.out.println("================================");
                                    System.out.println("=     SELECCION DE CLIENTE     =");
                                    System.out.println("================================");
                                    for (int i = 0; i < listaclientes.length-1; i++) {
                                        clientes = listaclientes[i];
                                        System.out.println(i+1+". "+clientes.nombre);
                                    }
                                    
                                    System.out.println("Selecciona el cliente: ");
                                    selecliente = tec.nextInt();
                                    
                                    System.out.println("\n-----------------------------------------------------------------------------------------------------------------\n");
                                    
                                    while(selecliente > listaclientes.length){
                                    
                                        System.out.println("Posicion del cliente inexistente");
                                        System.out.println("Presione enter para continuar...");
                                        tec.nextLine();
                                        enter = tec.nextLine();
                                        System.out.println("-----------------------------------------------------------------------------------------------------------------\n");
                                        
                                        System.out.println("================================");
                                        System.out.println("=     SELECCION DE CLIENTE     =");
                                        System.out.println("================================");
                                        
                                        for (int i = 0; i < listaclientes.length-1; i++) {
                                            
                                            clientes = listaclientes[i];
                                            System.out.println(i+1+". "+clientes.nombre);
                                            
                                        }
                                    
                                        System.out.println("Selecciona el cliente: ");
                                        selecliente = tec.nextInt();
                                        System.out.println("\n-----------------------------------------------------------------------------------------------------------------\n");
                                    
                                    }
                                    
                                    do{
                                        clientes = listaclientes[selecliente-1];
                                        System.out.println("Cliente: "+clientes.nombre);
                                        System.out.println("1. Playlist\n2. Agregar película\n3. Atras");
                                        opcliente = tec.nextInt();
                                        System.out.println("\n-----------------------------------------------------------------------------------------------------------------\n");
                                
                                        switch(opcliente){
                                
                                            case 1:
                                                
                                                if(contps[selecliente-1] == 0){
                                                    
                                                    clientes = listaclientes[selecliente-1];
                                                    System.out.println("Aun no se han añadido películas a la playlist de "+clientes.nombre);
                                                    System.out.println("Presione enter para continuar...");
                                                    tec.nextLine();
                                                    enter = tec.nextLine();
                                                    System.out.println("-----------------------------------------------------------------------------------------------------------------\n");
                                                
                                                }else{
                                                    
                                                    clientes = listaclientes[selecliente-1];
                                                    System.out.println("Playlist de "+clientes.nombre);
                                                    System.out.println(ps[selecliente-1].replace("null", ""));
                                                    System.out.println("\n-----------------------------------------------------------------------------------------------------------------\n");
                                                
                                                }
                                                
                                                break;
                                            case 2:
                                            
                                                tec.nextLine();
                                                if(increpelis == 0){
                                    
                                                    System.out.println("Aún no se registran peliculas");
                                                    System.out.println("Presione enter para continuar...");
                                                    tec.nextLine();
                                                    enter = tec.nextLine();
                                                    System.out.println("-----------------------------------------------------------------------------------------------------------------\n");
                                    
                                                }else{
                                                    
                                                    System.out.println("==================================");
                                                    System.out.println("=      LISTADO DE PELICULAS      =");
                                                    System.out.println("===================================");
                                                    for (int i = 0; i < listapelis.length-1; i++) {
                                                        Peliculas peliculas = listapelis[i];
                                                        System.out.println("\t"+(i+1)+". "+peliculas.nombrepeli);
                                                    }
                                                    
                                                    System.out.println("\nIngresa el numero de la película");
                                                    elegirpeli = tec.nextInt();
                                                    System.out.println("\n-----------------------------------------------------------------------------------------------------------------\n");
                                                    
                                                    if(elegirpeli != 0){
                                                    
                                                        while(elegirpeli > listapelis.length){
                                                    
                                                            System.out.println("Posición de pelicula inexistente");
                                                            System.out.println("Presione enter para continuar...");
                                                            tec.nextLine();
                                                            enter = tec.nextLine();
                                                            System.out.println("-----------------------------------------------------------------------------------------------------------------\n");
                                                            
                                                            System.out.println("==================================");
                                                            System.out.println("=      LISTADO DE PELICULAS      =");
                                                            System.out.println("===================================");
                                                            
                                                            for (int i = 0; i < listapelis.length-1; i++) {
                                                                
                                                                Peliculas peliculas = listapelis[i];
                                                                System.out.println("\t"+i+1+". "+peliculas.nombrepeli);
                                                                
                                                            }
                                                    
                                                            System.out.println("\nIngresa el numero de la película");
                                                            elegirpeli = tec.nextInt();
                                                            System.out.println("\n-----------------------------------------------------------------------------------------------------------------\n");
                                                    
                                                        }
                                                        
                                                    }else{
                                                    
                                                        break;
                                                    
                                                    }
                                                    
                                                    contps[selecliente-1] += 1;
                                                    
                                                    Peliculas peliculas = listapelis[elegirpeli-1];
                                                    
                                                 
                                                    ps[selecliente-1] += contps[selecliente-1]+". "+peliculas.nombrepeli+"\n";                                                    
                                
                                                }
                                                
                                                break;
                                            
                                            case 3:
                                                
                                                if(increclientes == 0){
                                    
                                    System.out.println("Aún no se registran clientes");
                                    System.out.println("Presione enter para continuar...");
                                    tec.nextLine();
                                    enter = tec.nextLine();
                                    System.out.println("-----------------------------------------------------------------------------------------------------------------\n");
                                    
                                }else{
                                    
                                    System.out.println("=================================");
                                    System.out.println("=      LISTADO DE CLIENTES      =");
                                    System.out.println("=================================");
                                    for (int i = 0; i < listaclientes.length-1; i++) {
                                        
                                        clientes = listaclientes[i];
                                        System.out.println(i+1+". Nombre: "+clientes.nombre+" Direccion: "+clientes.direccion+" Edad: "+clientes.edad);
                                    
                                    }
                                    
                                    System.out.println("Presione enter para continuar...");
                                    tec.nextLine();
                                    enter = tec.nextLine();
                                    
                                    System.out.println("\n-----------------------------------------------------------------------------------------------------------------\n");
                                
                                }
                                                break;
                                            
                                            default:
                                                System.out.println("Opcion no dispoible");
                                                System.out.println("Presione enter para continuar...");
                                                tec.nextLine();
                                                enter = tec.nextLine();
                                                System.out.println("-----------------------------------------------------------------------------------------------------------------\n");
                                
                                        }
                                
                                    }while(opcliente != 3);
                                
                                }
                                
                                break;
                            
                            case 4:
                                break;
                                
                            default:
                                System.out.println("Opcion no disponible");
                                System.out.println("Presione enter para continuar...");
                                tec.nextLine();
                                enter = tec.nextLine();
                                System.out.println("-----------------------------------------------------------------------------------------------------------------\n");
                                       
                        }
                    
                    }while(opclientes != 4);
                    break;
                    
                case 2:
                    
                    do{
                    
                        System.out.println("=====================");
                        System.out.println("=     PELICULAS     =");
                        System.out.println("=====================");
                        System.out.println("1. Ver listado de películas\n2. Crear película\n3. Atrás");
                        oppeliculas = tec.nextInt();
                        System.out.println("\n-----------------------------------------------------------------------------------------------------------------\n");
                        
                        switch(oppeliculas){
                        
                            case 1:
                                if(increpelis == 0){
                                    
                                    System.out.println("Aún no se registran peliculas");
                                    System.out.println("Presione enter para continuar...");
                                    tec.nextLine();
                                    enter = tec.nextLine();
                                    System.out.println("-----------------------------------------------------------------------------------------------------------------\n");
                                    
                                }else{
                                
                                    System.out.println("==================================");
                                    System.out.println("=      LISTADO DE PELICULAS      =");
                                    System.out.println("==================================");
                                    for (int i = 0; i < listapelis.length-1; i++) {
                                        Peliculas peliculas = listapelis[i];
                                        System.out.println(i+1+". Nombre: "+peliculas.nombrepeli+"\n\tTipo: "+peliculas.tipo+"\n\tGenero: "+peliculas.genero+"\n\tSinopsis: "+peliculas.sinopsis+"\n");
                                    }
                                    
                                    System.out.println("\n-----------------------------------------------------------------------------------------------------------------\n");
                                
                                }
                                break;
                            case 2:
                                
                                tec.nextLine();
                                System.out.println("=============================");
                                System.out.println("=      Crendo Pelicula      =");
                                System.out.println("=============================");
                                System.out.println("Ingresa el nombre: ");
                                nombrepeli = tec.nextLine();
                                System.out.println("Ingresa el tipo (serie/pelicula): ");
                                tipo = tec.nextLine();
                                System.out.println("Ingresa el género (drama, Comedia, terror, suspenso, etc): ");
                                genero = tec.nextLine();
                                System.out.println("Ingresa la sinopsis: ");
                                sinopsis =  tec.nextLine();
                                System.out.println("Pelicula almacenada de forma exitosa!");
                                System.out.println("\n-----------------------------------------------------------------------------------------------------------------\n");
                                
                                Peliculas peliculas = new Peliculas(nombrepeli, tipo, genero, sinopsis);
                                
                                listapelis[increpelis] = peliculas;
                                
                                increpelis++;
                                
                                listapelis = redimensionarpelis(listapelis);
                                
                                System.out.println("=================================================");
                                System.out.println("=      ACTUALIZACION DE LA LISTA PELICULAS      =");
                                System.out.println("=================================================");
                                
                                for (int i = 0; i < listapelis.length-1; i++) {
                                        peliculas = listapelis[i];
                                        System.out.println(i+1+". Nombre: "+peliculas.nombrepeli+"\n\tTipo: "+peliculas.tipo+"\n\tGenero: "+peliculas.genero+"\n\tSinopsis: "+peliculas.sinopsis+"\n");
                                    }
                                    
                                    System.out.println("\n-----------------------------------------------------------------------------------------------------------------\n");
                                
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Opcion no disponible");
                                System.out.println("Presione enter para continuar...");
                                tec.nextLine();
                                enter = tec.nextLine();
                                System.out.println("-----------------------------------------------------------------------------------------------------------------\n");
                                
                        }
                    
                    }while(oppeliculas != 3);
                    break;
                    
                case 3:
                    
                    System.out.println("Ha salido de NecFlis :)");
                    System.out.println("\n-----------------------------------------------------------------------------------------------------------------\n");
                    break;
                 
                default:
                    
                    System.out.println("Opcion no disponible");
                    System.out.println("Presione enter para continuar...");
                    tec.nextLine();
                    enter = tec.nextLine();
                    System.out.println("-----------------------------------------------------------------------------------------------------------------\n");
            
            }
        
        }while(opmenu != 3);
        
    }
    
    public static Clientes[] redimensionar(Clientes[] listaclientes){

        Clientes [] listaclientescopia = new Clientes[listaclientes.length + aumento];
        System.arraycopy(listaclientes, 0, listaclientescopia, 0, listaclientes.length);
        
        return listaclientescopia; 

    }
    
    public static Peliculas[] redimensionarpelis(Peliculas[] listapelis){

        Peliculas [] listapeliscopia = new Peliculas[listapelis.length + aumento];
        System.arraycopy(listapelis, 0, listapeliscopia, 0, listapelis.length);
        
        return listapeliscopia; 

    }
    
    public static String [] redimensionarplay(String[] ps){

        String [] ps_copia = new String[ps.length + aumento];
        System.arraycopy(ps, 0, ps_copia, 0, ps.length);
        
        return ps_copia; 

    }
    
    public static int [] redimensionarint(int[] contps){

        int [] nmps = new int[contps.length + aumento];
        System.arraycopy(contps, 0, nmps, 0, contps.length);
        
        return nmps; 

    }
    
}