package appPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class DB {

    private final String driver = "org.sqlite.JDBC";
    private final String url = "jdbc:sqlite:db/su_satis.db";

    private Connection conn = null;
    private PreparedStatement pre = null;

    // (Constructor) Database Connection
    public DB() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url);
            System.out.println("Connection Success");

        } catch (Exception e) {

            System.err.println("Connection Error : " + e);
        }

    }

    // close Db
    public void close() {

        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
            if (pre != null) {
                pre.close();
            }

        } catch (Exception e) {
            System.err.println("DB Close Error : " + e);
        }

    }

    // all Customers
    public DefaultTableModel allCustomer() {
        DefaultTableModel dtm = new DefaultTableModel();

        // add Column
        dtm.addColumn("Cid");
        dtm.addColumn("Adı");
        dtm.addColumn("Soyadı");
        dtm.addColumn("Telefon");
        dtm.addColumn("Adres");

        try {
            String sql = "Select * from customers";
            pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                int cid = rs.getInt("cid");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String tel = rs.getString("tel");
                String address = rs.getString("address");

                Object[] row = {cid, name, surname, tel, address};
                dtm.addRow(row);
            }

        } catch (Exception e) {
            System.err.println("allCustomers Error : " + e);
        }

        return dtm;
    }

    // search Customer
    public DefaultTableModel searchCustomer(String input_name, String input_surname) {
        DefaultTableModel dtm = new DefaultTableModel();
        
        // add Column
        dtm.addColumn("Cid");
        dtm.addColumn("Adı");
        dtm.addColumn("Soyadı");
        dtm.addColumn("Telefon");
        dtm.addColumn("Adres");
        
        try {
            String sql = " Select * from customers where name = ? and surname = ?";
            pre = conn.prepareStatement(sql);
            pre.setString(1, input_name);
            pre.setString(2, input_surname);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                int cid = rs.getInt("cid");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String tel = rs.getString("tel");
                String address = rs.getString("address");
                
                Object [] row ={cid, name, surname, tel, address};
                dtm.addRow(row);
            }
            
        } catch (Exception e) {
            System.err.println("searchCustomers Error : " + e);
        }

        return dtm;
    }

    // register Customer
    public int registerCustomer(String name, String surname, String tel, String address) {
        int status = 0;
        try {
            String sql = "insert into customers values (null,?,?,?,?)";
            pre = conn.prepareStatement(sql);
            pre.setString(1, name);
            pre.setString(2, surname);
            pre.setString(3, tel);
            pre.setString(4, address);
            status = pre.executeUpdate();

        } catch (Exception e) {
            System.err.println("customerRegistor Error : " + e);
            if (e.toString().contains("[SQLITE_CONSTRAINT_UNIQUE]")) { // to warn user for phone number (must be unique)
                status = -1;
            }
        }
        return status;

    }

    // update Customer
    public int updateCustomer(String name, String surname, String tel, String address, int cid) {

        int status = 0;

        try {
            String sql = "update customers set name = ?, surname = ?, tel = ?, address = ? where cid = ?";
            pre = conn.prepareStatement(sql);
            pre.setString(1, name);
            pre.setString(2, surname);
            pre.setString(3, tel);
            pre.setString(4, address);
            pre.setInt(5, cid);
            status = pre.executeUpdate();

        } catch (Exception e) {
            System.err.println("customerUpdate Error : " + e);
            if (e.toString().contains("[SQLITE_CONSTRAINT_UNIQUE]")) {
                status = -1;

            }
        }

        return status;

    }

    // delete Customer
    public int deleteCustomer(int cid) {
        int status = 0;

        try {
            String sql = "delete from customers where cid = ? ";
            pre = conn.prepareStatement(sql);
            pre.setInt(1, cid);
            status = pre.executeUpdate();

        } catch (Exception e) {
            System.err.println("customerDelete Error : " + e);
        }

        return status;
    }

    // delete allOrders
    public int deleteAllOrders() {
        int status = 0;

        try {
            String sql = "delete  from orders";
            pre = conn.prepareStatement(sql);
            status = pre.executeUpdate();
        } catch (Exception e) {
            System.err.println("allOrdersDelete Error : " + e);
        }

        return status;
    }

    // all Orders
    public DefaultTableModel allOrders() {
        DefaultTableModel dtm = new DefaultTableModel();

        // add Column
        dtm.addColumn("Oid");
        dtm.addColumn("Müşteri Adı");
        dtm.addColumn("Müşteri Soyadı");
        dtm.addColumn("Durum");
        dtm.addColumn("Adres");
        dtm.addColumn("Tutar");

        try {
            String sql = "Select * from orders";
            pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                int oid = rs.getInt("oid");
                String c_name = rs.getString("c_name");
                String c_surname = rs.getString("c_surname");
                String status = rs.getString("status");
                String c_address = rs.getString("c_address");
                String amount = rs.getString("amount");

                Object[] row = {oid, c_name, c_surname, status, c_address, amount};
                dtm.addRow(row);
            }
        } catch (Exception e) {
            System.err.println("allOrders Error : " + e);
        }

        return dtm;
    }

    // insert Order
    public int insertOrder(String c_name, String c_surname, String order_status, String c_address, String amount) {
        int status = 0;
        try {
            String sql = "insert into orders values (null,?,?,?,?,?)";
            pre = conn.prepareStatement(sql);
            pre.setString(1, c_name);
            pre.setString(2, c_surname);
            pre.setString(3, order_status);
            pre.setString(4, c_address);
            pre.setString(5, amount);
            status = pre.executeUpdate();
        } catch (Exception e) {
            System.err.println("customerRegistor Error : " + e);
        }
        return status;
    }

    // update orderStatus
    public int updateOrderStatus(String order_status, int oid) {
        int status = 0;
        try {
            String sql = "update orders set status = ? where oid = ?";
            pre = conn.prepareStatement(sql);
            pre.setString(1, order_status);
            pre.setInt(2, oid);
            status = pre.executeUpdate();
        } catch (Exception e) {
            System.err.println("Order Status Update Error : " + e);
        }

        return status;
    }

    // delete Order
    public int deleteOrder(int oid) {
        int status = 0;
        try {
            String sql = "delete from orders where oid = ?";
            pre = conn.prepareStatement(sql);
            pre.setInt(1, oid);
            status = pre.executeUpdate();
        } catch (Exception e) {
            System.err.println("orderDelete Error : " + e);
        }
        return status;
    }

    
    // todays Orders
    public DefaultTableModel todaysOrders() {
        DefaultTableModel dtm = new DefaultTableModel();
        // add Column
        dtm.addColumn("Oid");
        dtm.addColumn("Müşteri Adı");
        dtm.addColumn("Müşteri Soyadı");
        dtm.addColumn("Durum");
        dtm.addColumn("Adres");
        dtm.addColumn("Tutar");

        try {
            String sql = "Select * from orders where status = ? ";
            pre = conn.prepareStatement(sql);
            pre.setString(1, "Hazırlanıyor...");
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                int oid = rs.getInt("oid");
                String c_name = rs.getString("c_name");
                String c_surname = rs.getString("c_surname");
                String status = rs.getString("status");
                String c_address = rs.getString("c_address");
                String amount = rs.getString("amount");

                Object[] row = {oid, c_name, c_surname, status, c_address, amount};
                dtm.addRow(row);

            }
        } catch (Exception e) {
        }

        return dtm;
    }

}
