/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_final;

import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NaniXC7
 */
public class index extends javax.swing.JFrame {
    
    public static String sucur = "";   
    /**
     * Creates new form index
     */
    public index() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        lista.addItem("Seleccionar");
        lista.addItem("Guatemala");
        lista.addItem("El Progreso");
        lista.addItem("Jalapa");
        
        
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pizzas = new javax.swing.JTable();
        lista = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Gabriola", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ADMINISTRACIÓN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 340, 80));

        jLabel1.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Precio:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Sucursal");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 90, 60, -1));

        jLabel4.setFont(new java.awt.Font("Gabriola", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Pizzas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 90, 60));

        precio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        precio.setOpaque(false);
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 70, 30));

        jLabel5.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Decripción:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        nombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        nombre.setOpaque(false);
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 140, 30));

        jLabel6.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        pizzas.setBackground(new java.awt.Color(0, 0, 0));
        pizzas.setForeground(new java.awt.Color(255, 255, 255));
        pizzas.setModel(new javax.swing.table.DefaultTableModel(
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
        pizzas.setGridColor(new java.awt.Color(255, 255, 255));
        pizzas.setSelectionBackground(new java.awt.Color(0, 0, 0));
        pizzas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(pizzas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, 100));

        lista.setOpaque(false);
        lista.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaItemStateChanged(evt);
            }
        });
        lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaActionPerformed(evt);
            }
        });
        getContentPane().add(lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Realizar Orden");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examen_final/icons8_pizza_30px.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examen_final/icons8_money_30px.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        descripcion.setBackground(new java.awt.Color(0, 0, 0));
        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        descripcion.setForeground(new java.awt.Color(255, 255, 255));
        descripcion.setRows(5);
        descripcion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jScrollPane1.setViewportView(descripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 340, 80));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examen_final/icons8_create_30px.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examen_final/icons8_list_30px.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examen_final/fondo.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombreingresado = "", precioingresado = "", descripcioningresada = "", sucursal = "";
        int preciofinal = 0, hola = 0;
        
        nombreingresado = nombre.getText().trim();
        precioingresado = precio.getText().trim();
        descripcioningresada = descripcion.getText();
        sucursal = sucur;
        

        
        if(nombreingresado.equals("") || precioingresado.equals("") || descripcioningresada.equals("") || sucursal.equals("Seleccionar")){
            
            JOptionPane.showMessageDialog(null, "Todos los camboas son requeridos");
            
        }else{
        
            try {
                
                preciofinal = Integer.parseInt(precioingresado);
                
                
                if(sucur.equals("Guatemala")){
                
                    Examen_Final.nombresg.add(nombreingresado);
                    Examen_Final.precig.add(precioingresado);
                    Examen_Final.descripg.add(descripcioningresada);
                    Examen_Final.sucg.add(sucur);
                    
                    pizzas logica = new pizzas();
        
                    DefaultTableModel modelo = logica.mostrarPizzas();
        
                    pizzas.setModel(modelo);
                
                }else if(sucur.equals("Jalapa")){
                
                    Examen_Final.nombresj.add(nombreingresado);
                    Examen_Final.precij.add(precioingresado);
                    Examen_Final.descripj.add(descripcioningresada);
                    Examen_Final.sucj.add(sucur);
                    
                    pizzas logica = new pizzas();
        
                    DefaultTableModel modelo = logica.mostrarPizzasj();
        
                    pizzas.setModel(modelo);
                
                }else if(sucur.equals("El Progreso")){
                
                    Examen_Final.nombresep.add(nombreingresado);
                    Examen_Final.preciep.add(precioingresado);
                    Examen_Final.descripep.add(descripcioningresada);
                    Examen_Final.sucep.add(sucur);
                    
                    pizzas logica = new pizzas();
        
                    DefaultTableModel modelo = logica.mostrarPizzasep();
        
                    pizzas.setModel(modelo);
                    
                    nombre.setText("");
                    precio.setText("");
                    descripcion.setText("");
                
                }
                                                             
                
                JOptionPane.showMessageDialog(null, "La pizza " + nombreingresado + " ha sido creada exitosamente");               
        

                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, "No puede ingresar caracteres en el precio");
                
            }
        
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaActionPerformed

    private void listaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaItemStateChanged
        
        sucur =(String) lista.getSelectedItem();
        
        if(evt.getStateChange() == ItemEvent.SELECTED){
        
            if(this.lista.getSelectedIndex() == 0){
                
                String[] nombresColumnas = {"Nombre", "Descripcion", "Precio"};
                
                DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
                
                pizzas.setModel(modelo);

            }else if(this.lista.getSelectedIndex() == 1){
                
                pizzas logica = new pizzas();
        
                DefaultTableModel modelo = logica.mostrarPizzas();
        
                pizzas.setModel(modelo);
                
            }else if(this.lista.getSelectedIndex() == 2){
                
                pizzas logica = new pizzas();
        
                DefaultTableModel modelo = logica.mostrarPizzasep();
        
                pizzas.setModel(modelo);
                
            }else if(this.lista.getSelectedIndex() == 3){
                
                pizzas logica = new pizzas();
        
                DefaultTableModel modelo = logica.mostrarPizzasj();
        
                pizzas.setModel(modelo);
                
            }
            
        }
        
    }//GEN-LAST:event_listaItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ordenes c = new ordenes();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> lista;
    private javax.swing.JTextField nombre;
    private javax.swing.JTable pizzas;
    private javax.swing.JTextField precio;
    // End of variables declaration//GEN-END:variables
}