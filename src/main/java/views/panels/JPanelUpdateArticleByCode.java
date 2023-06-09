/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.math.BigInteger;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import models.Garment;
import models.GarmentCRUD;
import models.Service;
import models.Type;
import models.TypeCRUD;
import views.JFrameMain;
import views.dialogs.JConfirmDialogDeleteProductByCode;
import views.dialogs.JConfirmDialogUpdateProductByCode;

/**
 *
 * @author USER
 */
public class JPanelUpdateArticleByCode extends javax.swing.JPanel {

    private JFrameMain jFrameMain;
    private final JPanelMain jpanelMain;
    private ArrayList<Garment> garments;

    /**
     * Creates new form JPanelArticle
     */
    public JPanelUpdateArticleByCode(JFrameMain jFrameMain, JPanelMain jpanelMain) throws SQLException {
        this.jFrameMain = jFrameMain;
        this.jpanelMain = jpanelMain;
        initComponents();

        AbstractDocument document = (AbstractDocument) jTextField1.getDocument();
        document.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr)
                    throws BadLocationException {
                if (string.matches("\\d+")) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {
                if (text.matches("\\d+")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        garments = new GarmentCRUD().getGarments();
        for (int i = 0; i < garments.size(); i++) {
            model.addElement(garments.get(i).getName());
        }

        jComboBox3.setModel(model);
        jComboBox3.setSelectedIndex(0);

        jTextField4.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filterOptions();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filterOptions();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filterOptions();
            }

            private void filterOptions() {
                String filterText = jTextField4.getText().toUpperCase();
                DefaultComboBoxModel<String> filteredModel = new DefaultComboBoxModel<>();

                for (int i = 0; i < model.getSize(); i++) {
                    String item = model.getElementAt(i);
                    if (item.toUpperCase().contains(filterText)) {
                        filteredModel.addElement(item);
                    }
                }

                jComboBox3.setModel(filteredModel);
                if (filteredModel.getElementAt(0) != null) {
                    jComboBox3.setSelectedIndex(0);
                    jComboBox3.setPopupVisible(true);
                }

            }
        });
    }

    public ArrayList<Garment> getGarments() {
        return garments;
    }

    public void setGarments(ArrayList<Garment> garments) {
        this.garments = garments;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jToggleButtonBack = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanelBackground.setBackground(new java.awt.Color(244, 225, 208));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(244, 225, 208));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MODIFICAR PRODUCTO");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Género");
        jLabel2.setPreferredSize(new java.awt.Dimension(78, 32));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Código Producto");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Descripción");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Precio de Venta");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Precio de Compra");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
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

        jButton2.setBackground(new java.awt.Color(153, 0, 0));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jButton2.setForeground(new java.awt.Color(255, 255, 255));

        jButton2.setText("ELIMINAR");

        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setText("ELIMINAR");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
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

        jButton3.setBackground(new java.awt.Color(54, 125, 86));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jButton3.setForeground(new java.awt.Color(244, 225, 208));

        jButton3.setText("ACTUALIZAR");

        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setText("ACTUALIZAR");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButtonBack)
                    .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                            .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(75, 75, 75)
                            .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField3)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(120, Short.MAX_VALUE))
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

    public boolean getCastBigInteger(Service s) {
        try {
            new BigInteger(jTextField1.getText());

            return true;

        } catch (NumberFormatException e) {
            s.initNotification("Por favor, ingrese solo números positivos en el campo de valor de venta.", 2);
            return false;
        }
    }

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

        jpanelMain.initPanel(jPanelArticle);

    }//GEN-LAST:event_jToggleButtonBackActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        showIsEmpty(jTextField1);
        showIsEmpty(jTextField4);
        showIsEmptyJA(jTextArea1);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTextField2.getText().isEmpty()) {
            new Service(jFrameMain).initNotification("Para continuar, se requiere ingresar el código del producto.", 2);
        } else {
            try {
                if (new GarmentCRUD().isExistGarmentUpdate(jTextField2.getText().toUpperCase())) {
                    if (new GarmentCRUD().isExistProductInPurchases(jTextField2.getText().toUpperCase())
                            && new GarmentCRUD().isExistProductInSales(jTextField2.getText().toUpperCase())) {
                        JConfirmDialogDeleteProductByCode jcdug = null;
                        jcdug = new JConfirmDialogDeleteProductByCode(
                                jFrameMain,
                                jFrameMain, true,
                                jTextField2.getText().toUpperCase(), jpanelMain, this);
                        jcdug.setVisible(true);
                    }
                    if (!new GarmentCRUD().isExistProductInPurchases(jTextField2.getText().toUpperCase())) {
                        new Service(jFrameMain).initNotification("No es posible eliminar este producto debido a que se han registrado compras relacionadas con el mismo.", 2);
                    }
                    if (!new GarmentCRUD().isExistProductInSales(jTextField2.getText().toUpperCase())) {
                        new Service(jFrameMain).initNotification("No es posible eliminar este producto debido a que se han registrado ventas relacionadas con el mismo.", 2);
                    }
                } else {
                    new Service(jFrameMain).initNotification("EL CÓDIGO DEL PRODUCTO INGRESADO NO SE ENCUENTRA REGISTRADO EN EL SISTEMA.", 2);
                }
            } catch (SQLException ex) {
                Logger.getLogger(JPanelUpdateArticleByCode.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new Color(100, 0, 0));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new Color(153, 0, 0));
    }//GEN-LAST:event_jButton2MouseExited

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jTextField2.getText().isEmpty()) {
                new Service(jFrameMain).initNotification("Para continuar, se requiere ingresar el código del producto.", 2);
            } else {
                TypeCRUD tcrud = new TypeCRUD();
                ArrayList<Type> types = new ArrayList<>();

                GarmentCRUD gcrud = new GarmentCRUD();
                Service s = new Service(jFrameMain);
                Garment garment = null;

                try {
                    if (gcrud.isExistGarmentUpdate(jTextField2.getText().toUpperCase())) {
                        try {
                            types = tcrud.getTypes();
                        } catch (SQLException ex) {
                            Logger.getLogger(JPanelArticle.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        for (int i = 0; i < types.size(); i++) {
                        }

                        try {
                            garment = gcrud.getGarment(jTextField2.getText().toUpperCase());
                        } catch (SQLException ex) {
                            Logger.getLogger(JPanelReportsUpdateArticles.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        jTextField2.setText(garment.getCod());
                        jTextField4.setText(garment.getName());
                        jTextField3.setText(garment.getPricePurchase());
                        jTextField1.setText(garment.getPriceSale());
                        jTextArea1.setText(garment.getDescription());
                        jTextArea1.setLineWrap(true);
                        jTextArea1.setWrapStyleWord(true);
                    } else {
                        new Service(jFrameMain).initNotification("EL CÓDIGO DEL PRODUCTO INGRESADO NO SE ENCUENTRA REGISTRADO EN EL SISTEMA.", 2);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(JPanelUpdateArticleByCode.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Service s = new Service(jFrameMain);
        TypeCRUD tcrud = new TypeCRUD();
        boolean isValid = false;
        if (jTextField2.getText().isEmpty()) {
            s.initNotification("Para continuar, se requiere ingresar el código del producto.", 2);
            isValid = false;
        } else if (jTextField2.getText().length() > 500) {
            s.initNotification("El código del producto excede el límite de caracteres permitido.", 2);
            isValid = false;
        } else if (jTextField1.getText().isEmpty()) {
            s.initNotification("Para continuar, se requiere ingresar el precio de venta del producto.", 2);
            isValid = false;
        } else if (!getCastBigInteger(s)) {
            isValid = false;
        } else if (jTextArea1.getText().isEmpty()) {
            s.initNotification("Para continuar, es necesario ingresar la descripción del producto.", 2);
            isValid = false;
        } else if (jTextArea1.getText().length() > 500) {
            s.initNotification("La descripción del producto excede el límite de caracteres permitido.", 2);
            isValid = false;
        } else try {
            if (!(new GarmentCRUD().isExistGarment(jTextField2.getText().toUpperCase()))) {
                isValid = false;
                s.initNotification("EL CÓDIGO DEL PRODUCTO INGRESADO NO SE ENCUENTRA REGISTRADO EN EL SISTEMA.", 2);
            } else {
                isValid = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(JPanelUpdateArticleByCode.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (isValid) {
            JConfirmDialogUpdateProductByCode jcd = null;
            jcd = new JConfirmDialogUpdateProductByCode(jFrameMain, jFrameMain, true,
                    new Garment(
                            jTextField2.getText().toUpperCase(),
                            jTextField5.getText().toUpperCase(),
                            jComboBox3.getSelectedItem().toString(),
                            jTextArea1.getText().toUpperCase(),
                            jTextField6.getText().toUpperCase(),
                            jTextField1.getText()), this);
            jcd.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public JTextField getjTextField5() {
        return jTextField5;
    }

    public JTextField getjTextField6() {
        return jTextField6;
    }

    public JComboBox<String> getjComboBox3() {
        return jComboBox3;
    }

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setBackground(new Color(68, 95, 59));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBackground(new Color(54, 125, 86));
    }//GEN-LAST:event_jButton3MouseExited

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        showIsEmpty(jTextField1);
        showIsEmpty(jTextField4);
        showIsEmptyJA(jTextArea1);
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        showIsEmpty(jTextField1);
        showIsEmpty(jTextField4);
        showIsEmptyJA(jTextArea1);
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextArea1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyReleased
        showIsEmpty(jTextField1);
        showIsEmpty(jTextField4);
        showIsEmptyJA(jTextArea1);
    }//GEN-LAST:event_jTextArea1KeyReleased

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        if (jComboBox3.getSelectedItem() != null) {
            for (int i = 0; i < garments.size(); i++) {
                if (jComboBox3.getSelectedItem().toString().equals(garments.get(i).getName())) {
                    Garment get = garments.get(i);
                    jTextField2.setText(get.getCod());
                    jTextField5.setText(get.getNameType());
                    jTextField6.setText(get.getSex());
                    jTextField3.setText(get.getPricePurchase());
                    jTextField1.setText(get.getPriceSale());
                    jTextArea1.setText(get.getDescription());
                    jTextArea1.setLineWrap(true);
                    jTextArea1.setWrapStyleWord(true);
                }
            }
        }
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        if (jComboBox3.getSelectedItem() != null) {
            for (int i = 0; i < garments.size(); i++) {
                if (jComboBox3.getSelectedItem().toString().equals(garments.get(i).getName())) {
                    Garment get = garments.get(i);
                    jTextField2.setText(get.getCod());
                    jTextField5.setText(get.getNameType());
                    jTextField6.setText(get.getSex());
                    jTextField3.setText(get.getPricePurchase());
                    jTextField1.setText(get.getPriceSale());
                    jTextArea1.setText(get.getDescription());
                    jTextArea1.setLineWrap(true);
                    jTextArea1.setWrapStyleWord(true);
                }
            }
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
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

    public JTextField getjTextField3() {
        return jTextField3;
    }

    public void setjTextField3(JTextField jTextField3) {
        this.jTextField3 = jTextField3;
    }

    public JTextField getjTextField4() {
        return jTextField4;
    }

    public void setjTextField4(JTextField jTextField4) {
        this.jTextField4 = jTextField4;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JToggleButton jToggleButtonBack;
    // End of variables declaration//GEN-END:variables
}
