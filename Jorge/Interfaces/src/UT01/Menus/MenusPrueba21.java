/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Aiden-DAM2
 */
public class MenusPrueba21 extends javax.swing.JFrame {

    /**
     * Creates new form MenusPrueba2
     */
    public MenusPrueba21() {
        initComponents();
        label.setVisible(false);
        texto.setVisible(false);
        submit.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        label = new javax.swing.JLabel();
        texto = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newProject = new javax.swing.JMenuItem();
        newFile = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        openProject = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        closeProject = new javax.swing.JMenuItem();
        closeAllProjects = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenu4.setText("jMenu4");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label.setText("Introduce Nombre");
        label.setOpaque(true);

        texto.setText("Textodeprueba");
        texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoActionPerformed(evt);
            }
        });

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        newProject.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newProject.setText("New Project...");
        newProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newProjectActionPerformed(evt);
            }
        });
        jMenu1.add(newProject);

        newFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newFile.setText("New File...");
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        jMenu1.add(newFile);
        jMenu1.add(jSeparator1);

        openProject.setText("Open Project");
        openProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openProjectActionPerformed(evt);
            }
        });
        jMenu1.add(openProject);

        jMenuItem7.setText("Open Recent Project");
        jMenu1.add(jMenuItem7);

        closeProject.setText("Close Project (Menus)");
        closeProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeProjectActionPerformed(evt);
            }
        });
        jMenu1.add(closeProject);

        closeAllProjects.setText("Close Other Projects");
        closeAllProjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeAllProjectsActionPerformed(evt);
            }
        });
        jMenu1.add(closeAllProjects);

        jMenuItem10.setText("Open File...");
        jMenu1.add(jMenuItem10);

        jMenu7.setText("Open Recent File");

        jMenuItem11.setText("New JFrame.java");
        jMenu7.add(jMenuItem11);

        jMenuItem12.setText("etc...");
        jMenu7.add(jMenuItem12);

        jMenu1.add(jMenu7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem2.setText("jMenuItem2");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label)
                        .addGap(18, 18, 18)
                        .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(submit))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label)
                    .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submit)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProjectActionPerformed
        // TODO add your handling code here:
        getContentPane().setBackground(Color.PINK);
//        label.setVisible(true);
//        texto.setVisible(true);
//        submit.setVisible(true);
        
    }//GEN-LAST:event_newProjectActionPerformed

    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        // TODO add your handling code here:
        
        mensaje_nf = JOptionPane.showInputDialog("Introduce nombre");
        
//        getContentPane().setBackground(Color.PINK);
//        label.setVisible(false);
//        texto.setVisible(false);
//        submit.setVisible(false);
//        //No he conseguido que se ponga pero podría desactivarla y activarla no sé
//        JLabel texto_recibido = new JLabel(mi_texto);
//        add(texto_recibido);
//        texto_recibido.setVisible(true);
    }//GEN-LAST:event_newFileActionPerformed

    private void openProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openProjectActionPerformed
        // TODO add your handling code here:
        label.setVisible(true);
        texto.setVisible(true);
        submit.setVisible(true);
    }//GEN-LAST:event_openProjectActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        mensaje_op = texto.getText();
        label.setVisible(false);
        texto.setVisible(false);
        submit.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

    private void closeProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeProjectActionPerformed
        // TODO add your handling code here:
        JLabel etiq = new JLabel(mensaje_nf);
        /**
         * Para que se vean tenemos que añadir setsize y setlocation
         * La primera variable del SetLocation es el margin left
         * La segunda es el margin top
         */
        etiq.setSize(200, 200);
        etiq.setBackground(Color.red);
        etiq.setLocation(10, 0);
        this.add(etiq);
        etiq.setVisible(true);
    }//GEN-LAST:event_closeProjectActionPerformed

    private void closeAllProjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAllProjectsActionPerformed
        // TODO add your handling code here:
        JLabel etiq = new JLabel(mensaje_op);
        etiq.setSize(200, 200);
        etiq.setLocation(10,20);
        this.add(etiq);
        etiq.setVisible(true);
    }//GEN-LAST:event_closeAllProjectsActionPerformed

    private void textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoActionPerformed

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
            java.util.logging.Logger.getLogger(MenusPrueba21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenusPrueba21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenusPrueba21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenusPrueba21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenusPrueba21().setVisible(true);
                           
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem closeAllProjects;
    private javax.swing.JMenuItem closeProject;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel label;
    private javax.swing.JMenuItem newFile;
    private javax.swing.JMenuItem newProject;
    private javax.swing.JMenuItem openProject;
    private javax.swing.JButton submit;
    private javax.swing.JTextField texto;
    // End of variables declaration//GEN-END:variables
        String mensaje_nf;
        String mensaje_op;
}
