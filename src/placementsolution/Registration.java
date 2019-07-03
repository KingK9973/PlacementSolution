package placementsolution;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.JXDatePicker;

public class Registration extends javax.swing.JFrame {

    public Registration() {
        this.setLook();
        this.setUndecorated(true);

        initComponents();

        this.pickerDOB = new JXDatePicker();
        this.pickerDOB.setDate(java.util.Calendar.getInstance().getTime());
        this.pickerDOB.setFormats(new java.text.SimpleDateFormat("dd/MM/yyyy"));
        this.pickerDOB.setBounds(140, 66, 200, 20);
        this.pickerDOB.setFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 12));
        this.pickerDOB.getEditor().setBorder(null);
        this.pickerDOB.getEditor().setOpaque(false);
        this.pickerDOB.getEditor().setForeground(new java.awt.Color(102, 102, 102));
        this.jPanel1.add(pickerDOB);
        this.pickerDOB.getEditor().addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                pickerDOBFocusGained(evt);
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                pickerDOBFocusLost(evt);
            }
        });
        isButtonSubmitEnable = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelName = new javax.swing.JLabel();
        LabelStream = new javax.swing.JLabel();
        LabelMobileNo = new javax.swing.JLabel();
        LabelRollNo = new javax.swing.JLabel();
        LabelEmail = new javax.swing.JLabel();
        LabelSemester = new javax.swing.JLabel();
        LabelHOD = new javax.swing.JLabel();
        LabelDOB = new javax.swing.JLabel();
        TextFieldName = new javax.swing.JTextField();
        TextFieldMobileNo = new javax.swing.JTextField();
        SeparatorName = new javax.swing.JSeparator();
        SeparatorDOB = new javax.swing.JSeparator();
        SeparatorMobileNo = new javax.swing.JSeparator();
        SeparatorHOD = new javax.swing.JSeparator();
        TextFieldRollNo = new javax.swing.JTextField();
        TextFieldEmail = new javax.swing.JTextField();
        SeparatorRollNo = new javax.swing.JSeparator();
        TextFieldHOD = new javax.swing.JTextField();
        SeparatorEmail = new javax.swing.JSeparator();
        TextFieldSemester = new javax.swing.JTextField();
        SeparatorSemester = new javax.swing.JSeparator();
        ComboBoxStream = new javax.swing.JComboBox<>();
        CheckBox = new javax.swing.JCheckBox();
        ButtonSubmit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        LabelBackArrow = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 586));

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 526));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 526));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 526));

        LabelName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabelName.setForeground(new java.awt.Color(102, 102, 102));
        LabelName.setText("Name");

        LabelStream.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabelStream.setForeground(new java.awt.Color(102, 102, 102));
        LabelStream.setText("Stream");

        LabelMobileNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabelMobileNo.setForeground(new java.awt.Color(102, 102, 102));
        LabelMobileNo.setText("Mobile No.");

        LabelRollNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabelRollNo.setForeground(new java.awt.Color(102, 102, 102));
        LabelRollNo.setText("Roll No.");

        LabelEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabelEmail.setForeground(new java.awt.Color(102, 102, 102));
        LabelEmail.setText("Email");

        LabelSemester.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabelSemester.setForeground(new java.awt.Color(102, 102, 102));
        LabelSemester.setText("Semester");

        LabelHOD.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabelHOD.setForeground(new java.awt.Color(102, 102, 102));
        LabelHOD.setText("HOD");

        LabelDOB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabelDOB.setForeground(new java.awt.Color(102, 102, 102));
        LabelDOB.setText("DOB");

        TextFieldName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TextFieldName.setForeground(new java.awt.Color(102, 102, 102));
        TextFieldName.setBorder(null);
        TextFieldName.setOpaque(false);
        TextFieldName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldNameFocusLost(evt);
            }
        });
        TextFieldName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldNameKeyTyped(evt);
            }
        });

        TextFieldMobileNo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TextFieldMobileNo.setForeground(new java.awt.Color(102, 102, 102));
        TextFieldMobileNo.setBorder(null);
        TextFieldMobileNo.setOpaque(false);
        TextFieldMobileNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldMobileNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldMobileNoFocusLost(evt);
            }
        });
        TextFieldMobileNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldMobileNoKeyTyped(evt);
            }
        });

        SeparatorName.setBackground(new java.awt.Color(102, 102, 102));
        SeparatorName.setForeground(new java.awt.Color(102, 102, 102));

        SeparatorDOB.setBackground(new java.awt.Color(102, 102, 102));
        SeparatorDOB.setForeground(new java.awt.Color(102, 102, 102));

        SeparatorMobileNo.setBackground(new java.awt.Color(102, 102, 102));
        SeparatorMobileNo.setForeground(new java.awt.Color(102, 102, 102));

        SeparatorHOD.setBackground(new java.awt.Color(102, 102, 102));
        SeparatorHOD.setForeground(new java.awt.Color(102, 102, 102));

        TextFieldRollNo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TextFieldRollNo.setForeground(new java.awt.Color(102, 102, 102));
        TextFieldRollNo.setBorder(null);
        TextFieldRollNo.setOpaque(false);
        TextFieldRollNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldRollNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldRollNoFocusLost(evt);
            }
        });

        TextFieldEmail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TextFieldEmail.setForeground(new java.awt.Color(102, 102, 102));
        TextFieldEmail.setBorder(null);
        TextFieldEmail.setOpaque(false);
        TextFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldEmailFocusLost(evt);
            }
        });

        SeparatorRollNo.setBackground(new java.awt.Color(102, 102, 102));
        SeparatorRollNo.setForeground(new java.awt.Color(102, 102, 102));

        TextFieldHOD.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TextFieldHOD.setForeground(new java.awt.Color(102, 102, 102));
        TextFieldHOD.setBorder(null);
        TextFieldHOD.setOpaque(false);
        TextFieldHOD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldHODFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldHODFocusLost(evt);
            }
        });
        TextFieldHOD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldHODKeyTyped(evt);
            }
        });

        SeparatorEmail.setBackground(new java.awt.Color(102, 102, 102));
        SeparatorEmail.setForeground(new java.awt.Color(102, 102, 102));

        TextFieldSemester.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TextFieldSemester.setForeground(new java.awt.Color(102, 102, 102));
        TextFieldSemester.setBorder(null);
        TextFieldSemester.setOpaque(false);
        TextFieldSemester.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldSemesterFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldSemesterFocusLost(evt);
            }
        });
        TextFieldSemester.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldSemesterKeyTyped(evt);
            }
        });

        SeparatorSemester.setBackground(new java.awt.Color(102, 102, 102));
        SeparatorSemester.setForeground(new java.awt.Color(102, 102, 102));

        ComboBoxStream.setBackground(new java.awt.Color(30, 30, 30));
        ComboBoxStream.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ComboBoxStream.setForeground(new java.awt.Color(102, 102, 102));
        ComboBoxStream.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "B-Tech", "BCA", "B.sc", "BBA", "B.Com", "MBA", "MCA", "HM" }));
        ComboBoxStream.setBorder(null);
        ComboBoxStream.setOpaque(false);
        ComboBoxStream.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ComboBoxStreamFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ComboBoxStreamFocusLost(evt);
            }
        });

        CheckBox.setForeground(new java.awt.Color(102, 102, 102));
        CheckBox.setText("<html><p style=\"text-align: justify;\">I, hereby give my consent to Placement Admin and College Authorities to obtain my Name, Email Address and Mobile No. for authentication. Authorities have informed me that my identity information would only be used for authentication and also informed me that Email and Mobile No. may shared with the partners.</p></html>");
        CheckBox.setBorder(null);
        CheckBox.setFocusPainted(false);
        CheckBox.setIconTextGap(10);
        CheckBox.setOpaque(false);
        CheckBox.setVerifyInputWhenFocusTarget(false);
        CheckBox.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        CheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CheckBoxItemStateChanged(evt);
            }
        });

        ButtonSubmit.setBackground(new java.awt.Color(102, 102, 102));
        ButtonSubmit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ButtonSubmit.setForeground(new java.awt.Color(30, 30, 30));
        ButtonSubmit.setText("Submit");
        ButtonSubmit.setBorder(null);
        ButtonSubmit.setBorderPainted(false);
        ButtonSubmit.setEnabled(false);
        ButtonSubmit.setFocusPainted(false);
        ButtonSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonSubmitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LabelName)
                                .addGap(95, 95, 95)
                                .addComponent(TextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelMobileNo)
                                    .addComponent(LabelDOB)
                                    .addComponent(LabelRollNo)
                                    .addComponent(LabelEmail))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TextFieldMobileNo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(SeparatorName))
                                    .addComponent(SeparatorDOB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SeparatorMobileNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldRollNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SeparatorRollNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SeparatorEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelStream)
                                    .addComponent(LabelSemester)
                                    .addComponent(LabelHOD))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextFieldHOD, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(TextFieldSemester, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(SeparatorSemester, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(ComboBoxStream, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SeparatorHOD, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))))
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(ButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(LabelName))
                    .addComponent(TextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(SeparatorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(LabelDOB)
                .addGap(10, 10, 10)
                .addComponent(SeparatorDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelMobileNo)
                    .addComponent(TextFieldMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(SeparatorMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelRollNo)
                    .addComponent(TextFieldRollNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(SeparatorRollNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEmail)
                    .addComponent(TextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(SeparatorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelStream)
                    .addComponent(ComboBoxStream, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSemester)
                    .addComponent(TextFieldSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(SeparatorSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelHOD)
                    .addComponent(TextFieldHOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(SeparatorHOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(25, 25, 25));
        jPanel2.setMaximumSize(new java.awt.Dimension(400, 60));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 60));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 60));

        LabelBackArrow.setForeground(new java.awt.Color(0, 96, 206));
        LabelBackArrow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBackArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/left-arrow.png"))); // NOI18N
        LabelBackArrow.setMaximumSize(new java.awt.Dimension(30, 30));
        LabelBackArrow.setMinimumSize(new java.awt.Dimension(30, 30));
        LabelBackArrow.setPreferredSize(new java.awt.Dimension(30, 30));
        LabelBackArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelBackArrowMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("<html><u>Registration</u></html>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelBackArrow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(LabelBackArrow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LabelBackArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelBackArrowMouseClicked
        this.dispose();
        new LoginArea().setVisible(true);
    }//GEN-LAST:event_LabelBackArrowMouseClicked

    private void TextFieldNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldNameFocusGained
        LabelName.setForeground(new Color(0, 96, 206));
        TextFieldName.setForeground(new Color(0, 96, 206));
        SeparatorName.setForeground(new Color(0, 96, 206));
        SeparatorName.setBackground(new Color(0, 96, 206));
    }//GEN-LAST:event_TextFieldNameFocusGained

    private void TextFieldNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldNameFocusLost
        LabelName.setForeground(new Color(102, 102, 102));
        TextFieldName.setForeground(new Color(102, 102, 102));
        SeparatorName.setForeground(new Color(102, 102, 102));
        SeparatorName.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_TextFieldNameFocusLost

    private void pickerDOBFocusGained(FocusEvent evt) {
        LabelDOB.setForeground(new Color(0, 96, 206));
        pickerDOB.getEditor().setForeground(new java.awt.Color(0, 96, 206));
        SeparatorDOB.setForeground(new Color(0, 96, 206));
        SeparatorDOB.setBackground(new Color(0, 96, 206));

    }

    private void pickerDOBFocusLost(FocusEvent evt) {
        LabelDOB.setForeground(new Color(102, 102, 102));
        pickerDOB.getEditor().setForeground(new java.awt.Color(102, 102, 102));
        SeparatorDOB.setForeground(new Color(102, 102, 102));
        SeparatorDOB.setBackground(new Color(102, 102, 102));
    }

    private void TextFieldMobileNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldMobileNoFocusGained
        LabelMobileNo.setForeground(new Color(0, 96, 206));
        TextFieldMobileNo.setForeground(new Color(0, 96, 206));
        SeparatorMobileNo.setForeground(new Color(0, 96, 206));
        SeparatorMobileNo.setBackground(new Color(0, 96, 206));
    }//GEN-LAST:event_TextFieldMobileNoFocusGained

    private void TextFieldMobileNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldMobileNoFocusLost
        LabelMobileNo.setForeground(new Color(102, 102, 102));
        TextFieldMobileNo.setForeground(new Color(102, 102, 102));
        SeparatorMobileNo.setForeground(new Color(102, 102, 102));
        SeparatorMobileNo.setBackground(new Color(102, 102, 102));

        if (!TextFieldMobileNo.getText().isEmpty() && TextFieldMobileNo.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "Invalid Mobile Number", "ERROR", 2);
        }
    }//GEN-LAST:event_TextFieldMobileNoFocusLost

    private void TextFieldRollNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldRollNoFocusGained
        LabelRollNo.setForeground(new Color(0, 96, 206));
        TextFieldRollNo.setForeground(new Color(0, 96, 206));
        SeparatorRollNo.setForeground(new Color(0, 96, 206));
        SeparatorRollNo.setBackground(new Color(0, 96, 206));
    }//GEN-LAST:event_TextFieldRollNoFocusGained

    private void TextFieldRollNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldRollNoFocusLost
        LabelRollNo.setForeground(new Color(102, 102, 102));
        TextFieldRollNo.setForeground(new Color(102, 102, 102));
        SeparatorRollNo.setForeground(new Color(102, 102, 102));
        SeparatorRollNo.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_TextFieldRollNoFocusLost

    private void TextFieldEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldEmailFocusGained
        LabelEmail.setForeground(new Color(0, 96, 206));
        TextFieldEmail.setForeground(new Color(0, 96, 206));
        SeparatorEmail.setForeground(new Color(0, 96, 206));
        SeparatorEmail.setBackground(new Color(0, 96, 206));
    }//GEN-LAST:event_TextFieldEmailFocusGained

    private void TextFieldEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldEmailFocusLost
        LabelEmail.setForeground(new Color(102, 102, 102));
        TextFieldEmail.setForeground(new Color(102, 102, 102));
        SeparatorEmail.setForeground(new Color(102, 102, 102));
        SeparatorEmail.setBackground(new Color(102, 102, 102));
        Boolean email;
        MyConnection c = new MyConnection();
        if (!TextFieldEmail.getText().isEmpty()) {
            try {
                c.stm = c.sql_con.createStatement();
                c.r_set = c.stm.executeQuery("select Email from Registration where Email='" + TextFieldEmail.getText() + "'");
                if (c.r_set.next()) {
                    JOptionPane.showMessageDialog(null, "Email Address already registered", "ERROR", 2);
                    TextFieldEmail.setText("");
                } else {
                    String mail = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
                    email = TextFieldEmail.getText().matches(mail);
                    if (!email) {
                        JOptionPane.showMessageDialog(null, "Invalid Email Address", "ERROR", 2);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_TextFieldEmailFocusLost

    private void TextFieldSemesterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldSemesterFocusGained
        LabelSemester.setForeground(new Color(0, 96, 206));
        TextFieldSemester.setForeground(new Color(0, 96, 206));
        SeparatorSemester.setForeground(new Color(0, 96, 206));
        SeparatorSemester.setBackground(new Color(0, 96, 206));
    }//GEN-LAST:event_TextFieldSemesterFocusGained

    private void TextFieldSemesterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldSemesterFocusLost
        LabelSemester.setForeground(new Color(102, 102, 102));
        TextFieldSemester.setForeground(new Color(102, 102, 102));
        SeparatorSemester.setForeground(new Color(102, 102, 102));
        SeparatorSemester.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_TextFieldSemesterFocusLost

    private void ComboBoxStreamFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ComboBoxStreamFocusGained
        LabelStream.setForeground(new Color(0, 96, 206));
    }//GEN-LAST:event_ComboBoxStreamFocusGained

    private void ComboBoxStreamFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ComboBoxStreamFocusLost
        LabelStream.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_ComboBoxStreamFocusLost

    private void TextFieldHODFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldHODFocusGained
        LabelHOD.setForeground(new Color(0, 96, 206));
        TextFieldHOD.setForeground(new Color(0, 96, 206));
        SeparatorHOD.setForeground(new Color(0, 96, 206));
        SeparatorHOD.setBackground(new Color(0, 96, 206));
    }//GEN-LAST:event_TextFieldHODFocusGained

    private void TextFieldHODFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldHODFocusLost
        LabelHOD.setForeground(new Color(102, 102, 102));
        TextFieldHOD.setForeground(new Color(102, 102, 102));
        SeparatorHOD.setForeground(new Color(102, 102, 102));
        SeparatorHOD.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_TextFieldHODFocusLost

    private void CheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CheckBoxItemStateChanged
        if (CheckBox.isSelected()) {
            isButtonSubmitEnable = true;
            ButtonSubmit.setEnabled(true);
            ButtonSubmit.setBackground(new java.awt.Color(0, 96, 206));
        } else {
            isButtonSubmitEnable = false;
            ButtonSubmit.setEnabled(false);
            ButtonSubmit.setBackground(new java.awt.Color(102, 102, 102));
        }
    }//GEN-LAST:event_CheckBoxItemStateChanged

    private void TextFieldNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldNameKeyTyped
        if (!Character.isLetter(evt.getKeyChar()) && !Character.isSpace(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_TextFieldNameKeyTyped

    private void TextFieldHODKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldHODKeyTyped
        if (!Character.isLetter(evt.getKeyChar()) && !Character.isSpace(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_TextFieldHODKeyTyped

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

    private void ButtonSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSubmitMouseClicked
        if (isButtonSubmitEnable) {
            if (TextFieldName.getText().isEmpty() || pickerDOB.getEditor().getText().isEmpty()
                    || TextFieldMobileNo.getText().isEmpty() || TextFieldRollNo.getText().isEmpty()
                    || TextFieldEmail.getText().isEmpty() || ComboBoxStream.getSelectedIndex() == 0
                    || TextFieldSemester.getText().isEmpty() || TextFieldHOD.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "All Fields Are Mandatory", "ERROR", 2);
            } else {
                MyConnection c = new MyConnection();
                try {
                    c.pre_s = c.sql_con.prepareStatement("insert into Registration(NAME, DOB, MOBILENO, ROLLNO, "
                            + "EMAIL, STREAM, SEMESTER, HOD) values(?, ?, ?, ?, ?, ?, ?, ?)");
                    c.pre_s.setString(1, TextFieldName.getText().toUpperCase());
                    c.pre_s.setString(2, pickerDOB.getEditor().getText());
                    c.pre_s.setString(3, TextFieldMobileNo.getText());
                    c.pre_s.setString(4, TextFieldRollNo.getText());
                    c.pre_s.setString(5, TextFieldEmail.getText().toUpperCase());
                    c.pre_s.setString(6, ComboBoxStream.getSelectedItem().toString());
                    c.pre_s.setString(7, TextFieldSemester.getText());
                    c.pre_s.setString(8, TextFieldHOD.getText().toUpperCase());
                    c.pre_s.executeUpdate();

                    c.pre_s = c.sql_con.prepareStatement("insert into Login(Email, Password) values(?, ?)");
                    c.pre_s.setString(1, TextFieldEmail.getText().toUpperCase());
                    c.pre_s.setString(2, TextFieldRollNo.getText());
                    c.pre_s.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Your Request will be approve with in 24 working hours."
                            + "\nUse your Roll No as Password.", "Request Submitted Successfully.", 1);

                    this.dispose();
                    new LoginArea().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_ButtonSubmitMouseClicked

    private void setLook() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    private boolean isButtonSubmitEnable;
    private final JXDatePicker pickerDOB;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSubmit;
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JComboBox<String> ComboBoxStream;
    private javax.swing.JLabel LabelBackArrow;
    private javax.swing.JLabel LabelDOB;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelHOD;
    private javax.swing.JLabel LabelMobileNo;
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelRollNo;
    private javax.swing.JLabel LabelSemester;
    private javax.swing.JLabel LabelStream;
    private javax.swing.JSeparator SeparatorDOB;
    private javax.swing.JSeparator SeparatorEmail;
    private javax.swing.JSeparator SeparatorHOD;
    private javax.swing.JSeparator SeparatorMobileNo;
    private javax.swing.JSeparator SeparatorName;
    private javax.swing.JSeparator SeparatorRollNo;
    private javax.swing.JSeparator SeparatorSemester;
    private javax.swing.JTextField TextFieldEmail;
    private javax.swing.JTextField TextFieldHOD;
    private javax.swing.JTextField TextFieldMobileNo;
    private javax.swing.JTextField TextFieldName;
    private javax.swing.JTextField TextFieldRollNo;
    private javax.swing.JTextField TextFieldSemester;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
