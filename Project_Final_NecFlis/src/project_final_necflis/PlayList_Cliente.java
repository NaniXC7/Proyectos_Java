/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_final_necflis;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NaniXC7
 */
public class PlayList_Cliente extends javax.swing.JFrame {
    
    DefaultTableModel modelo;

    /**
     * Creates new form PlayList_Cliente
     */
    public PlayList_Cliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.setTitle("PlayList del usuario "+Seleccion_Cliente.nombre_cliente.toUpperCase());

        
        modelo = new DefaultTableModel();
        
        modelo.addColumn("Playlist de " + Seleccion_Cliente.nombre_cliente.toUpperCase());
        
        this.tbl_playlist.setModel(modelo);
        
        String pl_nueva = Seleccion_Cliente.pl_cliente;
        
        int num = Seleccion_Cliente.playlist_cliente;
                
        String [] pls = new String[Seleccion_Cliente.playlist_cliente];
        
        for (int i = 0; i <= pl_nueva.length()-1; i++) {
            
            
            String peli = "";
            int indice = 0;
            indice = pl_nueva.indexOf("  ") + 2;
            
            peli = pl_nueva.substring(0, indice);
            pl_nueva = pl_nueva.substring(indice, pl_nueva.length());
            
            if(peli.trim().equals("")){
            
                continue;
            
            }else{
            
                
                
                for (int j = 0; j < pls.length; j++) {
                    pls[j] = peli;
                }
                
                modelo.addRow(pls);
                
                
            
            }
            
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_playlist = new javax.swing.JTable();
        btn5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_playlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_playlist);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 400, 150));

        btn5.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_final_necflis/imgenes/icons8_undo_24px.png"))); // NOI18N
        btn5.setText("Regresar");
        btn5.setBorder(null);
        btn5.setContentAreaFilled(false);
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.setFocusPainted(false);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setSelected(true);
        btn5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 70, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_final_necflis/imgenes/necflis new.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 110, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_final_necflis/imgenes/tablas.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        new Info_Cliente().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlayList_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayList_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayList_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayList_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayList_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_playlist;
    // End of variables declaration//GEN-END:variables
}
