/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_final_necflis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NaniXC7
 */
public class extraccion_pelis {
    public DefaultTableModel mostrarClientes(){
        
        String []  nombresColumnas = {"ID","Nombre","Tipo", "Género", "Sinopsis"};
        String [] registros = new String[5];
        
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        String sql = "SELECT * FROM peliculas";
        
        Connection cn = null;
        
        PreparedStatement pst = null;
        
        ResultSet rs = null;
        
        try{
            
            cn = DriverManager.getConnection("jdbc:mysql://localhost/necflis", "root", "");            
            pst = cn.prepareStatement(sql);                                    
            rs = pst.executeQuery();
            
            while(rs.next()){
                
                registros[0] = rs.getString("ID");                
                registros[1] = rs.getString("nombre");                
                registros[2] = rs.getString("tipo");
                registros[3] = rs.getString("genero");
                registros[4] = rs.getString("sinopsis");
                
                
                modelo.addRow(registros);
                
            }
            
           
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null,"Error al conectar");
            
        }
        
        finally{
            
            try{
                
                if (rs != null){
                    
                    rs.close();
                    
                }
                
                if (pst != null){
                
                     pst.close();
                
                }
                
                if (cn != null){
                
                    cn.close();
                
                }
                
            }catch(SQLException e){
                
                JOptionPane.showMessageDialog(null,e);
                
            }
        }
        
        return modelo;
    }    
}
