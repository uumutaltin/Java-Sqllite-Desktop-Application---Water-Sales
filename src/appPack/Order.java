

package appPack;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;



public class Order extends javax.swing.JFrame {

    
    
    public Order() {
        initComponents();
        txt_name.setText(Dashboard.name);
        txt_surname.setText(Dashboard.surname);
        txt_address.setText(Dashboard.address);
        txt_name.setEditable(false);
        txt_surname.setEditable(false);
        txt_address.setEditable(false);
        txt_amount.requestFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_surname = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        btn_save_ = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_amount = new javax.swing.JTextField();
        order_ico = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sipariş Ekranı");

        jPanel1.setPreferredSize(new java.awt.Dimension(305, 416));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Adres");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(47, 175, 41, 17);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Soyadı");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(47, 121, 50, 17);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Adı");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(47, 67, 50, 17);
        jPanel1.add(txt_surname);
        txt_surname.setBounds(113, 118, 129, 20);
        jPanel1.add(txt_name);
        txt_name.setBounds(113, 64, 129, 20);
        jPanel1.add(txt_address);
        txt_address.setBounds(113, 172, 129, 20);

        btn_save_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save_icon.png"))); // NOI18N
        btn_save_.setOpaque(false);
        btn_save_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_save_ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_save_);
        btn_save_.setBounds(110, 260, 50, 50);

        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel_icon.png"))); // NOI18N
        btn_cancel.setOpaque(false);
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancel);
        btn_cancel.setBounds(190, 260, 50, 50);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Tutar");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(47, 229, 36, 17);

        txt_amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_amountKeyReleased(evt);
            }
        });
        jPanel1.add(txt_amount);
        txt_amount.setBounds(113, 226, 129, 20);

        order_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/water_4.jpg"))); // NOI18N
        jPanel1.add(order_ico);
        order_ico.setBounds(-6, -6, 310, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_save_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_save_ActionPerformed
        // order Insert 
        String amount = txt_amount.getText().trim();
        
        String order_status = "Hazırlanıyor...";
        if (amount.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Tutarı Giriniz!");
            txt_amount.requestFocus();
        } else if(Utils.checkParseLong(amount)){

            DB db = new DB();
            int status = db.insertOrder(Dashboard.name, Dashboard.surname, order_status, Dashboard.address, amount+" TL");
            db.close();

            if (status > 0) {
                JOptionPane.showMessageDialog(rootPane, "Sipariş Kaydedildi.");
                Dashboard dashboard = new Dashboard();
                dashboard.setVisible(true);
                dispose();

            }
            Dashboard.cid =0;
            Dashboard.name = null;
            Dashboard.surname = null;
            Dashboard.tel = null;
            Dashboard.address = null;

        }else{
            JOptionPane.showMessageDialog(rootPane, "Lütfen sadece bir sayı giriniz!");
            txt_amount.setText("");
            txt_amount.setBackground(Color.yellow);
            txt_amount.requestFocus();
        }


    }//GEN-LAST:event_btn_save_ActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        Dashboard.cid=0;
        Dashboard.name = null;
        Dashboard.surname = null;
        Dashboard.tel = null;
        Dashboard.address = null;
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void txt_amountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_amountKeyReleased
        if(KeyEvent.VK_ENTER == evt.getKeyCode() ){
            btn_save_ActionPerformed(null);
        }
    }//GEN-LAST:event_txt_amountKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutbtn_save_iswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_save_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel order_ico;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables
}
