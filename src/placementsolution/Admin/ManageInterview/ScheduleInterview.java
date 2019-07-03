package placementsolution.Admin.ManageInterview;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.JXDatePicker;
import placementsolution.MyConnection;

public class ScheduleInterview extends javax.swing.JPanel {

    public ScheduleInterview() {
        this.setLook();
        initComponents();
        this.jAutoCompleteComboBox();
        this.picker = new JXDatePicker();

        this.picker.setDate(java.util.Calendar.getInstance().getTime());
        this.picker.setFormats(new java.text.SimpleDateFormat("dd/MM/yyyy"));
        this.picker.setBounds(260, 65, 350, 20);
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TextFieldVenue = new javax.swing.JTextField();
        TextFieldSkills = new javax.swing.JTextField();
        TextFieldStream = new javax.swing.JTextField();
        TextFieldSemester = new javax.swing.JTextField();
        TextFieldPackage = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        EditorPaneDisc = new javax.swing.JEditorPane();
        PaneAddBtn = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(780, 540));
        setMinimumSize(new java.awt.Dimension(780, 540));
        setPreferredSize(new java.awt.Dimension(780, 540));

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Schedule Interview");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Date");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Venue");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Skills Required");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Stream");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Semester");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Package Per Annum");
        jLabel8.setPreferredSize(new java.awt.Dimension(106, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Discription");

        TextFieldVenue.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldVenue.setPreferredSize(new java.awt.Dimension(0, 20));

        TextFieldSkills.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldSkills.setPreferredSize(new java.awt.Dimension(0, 20));

        TextFieldStream.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldStream.setPreferredSize(new java.awt.Dimension(0, 20));

        TextFieldSemester.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldSemester.setPreferredSize(new java.awt.Dimension(0, 20));
        TextFieldSemester.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldSemesterKeyTyped(evt);
            }
        });

        TextFieldPackage.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldPackage.setPreferredSize(new java.awt.Dimension(0, 20));

        EditorPaneDisc.setPreferredSize(new java.awt.Dimension(106, 50));
        jScrollPane2.setViewportView(EditorPaneDisc);

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextFieldSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextFieldStream, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextFieldSkills, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextFieldVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(101, 101, 101)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextFieldPackage, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(PaneAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(170, 170, 170))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldVenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldSkills, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldStream, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldPackage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PaneAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

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

    private void TextFieldSemesterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldSemesterKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) || TextFieldSemester.getText().length() >= 1 || 
                evt.getKeyChar() == '9' ) {
            evt.consume();
        }
    }//GEN-LAST:event_TextFieldSemesterKeyTyped

    private void PaneAddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneAddBtnMouseClicked
        if (jComboBox1.getSelectedItem().toString().isEmpty() || picker.getEditor().getText().isEmpty()
                || TextFieldVenue.getText().isEmpty() || TextFieldSkills.getText().isEmpty()
                || TextFieldStream.getText().isEmpty() || TextFieldSemester.getText().isEmpty()
                || TextFieldPackage.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All Fields Are Mandatory", "ERROR", 2);
        } else {
            MyConnection c = new MyConnection();

            try {
                c.stm = c.sql_con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                c.r_set = c.stm.executeQuery("select * from Interview");
                c.r_set.last();
                int rowSize = c.r_set.getRow() + 1;

                c.pre_s = c.sql_con.prepareStatement("insert into INTERVIEW(IID, CID, DATE, VENUE, "
                        + "SKILLS, STREAMS, SEMESTER, PACKAGE, DISCRIPTION) values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
                c.pre_s.setString(1, Integer.toString(rowSize));
                c.pre_s.setString(2, CID);
                c.pre_s.setString(3, picker.getEditor().getText());
                c.pre_s.setString(4, TextFieldVenue.getText());
                c.pre_s.setString(5, TextFieldSkills.getText());
                c.pre_s.setString(6, TextFieldStream.getText());
                c.pre_s.setString(7, TextFieldSemester.getText());
                c.pre_s.setString(8, TextFieldPackage.getText());
                c.pre_s.setString(9, EditorPaneDisc.getText());

                c.pre_s.executeUpdate();

                JOptionPane.showMessageDialog(null, "Company Updated Successfully.", "Success", 1);
                jComboBox1.setSelectedIndex(0);
                TextFieldVenue.setText("");
                TextFieldSkills.setText("");
                TextFieldStream.setText("");
                TextFieldSemester.setText("");
                TextFieldPackage.setText("");
                EditorPaneDisc.setText("");
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

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        MyConnection c = new MyConnection();
        String name = jComboBox1.getSelectedItem().toString();
        try {
            c.stm = c.sql_con.createStatement();
            c.r_set = c.stm.executeQuery("SELECT CID FROM COMPANY where CNAME='" + name + "'");
            if (c.r_set.next()) {
                CID = c.r_set.getString("CID");
                c.sql_con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ScheduleInterview.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
    private void setLook() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScheduleInterview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    private final JXDatePicker picker;
    private String CID;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane EditorPaneDisc;
    private javax.swing.JPanel PaneAddBtn;
    private javax.swing.JTextField TextFieldPackage;
    private javax.swing.JTextField TextFieldSemester;
    private javax.swing.JTextField TextFieldSkills;
    private javax.swing.JTextField TextFieldStream;
    private javax.swing.JTextField TextFieldVenue;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
