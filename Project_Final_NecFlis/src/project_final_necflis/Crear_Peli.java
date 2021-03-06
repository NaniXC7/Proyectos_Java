/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_final_necflis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author NaniXC7
 */
public class Crear_Peli extends javax.swing.JFrame {

    /**
     * Creates new form Crear_Peli
     */
    public Crear_Peli() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        this.setTitle("Crear Película");
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_tipo = new javax.swing.ButtonGroup();
        txt_nombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_sinopsis = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        rbtn_serie = new javax.swing.JRadioButton();
        rbtn_peli = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_genero = new javax.swing.JTextField();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_nombre.setBackground(new java.awt.Color(14, 14, 14));
        txt_nombre.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 0, 0)));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 220, -1));

        txta_sinopsis.setBackground(new java.awt.Color(14, 14, 14));
        txta_sinopsis.setColumns(20);
        txta_sinopsis.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        txta_sinopsis.setForeground(new java.awt.Color(255, 255, 255));
        txta_sinopsis.setRows(5);
        txta_sinopsis.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 0, 0)));
        jScrollPane1.setViewportView(txta_sinopsis);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 220, -1));

        jPanel1.setBackground(new java.awt.Color(14, 14, 14));

        rbtn_serie.setBackground(new java.awt.Color(14, 14, 14));
        grupo_tipo.add(rbtn_serie);
        rbtn_serie.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        rbtn_serie.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_serie.setText("Serie");

        rbtn_peli.setBackground(new java.awt.Color(14, 14, 14));
        grupo_tipo.add(rbtn_peli);
        rbtn_peli.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        rbtn_peli.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_peli.setText("Película");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtn_peli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtn_serie)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_peli)
                    .addComponent(rbtn_serie)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_final_necflis/imgenes/icons8_movie_beginning_32px.png"))); // NOI18N
        jLabel2.setText("Tipo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_final_necflis/imgenes/icons8_anonymous_mask_32px.png"))); // NOI18N
        jLabel3.setText("Genero:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_final_necflis/imgenes/icons8_multiline_text_32px.png"))); // NOI18N
        jLabel4.setText("Sinópsis:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txt_genero.setBackground(new java.awt.Color(14, 14, 14));
        txt_genero.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        txt_genero.setForeground(new java.awt.Color(255, 255, 255));
        txt_genero.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 0, 0)));
        txt_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_generoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 220, -1));

        btn6.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_final_necflis/imgenes/icons8_save_as_32px_4.png"))); // NOI18N
        btn6.setText("Guardar");
        btn6.setBorder(null);
        btn6.setContentAreaFilled(false);
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.setFocusPainted(false);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setSelected(true);
        btn6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 80, 50));

        btn5.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_final_necflis/imgenes/icons8_cancel_32px.png"))); // NOI18N
        btn5.setText("Cancelar");
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
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 80, 50));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_final_necflis/imgenes/icons8_documentary_32px.png"))); // NOI18N
        jLabel7.setText("Nombre:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 100, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_final_necflis/imgenes/necflis new.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 110, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_final_necflis/imgenes/registro pelis.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        
        String nombre, tipo = "", genero, sinopsis;
        int nom, ti, ge, sino;

        nombre = txt_nombre.getText().trim();
        genero = txt_genero.getText().trim();
        sinopsis = txta_sinopsis.getText().trim();
        
        if(rbtn_peli.isSelected()){

            tipo = "Película";

        }
        if(rbtn_serie.isSelected()){

            tipo = "Serie";

        }

        if(nombre.equals("") || genero.equals("") || sinopsis.equals("") || tipo.equals("")){

            JOptionPane.showMessageDialog(null, "Todos los campos son requeridos >:D");

        }else{

            if(!Validar_cadenas(genero) && !Validar_cadenas(sinopsis)){

                Pelis pelicula = new Pelis(nombre, tipo, genero, sinopsis);

                try{

                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/necflis", "root", "");
                    PreparedStatement pst = cn.prepareStatement("insert into peliculas values(?,?,?,?,?)");

                    pst.setString(1, "0");
                    pst.setString(2, pelicula.peli);
                    pst.setString(3, pelicula.tipo);
                    pst.setString(4, pelicula.genero);
                    pst.setString(5, pelicula.sinopsis);
                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Pelicula se registró de forma exitosa :D");

                    new Peliculas().setVisible(true);
                    dispose();

                }catch(Exception e){

                    JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos :(");

                }

            }else{

                JOptionPane.showMessageDialog(null, "No puede ingresar enteros en los campos :v");

            }

        }

    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        
        new Peliculas().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btn5ActionPerformed

    private void txt_generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_generoActionPerformed
        
    }//GEN-LAST:event_txt_generoActionPerformed
    
    public static boolean Validar_cadenas(String datos_peli){
    
            return datos_peli.matches("[0-9]*");
    
    }
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
            java.util.logging.Logger.getLogger(Crear_Peli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear_Peli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear_Peli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_Peli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_Peli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.ButtonGroup grupo_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtn_peli;
    private javax.swing.JRadioButton rbtn_serie;
    private javax.swing.JTextField txt_genero;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextArea txta_sinopsis;
    // End of variables declaration//GEN-END:variables
}
