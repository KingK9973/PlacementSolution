package placementsolution.Admin.ManageCompany;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import placementsolution.MyConnection;

public class AddCompany extends javax.swing.JPanel {

    public AddCompany() {
        this.setLook();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TextFieldCompanyName = new javax.swing.JTextField();
        TextFieldCompanyLocation = new javax.swing.JTextField();
        TextFieldCompanyPhoneNo = new javax.swing.JTextField();
        TextFieldCompanyEmail = new javax.swing.JTextField();
        TextFieldDealsIn = new javax.swing.JTextField();
        TextFieldHRName = new javax.swing.JTextField();
        TextFieldHRPhoneNo = new javax.swing.JTextField();
        TextFieldHREmail = new javax.swing.JTextField();
        PaneSelectAllBtn = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(780, 540));
        setMinimumSize(new java.awt.Dimension(780, 540));

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Add Company");

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

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

        TextFieldCompanyName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldCompanyName.setPreferredSize(new java.awt.Dimension(0, 20));

        TextFieldCompanyLocation.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldCompanyLocation.setPreferredSize(new java.awt.Dimension(0, 20));

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

        TextFieldHRPhoneNo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldHRPhoneNo.setPreferredSize(new java.awt.Dimension(0, 20));
        TextFieldHRPhoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldHRPhoneNoKeyTyped(evt);
            }
        });

        TextFieldHREmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldHREmail.setPreferredSize(new java.awt.Dimension(0, 20));
        TextFieldHREmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldHREmailFocusLost(evt);
            }
        });

        PaneSelectAllBtn.setBackground(new java.awt.Color(50, 50, 50));
        PaneSelectAllBtn.setMaximumSize(new java.awt.Dimension(100, 40));
        PaneSelectAllBtn.setMinimumSize(new java.awt.Dimension(100, 40));
        PaneSelectAllBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaneSelectAllBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PaneSelectAllBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PaneSelectAllBtnMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Add");

        javax.swing.GroupLayout PaneSelectAllBtnLayout = new javax.swing.GroupLayout(PaneSelectAllBtn);
        PaneSelectAllBtn.setLayout(PaneSelectAllBtnLayout);
        PaneSelectAllBtnLayout.setHorizontalGroup(
            PaneSelectAllBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneSelectAllBtnLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel10)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        PaneSelectAllBtnLayout.setVerticalGroup(
            PaneSelectAllBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneSelectAllBtnLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextFieldCompanyName, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(TextFieldCompanyLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextFieldCompanyPhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextFieldCompanyEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextFieldDealsIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextFieldHRName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextFieldHRPhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextFieldHREmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(PaneSelectAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextFieldCompanyName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextFieldCompanyLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TextFieldCompanyPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TextFieldCompanyEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TextFieldDealsIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextFieldHRName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextFieldHRPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TextFieldHREmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(PaneSelectAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PaneSelectAllBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneSelectAllBtnMouseClicked
        String mail = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        Boolean email1 = TextFieldCompanyEmail.getText().matches(mail);
        Boolean email2 = TextFieldHREmail.getText().matches(mail);
        if (TextFieldCompanyName.getText().isEmpty() || TextFieldCompanyLocation.getText().isEmpty()
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
                c.stm = c.sql_con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                c.r_set = c.stm.executeQuery("select * from Company");
                c.r_set.last();
                int rowSize = c.r_set.getRow() + 1;

                c.pre_s = c.sql_con.prepareStatement("insert into COMPANY(CID, CNAME, CLOCATION, CEMAIL, "
                        + "CPHONENO, CDEALIN, HRNAME, HREMAIL, HRPHONENO) values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
                c.pre_s.setString(1, Integer.toString(rowSize));
                c.pre_s.setString(2, TextFieldCompanyName.getText());
                c.pre_s.setString(3, TextFieldCompanyLocation.getText());
                c.pre_s.setString(4, TextFieldCompanyEmail.getText());
                c.pre_s.setString(5, TextFieldCompanyPhoneNo.getText());
                c.pre_s.setString(6, TextFieldDealsIn.getText());
                c.pre_s.setString(7, TextFieldHRName.getText());
                c.pre_s.setString(8, TextFieldHREmail.getText());
                c.pre_s.setString(9, TextFieldHRPhoneNo.getText());
                
                c.pre_s.executeUpdate();
                c.sql_con.close();
                JOptionPane.showMessageDialog(null, "Company Added Successfully.", "Success", 1);
                TextFieldCompanyName.setText("");
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
    }//GEN-LAST:event_PaneSelectAllBtnMouseClicked

    private void PaneSelectAllBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneSelectAllBtnMouseEntered
        PaneSelectAllBtn.setBackground(new Color(30, 30, 30));
    }//GEN-LAST:event_PaneSelectAllBtnMouseEntered

    private void PaneSelectAllBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneSelectAllBtnMouseExited
        PaneSelectAllBtn.setBackground(new Color(50, 50, 50));
    }//GEN-LAST:event_PaneSelectAllBtnMouseExited

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
        if (!Character.isLetter(evt.getKeyChar()) && !Character.isSpace(evt.getKeyChar()) ) {
            evt.consume();
        }
    }//GEN-LAST:event_TextFieldHRNameKeyTyped

    private void TextFieldHRPhoneNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldHRPhoneNoKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) || TextFieldHRPhoneNo.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_TextFieldHRPhoneNoKeyTyped

    private void TextFieldHREmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldHREmailFocusLost
        String mail = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        Boolean email = TextFieldCompanyEmail.getText().matches(mail);
        if (!email) {
            JOptionPane.showMessageDialog(null, "Invalid Email Address", "ERROR", 2);
        }
    }//GEN-LAST:event_TextFieldHREmailFocusLost

    private void setLook() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PaneSelectAllBtn;
    private javax.swing.JTextField TextFieldCompanyEmail;
    private javax.swing.JTextField TextFieldCompanyLocation;
    private javax.swing.JTextField TextFieldCompanyName;
    private javax.swing.JTextField TextFieldCompanyPhoneNo;
    private javax.swing.JTextField TextFieldDealsIn;
    private javax.swing.JTextField TextFieldHREmail;
    private javax.swing.JTextField TextFieldHRName;
    private javax.swing.JTextField TextFieldHRPhoneNo;
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
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
