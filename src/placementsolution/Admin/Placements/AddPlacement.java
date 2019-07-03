package placementsolution.Admin.Placements;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.JXDatePicker;
import placementsolution.Admin.ManageInterview.ScheduleInterview;
import placementsolution.MyConnection;

public class AddPlacement extends javax.swing.JPanel {

    public AddPlacement() {
        this.setLook();
        initComponents();
        this.jAutoCompleteComboBox();
        this.picker = new JXDatePicker();

        this.picker.setDate(java.util.Calendar.getInstance().getTime());
        this.picker.setFormats(new java.text.SimpleDateFormat("dd/MM/yyyy"));
        this.picker.setBounds(260, 220, 350, 20);
        this.picker.setFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 12));
        this.jPanel2.add(picker);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TextFieldRollNo = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextFieldEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextFieldCID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TextFieldPackage = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PaneAddBtn = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(780, 540));
        setMinimumSize(new java.awt.Dimension(780, 540));
        setPreferredSize(new java.awt.Dimension(780, 540));

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Add Placed Student");

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

        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Student Roll No");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(75, 30, 85, 20);

        TextFieldRollNo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldRollNo.setPreferredSize(new java.awt.Dimension(0, 20));
        TextFieldRollNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldRollNoFocusLost(evt);
            }
        });
        jPanel2.add(TextFieldRollNo);
        TextFieldRollNo.setBounds(260, 30, 350, 20);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(260, 106, 350, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Company Name");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(75, 106, 84, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Student Email");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(75, 68, 76, 20);

        TextFieldEmail.setEditable(false);
        TextFieldEmail.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldEmail.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel2.add(TextFieldEmail);
        TextFieldEmail.setBounds(260, 68, 350, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Company ID");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(75, 144, 66, 20);

        TextFieldCID.setEditable(false);
        TextFieldCID.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldCID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldCID.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel2.add(TextFieldCID);
        TextFieldCID.setBounds(260, 144, 350, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Package");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(75, 182, 43, 20);

        TextFieldPackage.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldPackage.setPreferredSize(new java.awt.Dimension(0, 20));
        TextFieldPackage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldPackageFocusLost(evt);
            }
        });
        jPanel2.add(TextFieldPackage);
        TextFieldPackage.setBounds(260, 182, 350, 20);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Joining Date");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(75, 220, 68, 20);

        PaneAddBtn.setBackground(new java.awt.Color(50, 50, 50));
        PaneAddBtn.setMaximumSize(new java.awt.Dimension(100, 40));
        PaneAddBtn.setMinimumSize(new java.awt.Dimension(100, 40));
        PaneAddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaneAddBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PaneAddBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PaneAddBtnMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Add");

        javax.swing.GroupLayout PaneAddBtnLayout = new javax.swing.GroupLayout(PaneAddBtn);
        PaneAddBtn.setLayout(PaneAddBtnLayout);
        PaneAddBtnLayout.setHorizontalGroup(
            PaneAddBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneAddBtnLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        PaneAddBtnLayout.setVerticalGroup(
            PaneAddBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneAddBtnLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(PaneAddBtn);
        PaneAddBtn.setBounds(300, 280, 100, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    void jAutoCompleteComboBox() {
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
            Logger.getLogger(ScheduleInterview.class.getName()).log(Level.SEVERE, null, ex);
        }
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(al.toArray()));
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        MyConnection c = new MyConnection();
        String name = jComboBox1.getSelectedItem().toString();
        try {
            c.stm = c.sql_con.createStatement();
            c.r_set = c.stm.executeQuery("SELECT CID FROM COMPANY where CNAME='" + name + "'");
            if (c.r_set.next()) {
                TextFieldCID.setText(c.r_set.getString("CID"));
                c.sql_con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddPlacement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void TextFieldRollNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldRollNoFocusLost
        MyConnection c = new MyConnection();
        String rollno = TextFieldRollNo.getText();
        try {
            c.stm = c.sql_con.createStatement();
            c.r_set = c.stm.executeQuery("SELECT EMAIL FROM REGISTRATION where ROLLNO='" + rollno + "'");
            if (c.r_set.next()) {
                    TextFieldEmail.setText(c.r_set.getString("EMAIL"));
                c.sql_con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddPlacement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TextFieldRollNoFocusLost

    private void TextFieldPackageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldPackageFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldPackageFocusLost

    private void PaneAddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneAddBtnMouseClicked
        if (TextFieldCID.getText().isEmpty() || TextFieldPackage.getText().isEmpty()
                || TextFieldEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All Fields Are Mandatory", "ERROR", 2);
        } else {
            MyConnection c = new MyConnection();

            try {
                c.pre_s = c.sql_con.prepareStatement("insert into PLACEDSTUDENTS(EMAIL, CID, JOININGDATE, PACKAGE)"
                        + " values(?, ?, ?, ?)");
                c.pre_s.setString(1, TextFieldEmail.getText());
                c.pre_s.setString(2, TextFieldCID.getText());
                c.pre_s.setString(3, picker.getEditor().getText());
                c.pre_s.setString(4, TextFieldPackage.getText());
                
                c.pre_s.executeUpdate();

                JOptionPane.showMessageDialog(null, "Data Inserted Successfully.", "Success", 1);
                jComboBox1.setSelectedIndex(0);
                TextFieldRollNo.setText("");
                TextFieldEmail.setText("");
                TextFieldCID.setText("");
                TextFieldPackage.setText("");
                c.sql_con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ScheduleInterview.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_PaneAddBtnMouseClicked

    private void PaneAddBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneAddBtnMouseEntered
        PaneAddBtn.setBackground(new Color(30, 30, 30));
    }//GEN-LAST:event_PaneAddBtnMouseEntered

    private void PaneAddBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneAddBtnMouseExited
        PaneAddBtn.setBackground(new Color(50, 50, 50));
    }//GEN-LAST:event_PaneAddBtnMouseExited

    private void setLook() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPlacement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    private final JXDatePicker picker;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PaneAddBtn;
    private javax.swing.JTextField TextFieldCID;
    private javax.swing.JTextField TextFieldEmail;
    private javax.swing.JTextField TextFieldPackage;
    private javax.swing.JTextField TextFieldRollNo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
