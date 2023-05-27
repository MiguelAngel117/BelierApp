/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.panels;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import views.JFrameMain;
import views.dialogs.JConfirmDialogCloseProgram;

/**
 *
 * @author USER
 */
public class JPanelLogin extends javax.swing.JPanel {

    private JFrameMain frameMain;
    private String user;
    private String password;

    /**
     * Creates new form JPanelLogin
     */
    public JPanelLogin(JFrameMain frameMain) {
        this.frameMain = frameMain;
        initComponents();
        this.user = "ADMIN";
        this.password = "Belier2";
        jLabelDesc1.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jPasswordFieldContraseña1 = new javax.swing.JPasswordField();
        jLabelPassword1 = new javax.swing.JLabel();
        jTextFieldNombreUsuario1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabelUser1 = new javax.swing.JLabel();
        jLabelIniciar1 = new javax.swing.JLabel();
        JLabelLogo1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelDesc1 = new javax.swing.JLabel();
        jPanel2 = new backgroundPanel();
        jPanel3 = new backgroundPanel();

        setBackground(new java.awt.Color(153, 204, 255));
        setPreferredSize(new java.awt.Dimension(1020, 640));

        jPanelBackground.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(255, 51, 0));
        jSeparator4.setForeground(new java.awt.Color(255, 51, 0));

        jPasswordFieldContraseña1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordFieldContraseña1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordFieldContraseña1.setBorder(null);
        jPasswordFieldContraseña1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldContraseña1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldContraseña1KeyTyped(evt);
            }
        });

        jLabelPassword1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelPassword1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPassword1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPassword1.setText("Contraseña");

        jTextFieldNombreUsuario1.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombreUsuario1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldNombreUsuario1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldNombreUsuario1.setBorder(null);
        jTextFieldNombreUsuario1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldNombreUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreUsuario1ActionPerformed(evt);
            }
        });
        jTextFieldNombreUsuario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNombreUsuario1KeyPressed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(255, 51, 0));
        jSeparator3.setForeground(new java.awt.Color(255, 51, 0));

        jLabelUser1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelUser1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUser1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUser1.setText("Usuario");

        jLabelIniciar1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelIniciar1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelIniciar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIniciar1.setText("INICIAR SESIÓN ");

        JLabelLogo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/belierrr.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("INGRESAR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEnterEvenListenerMouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton1KeyTyped(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close4.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabelDesc1.setBackground(new java.awt.Color(102, 0, 0));
        jLabelDesc1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelDesc1.setForeground(new java.awt.Color(244, 225, 208));
        jLabelDesc1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(JLabelLogo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 110, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4)
                    .addComponent(jTextFieldNombreUsuario1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIniciar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelUser1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPassword1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordFieldContraseña1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDesc1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(JLabelLogo1)
                .addGap(75, 75, 75)
                .addComponent(jLabelIniciar1)
                .addGap(50, 50, 50)
                .addComponent(jLabelUser1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNombreUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabelPassword1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDesc1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(280, 0));
        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 215, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean isValid = false;
        if (jTextFieldNombreUsuario1.getText().length() == 0) {
            isValid = false;
            jLabelDesc1.setText(" Ingrese un usuario.");
            jLabelDesc1.setVisible(true);
        } else if (jPasswordFieldContraseña1.getText().length() == 0) {
            isValid = false;
            jLabelDesc1.setText(" Ingrese una contraseña.");
            jLabelDesc1.setVisible(true);
        }else if (!jTextFieldNombreUsuario1.getText().toUpperCase().equals(user)) {
            isValid = false;
            jLabelDesc1.setText(" Usuario ingresado incorrecto.");
            jLabelDesc1.setVisible(true);
        }  else if (!jPasswordFieldContraseña1.getText().equals(password)) {
            isValid = false;
            jLabelDesc1.setText(" Contraseña incorrecta.");
            jLabelDesc1.setVisible(true);
        } else {
            jLabelDesc1.setVisible(false);
            isValid = true;
        }
        if (isValid) {
            JPanelMain jPanelMain = new JPanelMain(frameMain);
            jPanelMain.setLocation(0, 0);
            jPanelMain.setSize(this.getSize());
            this.removeAll();
            this.add(jPanelMain, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            isValid = false;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldNombreUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreUsuario1ActionPerformed

    private void jButtonEnterEvenListenerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnterEvenListenerMouseClicked

    }//GEN-LAST:event_jButtonEnterEvenListenerMouseClicked

    private void jButton1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyTyped

    private void jPanel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyPressed

    }//GEN-LAST:event_jPanel2KeyPressed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed


    }//GEN-LAST:event_jPanel1KeyPressed

    private void jTextFieldNombreUsuario1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreUsuario1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            boolean isValid = false;
            if (jTextFieldNombreUsuario1.getText().length() == 0) {
                isValid = false;
                jLabelDesc1.setText(" Ingrese un usuario.");
                jLabelDesc1.setVisible(true);
            }else if (jPasswordFieldContraseña1.getText().length() == 0) {
                isValid = false;
                jLabelDesc1.setText(" Ingrese una contraseña.");
                jLabelDesc1.setVisible(true);
            }else if (!jTextFieldNombreUsuario1.getText().toUpperCase().equals(user)) {
                isValid = false;
                jLabelDesc1.setText(" Usuario ingresado incorrecto.");
                jLabelDesc1.setVisible(true);
            }  else if (!jPasswordFieldContraseña1.getText().toUpperCase().equals(password)) {
                isValid = false;
                jLabelDesc1.setText(" Contraseña incorrecta.");
                jLabelDesc1.setVisible(true);
            } else {
                jLabelDesc1.setVisible(false);
                isValid = true;
            }
            if (isValid) {
                JPanelMain jPanelMain = new JPanelMain(frameMain);
                jPanelMain.setLocation(0, 0);
                jPanelMain.setSize(this.getSize());
                this.removeAll();
                this.add(jPanelMain, BorderLayout.CENTER);
                this.revalidate();
                this.repaint();
                isValid = false;
            }
        }
    }//GEN-LAST:event_jTextFieldNombreUsuario1KeyPressed

    private void jPasswordFieldContraseña1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseña1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldContraseña1KeyTyped

    private void jPasswordFieldContraseña1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseña1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            boolean isValid = false;
            if (jTextFieldNombreUsuario1.getText().length() == 0) {
                isValid = false;
                jLabelDesc1.setText(" Ingrese un usuario.");
                jLabelDesc1.setVisible(true);
            } else if (!jTextFieldNombreUsuario1.getText().toUpperCase().equals(user)) {
                isValid = false;
                jLabelDesc1.setText(" Usuario ingresado incorrecto.");
                jLabelDesc1.setVisible(true);
            } else if (jPasswordFieldContraseña1.getText().length() == 0) {
                isValid = false;
                jLabelDesc1.setText(" Ingrese una contraseña.");
                jLabelDesc1.setVisible(true);
            } else if (!jPasswordFieldContraseña1.getText().equals(password)) {
                isValid = false;
                jLabelDesc1.setText(" Contraseña ingresada incorrecta.");
                jLabelDesc1.setVisible(true);
            } else {
                jLabelDesc1.setVisible(false);
                isValid = true;
            }
            if (isValid) {
                JPanelMain jPanelMain = new JPanelMain(frameMain);
                jPanelMain.setLocation(0, 0);
                jPanelMain.setSize(this.getSize());
                this.removeAll();
                this.add(jPanelMain, BorderLayout.CENTER);
                this.revalidate();
                this.repaint();
                
                isValid = false;
            }
        }
    }//GEN-LAST:event_jPasswordFieldContraseña1KeyPressed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close7.png")));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close4.png")));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JConfirmDialogCloseProgram confirmationDialog = new JConfirmDialogCloseProgram(frameMain);
        confirmationDialog.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelLogo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabelDesc1;
    private javax.swing.JLabel jLabelIniciar1;
    private javax.swing.JLabel jLabelPassword1;
    private javax.swing.JLabel jLabelUser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPasswordField jPasswordFieldContraseña1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextFieldNombreUsuario1;
    // End of variables declaration//GEN-END:variables

    class backgroundPanel extends JPanel {

        private Image image;

        @Override
        public void paint(Graphics g) {
            image = new ImageIcon(getClass().getResource("/fondobelier.jpg")).getImage();
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }

    }
}
