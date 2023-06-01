package views.panels;

import java.awt.Color;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import models.Garment;
import models.GarmentCRUD;
import models.Sale;
import models.SaleCRUD;
import models.Type;
import models.TypeCRUD;
import views.JFrameMain;

/**
 *
 * @author USER
 */
public class JPanelSale extends javax.swing.JPanel {
    
    private JFrameMain jFrameMain;
    /**
     * Creates new form JPanelArticle
     */
    public JPanelSale(JFrameMain jFrameMain, JPanelMain jPanelMain) {
        this.jFrameMain = jFrameMain;
        this.jPanelMain = jPanelMain;
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

        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButtonRegister = new javax.swing.JToggleButton();
        jToggleButtonUpdate = new javax.swing.JToggleButton();
        jPanelBackground = new javax.swing.JPanel();
        jLabelTittle = new javax.swing.JLabel();
        jToggleButtonRegister1 = new javax.swing.JToggleButton();
        jToggleButtonUpdate1 = new javax.swing.JToggleButton();

        jToggleButton4.setText("Registrar");

        jToggleButtonRegister.setBackground(new java.awt.Color(255, 51, 0));
        jToggleButtonRegister.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jToggleButtonRegister.setForeground(new java.awt.Color(244, 225, 208));
        jToggleButtonRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ADD_PRODUCT - copiaa.png"))); // NOI18N
        jToggleButtonRegister.setText(" REGISTRAR ");
        jToggleButtonRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jToggleButtonRegisterjButtonRegisterEvenListenerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jToggleButtonRegisterjButtonRegisterEvenListenerMouseExited(evt);
            }
        });
        jToggleButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonRegisterActionPerformed(evt);
            }
        });

        jToggleButtonUpdate.setBackground(new java.awt.Color(54, 125, 86));
        jToggleButtonUpdate.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jToggleButtonUpdate.setForeground(new java.awt.Color(244, 225, 208));
        jToggleButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descarga.png"))); // NOI18N
        jToggleButtonUpdate.setText(" ACTUALIZAR ");
        jToggleButtonUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jToggleButtonUpdatejButtonUpdateEvenListenerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jToggleButtonUpdatejButtonUpdateMouseExited(evt);
            }
        });
        jToggleButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonUpdateActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(255, 255, 255));

        jPanelBackground.setBackground(new java.awt.Color(244, 225, 208));

        jLabelTittle.setBackground(new java.awt.Color(51, 51, 51));
        jLabelTittle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelTittle.setForeground(new java.awt.Color(244, 225, 208));
        jLabelTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTittle.setText("GESTOR DE VENTAS");
        jLabelTittle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelTittle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelTittle.setOpaque(true);

        jToggleButtonRegister1.setBackground(new java.awt.Color(255, 51, 0));
        jToggleButtonRegister1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jToggleButtonRegister1.setForeground(new java.awt.Color(244, 225, 208));
        jToggleButtonRegister1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descarga (1).png"))); // NOI18N
        jToggleButtonRegister1.setText(" REGISTRAR ");
        jToggleButtonRegister1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonRegister1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jToggleButtonRegister1jButtonRegisterEvenListenerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jToggleButtonRegister1jButtonRegisterEvenListenerMouseExited(evt);
            }
        });
        jToggleButtonRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonRegister1ActionPerformed(evt);
            }
        });

        jToggleButtonUpdate1.setBackground(new java.awt.Color(54, 125, 86));
        jToggleButtonUpdate1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jToggleButtonUpdate1.setForeground(new java.awt.Color(244, 225, 208));
        jToggleButtonUpdate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descarga (2).png"))); // NOI18N
        jToggleButtonUpdate1.setText("REEMBOLSAR");
        jToggleButtonUpdate1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonUpdate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jToggleButtonUpdate1jButtonUpdateEvenListenerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jToggleButtonUpdate1jButtonUpdateMouseExited(evt);
            }
        });
        jToggleButtonUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonUpdate1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jToggleButtonRegister1)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButtonUpdate1)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabelTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonRegister1)
                    .addComponent(jToggleButtonUpdate1))
                .addContainerGap(25, Short.MAX_VALUE))
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

    private void jToggleButtonRegisterjButtonRegisterEvenListenerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonRegisterjButtonRegisterEvenListenerMouseEntered
        jToggleButtonRegister.setBackground(new Color(175,51,0));
    }//GEN-LAST:event_jToggleButtonRegisterjButtonRegisterEvenListenerMouseEntered

    private void jToggleButtonRegisterjButtonRegisterEvenListenerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonRegisterjButtonRegisterEvenListenerMouseExited
        jToggleButtonRegister.setBackground(new Color(255,51,0));
    }//GEN-LAST:event_jToggleButtonRegisterjButtonRegisterEvenListenerMouseExited

    private void jToggleButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonRegisterActionPerformed
        
    }//GEN-LAST:event_jToggleButtonRegisterActionPerformed

    private void jToggleButtonUpdatejButtonUpdateEvenListenerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonUpdatejButtonUpdateEvenListenerMouseEntered
        jToggleButtonUpdate.setBackground(new Color(68,95,59));
    }//GEN-LAST:event_jToggleButtonUpdatejButtonUpdateEvenListenerMouseEntered

    private void jToggleButtonUpdatejButtonUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonUpdatejButtonUpdateMouseExited
        jToggleButtonUpdate.setBackground(new Color(54,125,86));
    }//GEN-LAST:event_jToggleButtonUpdatejButtonUpdateMouseExited

    private void jToggleButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonUpdateActionPerformed
        
    }//GEN-LAST:event_jToggleButtonUpdateActionPerformed

    private void jToggleButtonRegister1jButtonRegisterEvenListenerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonRegister1jButtonRegisterEvenListenerMouseEntered
        jToggleButtonRegister1.setBackground(new Color(175,51,0));
    }//GEN-LAST:event_jToggleButtonRegister1jButtonRegisterEvenListenerMouseEntered

    private void jToggleButtonRegister1jButtonRegisterEvenListenerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonRegister1jButtonRegisterEvenListenerMouseExited
        jToggleButtonRegister1.setBackground(new Color(255,51,0));
    }//GEN-LAST:event_jToggleButtonRegister1jButtonRegisterEvenListenerMouseExited

    private void jToggleButtonRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonRegister1ActionPerformed
        
        JPanelRegisterSale jprs = new JPanelRegisterSale(jFrameMain,jPanelMain);
        jPanelMain.initPanel(jprs);
        try {
            jprs.getjTextField6().setText(String.valueOf(new SaleCRUD().getNextId()));
        } catch (SQLException ex) {
            Logger.getLogger(JPanelSale.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jToggleButtonRegister1ActionPerformed

    private void jToggleButtonUpdate1jButtonUpdateEvenListenerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonUpdate1jButtonUpdateEvenListenerMouseEntered
        jToggleButtonUpdate1.setBackground(new Color(68,95,59));
    }//GEN-LAST:event_jToggleButtonUpdate1jButtonUpdateEvenListenerMouseEntered

    private void jToggleButtonUpdate1jButtonUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonUpdate1jButtonUpdateMouseExited
        jToggleButtonUpdate1.setBackground(new Color(54,125,86));
    }//GEN-LAST:event_jToggleButtonUpdate1jButtonUpdateMouseExited
    public String formatPesos(String num){
        DecimalFormat formatoPesos = new DecimalFormat("$###,###");
        return formatoPesos.format(Double.parseDouble(num));
    }
    private void jToggleButtonUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonUpdate1ActionPerformed
        JPanelReportUpdateSale jpus = new JPanelReportUpdateSale(jFrameMain,jPanelMain);
        jPanelMain.initPanel(jpus);
        
        ArrayList<Sale> sales = new ArrayList<>();
        try {
            sales = new SaleCRUD().getSales();
        } catch (SQLException ex) {
            Logger.getLogger(JPanelReports.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultTableModel defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        defaultTableModel.addColumn("CODIGO");
        defaultTableModel.addColumn("PRODUCTO");
        defaultTableModel.addColumn("FECHA");
        defaultTableModel.addColumn("PRECIO UNITARIO");
        defaultTableModel.addColumn("CANTIDAD");
        defaultTableModel.addColumn("PRECIO TOTAL");
        defaultTableModel.addColumn("COMENTARIOS");

        for (Sale sale : sales) {
            Object[] row = new Object[7];
            row[0] = sale.getId();
            row[1] = sale.getGarments();
            row[2] = sale.getDateTime();
            row[3] = formatPesos(sale.getUnitPrice());
            row[4] = sale.getQuantity();
            row[5] = formatPesos(sale.getTotal());
            row[6] = sale.getComentaries();
            defaultTableModel.addRow(row);
        }
        
        jpus.getjTable1().setModel(defaultTableModel);
    }//GEN-LAST:event_jToggleButtonUpdate1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelTittle;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButtonRegister;
    private javax.swing.JToggleButton jToggleButtonRegister1;
    private javax.swing.JToggleButton jToggleButtonUpdate;
    private javax.swing.JToggleButton jToggleButtonUpdate1;
    // End of variables declaration//GEN-END:variables
    private JPanelMain jPanelMain;
}
