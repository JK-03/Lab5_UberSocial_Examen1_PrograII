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
public class AgregarPost extends javax.swing.JFrame {

    /**
     * Creates new form AgregarPost
     */
    public AgregarPost() {
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
        UsuarioField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        PostArea = new javax.swing.JTextArea();
        BotonPublicar = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 90, 40, 30));

        UsuarioField.setBackground(new java.awt.Color(202, 240, 248));
        UsuarioField.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        UsuarioField.setForeground(new java.awt.Color(0, 0, 0));
        UsuarioField.setBorder(null);
        jPanel1.add(UsuarioField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 226, 240, 40));

        jScrollPane1.setBorder(null);

        PostArea.setBackground(new java.awt.Color(202, 240, 248));
        PostArea.setColumns(20);
        PostArea.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        PostArea.setForeground(new java.awt.Color(0, 0, 0));
        PostArea.setLineWrap(true);
        PostArea.setRows(5);
        PostArea.setBorder(null);
        jScrollPane1.setViewportView(PostArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 317, 550, 90));

        BotonPublicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonPublicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonPublicarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonPublicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 180, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos/AgregarPost.png"))); // NOI18N
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
        String post = PostArea.getText();
        
       if (usuario.isBlank() || usuario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completa el campo de Usuario.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (post.isBlank() || post.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completa el campo de Post.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Main_UberSocial.uberSocial.agregarPost(usuario, post);

        if (Main_UberSocial.uberSocial.isMenuPrincipal()) {
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.setVisible(true);
            this.setVisible(false);
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
            java.util.logging.Logger.getLogger(AgregarPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonPublicar;
    private javax.swing.JLabel BotonRegresar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextArea PostArea;
    private javax.swing.JTextField UsuarioField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
