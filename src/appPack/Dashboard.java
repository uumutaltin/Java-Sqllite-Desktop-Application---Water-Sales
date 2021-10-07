package appPack;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        refreshCustomers();
        refreshOrders();

    }
    //customers
    static int cid = 0;
    static String name = null;
    static String surname = null;
    static String tel = null;
    static String address = null;

    //orders
    int oid = 0;
    

    private void refreshCustomers() {
        DB db = new DB();
        tbl_cus.setModel(db.allCustomer());
        db.close();
    }

    private void refreshOrders() {
        DB db = new DB();
        tbl_orders.setModel(db.allOrders());
        db.close();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_cus = new javax.swing.JTable();
        btn_add_customer_ = new javax.swing.JButton();
        btn_edit_customer_ = new javax.swing.JButton();
        btn_delete_customer_ = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_orders = new javax.swing.JTable();
        btn_new_order_ = new javax.swing.JButton();
        btn_delivering_ = new javax.swing.JButton();
        btn_delivered_ = new javax.swing.JButton();
        btn_refresh_orders_ = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_delete_selected_order_ = new javax.swing.JButton();
        btn_delete_all = new javax.swing.JButton();
        btn_todays_orders_ = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_cus_name = new javax.swing.JTextField();
        txt_cus_surname = new javax.swing.JTextField();
        btn_search_ = new javax.swing.JButton();
        btn_refresh_customers_ = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Su Satış Otomasyonu ");
        setPreferredSize(new java.awt.Dimension(880, 373));
        setResizable(false);

        jPanel4.setPreferredSize(new java.awt.Dimension(880, 373));
        jPanel4.setLayout(null);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteriler"));
        jPanel5.setOpaque(false);

        tbl_cus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_cus.setOpaque(false);
        tbl_cus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_cusMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_cus);

        btn_add_customer_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_icon.png"))); // NOI18N
        btn_add_customer_.setOpaque(false);
        btn_add_customer_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_customer_ActionPerformed(evt);
            }
        });

        btn_edit_customer_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit_icon.png"))); // NOI18N
        btn_edit_customer_.setOpaque(false);
        btn_edit_customer_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_customer_ActionPerformed(evt);
            }
        });

        btn_delete_customer_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        btn_delete_customer_.setOpaque(false);
        btn_delete_customer_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_customer_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_add_customer_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_edit_customer_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_delete_customer_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_edit_customer_, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add_customer_, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete_customer_, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5);
        jPanel5.setBounds(10, 97, 444, 240);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Siparişler"));
        jPanel3.setOpaque(false);

        tbl_orders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_orders.setOpaque(false);
        tbl_orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_ordersMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_orders);

        btn_new_order_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/_new_order_icon.png"))); // NOI18N
        btn_new_order_.setText("Yeni Sipariş");
        btn_new_order_.setOpaque(false);
        btn_new_order_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_order_ActionPerformed(evt);
            }
        });

        btn_delivering_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/_transport_icon.png"))); // NOI18N
        btn_delivering_.setText("Yola Çıktı");
        btn_delivering_.setOpaque(false);
        btn_delivering_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delivering_ActionPerformed(evt);
            }
        });

        btn_delivered_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/_delivered_icon.png"))); // NOI18N
        btn_delivered_.setText("Teslim Edildi");
        btn_delivered_.setOpaque(false);
        btn_delivered_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delivered_ActionPerformed(evt);
            }
        });

        btn_refresh_orders_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/_refresh_icon.png"))); // NOI18N
        btn_refresh_orders_.setOpaque(false);
        btn_refresh_orders_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refresh_orders_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_new_order_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_delivering_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_delivered_))
                    .addComponent(btn_refresh_orders_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_delivered_, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_new_order_, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_delivering_)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_refresh_orders_, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.add(jPanel3);
        jPanel3.setBounds(472, 97, 390, 240);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tablo İşlemleri"));
        jPanel2.setOpaque(false);

        btn_delete_selected_order_.setText("Seçili Olanı Sil");
        btn_delete_selected_order_.setOpaque(false);
        btn_delete_selected_order_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_selected_order_ActionPerformed(evt);
            }
        });

        btn_delete_all.setText("Tümünü Sil");
        btn_delete_all.setOpaque(false);
        btn_delete_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_allActionPerformed(evt);
            }
        });

        btn_todays_orders_.setText("Bu Günün Siparişi");
        btn_todays_orders_.setOpaque(false);
        btn_todays_orders_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_todays_orders_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_delete_selected_order_, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_delete_all, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_todays_orders_)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_delete_selected_order_)
                    .addComponent(btn_delete_all)
                    .addComponent(btn_todays_orders_))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel2);
        jPanel2.setBounds(472, 11, 390, 80);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Arama"));
        jPanel1.setOpaque(false);

        jLabel1.setText("Müşteri Adı");

        jLabel2.setText("Müşteri Soyadı");

        txt_cus_surname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cus_surnameKeyReleased(evt);
            }
        });

        btn_search_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/_search_icon.png"))); // NOI18N
        btn_search_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_ActionPerformed(evt);
            }
        });

        btn_refresh_customers_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/_refresh_icon.png"))); // NOI18N
        btn_refresh_customers_.setOpaque(false);
        btn_refresh_customers_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refresh_customers_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_cus_name, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_cus_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(btn_search_)
                .addGap(18, 18, 18)
                .addComponent(btn_refresh_customers_)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cus_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cus_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_search_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_refresh_customers_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.add(jPanel1);
        jPanel1.setBounds(10, 11, 444, 78);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dashboard_ico.jpg"))); // NOI18N
        jPanel4.add(jLabel4);
        jLabel4.setBounds(0, -30, 880, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_add_customer_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_customer_ActionPerformed
        Register register = new Register();
        register.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_add_customer_ActionPerformed

    private void tbl_cusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_cusMouseReleased
        int row = tbl_cus.getSelectedRow();
        cid = (int) tbl_cus.getValueAt(row, 0);
        name = (String) tbl_cus.getValueAt(row, 1);
        surname = (String) tbl_cus.getValueAt(row, 2);
        tel = (String) tbl_cus.getValueAt(row, 3);
        address = (String) tbl_cus.getValueAt(row, 4);


    }//GEN-LAST:event_tbl_cusMouseReleased

    private void btn_edit_customer_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_customer_ActionPerformed
        if (cid == 0) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız.");

        } else {
            Register register = new Register();
            register.setVisible(true);
            dispose();

        }

    }//GEN-LAST:event_btn_edit_customer_ActionPerformed

    private void btn_delete_customer_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_customer_ActionPerformed
        if (cid > 0) {
            int select = JOptionPane.showConfirmDialog(rootPane, "Silmek istediğinizden emin misiniz?", "Silme İşlem", JOptionPane.YES_NO_OPTION);

            if (select == 0) {
                DB db = new DB();
                int status = db.deleteCustomer(cid);
                db.close();

                if (status > 0) {
                    refreshCustomers();
                    JOptionPane.showMessageDialog(rootPane, "Silindi.");
                }

            }
            cid = 0;
            name = null;
            surname = null;
            tel = null;
            address = null;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız.");
        }
    }//GEN-LAST:event_btn_delete_customer_ActionPerformed

    private void btn_new_order_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_order_ActionPerformed
        if (cid == 0) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız.");

        } else {
            Order order = new Order();
            order.setVisible(true);
            dispose();

        }
       
        

    }//GEN-LAST:event_btn_new_order_ActionPerformed

    private void btn_delivering_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delivering_ActionPerformed
        if (oid > 0) {
            DB db = new DB();
            int status = db.updateOrderStatus("Yola Çıktı.", oid);
            db.close();

            if (status > 0) {
                refreshOrders();
                JOptionPane.showMessageDialog(rootPane, "Sipariş durumu 'Yola çıktı' olarak güncellendi.");
            }
            oid = 0;
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız.");
        }


    }//GEN-LAST:event_btn_delivering_ActionPerformed

    private void tbl_ordersMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ordersMouseReleased
        int row = tbl_orders.getSelectedRow();
        oid = (int) tbl_orders.getValueAt(row, 0);
        
    }//GEN-LAST:event_tbl_ordersMouseReleased

    private void btn_delete_selected_order_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_selected_order_ActionPerformed
        if (oid > 0) {
            int select = JOptionPane.showConfirmDialog(rootPane, "Siparişi silmek istediğinize emin misiniz?", "Silme İşlem", JOptionPane.YES_NO_OPTION);

            if (select == 0) {
                DB db = new DB();
                int status = db.deleteOrder(oid);
                db.close();

                if (status > 0) {
                    refreshOrders();
                    JOptionPane.showMessageDialog(rootPane, "Silindi.");
                }

            }
            oid = 0;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız.");
        }


    }//GEN-LAST:event_btn_delete_selected_order_ActionPerformed

    private void btn_delivered_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delivered_ActionPerformed

        if (oid > 0) {
            DB db = new DB();
            int status = db.updateOrderStatus("Teslim edildi.", oid);
            db.close();

            if (status > 0) {
                refreshOrders();
                JOptionPane.showMessageDialog(rootPane, "Sipariş durumu 'Teslim edildi' olarak güncellendi.");
            }
            oid = 0;
           
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız.");
        }


    }//GEN-LAST:event_btn_delivered_ActionPerformed

    private void btn_todays_orders_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_todays_orders_ActionPerformed

        DB db = new DB();

        if (db.todaysOrders().getRowCount() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Bugünlük yeni sipariş yok.");

        } else {
            tbl_orders.setModel(db.todaysOrders());
        }
        db.close();


    }//GEN-LAST:event_btn_todays_orders_ActionPerformed

    private void btn_refresh_orders_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refresh_orders_ActionPerformed
        DB db = new DB();
        tbl_orders.setModel(db.allOrders());
        db.close();
        cid = 0;
        name = null;
        surname = null;
        tel = null;
        address = null;
    }//GEN-LAST:event_btn_refresh_orders_ActionPerformed

    private void btn_delete_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_allActionPerformed

        if (tbl_orders.getRowCount() != 0) {

            int select = JOptionPane.showConfirmDialog(rootPane, "Silmek istediğinizden emin misiniz?", "Silme İşlem", JOptionPane.YES_NO_OPTION);

            if (select == 0) {
                DB db = new DB();
                int status = db.deleteAllOrders();
                db.close();
                if (status > 0) {
                    refreshOrders();
                    JOptionPane.showMessageDialog(rootPane, "Silindi.");
                }

            }
            oid = 0;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Sipariş bulunmamaktadır.");
        }

    }//GEN-LAST:event_btn_delete_allActionPerformed

    private void btn_search_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_ActionPerformed

        if (txt_cus_name.getText().trim().isEmpty() || txt_cus_surname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Aranacak müşterinin bilgilerini eksiksiz girin.");

        } else {
            DB db = new DB();
            tbl_cus.setModel(db.searchCustomer(txt_cus_name.getText().trim(), txt_cus_surname.getText().trim()));
            db.close();

        }

    }//GEN-LAST:event_btn_search_ActionPerformed

    private void btn_refresh_customers_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refresh_customers_ActionPerformed

        DB db = new DB();
        tbl_cus.setModel(db.allCustomer());
        db.close();
        txt_cus_name.setText("");
        txt_cus_surname.setText("");
       


    }//GEN-LAST:event_btn_refresh_customers_ActionPerformed

    private void txt_cus_surnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cus_surnameKeyReleased
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            btn_search_ActionPerformed(null);
        }
    }//GEN-LAST:event_txt_cus_surnameKeyReleased

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_customer_;
    private javax.swing.JButton btn_delete_all;
    private javax.swing.JButton btn_delete_customer_;
    private javax.swing.JButton btn_delete_selected_order_;
    private javax.swing.JButton btn_delivered_;
    private javax.swing.JButton btn_delivering_;
    private javax.swing.JButton btn_edit_customer_;
    private javax.swing.JButton btn_new_order_;
    private javax.swing.JButton btn_refresh_customers_;
    private javax.swing.JButton btn_refresh_orders_;
    private javax.swing.JButton btn_search_;
    private javax.swing.JButton btn_todays_orders_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbl_cus;
    private javax.swing.JTable tbl_orders;
    private javax.swing.JTextField txt_cus_name;
    private javax.swing.JTextField txt_cus_surname;
    // End of variables declaration//GEN-END:variables
}
