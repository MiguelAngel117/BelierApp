package views.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.math.BigInteger;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import models.Garment;
import models.GarmentCRUD;
import models.Purchase;
import models.Service;
import views.JFrameMain;
import views.dialogs.JConfirmDialogCreatePurch;

/**
 *
 * @author USER
 */
public class JPanelRegisterBuy extends javax.swing.JPanel {

    private JFrameMain jFrameMain;
    private JPanelMain jPanelMain;

    /**
     * Creates new form JPanelArticle
     */
    public JPanelRegisterBuy(JFrameMain jFrameMain, JPanelMain jPanelMain) {
        this.jFrameMain = jFrameMain;
        this.jPanelMain = jPanelMain;
        initComponents();

        AbstractDocument document = (AbstractDocument) jTextField4.getDocument();
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

        AbstractDocument document1 = (AbstractDocument) jTextField3.getDocument();
        document1.setDocumentFilter(new DocumentFilter() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jToggleButtonBack = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanelBackground.setBackground(new java.awt.Color(244, 225, 208));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(244, 225, 208));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR COMPRA");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Género");
        jLabel2.setPreferredSize(new java.awt.Dimension(78, 32));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Código Artículo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cantidad");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Costo total");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Costo Unitario");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setBorder(BorderFactory.createLineBorder(new Color(255,102,0), 2));
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

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setBorder(BorderFactory.createLineBorder(new Color(255,102,0), 2));
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4.setBorder(BorderFactory.createLineBorder(new Color(255,102,0), 2));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tipo Artículo");

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Código Compra");

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre Artículo");
        jLabel4.setPreferredSize(new java.awt.Dimension(78, 32));

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

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

        jButton1.setBackground(new java.awt.Color(54, 125, 86));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jButton1.setForeground(new java.awt.Color(244, 225, 208));

        jButton1.setText("BUSCAR");

        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(54, 125, 86));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jButton2.setForeground(new java.awt.Color(244, 225, 208));

        jButton2.setText("REGISTRAR");

        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setText("REGISTRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBackgroundLayout.createSequentialGroup()
                            .addComponent(jToggleButtonBack)
                            .addGap(394, 394, 394)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                            .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBackgroundLayout.createSequentialGroup()
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(75, 75, 75)
                            .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    public void showIsEmpty(JTextField jTextField){
        if(jTextField.getText().isEmpty()){
            jTextField.setBorder(BorderFactory.createLineBorder(new Color(255,102,0), 2));
        }
        else{
            jTextField.setBorder(null);
        }
    }
    
    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        calculate();
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        showIsEmpty(jTextField2);
        showIsEmpty(jTextField3);
        showIsEmpty(jTextField4);
        calculate();


    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        calculate();
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    public boolean getCastInteger(Service s) {
        try {
            new BigInteger(jTextField4.getText());
            return true;
        } catch (NumberFormatException e) {
            s.initNotification("¡INGRESE UN VALOR DE UNITARIO QUE SOLO CONTENGA NUMEROS!",1);
            s.initNotification("¡EL VALOR UNITARIO INGRESADO NO ES VÁLIDO!",1);
            return false;
        }
    }

    public boolean getCastBigIntegerCU(Service s) {
        try {
            new BigInteger(jTextField4.getText());

            return true;

        } catch (NumberFormatException e) {
            s.initNotification("Por favor, ingrese solo números positivos en el campo de costo unitario.",1);
            return false;
        }
    }

    public boolean getCastBigIntegerCA(Service s) {
        try {
            new BigInteger(jTextField3.getText());

            return true;

        } catch (NumberFormatException e) {
            s.initNotification("Por favor, ingrese solo números positivos en el campo de cantidad.",1);
            return false;
        }
    }

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        calculate();
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        
        showIsEmpty(jTextField2);
        showIsEmpty(jTextField3);
        showIsEmpty(jTextField4);
        
        calculate();


    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        calculate();
    }//GEN-LAST:event_jTextField3KeyPressed

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
        JPanelBuy jPanelBuy = new JPanelBuy(jFrameMain,jPanelMain);
        jPanelBuy.setLocation(0, 0);
        jPanelBuy.setSize(this.getSize());
        this.removeAll();
        this.add(jPanelBuy, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();

        jPanelMain.initPanel(jPanelBuy);

    }//GEN-LAST:event_jToggleButtonBackActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jTextField2.getText().isEmpty()) {
                new Service(jFrameMain).initNotification("Para continuar, se requiere ingresar el código del producto.",2);
            } else {
                GarmentCRUD gcrud = new GarmentCRUD();
                Service s = new Service();
                Garment garment = null;

                try {
                    if (gcrud.isExistGarmentUpdate(jTextField2.getText().toUpperCase())) {
                        try {
                            garment = gcrud.getGarment(jTextField2.getText().toUpperCase());
                        } catch (SQLException ex) {
                            Logger.getLogger(JPanelReportsUpdateArticles.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        jTextField8.setText(garment.getName());
                        jTextField5.setText(garment.getSex());
                        jTextField7.setText(garment.getNameType());
                        jTextField2.setText(garment.getCod().toUpperCase());
                    } else {
                        new Service(jFrameMain).initNotification("EL CÓDIGO DEL PRODUCTO INGRESADO NO SE ENCUENTRA REGISTRADO EN EL SISTEMA.",2);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(JPanelUpdateArticleByCode.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextField2.getText().isEmpty()) {
            new Service(jFrameMain).initNotification("Para continuar, se requiere ingresar el código del producto.",1);
        } else {
            GarmentCRUD gcrud = new GarmentCRUD();
            Service s = new Service();
            Garment garment = null;

            try {
                if (gcrud.isExistGarmentUpdate(jTextField2.getText().toUpperCase())) {
                    try {
                        garment = gcrud.getGarment(jTextField2.getText().toUpperCase());
                    } catch (SQLException ex) {
                        Logger.getLogger(JPanelReportsUpdateArticles.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jTextField8.setText(garment.getName());
                    jTextField5.setText(garment.getSex());
                    jTextField7.setText(garment.getNameType());
                    jTextField2.setText(garment.getCod().toUpperCase());
                } else {
                    new Service(jFrameMain).initNotification("EL CÓDIGO DEL PRODUCTO INGRESADO NO SE ENCUENTRA REGISTRADO EN EL SISTEMA.",2);
                }
            } catch (SQLException ex) {
                Logger.getLogger(JPanelUpdateArticleByCode.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        GarmentCRUD gcrud = new GarmentCRUD();
        Service s = new Service(jFrameMain);
        boolean isValid = false;

        if (jTextField2.getText().isEmpty()) {
            s.initNotification("Para continuar, es necesario ingresar el código del producto.",2);
            isValid = false;
        } else if (jTextField4.getText().isEmpty()) {
            s.initNotification("Para continuar, es necesario ingresar el costo unitario de compra del producto.",2);
            isValid = false;
        } else if (!getCastBigIntegerCU(s)) {
            isValid = false;
        } else if (jTextField3.getText().isEmpty()) {
            s.initNotification("Para continuar, es necesario ingresar la cantidad de compra del producto.",2);
            isValid = false;
        } else if (!getCastBigIntegerCA(s)) {
            isValid = false;
        } else try {
            if (!gcrud.isExistGarmentUpdate(jTextField2.getText())) {
                isValid = false;
                s.initNotification("EL CÓDIGO DEL PRODUCTO INGRESADO NO SE ENCUENTRA REGISTRADO EN EL SISTEMA.",2);
            } else {
                isValid = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(JPanelUpdateArticle.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (isValid) {
            JConfirmDialogCreatePurch jcdcp = new JConfirmDialogCreatePurch(jFrameMain,jFrameMain,
                    true,
                    new Purchase(
                    jTextField2.getText(),
                    jTextField4.getText(),
                    jTextField3.getText(),
                    jTextField1.getText()), this);
            jcdcp.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        showIsEmpty(jTextField2);
        showIsEmpty(jTextField3);
        showIsEmpty(jTextField4);
    }//GEN-LAST:event_jTextField2KeyReleased

    public void calculate() {
        try {
            if (!jTextField4.getText().isEmpty() && !jTextField3.getText().isEmpty()) {
                jTextField1.setText(String.valueOf((new BigInteger(jTextField4.getText())).multiply(new BigInteger(jTextField3.getText()))));
            }
        } catch (NumberFormatException ex) {
        }
    }

    public boolean getCastInt(Service s) {
        try {
            Integer.parseInt(jTextField2.getText());
            return true;
        } catch (NumberFormatException ex) {
            s.initNotification("¡INGRESE UN ID QUE SOLO CONTENGA NUMEROS!",2);
            s.initNotification("¡EL ID INGRESADO NO ES VÁLIDO!",2);
            return false;
        }
    }

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

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JPanel getjPanelBackground() {
        return jPanelBackground;
    }

    public void setjPanelBackground(JPanel jPanelBackground) {
        this.jPanelBackground = jPanelBackground;
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

    public JTextField getjTextField5() {
        return jTextField5;
    }

    public void setjTextField5(JTextField jTextField5) {
        this.jTextField5 = jTextField5;
    }

    public JTextField getjTextField6() {
        return jTextField6;
    }

    public void setjTextField6(JTextField jTextField6) {
        this.jTextField6 = jTextField6;
    }

    public JTextField getjTextField7() {
        return jTextField7;
    }

    public void setjTextField7(JTextField jTextField7) {
        this.jTextField7 = jTextField7;
    }

    public JTextField getjTextField8() {
        return jTextField8;
    }

    public void setjTextField8(JTextField jTextField8) {
        this.jTextField8 = jTextField8;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JToggleButton jToggleButtonBack;
    // End of variables declaration//GEN-END:variables
}
