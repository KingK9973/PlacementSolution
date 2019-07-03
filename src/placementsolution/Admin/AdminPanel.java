package placementsolution.Admin;

import java.awt.Color;

public class AdminPanel extends javax.swing.JFrame {

    public AdminPanel() {
        this.setLook();
        manageStudent = new placementsolution.Admin.ManageStudent.ManageStudent();
        manageCompany = new placementsolution.Admin.ManageCompany.ManageCompany();
        manageInterview = new placementsolution.Admin.ManageInterview.ManageInterview();
        notices = new placementsolution.Admin.Notices.Notices();
        placements = new placementsolution.Admin.Placements.Placements();
        this.setUndecorated(true);
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTitleBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        PanelManageStudents = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        PanelManageCompany = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        PanelManageInterview = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        PanelLogout = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        PanelPlacements = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        PanelNotices = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(920, 560));

        PanelTitleBar.setBackground(new java.awt.Color(30, 30, 30));
        PanelTitleBar.setMaximumSize(new java.awt.Dimension(920, 200));
        PanelTitleBar.setMinimumSize(new java.awt.Dimension(920, 200));
        PanelTitleBar.setPreferredSize(new java.awt.Dimension(920, 200));
        PanelTitleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelTitleBarMouseDragged(evt);
            }
        });
        PanelTitleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelTitleBarMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoIcon.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 109, 240));
        jLabel2.setText("Placement Solutions");

        jSeparator1.setBackground(new java.awt.Color(0, 109, 240));
        jSeparator1.setForeground(new java.awt.Color(0, 109, 240));
        jSeparator1.setMaximumSize(new java.awt.Dimension(500, 2));
        jSeparator1.setMinimumSize(new java.awt.Dimension(500, 2));
        jSeparator1.setPreferredSize(new java.awt.Dimension(500, 2));

        javax.swing.GroupLayout PanelTitleBarLayout = new javax.swing.GroupLayout(PanelTitleBar);
        PanelTitleBar.setLayout(PanelTitleBarLayout);
        PanelTitleBarLayout.setHorizontalGroup(
            PanelTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTitleBarLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        PanelTitleBarLayout.setVerticalGroup(
            PanelTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTitleBarLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(PanelTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(PanelTitleBarLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setMaximumSize(new java.awt.Dimension(920, 360));
        jPanel2.setMinimumSize(new java.awt.Dimension(920, 360));

        PanelManageStudents.setBackground(new java.awt.Color(235, 235, 235));
        PanelManageStudents.setMaximumSize(new java.awt.Dimension(110, 110));
        PanelManageStudents.setMinimumSize(new java.awt.Dimension(110, 110));
        PanelManageStudents.setPreferredSize(new java.awt.Dimension(110, 110));
        PanelManageStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelManageStudentsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelManageStudentsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelManageStudentsMouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/student.png"))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 109, 240));
        jLabel22.setText("Manage Students");

        javax.swing.GroupLayout PanelManageStudentsLayout = new javax.swing.GroupLayout(PanelManageStudents);
        PanelManageStudents.setLayout(PanelManageStudentsLayout);
        PanelManageStudentsLayout.setHorizontalGroup(
            PanelManageStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelManageStudentsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(23, 23, 23))
            .addGroup(PanelManageStudentsLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel22)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        PanelManageStudentsLayout.setVerticalGroup(
            PanelManageStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelManageStudentsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(jLabel22)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        PanelManageCompany.setBackground(new java.awt.Color(235, 235, 235));
        PanelManageCompany.setMaximumSize(new java.awt.Dimension(110, 110));
        PanelManageCompany.setMinimumSize(new java.awt.Dimension(110, 110));
        PanelManageCompany.setPreferredSize(new java.awt.Dimension(110, 110));
        PanelManageCompany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelManageCompanyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelManageCompanyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelManageCompanyMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Company.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 109, 240));
        jLabel23.setText("Manage Company");

        javax.swing.GroupLayout PanelManageCompanyLayout = new javax.swing.GroupLayout(PanelManageCompany);
        PanelManageCompany.setLayout(PanelManageCompanyLayout);
        PanelManageCompanyLayout.setHorizontalGroup(
            PanelManageCompanyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelManageCompanyLayout.createSequentialGroup()
                .addGroup(PanelManageCompanyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelManageCompanyLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5))
                    .addGroup(PanelManageCompanyLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel23)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelManageCompanyLayout.setVerticalGroup(
            PanelManageCompanyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelManageCompanyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addContainerGap())
        );

        PanelManageInterview.setBackground(new java.awt.Color(235, 235, 235));
        PanelManageInterview.setMaximumSize(new java.awt.Dimension(110, 110));
        PanelManageInterview.setMinimumSize(new java.awt.Dimension(110, 110));
        PanelManageInterview.setPreferredSize(new java.awt.Dimension(110, 110));
        PanelManageInterview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelManageInterviewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelManageInterviewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelManageInterviewMouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/interview.png"))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 109, 240));
        jLabel24.setText("Manage Interview");

        javax.swing.GroupLayout PanelManageInterviewLayout = new javax.swing.GroupLayout(PanelManageInterview);
        PanelManageInterview.setLayout(PanelManageInterviewLayout);
        PanelManageInterviewLayout.setHorizontalGroup(
            PanelManageInterviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelManageInterviewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(23, 23, 23))
            .addGroup(PanelManageInterviewLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel24)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        PanelManageInterviewLayout.setVerticalGroup(
            PanelManageInterviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelManageInterviewLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addGap(10, 10, 10)
                .addComponent(jLabel24)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        PanelLogout.setBackground(new java.awt.Color(235, 235, 235));
        PanelLogout.setMaximumSize(new java.awt.Dimension(110, 110));
        PanelLogout.setMinimumSize(new java.awt.Dimension(110, 110));
        PanelLogout.setPreferredSize(new java.awt.Dimension(110, 110));
        PanelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelLogoutMouseExited(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 109, 240));
        jLabel27.setText("Logout");

        javax.swing.GroupLayout PanelLogoutLayout = new javax.swing.GroupLayout(PanelLogout);
        PanelLogout.setLayout(PanelLogoutLayout);
        PanelLogoutLayout.setHorizontalGroup(
            PanelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLogoutLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(PanelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLogoutLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel27))
                    .addComponent(jLabel9))
                .addGap(23, 23, 23))
        );
        PanelLogoutLayout.setVerticalGroup(
            PanelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLogoutLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addGap(10, 10, 10)
                .addComponent(jLabel27)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        PanelPlacements.setBackground(new java.awt.Color(235, 235, 235));
        PanelPlacements.setMaximumSize(new java.awt.Dimension(110, 110));
        PanelPlacements.setMinimumSize(new java.awt.Dimension(110, 110));
        PanelPlacements.setPreferredSize(new java.awt.Dimension(110, 110));
        PanelPlacements.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelPlacementsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelPlacementsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelPlacementsMouseExited(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/placement.png"))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 109, 240));
        jLabel26.setText("Placements");

        javax.swing.GroupLayout PanelPlacementsLayout = new javax.swing.GroupLayout(PanelPlacements);
        PanelPlacements.setLayout(PanelPlacementsLayout);
        PanelPlacementsLayout.setHorizontalGroup(
            PanelPlacementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlacementsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanelPlacementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(PanelPlacementsLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel26)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        PanelPlacementsLayout.setVerticalGroup(
            PanelPlacementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlacementsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel8)
                .addGap(10, 10, 10)
                .addComponent(jLabel26)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        PanelNotices.setBackground(new java.awt.Color(235, 235, 235));
        PanelNotices.setMaximumSize(new java.awt.Dimension(110, 110));
        PanelNotices.setMinimumSize(new java.awt.Dimension(110, 110));
        PanelNotices.setPreferredSize(new java.awt.Dimension(110, 110));
        PanelNotices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelNoticesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelNoticesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelNoticesMouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/notice.png"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 109, 240));
        jLabel25.setText("Notices");

        javax.swing.GroupLayout PanelNoticesLayout = new javax.swing.GroupLayout(PanelNotices);
        PanelNotices.setLayout(PanelNoticesLayout);
        PanelNoticesLayout.setHorizontalGroup(
            PanelNoticesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNoticesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNoticesLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(36, 36, 36))
        );
        PanelNoticesLayout.setVerticalGroup(
            PanelNoticesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNoticesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addGap(10, 10, 10)
                .addComponent(jLabel25)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelManageStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelNotices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelManageCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelPlacements, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelManageInterview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelManageStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelManageCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelManageInterview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelNotices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelPlacements, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PanelTitleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelTitleBarMousePressed
        this.xx = evt.getX();
        this.yy = evt.getY();
        System.out.println("xx = " + xx + "\nyy = " + yy);
    }//GEN-LAST:event_PanelTitleBarMousePressed

    private void PanelTitleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelTitleBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        System.out.println("x = " + xx + "\ny = " + y);
        System.out.println("x - xx = " + (x - xx) + "\ny - yy = " + (y - yy));
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_PanelTitleBarMouseDragged

    private void PanelManageStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelManageStudentsMouseClicked
        manageStudent.setVisible(true);
    }//GEN-LAST:event_PanelManageStudentsMouseClicked

    private void PanelManageStudentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelManageStudentsMouseEntered
        PanelManageStudents.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_PanelManageStudentsMouseEntered

    private void PanelManageStudentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelManageStudentsMouseExited
        PanelManageStudents.setBackground(new Color(235, 235, 235));
    }//GEN-LAST:event_PanelManageStudentsMouseExited

    private void PanelManageCompanyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelManageCompanyMouseClicked
        manageCompany.setVisible(true);
    }//GEN-LAST:event_PanelManageCompanyMouseClicked

    private void PanelManageCompanyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelManageCompanyMouseEntered
        PanelManageCompany.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_PanelManageCompanyMouseEntered

    private void PanelManageCompanyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelManageCompanyMouseExited
        PanelManageCompany.setBackground(new Color(235, 235, 235));
    }//GEN-LAST:event_PanelManageCompanyMouseExited

    private void PanelManageInterviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelManageInterviewMouseClicked
        manageInterview.setVisible(true);
    }//GEN-LAST:event_PanelManageInterviewMouseClicked

    private void PanelManageInterviewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelManageInterviewMouseEntered
        PanelManageInterview.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_PanelManageInterviewMouseEntered

    private void PanelManageInterviewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelManageInterviewMouseExited
        PanelManageInterview.setBackground(new Color(235, 235, 235));
    }//GEN-LAST:event_PanelManageInterviewMouseExited

    private void PanelNoticesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelNoticesMouseClicked
        notices.setVisible(true);
    }//GEN-LAST:event_PanelNoticesMouseClicked

    private void PanelNoticesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelNoticesMouseEntered
        PanelNotices.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_PanelNoticesMouseEntered

    private void PanelNoticesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelNoticesMouseExited
        PanelNotices.setBackground(new Color(235, 235, 235));
    }//GEN-LAST:event_PanelNoticesMouseExited

    private void PanelPlacementsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelPlacementsMouseClicked
        placements.setVisible(true);
    }//GEN-LAST:event_PanelPlacementsMouseClicked

    private void PanelPlacementsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelPlacementsMouseEntered
        PanelPlacements.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_PanelPlacementsMouseEntered

    private void PanelPlacementsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelPlacementsMouseExited
        PanelPlacements.setBackground(new Color(235, 235, 235));
    }//GEN-LAST:event_PanelPlacementsMouseExited

    private void PanelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelLogoutMouseClicked
        this.dispose();
        manageStudent.dispose();
        manageCompany.dispose();
        manageInterview.dispose();
        notices.dispose();
        placements.dispose();
        new placementsolution.LoginArea().setVisible(true);
    }//GEN-LAST:event_PanelLogoutMouseClicked

    private void PanelLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelLogoutMouseEntered
        PanelLogout.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_PanelLogoutMouseEntered

    private void PanelLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelLogoutMouseExited
        PanelLogout.setBackground(new Color(235, 235, 235));
    }//GEN-LAST:event_PanelLogoutMouseExited

    private void setLook() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    private int xx;
    private int yy;
    private final placementsolution.Admin.ManageStudent.ManageStudent manageStudent;
    private final placementsolution.Admin.ManageCompany.ManageCompany manageCompany;
    private final placementsolution.Admin.ManageInterview.ManageInterview manageInterview;
    private final placementsolution.Admin.Notices.Notices notices;
    private final placementsolution.Admin.Placements.Placements placements;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelLogout;
    private javax.swing.JPanel PanelManageCompany;
    private javax.swing.JPanel PanelManageInterview;
    private javax.swing.JPanel PanelManageStudents;
    private javax.swing.JPanel PanelNotices;
    private javax.swing.JPanel PanelPlacements;
    private javax.swing.JPanel PanelTitleBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
