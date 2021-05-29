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
public class extraccion {

    public DefaultTableModel mostrarClientes() {
        String[] nombresColumnas = {"ID", "Nombre", "Direccion", "Edad", "Cont-PL", "PlayList"};
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        String sql = "SELECT * FROM clientes";

        Connection cn = null;

        PreparedStatement pst = null;

        ResultSet rs = null;

        try {

            cn = DriverManager.getConnection("jdbc:mysql://localhost/necflis", "root", "");
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {

                registros[0] = rs.getString("ID");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("direccion");
                registros[3] = rs.getString("edad");
                registros[4] = rs.getString("playlist");
                registros[5] = rs.getString("detalle_pl");

                modelo.addRow(registros);

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al conectar");

        } finally {

            try {

                if (rs != null) {

                    rs.close();

                }

                if (pst != null) {

                    pst.close();

                }

                if (cn != null) {

                    cn.close();

                }

            } catch (SQLException e) {

                JOptionPane.showMessageDialog(null, e);

            }
        }

        return modelo;
    }    
}
