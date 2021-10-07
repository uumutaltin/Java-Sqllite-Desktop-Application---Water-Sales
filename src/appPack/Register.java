package appPack;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();

        txt_name.setText(Dashboard.name);
        txt_surname.setText(Dashboard.surname);
        txt_tel.setText(Dashboard.tel);
        txt_address.setText(Dashboard.address);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_tel = new javax.swing.JTextField();
        txt_surname = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        btn_save_ = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kayıt Ekranı");
        setPreferredSize(new java.awt.Dimension(300, 420));
        setResizable(false);

        jPanel1.setLayout(null);

        txt_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nameKeyReleased(evt);
            }
        });
        jPanel1.add(txt_name);
        txt_name.setBounds(113, 64, 129, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Soyadı");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(47, 121, 60, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Telefon");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(47, 175, 70, 17);

        lbl_name.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_name.setForeground(java.awt.Color.white);
        lbl_name.setText("Adı");
        jPanel1.add(lbl_name);
        lbl_name.setBounds(47, 67, 60, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Adres");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(47, 229, 60, 17);

        txt_tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_telKeyReleased(evt);
            }
        });
        jPanel1.add(txt_tel);
        txt_tel.setBounds(113, 172, 129, 20);

        txt_surname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_surnameKeyReleased(evt);
            }
        });
        jPanel1.add(txt_surname);
        txt_surname.setBounds(113, 118, 129, 20);

        txt_address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_addressKeyReleased(evt);
            }
        });
        jPanel1.add(txt_address);
        txt_address.setBounds(113, 226, 129, 20);

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

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/water_4.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(-6, -6, 310, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_save_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_save_ActionPerformed

        String name = txt_name.getText().trim();
        String surname = txt_surname.getText().trim();
        String tel = txt_tel.getText().trim();
        String address = txt_address.getText().trim();

        if (name.equals("") || surname.equals("") || tel.equals("") || address.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Tüm Alanları Doldurunuz!");
            txt_name.requestFocus();
        }
        if (Utils.isValidPhone(tel)) {
            // Customer Update
            if (Dashboard.cid > 0) {

                DB db = new DB();
                int status = db.updateCustomer(name, surname, tel, address, Dashboard.cid);
                db.close();

                if (status > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Güncelleme Başarılı");
                    Dashboard dashboard = new Dashboard();
                    dashboard.setVisible(true);

                    dispose();

                }
                if (status == -1) {
                    JOptionPane.showMessageDialog(rootPane, "Daha önceden bu telefon numarası ile kayıt alınmıştır!");
                    txt_tel.setText("");
                    txt_tel.requestFocus();

                }
                Dashboard.cid = 0;
                Dashboard.name = null;
                Dashboard.surname = null;
                Dashboard.tel = null;
                Dashboard.address = null;

            } // Customer Register
            else {
                txt_name.setText("");
                txt_surname.setText("");
                txt_tel.setText("");
                txt_address.setText("");
                DB db = new DB();
                int status = db.registerCustomer(name, surname, tel, address);
                db.close();

                if (status > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Kayıt Başarılı");
                    Dashboard dashboard = new Dashboard();
                    dashboard.setVisible(true);
                    dispose();

                }
                if (status == -1) {
                    JOptionPane.showMessageDialog(rootPane, "Daha önceden bu telefon numarası ile kayıt alınmıştır!");
                    txt_tel.setText("");
                    txt_tel.requestFocus();

                }
                Dashboard.name = null;
                Dashboard.surname = null;
                Dashboard.tel = null;
                Dashboard.address = null;

            }
        }else{
            
            JOptionPane.showMessageDialog(rootPane, "Gerçerli bir telefon numarası girin!\nÖr: (5xx)-(xxx)-(xx)-(xx)");
            txt_tel.setText("");
            txt_tel.setBackground(Color.yellow);
            txt_tel.requestFocus();
            
        }


    }//GEN-LAST:event_btn_save_ActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
        Dashboard.name = null;
        Dashboard.surname = null;
        Dashboard.tel = null;
        Dashboard.address = null;
        dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void txt_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyReleased
        if(KeyEvent.VK_ENTER == evt.getKeyCode() ){
            txt_surname.requestFocus();
        }
    }//GEN-LAST:event_txt_nameKeyReleased

    private void txt_surnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_surnameKeyReleased
        if(KeyEvent.VK_ENTER == evt.getKeyCode() ){
            txt_tel.requestFocus();
        }
    }//GEN-LAST:event_txt_surnameKeyReleased

    private void txt_telKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telKeyReleased
        if(KeyEvent.VK_ENTER == evt.getKeyCode() ){
            txt_address.requestFocus();
        }
    }//GEN-LAST:event_txt_telKeyReleased

    private void txt_addressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_addressKeyReleased
        if(KeyEvent.VK_ENTER == evt.getKeyCode() ){
            btn_save_ActionPerformed(null);
        }
    }//GEN-LAST:event_txt_addressKeyReleased

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_save_;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_surname;
    private javax.swing.JTextField txt_tel;
    // End of variables declaration//GEN-END:variables
}
