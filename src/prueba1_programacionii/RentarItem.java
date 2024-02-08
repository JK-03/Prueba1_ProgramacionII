/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prueba1_programacionii;

import javax.swing.JOptionPane;

/**
 *
 * @author jenniferbueso
 */
public class RentarItem extends javax.swing.JFrame {

    /**
     * Creates new form RentarItem
     */
    public RentarItem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonRegresar = new javax.swing.JLabel();
        TipoItemBox = new javax.swing.JComboBox<>();
        DiasField = new javax.swing.JTextField();
        MostrarField = new javax.swing.JTextField();
        CodigoField = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JLabel();
        MontoLabel = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 50, 50));

        TipoItemBox.setBackground(new java.awt.Color(255, 255, 255));
        TipoItemBox.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        TipoItemBox.setForeground(new java.awt.Color(159, 77, 79));
        TipoItemBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Movie", "Game" }));
        TipoItemBox.setBorder(null);
        TipoItemBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(TipoItemBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 190, 40));

        DiasField.setBackground(new java.awt.Color(255, 255, 255));
        DiasField.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        DiasField.setForeground(new java.awt.Color(159, 77, 79));
        DiasField.setBorder(null);
        DiasField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DiasFieldKeyTyped(evt);
            }
        });
        jPanel1.add(DiasField, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 293, 270, 40));

        MostrarField.setEditable(false);
        MostrarField.setBackground(new java.awt.Color(255, 255, 255));
        MostrarField.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        MostrarField.setForeground(new java.awt.Color(159, 77, 79));
        MostrarField.setBorder(null);
        MostrarField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MostrarFieldKeyTyped(evt);
            }
        });
        jPanel1.add(MostrarField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 443, 350, 40));

        CodigoField.setBackground(new java.awt.Color(255, 255, 255));
        CodigoField.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CodigoField.setForeground(new java.awt.Color(159, 77, 79));
        CodigoField.setBorder(null);
        CodigoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CodigoFieldKeyTyped(evt);
            }
        });
        jPanel1.add(CodigoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 293, 270, 40));

        BotonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonBuscarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 160, 50));

        MontoLabel.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        MontoLabel.setForeground(new java.awt.Color(159, 77, 79));
        MontoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(MontoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 443, 220, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos/RentarItem.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseClicked
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonRegresarMouseClicked

    private void CodigoFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodigoFieldKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;

        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_CodigoFieldKeyTyped

    private void DiasFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DiasFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_DiasFieldKeyTyped

    private void BotonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMouseClicked
        int codigo = -1;
        int dias  = -1;
        codigo = Integer.parseInt(CodigoField.getText());
        String tipoItem = (String) TipoItemBox.getSelectedItem();
        dias = Integer.parseInt(DiasField.getText());
        
        
        if (codigo == -1) {
            JOptionPane.showMessageDialog(null, "Completa el campo de Código.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (tipoItem.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Elije un Tipo de Item.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (dias == -1) {
            JOptionPane.showMessageDialog(null, "Completa el campo de Días.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        BlockBusterItem item  = Main_BlockBuster.blockBuster.rentar(codigo, tipoItem, dias);
        
        if (item != null) {
            MostrarField.setText(item.toString());
            MontoLabel.setText("Lps. " + String.valueOf(item.pagoRenta(dias)));
        } else {
            JOptionPane.showMessageDialog(null, "El código ingresado no existe en el sistema.", "Error: Código Inexistente", JOptionPane.ERROR_MESSAGE);
        }
        

    }//GEN-LAST:event_BotonBuscarMouseClicked

    private void MostrarFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MostrarFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_MostrarFieldKeyTyped

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
            java.util.logging.Logger.getLogger(RentarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentarItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonBuscar;
    private javax.swing.JLabel BotonRegresar;
    private javax.swing.JTextField CodigoField;
    private javax.swing.JTextField DiasField;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel MontoLabel;
    private javax.swing.JTextField MostrarField;
    private javax.swing.JComboBox<String> TipoItemBox;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}