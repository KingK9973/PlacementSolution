package placementsolution.Student.Profile;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.JXDatePicker;

public class StudentProfile extends javax.swing.JFrame {

    public StudentProfile(String username) {
        this.setLook();

        this.userName = username;
        initComponents();

        this.pickerDOB = new JXDatePicker();

        this.pickerDOB.setDate(java.util.Calendar.getInstance().getTime());
        this.pickerDOB.setFormats(new java.text.SimpleDateFormat("dd/MM/yyyy"));
        this.pickerDOB.setBounds(199, 79, 350, 20);
        this.pickerDOB.setFont(new java.awt.Font("Times New Roman", 0, 12));
        this.PanelMainContent.add(pickerDOB);

        this.setEditableAll(false);
        this.fillData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenuBar = new javax.swing.JPanel();
        PanelView = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PanelUpdate = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        PanelMainContent = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextFieldName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TextFieldMobileNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TextFieldRollNo = new javax.swing.JTextField();
        TextFieldEmail = new javax.swing.JTextField();
        TextFieldSemester = new javax.swing.JTextField();
        TextFieldHOD = new javax.swing.JTextField();
        ComboBoxStream = new javax.swing.JComboBox<>();
        CheckBox = new javax.swing.JCheckBox();
        PanelUpdateBtn = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        PanelMenuBar.setBackground(new java.awt.Color(30, 30, 30));
        PanelMenuBar.setMaximumSize(new java.awt.Dimension(220, 540));
        PanelMenuBar.setMinimumSize(new java.awt.Dimension(220, 540));

        PanelView.setBackground(new java.awt.Color(50, 50, 50));
        PanelView.setMaximumSize(new java.awt.Dimension(120, 40));
        PanelView.setMinimumSize(new java.awt.Dimension(120, 40));
        PanelView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelViewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelViewMouseExited(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(150, 150, 150));
        jPanel5.setPreferredSize(new java.awt.Dimension(3, 50));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("View");

        javax.swing.GroupLayout PanelViewLayout = new javax.swing.GroupLayout(PanelView);
        PanelView.setLayout(PanelViewLayout);
        PanelViewLayout.setHorizontalGroup(
            PanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelViewLayout.setVerticalGroup(
            PanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(PanelViewLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2))
        );

        PanelUpdate.setBackground(new java.awt.Color(30, 30, 30));
        PanelUpdate.setMaximumSize(new java.awt.Dimension(120, 40));
        PanelUpdate.setMinimumSize(new java.awt.Dimension(120, 40));
        PanelUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelUpdateMouseExited(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(150, 150, 150));
        jPanel6.setPreferredSize(new java.awt.Dimension(3, 50));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Edit");

        javax.swing.GroupLayout PanelUpdateLayout = new javax.swing.GroupLayout(PanelUpdate);
        PanelUpdate.setLayout(PanelUpdateLayout);
        PanelUpdateLayout.setHorizontalGroup(
            PanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUpdateLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelUpdateLayout.setVerticalGroup(
            PanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(PanelUpdateLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Profile");

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout PanelMenuBarLayout = new javax.swing.GroupLayout(PanelMenuBar);
        PanelMenuBar.setLayout(PanelMenuBarLayout);
        PanelMenuBarLayout.setHorizontalGroup(
            PanelMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PanelMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(PanelMenuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(PanelMenuBarLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelMenuBarLayout.setVerticalGroup(
            PanelMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuBarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(PanelView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(PanelUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelMainContent.setMaximumSize(new java.awt.Dimension(780, 540));
        PanelMainContent.setMinimumSize(new java.awt.Dimension(780, 540));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("DOB");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Name");

        TextFieldName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldName.setPreferredSize(new java.awt.Dimension(0, 20));
        TextFieldName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldNameKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Mobile No.");

        TextFieldMobileNo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldMobileNo.setPreferredSize(new java.awt.Dimension(0, 20));
        TextFieldMobileNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldMobileNoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Roll No.");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Email");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Stream");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("Semester");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("H.O.D");

        TextFieldRollNo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldRollNo.setPreferredSize(new java.awt.Dimension(0, 20));

        TextFieldEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldEmail.setPreferredSize(new java.awt.Dimension(0, 20));
        TextFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldEmailFocusLost(evt);
            }
        });

        TextFieldSemester.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldSemester.setPreferredSize(new java.awt.Dimension(0, 20));
        TextFieldSemester.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldSemesterKeyTyped(evt);
            }
        });

        TextFieldHOD.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TextFieldHOD.setPreferredSize(new java.awt.Dimension(0, 20));
        TextFieldHOD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldHODKeyTyped(evt);
            }
        });

        ComboBoxStream.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ComboBoxStream.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "B-Tech", "BCA", "B.sc", "BBA", "B.Com", "MBA", "MCA", "HM" }));

        CheckBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        CheckBox.setText("<html><p style=\"text-align: justify;\">I, hereby give my consent to Placement Admin and College Authorities to obtain my Name, Email Address and Mobile No. for authentication. Authorities have informed me that my identity information would only be used for authentication and also informed me that Email and Mobile No. may shared with the partners.</p></html>");
        CheckBox.setBorder(null);
        CheckBox.setFocusPainted(false);
        CheckBox.setIconTextGap(10);
        CheckBox.setOpaque(false);
        CheckBox.setVerifyInputWhenFocusTarget(false);
        CheckBox.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        PanelUpdateBtn.setBackground(new java.awt.Color(50, 50, 50));
        PanelUpdateBtn.setMaximumSize(new java.awt.Dimension(100, 40));
        PanelUpdateBtn.setMinimumSize(new java.awt.Dimension(100, 40));
        PanelUpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelUpdateBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelUpdateBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelUpdateBtnMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Update");

        javax.swing.GroupLayout PanelUpdateBtnLayout = new javax.swing.GroupLayout(PanelUpdateBtn);
        PanelUpdateBtn.setLayout(PanelUpdateBtnLayout);
        PanelUpdateBtnLayout.setHorizontalGroup(
            PanelUpdateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUpdateBtnLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        PanelUpdateBtnLayout.setVerticalGroup(
            PanelUpdateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUpdateBtnLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelMainContentLayout = new javax.swing.GroupLayout(PanelMainContent);
        PanelMainContent.setLayout(PanelMainContentLayout);
        PanelMainContentLayout.setHorizontalGroup(
            PanelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMainContentLayout.createSequentialGroup()
                .addGroup(PanelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMainContentLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(PanelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(PanelMainContentLayout.createSequentialGroup()
                                .addGroup(PanelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(81, 81, 81)
                                .addGroup(PanelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextFieldHOD, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                    .addComponent(TextFieldSemester, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                    .addComponent(TextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                    .addComponent(TextFieldRollNo, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                    .addComponent(TextFieldMobileNo, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                    .addComponent(TextFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboBoxStream, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(PanelMainContentLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(PanelUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        PanelMainContentLayout.setVerticalGroup(
            PanelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMainContentLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(PanelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldRollNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMainContentLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldHOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ComboBoxStream, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelMainContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelMenuBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelMainContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reset(int index) {
        if (index != 1) {
            this.PanelView.setBackground(new Color(30, 30, 30));
        }
        if (index != 2) {
            this.PanelUpdate.setBackground(new Color(30, 30, 30));
        }
    }

    private void fillData() {
        placementsolution.MyConnection c = new placementsolution.MyConnection();
        try {
            c.stm = c.sql_con.createStatement();
            c.r_set = c.stm.executeQuery("select "
                    + "r.\"NAME\",r.DOB,r.MOBILENO,r.ROLLNO,r.EMAIL,r.STREAM,r.SEMESTER,r.HOD "
                    + "from REGISTRATION r "
                    + "where r.EMAIL = '" + this.userName + "'");
            if (c.r_set.next()) {
                TextFieldName.setText(c.r_set.getString(1));
                pickerDOB.getEditor().setText(c.r_set.getString(2));
                TextFieldMobileNo.setText(c.r_set.getString(3));
                TextFieldRollNo.setText(c.r_set.getString(4));
                TextFieldEmail.setText(c.r_set.getString(5));
                ComboBoxStream.setSelectedItem(c.r_set.getString(6));
                TextFieldSemester.setText(c.r_set.getString(7));
                TextFieldHOD.setText(c.r_set.getString(8));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setEditableAll(boolean b) {
        TextFieldName.setEditable(b);
        pickerDOB.setEditable(b);
        TextFieldMobileNo.setEditable(b);
        TextFieldRollNo.setEditable(false);
        TextFieldEmail.setEditable(b);
        ComboBoxStream.enable(b);
        TextFieldSemester.setEditable(b);
        TextFieldHOD.setEditable(b);
        CheckBox.setVisible(b);
        PanelUpdateBtn.setVisible(b);
        CheckBox.setSelected(false);
    }

    private void PanelViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelViewMouseClicked
        selectIndex = 1;
        reset(selectIndex);
        this.setEditableAll(false);
        this.fillData();
    }//GEN-LAST:event_PanelViewMouseClicked

    private void PanelViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelViewMouseEntered
        PanelView.setBackground(new Color(50, 50, 50));
    }//GEN-LAST:event_PanelViewMouseEntered

    private void PanelViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelViewMouseExited
        if (selectIndex != 1) {
            PanelView.setBackground(new Color(30, 30, 30));
        }
    }//GEN-LAST:event_PanelViewMouseExited

    private void PanelUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelUpdateMouseClicked
        selectIndex = 2;
        reset(selectIndex);
        this.setEditableAll(true);
    }//GEN-LAST:event_PanelUpdateMouseClicked

    private void PanelUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelUpdateMouseEntered
        PanelUpdate.setBackground(new Color(50, 50, 50));
    }//GEN-LAST:event_PanelUpdateMouseEntered

    private void PanelUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelUpdateMouseExited
        if (selectIndex != 2) {
            PanelUpdate.setBackground(new Color(30, 30, 30));
        }
    }//GEN-LAST:event_PanelUpdateMouseExited

    private void TextFieldNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldNameKeyTyped
        if (!Character.isLetter(evt.getKeyChar()) && !Character.isSpace(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_TextFieldNameKeyTyped

    private void TextFieldMobileNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldMobileNoKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) || TextFieldMobileNo.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_TextFieldMobileNoKeyTyped

    private void TextFieldSemesterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldSemesterKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) || TextFieldSemester.getText().length() >= 1
                || evt.getKeyChar() == '9') {
            evt.consume();
        }
    }//GEN-LAST:event_TextFieldSemesterKeyTyped

    private void TextFieldHODKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldHODKeyTyped
        if (!Character.isLetter(evt.getKeyChar()) && !Character.isSpace(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_TextFieldHODKeyTyped

    private void PanelUpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelUpdateBtnMouseClicked
        if (CheckBox.isSelected()) {
            String mail = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
            Boolean email1 = TextFieldEmail.getText().matches(mail);
            if (TextFieldName.getText().isEmpty() || pickerDOB.getEditor().getText().isEmpty()
                    || TextFieldMobileNo.getText().isEmpty() || TextFieldRollNo.getText().isEmpty()
                    || TextFieldEmail.getText().isEmpty() || ComboBoxStream.getSelectedIndex() == 0
                    || TextFieldSemester.getText().isEmpty() || TextFieldHOD.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "All Fields Are Mandatory", "ERROR", 2);
            } else if (!email1) {
                JOptionPane.showMessageDialog(null, "Invalid Email Address", "ERROR", 2);
            } else if (TextFieldMobileNo.getText().length() != 10) {
                JOptionPane.showMessageDialog(null, "Enter Valid Mobile No.", "ERROR", 2);
            } else {
                placementsolution.MyConnection c = new placementsolution.MyConnection();
                try {
                    c.pre_s = c.sql_con.prepareStatement("UPDATE Registration SET NAME = ?, DOB = ?, "
                            + "MOBILENO = ?, ROLLNO = ?, EMAIL = ?, STREAM = ?, SEMESTER = ?, HOD = ? WHERE EMAIL = ?");
                    c.pre_s.setString(1, TextFieldName.getText().toUpperCase());
                    c.pre_s.setString(2, pickerDOB.getEditor().getText());
                    c.pre_s.setString(3, TextFieldMobileNo.getText());
                    c.pre_s.setString(4, TextFieldRollNo.getText());
                    c.pre_s.setString(5, TextFieldEmail.getText().toUpperCase());
                    c.pre_s.setString(6, ComboBoxStream.getSelectedItem().toString());
                    c.pre_s.setString(7, TextFieldSemester.getText());
                    c.pre_s.setString(8, TextFieldHOD.getText().toUpperCase());
                    c.pre_s.setString(9, this.userName);
                    c.pre_s.executeUpdate();

                    c.pre_s = c.sql_con.prepareStatement("UPDATE Login SET Email = ? WHERE EMAIL = ?");
                    c.pre_s.setString(1, TextFieldEmail.getText().toUpperCase());
                    c.pre_s.setString(2, this.userName);
                    c.pre_s.executeUpdate();

                    c.pre_s = c.sql_con.prepareStatement("UPDATE PLACEDSTUDENTS SET Email = ? WHERE EMAIL = ?");
                    c.pre_s.setString(1, TextFieldEmail.getText().toUpperCase());
                    c.pre_s.setString(2, this.userName);
                    c.pre_s.executeUpdate();

                    c.pre_s = c.sql_con.prepareStatement("UPDATE STUDENTINTERVIEW SET Email = ? WHERE EMAIL = ?");
                    c.pre_s.setString(1, TextFieldEmail.getText().toUpperCase());
                    c.pre_s.setString(2, this.userName);
                    c.pre_s.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Request Submitted Successfully.", "Success", 1);
                    this.userName = TextFieldEmail.getText().toUpperCase();
                    this.fillData();
                    this.setEditableAll(true);
                } catch (SQLException ex) {
                    Logger.getLogger(StudentProfile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_PanelUpdateBtnMouseClicked

    private void PanelUpdateBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelUpdateBtnMouseEntered
        if (CheckBox.isSelected()) {
            PanelUpdateBtn.setBackground(new Color(30, 30, 30));
        }
    }//GEN-LAST:event_PanelUpdateBtnMouseEntered

    private void PanelUpdateBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelUpdateBtnMouseExited
        if (CheckBox.isSelected()) {
            PanelUpdateBtn.setBackground(new Color(50, 50, 50));
        }
    }//GEN-LAST:event_PanelUpdateBtnMouseExited

    private void TextFieldEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldEmailFocusLost
        String mail = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        Boolean email = TextFieldEmail.getText().matches(mail);
        if (!email) {
            JOptionPane.showMessageDialog(null, "Invalid Email Address", "ERROR", 2);
        }
    }//GEN-LAST:event_TextFieldEmailFocusLost

    private void setLook() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    private String userName;
    private int selectIndex = 1;
    private final JXDatePicker pickerDOB;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JComboBox<String> ComboBoxStream;
    private javax.swing.JPanel PanelMainContent;
    private javax.swing.JPanel PanelMenuBar;
    private javax.swing.JPanel PanelUpdate;
    private javax.swing.JPanel PanelUpdateBtn;
    private javax.swing.JPanel PanelView;
    private javax.swing.JTextField TextFieldEmail;
    private javax.swing.JTextField TextFieldHOD;
    private javax.swing.JTextField TextFieldMobileNo;
    private javax.swing.JTextField TextFieldName;
    private javax.swing.JTextField TextFieldRollNo;
    private javax.swing.JTextField TextFieldSemester;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
