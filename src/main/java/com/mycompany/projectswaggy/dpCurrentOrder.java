/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projectswaggy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Timestamp;

/**
 *
 * @author Avaneesh Koushik
 */
public class dpCurrentOrder extends javax.swing.JFrame {
    Connection con;
    Statement st;
    PreparedStatement ps;
    String dpid;
    String oid;
    String rid;
    String oadd;
    String pcode;
    /**
     * Creates new form dpCurrentOrder
     */
    public dpCurrentOrder(Connection con,String dpid) {
        initComponents();
        this.con=con;
        this.dpid=dpid;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        dpCustPhone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dpCustName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dpCustAddress = new javax.swing.JTextArea();
        deliverStatus = new javax.swing.JCheckBox();
        deliveryDone = new javax.swing.JButton();
        refreshCo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        currOrderList = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel4.setText("Customer Name:");

        dpCustPhone.setFocusable(false);
        dpCustPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpCustPhoneActionPerformed(evt);
            }
        });

        jLabel5.setText("Customer Phone :");

        dpCustName.setFocusable(false);
        dpCustName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpCustNameActionPerformed(evt);
            }
        });

        jLabel7.setText("Delivery Address :");

        dpCustAddress.setColumns(20);
        dpCustAddress.setRows(5);
        dpCustAddress.setFocusable(false);
        jScrollPane1.setViewportView(dpCustAddress);

        deliverStatus.setText("Delivered to Customer");

        deliveryDone.setText("delivered");
        deliveryDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryDoneActionPerformed(evt);
            }
        });

        refreshCo.setText("Refresh");
        refreshCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshCoActionPerformed(evt);
            }
        });

        currOrderList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sno", "Dish", "qty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(currOrderList);

        jLabel1.setText("Current Order Contents :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(deliverStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deliveryDone))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(dpCustPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                            .addComponent(dpCustName)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addComponent(refreshCo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(dpCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(dpCustPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(refreshCo))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliverStatus)
                    .addComponent(deliveryDone))
                .addGap(85, 85, 85))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dpCustPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpCustPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpCustPhoneActionPerformed

    private void dpCustNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpCustNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpCustNameActionPerformed

    private void refreshCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshCoActionPerformed
        // TODO add your handling code here:
        String sqlu = "select c.c_name,c.c_phno,o.o_address from customer c,orders o where o.dp_id='"+dpid+"' and o.c_id=c.c_id and o.status='OUT FOR DELIVERY'";
        JOptionPane.showMessageDialog(this,sqlu);
        try (Statement stmt = con.createStatement()) {
            //ps = con.prepareStatement(sqlu);
            ResultSet rs = stmt.executeQuery(sqlu);
            //rs.next();
            while (rs.next()) {
                //JOptionPane.showMessageDialog(this,rs.getString("eid")+"  "+rs.getString("ename")+"  "+rs.getString("designation"));
                JOptionPane.showMessageDialog(this,"hello");
                dpCustName.setText(rs.getString("c_name"));
                dpCustPhone.setText(rs.getString("c_phno"));
                dpCustAddress.setText(rs.getString("o_address"));
                //dpCPincode.setText(rs.getString("o_pincode"));
            }
        } catch (SQLException e) {
            //Logger.getLogger(bank.class.getName()).log(Level.SEVERE,null, e);
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
        sqlu = "select oa.o_pincode,o.o_address,o.r_id,o.o_id,ol.d_name,ol.QUANTITY from order_list ol,orders o,order_address oa where o.dp_id='"+dpid+"' and ol.o_id=o.o_id and o.status='OUT FOR DELIVERY'and o.o_address=oa.o_address";
        JOptionPane.showMessageDialog(this,sqlu);
        try (Statement stmt = con.createStatement()) {
            //ps = con.prepareStatement(sqlu);
            ResultSet rs = stmt.executeQuery(sqlu);
            ResultSetMetaData rsmd =rs.getMetaData();
            DefaultTableModel model=((DefaultTableModel) currOrderList.getModel());
//            int cols=rsmd.getColumnCount();
//            String[] colName=new String[cols];
//            for (int i=0;i<cols;i++)
//            {
//                colName[i]=rsmd.getColumnName(i+1);
//            }
//            model.setColumnIdentifiers(colName);
            String dish,qty;
            int sno=1;
            while(rs.next())
            {
                if(sno==1)
                {
                    oid=rs.getString("o_id");
                    rid=rs.getString("r_id");
                    oadd=rs.getString("o_address");
                    pcode=rs.getString("o_pincode");
                }
                dish=rs.getString("D_Name");
                qty=rs.getString("QUANTITY");
                String[] row={Integer.toString(sno),dish,qty};
                model.addRow(row);
                sno+=1;
            }
                  
            //rs.next();
//            while (rs.next()) {
//                //JOptionPane.showMessageDialog(this,rs.getString("eid")+"  "+rs.getString("ename")+"  "+rs.getString("designation"));
//                JOptionPane.showMessageDialog(this,"hello");
//                dpCustName.setText(rs.getString("c_name"));
//                dpCustPhone.setText(rs.getString("c_phno"));
//                dpCustAddress.setText(rs.getString("o_address"));
//                //dpCPincode.setText(rs.getString("o_pincode"));
//            }
        } catch (SQLException e) {
            //Logger.getLogger(bank.class.getName()).log(Level.SEVERE,null, e);
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_refreshCoActionPerformed

    private void deliveryDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryDoneActionPerformed
        // TODO add your handling code here:
        if(deliverStatus.isSelected()){    
            JOptionPane.showMessageDialog(this,"Selected");
            try{
                
                //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                LocalDateTime now = LocalDateTime.now();
                //String cdate=dtf.format(now);
                JOptionPane.showMessageDialog(this,now);
                Timestamp timestamp = Timestamp.valueOf(now);
                
                System.out.println(now);
                String sql = "update orders set status='delivered' where o_id='"+oid+"'";
                ps = con.prepareStatement(sql);
                ps.execute();
                sql = "update delivery_partner set DP_AVAILABILITY = 1 where dp_id='"+dpid+"'";
                ps = con.prepareStatement(sql);
                ps.execute();
                sql = "update delivery_partner set DP_pincode ='"+pcode+"' where dp_id='"+dpid+"'";
                ps = con.prepareStatement(sql);
                ps.execute();
                sql = "update orders set DELV_DATE = ? where o_id='"+oid+"'";
                ps = con.prepareStatement(sql);
                ps.setTimestamp(1, timestamp);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this,"Updated status. Close this tab");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
            
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Select check box to confirm");
        }
    }//GEN-LAST:event_deliveryDoneActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(dpCurrentOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(dpCurrentOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(dpCurrentOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(dpCurrentOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new dpCurrentOrder().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable currOrderList;
    private javax.swing.JCheckBox deliverStatus;
    private javax.swing.JButton deliveryDone;
    private javax.swing.JTextArea dpCustAddress;
    private javax.swing.JTextField dpCustName;
    private javax.swing.JTextField dpCustPhone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshCo;
    // End of variables declaration//GEN-END:variables
}
