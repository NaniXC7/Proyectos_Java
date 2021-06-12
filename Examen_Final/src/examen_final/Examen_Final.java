/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_final;

import java.util.ArrayList;

/**
 *
 * @author NaniXC7
 */
public class Examen_Final {
    
    public static String sucur = "";
    //public static 
    public static ArrayList<String> preci;
    public static ArrayList<String> descrip;
    public static ArrayList<String> suc;
    public static ArrayList<String> nombres;
        
    //jalapa
    public static ArrayList<String> precij;
    public static ArrayList<String> descripj;
    public static ArrayList<String> sucj;
    public static ArrayList<String> nombresj;
    
    //el progreso
    public static ArrayList<String> preciep;
    public static ArrayList<String> descripep;
    public static ArrayList<String> sucep;
    public static ArrayList<String> nombresep;
    
    //guatemala
    public static ArrayList<String> precig;
    public static ArrayList<String> descripg;
    public static ArrayList<String> sucg;
    public static ArrayList<String> nombresg;
    
    public static ArrayList<Integer> con;

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        nombres = new ArrayList<>();
        preci = new ArrayList<>();
        descrip = new ArrayList<>();
        suc = new ArrayList<>();
        
        nombresj = new ArrayList<>();
        precij = new ArrayList<>();
        descripj = new ArrayList<>();
        sucj = new ArrayList<>();
        
        nombresep = new ArrayList<>();
        preciep = new ArrayList<>();
        descripep = new ArrayList<>();
        sucep = new ArrayList<>();
        
        nombresg = new ArrayList<>();
        precig = new ArrayList<>();
        descripg = new ArrayList<>();
        sucg = new ArrayList<>();
        
        con = new ArrayList<>();
        
        nombresg.add("Seleccionar");
        nombresj.add("Seleccionar");
        nombresep.add("Seleccionar");
        
        String [] oredenes = new String [4];
        
        index c = new index();
        c.setVisible(true);
        
    }
    
    
}
