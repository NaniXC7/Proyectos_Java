/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_final;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NaniXC7
 */
public class pizzas {
    public DefaultTableModel mostrarPizzas() {
        String[] nombresColumnas = {"Nombre", "Descripcion", "Precio"};
        String[] registros = new String[3];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        for (int i = 0; i < Examen_Final.nombresg.size(); i++) {
            
            if(i > 0){
            
                registros[0] = Examen_Final.nombresg.get(i);
                registros[1] = Examen_Final.descripg.get(i-1);
                registros[2] = Examen_Final.precig.get(i-1);

                modelo.addRow(registros);
            
            }
            
        }

        return modelo;
    } 
    
    public DefaultTableModel mostrarPizzasj() {
        String[] nombresColumnas = {"Nombre", "Descripcion", "Precio"};
        String[] registros = new String[3];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        for (int i = 0; i < Examen_Final.nombresj.size(); i++) {
            
            if(i > 0){
            
                registros[0] = Examen_Final.nombresj.get(i);
                registros[1] = Examen_Final.descripj.get(i-1);
                registros[2] = Examen_Final.precij.get(i-1);

                modelo.addRow(registros);
            
            }
            
        }

        return modelo;
    } 
    
    public DefaultTableModel mostrarPizzasep() {
        String[] nombresColumnas = {"Nombre", "Descripcion", "Precio"};
        String[] registros = new String[3];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        for (int i = 0; i < Examen_Final.nombresep.size(); i++) {
            
            if(i > 0){
            
                registros[0] = Examen_Final.nombresep.get(i);
                registros[1] = Examen_Final.descripep.get(i-1);
                registros[2] = Examen_Final.preciep.get(i-1);

                modelo.addRow(registros);
            
            }
            
        }

        return modelo;
    } 
    
    public DefaultTableModel mostrarordenes() {
        String[] nombresColumnas = {"No", "Pizza", "Descripcion", "Sucursal"};
        String[] registros = new String[4];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        for (int i = 0; i < Examen_Final.nombres.size(); i++) {
            
            
            registros[0] = Integer.toString(Examen_Final.con.get(i));
            registros[1] = Examen_Final.nombres.get(i);
            registros[2] = Examen_Final.descrip.get(i);
            registros[3] = Examen_Final.suc.get(i);

            modelo.addRow(registros);

        }

        return modelo;
    }
}
