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
public class AgregarItem extends javax.swing.JFrame {
    private String tipoItem;
    private boolean game = false;
    
    public AgregarItem() {
        initComponents();
        jPanel1.setLayout(null);
        
        RentaMostrar.setVisible(false);
        RentaField.setVisible(false);
        TipoConsolaMostrar.setVisible(false);
        TipoConsolaBox.setVisible(false);
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
        NombreField = new javax.swing.JTextField();
        RentaField = new javax.swing.JTextField();
        CodigoField = new javax.swing.JTextField();
        TipoConsolaBox = new javax.swing.JComboBox<>();
        TipoItemBox = new javax.swing.JComboBox<>();
        BotonAgregar = new javax.swing.JLabel();
        TipoConsolaMostrar = new javax.swing.JLabel();
        RentaMostrar = new javax.swing.JLabel();
        BotonRegresar = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreField.setBackground(new java.awt.Color(255, 255, 255));
        NombreField.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        NombreField.setForeground(new java.awt.Color(159, 77, 79));
        NombreField.setBorder(null);
        NombreField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreFieldKeyTyped(evt);
            }
        });
        jPanel1.add(NombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 287, 270, 40));

        RentaField.setBackground(new java.awt.Color(255, 255, 255));
        RentaField.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        RentaField.setForeground(new java.awt.Color(159, 77, 79));
        RentaField.setBorder(null);
        RentaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RentaFieldKeyTyped(evt);
            }
        });
        jPanel1.add(RentaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 392, 220, 40));

        CodigoField.setBackground(new java.awt.Color(255, 255, 255));
        CodigoField.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CodigoField.setForeground(new java.awt.Color(159, 77, 79));
        CodigoField.setBorder(null);
        CodigoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CodigoFieldKeyTyped(evt);
            }
        });
        jPanel1.add(CodigoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 287, 270, 40));

        TipoConsolaBox.setBackground(new java.awt.Color(255, 255, 255));
        TipoConsolaBox.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        TipoConsolaBox.setForeground(new java.awt.Color(159, 77, 79));
        TipoConsolaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Playstation", "Xbox", "WII" }));
        TipoConsolaBox.setBorder(null);
        TipoConsolaBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TipoConsolaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoConsolaBoxActionPerformed(evt);
            }
        });
        jPanel1.add(TipoConsolaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 392, 190, 40));

        TipoItemBox.setBackground(new java.awt.Color(255, 255, 255));
        TipoItemBox.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        TipoItemBox.setForeground(new java.awt.Color(159, 77, 79));
        TipoItemBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Movie", "Game" }));
        TipoItemBox.setBorder(null);
        TipoItemBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TipoItemBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoItemBoxActionPerformed(evt);
            }
        });
        jPanel1.add(TipoItemBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 184, 190, 40));

        BotonAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonAgregarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 180, 50));

        TipoConsolaMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos/TipoConsolaField.png"))); // NOI18N
        jPanel1.add(TipoConsolaMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 350, -1, 90));

        RentaMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos/RentaField.png"))); // NOI18N
        jPanel1.add(RentaMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, 90));

        BotonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 50, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos/AgregarItem.png"))); // NOI18N
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

    private void TipoItemBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoItemBoxActionPerformed
        tipoItem = (String) TipoItemBox.getSelectedItem();
        
        if (tipoItem.equals(" ")) {
            RentaMostrar.setVisible(false);
            RentaField.setVisible(false);
            TipoConsolaMostrar.setVisible(false);
            TipoConsolaBox.setVisible(false);
        } else if (tipoItem.equals("Movie")) {
            RentaMostrar.setVisible(true);
            RentaField.setVisible(true);
            TipoConsolaMostrar.setVisible(false);
            TipoConsolaBox.setVisible(false);
            RentaMostrar.setLocation(250, 350);
            RentaField.setLocation(273, 394);
        } else if (tipoItem.equals("Game")) {
            RentaMostrar.setVisible(false);
            RentaField.setVisible(false);
            TipoConsolaMostrar.setVisible(true);
            TipoConsolaBox.setVisible(true);
            TipoConsolaMostrar.setLocation(250, 350);
            TipoConsolaBox.setLocation(320, 392);
            game = true;
        }
    }//GEN-LAST:event_TipoItemBoxActionPerformed

    private void CodigoFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodigoFieldKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;

        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_CodigoFieldKeyTyped

    private void RentaFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RentaFieldKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;

        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_RentaFieldKeyTyped

    private void TipoConsolaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoConsolaBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoConsolaBoxActionPerformed

    private void BotonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAgregarMouseClicked
        int codigo = -1;
        double renta = -1;
        String nombre = NombreField.getText();
        codigo = Integer.parseInt(CodigoField.getText());
        String tipoItem = (String) TipoItemBox.getSelectedItem();
        if (!game) {
            renta = Double.parseDouble(RentaField.getText());
        }
        boolean mensaje;
        
        if (nombre.isBlank() || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completa el campo de Nombre.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (codigo == -1) {
            JOptionPane.showMessageDialog(null, "Completa el campo de Código.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (tipoItem.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Elije un Tipo de Item.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (renta == -1 && !game) {
            JOptionPane.showMessageDialog(null, "Completa el campo de Renta.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        
        switch (tipoItem) {
            case "Movie":
                MovieItem movieItem = (MovieItem) Main_BlockBuster.blockBuster.agregarItem(codigo, nombre, tipoItem);
                
                if (movieItem != null) {
                    JOptionPane.showMessageDialog(null, "Item '" + nombre + "' agregado con éxito!", "Ítem Agregado Exitosamente", JOptionPane.INFORMATION_MESSAGE);
                    movieItem.setRentaItem(renta);
                    MenuPrincipal menuPrincipal = new MenuPrincipal();
                    menuPrincipal.setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Código de MOVIE ya existente. Por favor, ingrese otro código.", "Código Existente", JOptionPane.ERROR_MESSAGE);
                }
                break;
                
            case "Game":    
                String tipoConsola = (String) TipoConsolaBox.getSelectedItem();
                if (tipoItem.equals(" ")) {
                    JOptionPane.showMessageDialog(null, "Elije un Tipo de Consola.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                VideoGameItem gameItem = (VideoGameItem) Main_BlockBuster.blockBuster.agregarItem(codigo, nombre, tipoItem);
                
                if (gameItem !=null) {
                    JOptionPane.showMessageDialog(null, "¡Item '" + nombre + "' agregado con éxito!", "Ítem Agregado Exitosamente", JOptionPane.INFORMATION_MESSAGE);
                    gameItem.setConsolaNombre(tipoConsola);
                    MenuPrincipal menuPrincipal = new MenuPrincipal();
                    menuPrincipal.setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Código de GAME ya existente. Por favor, ingrese otro código.", "Código Existente", JOptionPane.ERROR_MESSAGE);
                }
                break;
        }
    }//GEN-LAST:event_BotonAgregarMouseClicked

    private void BotonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseClicked
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonRegresarMouseClicked

    private void NombreFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreFieldKeyTyped

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
            java.util.logging.Logger.getLogger(AgregarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new AgregarItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonAgregar;
    private javax.swing.JLabel BotonRegresar;
    private javax.swing.JTextField CodigoField;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField NombreField;
    private javax.swing.JTextField RentaField;
    private javax.swing.JLabel RentaMostrar;
    private javax.swing.JComboBox<String> TipoConsolaBox;
    private javax.swing.JLabel TipoConsolaMostrar;
    private javax.swing.JComboBox<String> TipoItemBox;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}