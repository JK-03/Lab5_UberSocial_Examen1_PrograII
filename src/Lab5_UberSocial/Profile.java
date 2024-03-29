/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lab5_UberSocial;

import javax.swing.JOptionPane;

/**
 *
 * @author jenniferbueso
 */
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    public Profile() {
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
        UsuarioField = new javax.swing.JTextField();
        BotonRegresar = new javax.swing.JLabel();
        BotonPublicar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProfileArea = new javax.swing.JTextArea();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsuarioField.setBackground(new java.awt.Color(202, 240, 248));
        UsuarioField.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        UsuarioField.setForeground(new java.awt.Color(0, 0, 0));
        UsuarioField.setBorder(null);
        jPanel1.add(UsuarioField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 197, 250, 40));

        BotonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 90, 40, 30));

        BotonPublicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonPublicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonPublicarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonPublicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 50, 50));

        jScrollPane1.setBorder(null);

        ProfileArea.setEditable(false);
        ProfileArea.setBackground(new java.awt.Color(202, 240, 248));
        ProfileArea.setColumns(20);
        ProfileArea.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        ProfileArea.setForeground(new java.awt.Color(0, 0, 0));
        ProfileArea.setLineWrap(true);
        ProfileArea.setRows(5);
        ProfileArea.setBorder(null);
        jScrollPane1.setViewportView(ProfileArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 269, 550, 200));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos/Profile.png"))); // NOI18N
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

    private void BotonPublicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPublicarMouseClicked
        String usuario = UsuarioField.getText();

        if (usuario.isBlank() || usuario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completa el campo de Usuario.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String mostrar = Main_UberSocial.uberSocial.profileFrom(usuario);
        
        ProfileArea.setText(Main_UberSocial.uberSocial.profileFrom(usuario));

        if (mostrar != null) {
            ProfileArea.setText(mostrar);
        }
    }//GEN-LAST:event_BotonPublicarMouseClicked

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonPublicar;
    private javax.swing.JLabel BotonRegresar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextArea ProfileArea;
    private javax.swing.JTextField UsuarioField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
