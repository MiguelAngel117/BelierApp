/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.math.BigInteger;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import models.Garment;
import models.GarmentCRUD;
import models.Service;
import models.TypeCRUD;
import views.JFrameMain;
import views.dialogs.JConfirmDialogCreateProduct;

/**
 *
 * @author USER
 */
public class JPanelRegisterArticle extends javax.swing.JPanel {

    private final JFrameMain jFrameMain;
    private final JPanelMain jpanelMain;

    /**
     * Creates new form JPanelArticle
     */
    public JPanelRegisterArticle(JFrameMain jFrameMain, JPanelMain jpanelMain) {
        this.jFrameMain = jFrameMain;
        this.jpanelMain = jpanelMain;
        initComponents();
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        jLabelDesc1.setVisible(false);

        AbstractDocument document = (AbstractDocument) jTextField1.getDocument();
        document.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
                    throws BadLocationException {
                if (string.matches("\\d+")) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {
                if (text.matches("\\d+")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
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
        jLabelTittle = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jLabelCod = new javax.swing.JLabel();
        jLabelType = new javax.swing.JLabel();
        jLabelDesc = new javax.swing.JLabel();
        jLabelPriceSale = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jToggleButtonBack = new javax.swing.JToggleButton();
        jLabelDesc1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanelBackground.setBackground(new java.awt.Color(244, 225, 208));

        jLabelTittle.setBackground(new java.awt.Color(51, 51, 51));
        jLabelTittle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTittle.setForeground(new java.awt.Color(244, 225, 208));
        jLabelTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTittle.setText("REGISTRAR PRODUCTO");
        jLabelTittle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelTittle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelTittle.setOpaque(true);

        jLabelGender.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelGender.setForeground(new java.awt.Color(0, 0, 0));
        jLabelGender.setText("Género");
        jLabelGender.setPreferredSize(new java.awt.Dimension(78, 32));

        jLabelCod.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCod.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCod.setText("Código Producto");

        jLabelType.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelType.setForeground(new java.awt.Color(0, 0, 0));
        jLabelType.setText("Tipo");

        jLabelDesc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelDesc.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDesc.setText("Descripción");

        jLabelPriceSale.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelPriceSale.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPriceSale.setText("Precio de Venta");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setBorder(BorderFactory.createLineBorder(new Color(255,102,0), 2));
        jTextField1.setMaximumSize(new java.awt.Dimension(64, 28));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setMaximumSize(new java.awt.Dimension(64, 28));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(BorderFactory.createLineBorder(new Color(255,102,0), 2));
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4.setBorder(BorderFactory.createLineBorder(new Color(255,102,0), 2));
        jTextField4.setMaximumSize(new java.awt.Dimension(64, 28));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });

        jToggleButtonBack.setBackground(new java.awt.Color(97, 136, 176));
        jToggleButtonBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jToggleButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButtonBack.setText("REGRESAR");
        jToggleButtonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jToggleButtonBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jToggleButtonBackMouseExited(evt);
            }
        });
        jToggleButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonBackActionPerformed(evt);
            }
        });

        jLabelDesc1.setBackground(new java.awt.Color(102, 0, 0));
        jLabelDesc1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelDesc1.setForeground(new java.awt.Color(244, 225, 208));
        jLabelDesc1.setText(" Ingrese solo valores númericos! ");
        jLabelDesc1.setOpaque(true);

        jButton1.setBackground(new java.awt.Color(54, 125, 86));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(244, 225, 208));
        jButton1.setText("REGISTRAR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelType, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelGender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCod, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelPriceSale)
                            .addComponent(jLabelDesc)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabelDesc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jToggleButtonBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jLabelTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabelTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabelCod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabelPriceSale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDesc1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jToggleButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jToggleButtonBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonBackMouseEntered
        jToggleButtonBack.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_jToggleButtonBackMouseEntered

    private void jToggleButtonBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonBackMouseExited
        jToggleButtonBack.setBackground(new Color(97, 136, 176));
    }//GEN-LAST:event_jToggleButtonBackMouseExited

    private void jToggleButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonBackActionPerformed
        JPanelArticle jPanelArticle = new JPanelArticle(jFrameMain, jpanelMain);
        jPanelArticle.setLocation(0, 0);
        jPanelArticle.setSize(this.getSize());
        this.removeAll();
        this.add(jPanelArticle, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jToggleButtonBackActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        showIsEmpty(jTextField1);
        showIsEmpty(jTextField2);
        showIsEmpty(jTextField4);
        showIsEmptyJA(jTextArea1);

        if (!jTextField1.getText().isEmpty()) {
            try {
                new BigInteger(jTextField1.getText());
                jLabelDesc1.setVisible(false);
                if (jTextField1.getText().contains("-")) {
                    jLabelDesc1.setVisible(true);
                    jLabelDesc1.setText(" Ingrese solo valores positivos! ");
                } else {
                    jLabelDesc1.setVisible(false);
                }
            } catch (NumberFormatException e) {
                jLabelDesc1.setVisible(true);
                jLabelDesc1.setText(" Ingrese solo valores númericos! ");
            }
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public void showIsEmpty(JTextField jTextField) {
        if (jTextField.getText().isEmpty()) {
            jTextField.setBorder(BorderFactory.createLineBorder(new Color(255, 102, 0), 2));
        } else {
            jTextField.setBorder(null);
        }
    }

    public void showIsEmptyJA(JTextArea jTextField) {
        if (jTextField.getText().isEmpty()) {
            jTextField.setBorder(BorderFactory.createLineBorder(new Color(255, 102, 0), 2));
        } else {
            jTextField.setBorder(null);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        showIsEmpty(jTextField1);
        showIsEmpty(jTextField4);
        showIsEmptyJA(jTextArea1);

        Service s = new Service(jFrameMain);
        TypeCRUD tcrud = new TypeCRUD();
        boolean isValid = false;
        if (jTextField2.getText().isEmpty()) {
            new Service(jFrameMain).initNotification("Para continuar, se requiere ingresar el código del producto.", 2);
            isValid = false;
        } else if (jTextField2.getText().length() > 500) {
            new Service(jFrameMain).initNotification("El código del producto excede el límite de caracteres permitido.", 2);
            isValid = false;
        } else if (jTextField4.getText().isEmpty()) {
            new Service(jFrameMain).initNotification("Para continuar, es necesario ingresar el nombre del producto.", 2);
            isValid = false;
        } else if (jTextField4.getText().length() > 500) {
            new Service(jFrameMain).initNotification("El nombre del producto excede el límite de caracteres permitido.", 2);
            isValid = false;
        } else if (jTextField1.getText().isEmpty()) {
            new Service(jFrameMain).initNotification("Para continuar, se requiere ingresar el precio de venta del producto.", 2);
            isValid = false;
        } else if (!getCastBigInteger(s)) {
            isValid = false;
        } else if (jTextArea1.getText().isEmpty()) {
            new Service(jFrameMain).initNotification("Para continuar, es necesario ingresar la descripción del producto.", 2);
            isValid = false;
        } else if (jTextArea1.getText().length() > 500) {
            new Service(jFrameMain).initNotification("La descripción del producto excede el límite de caracteres permitido.", 2);
            isValid = false;
        } 
        else try {
            if (new GarmentCRUD().isExistName(jTextField4.getText().toUpperCase())) {
                new Service(jFrameMain).initNotification("Este nombre del producto ya esta registrado en el sistema, por favor ingrese uno diferente.", 2);
                isValid = false;
            }else {
                isValid = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(JPanelRegisterArticle.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (isValid) {
            try {
                if ((new GarmentCRUD().isExistGarment(jTextField2.getText().toUpperCase())) == false) {
                    JConfirmDialogCreateProduct jcd = null;
                    jcd = new JConfirmDialogCreateProduct(
                            jFrameMain,
                            jFrameMain,
                            new Garment(
                                    jTextField2.getText().toUpperCase(),
                                    jComboBox2.getSelectedItem().toString().toUpperCase(),
                                    jTextField4.getText().toUpperCase(),
                                    jTextArea1.getText().toUpperCase(),
                                    jComboBox1.getSelectedItem().toString().toUpperCase(),
                                    jTextField1.getText()),
                            jpanelMain,
                            this);
                    jcd.setVisible(true);
                } else {
                    s.initNotification("El código de producto ingresado no es válido. Por favor, ingrese un código diferente.", 2);
                }
            } catch (SQLException ex) {
                Logger.getLogger(JPanelRegisterArticle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new Color(68, 95, 59));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(54,125,86));    }//GEN-LAST:event_jButton1MouseExited

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        showIsEmpty(jTextField1);
        showIsEmpty(jTextField2);
        showIsEmpty(jTextField4);
        showIsEmptyJA(jTextArea1);
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        showIsEmpty(jTextField1);
        showIsEmpty(jTextField2);
        showIsEmpty(jTextField4);
        showIsEmptyJA(jTextArea1);
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextArea1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyReleased
        showIsEmpty(jTextField1);
        showIsEmpty(jTextField2);
        showIsEmpty(jTextField4);
        showIsEmptyJA(jTextArea1);
    }//GEN-LAST:event_jTextArea1KeyReleased

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        try {
            jTextField2.setText(String.valueOf(jComboBox2.getSelectedIndex()) + String.valueOf(jComboBox1.getSelectedIndex())
                    + String.valueOf(new GarmentCRUD().getCodNext()));
        } catch (SQLException ex) {
            Logger.getLogger(JPanelRegisterArticle.class.getName()).log(Level.SEVERE, null, ex);
            jTextField2.setText(String.valueOf(jComboBox2.getSelectedIndex()) + String.valueOf(jComboBox1.getSelectedIndex())
                    + String.valueOf(1));
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        try {
            jTextField2.setText(String.valueOf(jComboBox2.getSelectedIndex()) + String.valueOf(jComboBox1.getSelectedIndex())
                    + String.valueOf(new GarmentCRUD().getCodNext()));
        } catch (SQLException ex) {
            Logger.getLogger(JPanelRegisterArticle.class.getName()).log(Level.SEVERE, null, ex);
            jTextField2.setText(String.valueOf(jComboBox2.getSelectedIndex()) + String.valueOf(jComboBox1.getSelectedIndex())
                    + String.valueOf(1));
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    public JLabel getjLabelDesc1() {
        return jLabelDesc1;
    }

    public void setjLabelDesc1(JLabel jLabelDesc1) {
        this.jLabelDesc1 = jLabelDesc1;
    }

    public boolean getCastBigInteger(Service s) {
        try {
            new BigInteger(jTextField1.getText());
            return true;

        } catch (NumberFormatException e) {
            s.initNotification("a", 1);
            return false;
        }
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    public JComboBox<String> getjComboBox2() {
        return jComboBox2;
    }

    public void setjComboBox2(JComboBox<String> jComboBox2) {
        this.jComboBox2 = jComboBox2;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabelCod() {
        return jLabelCod;
    }

    public void setjLabelCod(JLabel jLabelCod) {
        this.jLabelCod = jLabelCod;
    }

    public JLabel getjLabelDesc() {
        return jLabelDesc;
    }

    public void setjLabelDesc(JLabel jLabelDesc) {
        this.jLabelDesc = jLabelDesc;
    }

    public JLabel getjLabelGender() {
        return jLabelGender;
    }

    public void setjLabelGender(JLabel jLabelGender) {
        this.jLabelGender = jLabelGender;
    }

    public JLabel getjLabelPriceSale() {
        return jLabelPriceSale;
    }

    public void setjLabelPriceSale(JLabel jLabelPriceSale) {
        this.jLabelPriceSale = jLabelPriceSale;
    }

    public JLabel getjLabelTittle() {
        return jLabelTittle;
    }

    public void setjLabelTittle(JLabel jLabelTittle) {
        this.jLabelTittle = jLabelTittle;
    }

    public JLabel getjLabelType() {
        return jLabelType;
    }

    public void setjLabelType(JLabel jLabelType) {
        this.jLabelType = jLabelType;
    }

    public JPanel getjPanelBackground() {
        return jPanelBackground;
    }

    public void setjPanelBackground(JPanel jPanelBackground) {
        this.jPanelBackground = jPanelBackground;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    public JTextField getjTextField2() {
        return jTextField2;
    }

    public void setjTextField2(JTextField jTextField2) {
        this.jTextField2 = jTextField2;
    }

    public JTextField getjTextField4() {
        return jTextField4;
    }

    public void setjTextField4(JTextField jTextField4) {
        this.jTextField4 = jTextField4;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JLabel jLabelDesc;
    private javax.swing.JLabel jLabelDesc1;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelPriceSale;
    private javax.swing.JLabel jLabelTittle;
    private javax.swing.JLabel jLabelType;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButtonBack;
    // End of variables declaration//GEN-END:variables
}
