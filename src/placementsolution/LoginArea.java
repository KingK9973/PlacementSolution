package placementsolution;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginArea extends javax.swing.JFrame {

    public LoginArea() {
        this.setUndecorated(true);
        initComponents();
        PanelOverImage.setBackground(new Color(0, 0, 0, 150));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabelUsername = new javax.swing.JLabel();
        TextFieldUsername = new javax.swing.JTextField();
        SeparatorUsername = new javax.swing.JSeparator();
        LabelPassword = new javax.swing.JLabel();
        PasswordFieldPassword = new javax.swing.JPasswordField();
        SeparatorPassword = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        LabelRegister = new javax.swing.JLabel();
        RadioButtonAdmin = new javax.swing.JRadioButton();
        RadioButtonStudent = new javax.swing.JRadioButton();
        PanelOverImage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(30, 30, 30));
        jPanel2.setMaximumSize(new java.awt.Dimension(450, 500));
        jPanel2.setMinimumSize(new java.awt.Dimension(450, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(450, 500));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 96, 206));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(30, 30));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Login");

        LabelUsername.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabelUsername.setForeground(new java.awt.Color(102, 102, 102));
        LabelUsername.setText("Username");

        TextFieldUsername.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TextFieldUsername.setForeground(new java.awt.Color(102, 102, 102));
        TextFieldUsername.setToolTipText("Enter Username");
        TextFieldUsername.setBorder(null);
        TextFieldUsername.setOpaque(false);
        TextFieldUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldUsernameFocusLost(evt);
            }
        });

        SeparatorUsername.setBackground(new java.awt.Color(102, 102, 102));
        SeparatorUsername.setForeground(new java.awt.Color(102, 102, 102));

        LabelPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabelPassword.setForeground(new java.awt.Color(102, 102, 102));
        LabelPassword.setText("Password");

        PasswordFieldPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PasswordFieldPassword.setForeground(new java.awt.Color(102, 102, 102));
        PasswordFieldPassword.setToolTipText("Enter Password");
        PasswordFieldPassword.setBorder(null);
        PasswordFieldPassword.setOpaque(false);
        PasswordFieldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFieldPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFieldPasswordFocusLost(evt);
            }
        });

        SeparatorPassword.setBackground(new java.awt.Color(102, 102, 102));
        SeparatorPassword.setForeground(new java.awt.Color(102, 102, 102));

        jButton1.setBackground(new java.awt.Color(0, 96, 206));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jButton1.setForeground(new java.awt.Color(30, 30, 30));
        jButton1.setText("Login");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        LabelRegister.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LabelRegister.setForeground(new java.awt.Color(102, 102, 102));
        LabelRegister.setText("<html><u>STUDENT REGISTER.<u></html>");
        LabelRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelRegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelRegisterMouseExited(evt);
            }
        });

        RadioButtonAdmin.setBackground(new java.awt.Color(30, 30, 30));
        buttonGroup1.add(RadioButtonAdmin);
        RadioButtonAdmin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        RadioButtonAdmin.setForeground(new java.awt.Color(102, 102, 102));
        RadioButtonAdmin.setText("Admin");
        RadioButtonAdmin.setBorder(null);
        RadioButtonAdmin.setFocusPainted(false);
        RadioButtonAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RadioButtonAdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RadioButtonAdminFocusLost(evt);
            }
        });

        RadioButtonStudent.setBackground(new java.awt.Color(30, 30, 30));
        buttonGroup1.add(RadioButtonStudent);
        RadioButtonStudent.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        RadioButtonStudent.setForeground(new java.awt.Color(102, 102, 102));
        RadioButtonStudent.setText("Student");
        RadioButtonStudent.setBorder(null);
        RadioButtonStudent.setFocusPainted(false);
        RadioButtonStudent.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RadioButtonStudentFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RadioButtonStudentFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel3))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(LabelUsername))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(TextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(SeparatorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(LabelPassword))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(PasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(SeparatorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(RadioButtonAdmin)
                .addGap(29, 29, 29)
                .addComponent(RadioButtonStudent))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(LabelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(LabelUsername)
                .addGap(6, 6, 6)
                .addComponent(TextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(SeparatorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelPassword)
                .addGap(6, 6, 6)
                .addComponent(PasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(SeparatorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RadioButtonAdmin)
                    .addComponent(RadioButtonStudent))
                .addGap(22, 22, 22)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(450, 0, 450, 500);

        PanelOverImage.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelOverImageMouseDragged(evt);
            }
        });
        PanelOverImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelOverImageMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PanelOverImageLayout = new javax.swing.GroupLayout(PanelOverImage);
        PanelOverImage.setLayout(PanelOverImageLayout);
        PanelOverImageLayout.setHorizontalGroup(
            PanelOverImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        PanelOverImageLayout.setVerticalGroup(
            PanelOverImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(PanelOverImage);
        PanelOverImage.setBounds(0, 0, 450, 500);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 450, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void PanelOverImageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelOverImageMousePressed
        this.xx = evt.getX();
        this.yy = evt.getY();
        System.out.println("xx = " + xx + "\nyy = " + yy);
    }//GEN-LAST:event_PanelOverImageMousePressed

    private void PanelOverImageMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelOverImageMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        System.out.println("x = " + xx + "\ny = " + y);
        System.out.println("x - xx = " + (x - xx) + "\ny - yy = " + (y - yy));
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_PanelOverImageMouseDragged

    private void TextFieldUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldUsernameFocusGained
        LabelUsername.setForeground(new Color(0, 96, 206));
        TextFieldUsername.setForeground(new Color(0, 96, 206));
        SeparatorUsername.setForeground(new Color(0, 96, 206));
        SeparatorUsername.setBackground(new Color(0, 96, 206));
    }//GEN-LAST:event_TextFieldUsernameFocusGained

    private void TextFieldUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldUsernameFocusLost
        LabelUsername.setForeground(new Color(102, 102, 102));
        TextFieldUsername.setForeground(new Color(102, 102, 102));
        SeparatorUsername.setForeground(new Color(102, 102, 102));
        SeparatorUsername.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_TextFieldUsernameFocusLost

    private void PasswordFieldPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldPasswordFocusGained
        LabelPassword.setForeground(new Color(0, 96, 206));
        PasswordFieldPassword.setForeground(new Color(0, 96, 206));
        SeparatorPassword.setForeground(new Color(0, 96, 206));
        SeparatorPassword.setBackground(new Color(0, 96, 206));
    }//GEN-LAST:event_PasswordFieldPasswordFocusGained

    private void PasswordFieldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldPasswordFocusLost
        LabelPassword.setForeground(new Color(102, 102, 102));
        PasswordFieldPassword.setForeground(new Color(102, 102, 102));
        SeparatorPassword.setForeground(new Color(102, 102, 102));
        SeparatorPassword.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_PasswordFieldPasswordFocusLost

    private void LabelRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelRegisterMouseEntered
        LabelRegister.setForeground(new Color(0, 96, 206));
    }//GEN-LAST:event_LabelRegisterMouseEntered

    private void LabelRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelRegisterMouseExited
        LabelRegister.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_LabelRegisterMouseExited

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (!TextFieldUsername.getText().isEmpty() && !PasswordFieldPassword.getText().isEmpty()) {
            MyConnection c = new MyConnection();
            if (RadioButtonAdmin.isSelected()) {
                try {
                    c.stm = c.sql_con.createStatement();
                    c.r_set = c.stm.executeQuery("select * from AdminLogin where Password='" + PasswordFieldPassword.getText() + "'");
                    if (TextFieldUsername.getText().equalsIgnoreCase("ADMIN") && c.r_set.next()) {
                        new placementsolution.Admin.AdminPanel().setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Username OR Password.", "ERROR", 2);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (RadioButtonStudent.isSelected()) {
                try {
                    c.stm = c.sql_con.createStatement();
                    c.r_set = c.stm.executeQuery("select * from Login where Email='" + TextFieldUsername.getText().toUpperCase()
                            + "' and Password='" + PasswordFieldPassword.getText() + "'");
                    if (c.r_set.next()) {
                        System.out.println();
                        if (c.r_set.getString(3).equals("Y")) {
                            new placementsolution.Student.StudentPanel(TextFieldUsername.getText().toUpperCase()).setVisible(true);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Your request is not approved yet.\n"
                                    + "Please concert your admin.", "Message", 1);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Username OR Password.", "ERROR", 2);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Username OR Password can't be empty.", "ERROR", 2);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void LabelRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelRegisterMouseClicked
        this.dispose();
        new Registration().setVisible(true);
    }//GEN-LAST:event_LabelRegisterMouseClicked

    private void RadioButtonAdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RadioButtonAdminFocusGained
        RadioButtonAdmin.setForeground(new Color(0, 96, 206));
    }//GEN-LAST:event_RadioButtonAdminFocusGained

    private void RadioButtonAdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RadioButtonAdminFocusLost
        RadioButtonAdmin.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_RadioButtonAdminFocusLost

    private void RadioButtonStudentFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RadioButtonStudentFocusGained
        RadioButtonStudent.setForeground(new Color(0, 96, 206));
    }//GEN-LAST:event_RadioButtonStudentFocusGained

    private void RadioButtonStudentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RadioButtonStudentFocusLost
        RadioButtonStudent.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_RadioButtonStudentFocusLost

    private void setLook() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    private int xx;
    private int yy;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelRegister;
    private javax.swing.JLabel LabelUsername;
    private javax.swing.JPanel PanelOverImage;
    private javax.swing.JPasswordField PasswordFieldPassword;
    private javax.swing.JRadioButton RadioButtonAdmin;
    private javax.swing.JRadioButton RadioButtonStudent;
    private javax.swing.JSeparator SeparatorPassword;
    private javax.swing.JSeparator SeparatorUsername;
    private javax.swing.JTextField TextFieldUsername;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
