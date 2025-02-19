package views.popup.order;

import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import models.FoodItem;
import models.OrderItem;
import utils.ImageManager;

/**
 *
 * @author Tran Thanh The
 */
public class OrderItemPane extends javax.swing.JPanel {

    OrderItem orderItem;
    ImageManager im = new ImageManager();
    DecimalFormat formatter = new DecimalFormat("###,###,###");

    public OrderItemPane(OrderItem o) {
        initComponents();
        btnMinus.putClientProperty("JButton.buttonType", "roundRect");
        btnPlus.putClientProperty("JButton.buttonType", "roundRect");
        this.orderItem = o;
        render();
    }

    public void render() {
        FoodItem food = orderItem.getFoodItem(), topping = orderItem.getToppingItem();
        spnQuantity.setValue(orderItem.getQuantity());
        lbFoodName.setText(food.getName());
        if (food.getIdCategory() != 2) {
            lbToppingName.setText("");
        } else if (topping == null) {
            lbToppingName.setText("");
        } else {
            lbToppingName.setText(topping.getName());
        }
        lbPrice.setText(orderItem.getFoodPrice() + orderItem.getToppingPrice() + "");
        String urlImage = orderItem.getFoodItem().getUrlImage();
        if (urlImage != null && !urlImage.isEmpty()) {
            ImageIcon ic = im.getImage(urlImage);
            lbIcon.setIcon(im.resizeIcon(ic, 75, 75));
        }
    }

    public JSpinner getSpnQuantity() {
        return spnQuantity;
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        lbIcon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnMinus = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        spnQuantity = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        lbFoodName = new javax.swing.JLabel();
        lbToppingName = new javax.swing.JLabel();
        lbPrice = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(75, 75));

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new_75px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(125, 75));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        btnMinus.setText("-");
        btnMinus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinus.setFocusable(false);
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.1;
        jPanel2.add(btnMinus, gridBagConstraints);

        btnPlus.setText("+");
        btnPlus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlus.setFocusable(false);
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.1;
        jPanel2.add(btnPlus, gridBagConstraints);

        spnQuantity.setPreferredSize(new java.awt.Dimension(50, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        jPanel2.add(spnQuantity, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 75));

        lbFoodName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbFoodName.setText("Trà Sữa Trân Châu Khổng Lồ");

        lbToppingName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbToppingName.setForeground(new java.awt.Color(153, 153, 153));
        lbToppingName.setText("No Topping");

        lbPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbPrice.setText("20,000");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("VND");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbFoodName)
                        .addGap(0, 88, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbToppingName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFoodName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbToppingName)
                    .addComponent(lbPrice)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        int quantity = (int) spnQuantity.getValue();
        spnQuantity.setValue(Math.max(0, quantity - 1));
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        int quantity = (int) spnQuantity.getValue();
        spnQuantity.setValue(quantity + 1);
    }//GEN-LAST:event_btnPlusActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnPlus;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbFoodName;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbToppingName;
    private javax.swing.JSpinner spnQuantity;
    // End of variables declaration//GEN-END:variables

}
