package placementsolution.Admin.ManageCompany;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import placementsolution.MyConnection;

public class UpdateCompany extends javax.swing.JPanel {

    public UpdateCompany() {
        this.setLook();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TextFieldCompanyLocation = new javax.swing.JTextField();
        TextFieldCompanyPhoneNo = new javax.swing.JTextField();
        TextFieldCompanyEmail = new javax.swing.JTextField();
        TextFieldDealsIn = new javax.swing.JTextField();
        TextFieldHRName = new javax.swing.JTextField();
        TextFieldHREmail = new javax.swing.JTextField();
        PaneSubmitBtn = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        TextFieldHRPhoneNo = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(780, 540));
        setMinimumSize(new java.awt.Dimension(780, 540));

        jPanel2.setBackground(new java.awt.Color(50, 50, 50));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Add Company");

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.setMaximumSize(new java.awt.Dimension(780, 540));
        jPanel1.setMinimumSize(new java.awt.Dimension(780, 540));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Company Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Company Location");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("HR Name");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("HR Mobile No.");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Company Mobile No.");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Company Email");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("HR Email");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Company Deals In");

        TextFieldCompanyLocation.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldCompanyLocation.setPreferredSize(new java.awt.Dimension(0, 20));
        TextFieldCompanyLocation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldCompanyLocationKeyTyped(evt);
            }
        });

        TextFieldCompanyPhoneNo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldCompanyPhoneNo.setPreferredSize(new java.awt.Dimension(0, 20));
        TextFieldCompanyPhoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldCompanyPhoneNoKeyTyped(evt);
            }
        });

        TextFieldCompanyEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldCompanyEmail.setPreferredSize(new java.awt.Dimension(0, 20));
        TextFieldCompanyEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldCompanyEmailFocusLost(evt);
            }
        });

        TextFieldDealsIn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldDealsIn.setPreferredSize(new java.awt.Dimension(0, 20));

        TextFieldHRName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldHRName.setPreferredSize(new java.awt.Dimension(0, 20));
        TextFieldHRName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldHRNameKeyTyped(evt);
            }
        });

        TextFieldHREmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldHREmail.setPreferredSize(new java.awt.Dimension(0, 20));
        TextFieldHREmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldHREmailFocusLost(evt);
            }
        });

        PaneSubmitBtn.setBackground(new java.awt.Color(50, 50, 50));
        PaneSubmitBtn.setMaximumSize(new java.awt.Dimension(100, 40));
        PaneSubmitBtn.setMinimumSize(new java.awt.Dimension(100, 40));
        PaneSubmitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaneSubmitBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PaneSubmitBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PaneSubmitBtnMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Submit");

        javax.swing.GroupLayout PaneSubmitBtnLayout = new javax.swing.GroupLayout(PaneSubmitBtn);
        PaneSubmitBtn.setLayout(PaneSubmitBtnLayout);
        PaneSubmitBtnLayout.setHorizontalGroup(
            PaneSubmitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneSubmitBtnLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        PaneSubmitBtnLayout.setVerticalGroup(
            PaneSubmitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneSubmitBtnLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        TextFieldHRPhoneNo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldHRPhoneNo.setPreferredSize(new java.awt.Dimension(0, 20));
        TextFieldHRPhoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldHRPhoneNoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2)
                        .addGap(101, 101, 101)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel3)
                        .addGap(88, 88, 88)
                        .addComponent(TextFieldCompanyLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel6)
                        .addGap(75, 75, 75)
                        .addComponent(TextFieldCompanyPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel7)
                        .addGap(102, 102, 102)
                        .addComponent(TextFieldCompanyEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel9)
                        .addGap(89, 89, 89)
                        .addComponent(TextFieldDealsIn, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel4)
                        .addGap(135, 135, 135)
                        .addComponent(TextFieldHRName, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(PaneSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldHRPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldHREmail, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(189, 189, 189))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(TextFieldCompanyLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(TextFieldCompanyPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(TextFieldCompanyEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9))
                    .addComponent(TextFieldDealsIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(TextFieldHRName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextFieldHRPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addComponent(TextFieldHREmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(PaneSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldCompanyLocationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldCompanyLocationKeyTyped
        if (!Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_TextFieldCompanyLocationKeyTyped

    private void TextFieldCompanyPhoneNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldCompanyPhoneNoKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) || TextFieldCompanyPhoneNo.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_TextFieldCompanyPhoneNoKeyTyped

    private void TextFieldCompanyEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldCompanyEmailFocusLost
        String mail = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        Boolean email = TextFieldCompanyEmail.getText().matches(mail);
        if (!email) {
            JOptionPane.showMessageDialog(null, "Invalid Email Address", "ERROR", 2);
        }
    }//GEN-LAST:event_TextFieldCompanyEmailFocusLost

    private void TextFieldHRNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldHRNameKeyTyped
        if (!Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_TextFieldHRNameKeyTyped

    private void TextFieldHREmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldHREmailFocusLost
        String mail = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        Boolean email = TextFieldCompanyEmail.getText().matches(mail);
        if (!email) {
            JOptionPane.showMessageDialog(null, "Invalid Email Address", "ERROR", 2);
        }
    }//GEN-LAST:event_TextFieldHREmailFocusLost

    private void PaneSubmitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneSubmitBtnMouseClicked
        String mail = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        Boolean email1 = TextFieldCompanyEmail.getText().matches(mail);
        Boolean email2 = TextFieldHREmail.getText().matches(mail);
        if (jComboBox1.getSelectedItem().toString().isEmpty() || TextFieldCompanyLocation.getText().isEmpty()
                || TextFieldCompanyPhoneNo.getText().isEmpty() || TextFieldCompanyEmail.getText().isEmpty()
                || TextFieldDealsIn.getText().isEmpty() || TextFieldHRName.getText().isEmpty()
                || TextFieldHRPhoneNo.getText().isEmpty() || TextFieldHREmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All Fields Are Mandatory", "ERROR", 2);
        } else if (TextFieldCompanyPhoneNo.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "Enter Valid Mobile No for Company.", "ERROR", 2);
        } else if (TextFieldHRPhoneNo.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "Enter Valid Mobile No for HR.", "ERROR", 2);
        } else if (!email1 || !email2) {
            JOptionPane.showMessageDialog(null, "Invalid Email Address", "ERROR", 2);
        } else {
            MyConnection c = new MyConnection();

            try {
                c.pre_s = c.sql_con.prepareStatement("UPDATE COMPANY set CLOCATION = ?, CEMAIL = ?, "
                        + "CPHONENO = ?, CDEALIN = ?, HRNAME = ?, HREMAIL = ?, HRPHONENO = ? WHERE CID = ? ");
                c.pre_s.setString(1, TextFieldCompanyLocation.getText());
                c.pre_s.setString(2, TextFieldCompanyEmail.getText());
                c.pre_s.setString(3, TextFieldCompanyPhoneNo.getText());
                c.pre_s.setString(4, TextFieldDealsIn.getText());
                c.pre_s.setString(5, TextFieldHRName.getText());
                c.pre_s.setString(6, TextFieldHREmail.getText());
                c.pre_s.setString(7, TextFieldHRPhoneNo.getText());
                c.pre_s.setString(8, CID);

                c.pre_s.executeUpdate();

                JOptionPane.showMessageDialog(null, "Company Updated Successfully.", "Success", 1);
                jComboBox1.setSelectedIndex(0);
                TextFieldCompanyLocation.setText("");
                TextFieldCompanyEmail.setText("");
                TextFieldCompanyPhoneNo.setText("");
                TextFieldDealsIn.setText("");
                TextFieldHRName.setText("");
                TextFieldHREmail.setText("");
                TextFieldHRPhoneNo.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(AddCompany.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_PaneSubmitBtnMouseClicked

    private void PaneSubmitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneSubmitBtnMouseEntered
        PaneSubmitBtn.setBackground(new Color(30, 30, 30));
    }//GEN-LAST:event_PaneSubmitBtnMouseEntered

    private void PaneSubmitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneSubmitBtnMouseExited
        PaneSubmitBtn.setBackground(new Color(50, 50, 50));
    }//GEN-LAST:event_PaneSubmitBtnMouseExited

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        MyConnection c = new MyConnection();
        String name = jComboBox1.getSelectedItem().toString();
        try {
            c.stm = c.sql_con.createStatement();
            c.r_set = c.stm.executeQuery("SELECT * FROM COMPANY where CNAME='" + name + "'");
            if (c.r_set.next()) {
                CID = c.r_set.getString("CID");
                TextFieldCompanyLocation.setText(c.r_set.getString("CLOCATION"));
                TextFieldCompanyEmail.setText(c.r_set.getString("CEMAIL"));
                TextFieldCompanyPhoneNo.setText(c.r_set.getString("CPHONENO"));
                TextFieldDealsIn.setText(c.r_set.getString("CDEALIN"));
                TextFieldHRName.setText(c.r_set.getString("HRNAME"));
                TextFieldHREmail.setText(c.r_set.getString("HREMAIL"));
                TextFieldHRPhoneNo.setText(c.r_set.getString("HRPHONENO"));
                c.sql_con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateCompany.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void TextFieldHRPhoneNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldHRPhoneNoKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) || TextFieldHRPhoneNo.getText().length() >= 10) {
            System.out.println("Consume");
            evt.consume();
        }
        System.out.println(evt.getKeyChar());
    }//GEN-LAST:event_TextFieldHRPhoneNoKeyTyped

    void jAutoCompleteComboBox1() {
        MyConnection c = new MyConnection();
        java.util.ArrayList<String> al = new java.util.ArrayList<>();
        al.add("");
        try {
            c.stm = c.sql_con.createStatement();
            c.r_set = c.stm.executeQuery("SELECT CNAME FROM COMPANY ORDER BY CNAME ASC");
            while (c.r_set.next()) {
                al.add(c.r_set.getString("CNAME"));
            }
            c.r_set.close();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateCompany.class.getName()).log(Level.SEVERE, null, ex);
        }
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(al.toArray()));
    }
    
    private void setLook() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    private String CID;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PaneSubmitBtn;
    private javax.swing.JTextField TextFieldCompanyEmail;
    private javax.swing.JTextField TextFieldCompanyLocation;
    private javax.swing.JTextField TextFieldCompanyPhoneNo;
    private javax.swing.JTextField TextFieldDealsIn;
    private javax.swing.JTextField TextFieldHREmail;
    private javax.swing.JTextField TextFieldHRName;
    private javax.swing.JTextField TextFieldHRPhoneNo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
