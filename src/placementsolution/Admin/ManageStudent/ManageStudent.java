package placementsolution.Admin.ManageStudent;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class ManageStudent extends javax.swing.JFrame {

    public ManageStudent() {
        this.setLook();
        approveStudent = new ApproveStudent();
        listStudent = new ListStudent();
        block = new Block();
        layout = new GridBagLayout();
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        initComponents();

        PanelMainContent.setLayout(layout);
        PanelMainContent.add(approveStudent, constraints);
        PanelMainContent.add(listStudent, constraints);
        PanelMainContent.add(block, constraints);

        approveStudent.setVisible(true);
        listStudent.setVisible(false);
        block.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenuBar = new javax.swing.JPanel();
        PanelApproveStudent = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PanelListView = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        PanelBlock = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        PanelMainContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 540));
        setMinimumSize(new java.awt.Dimension(1000, 540));
        setResizable(false);

        PanelMenuBar.setBackground(new java.awt.Color(30, 30, 30));
        PanelMenuBar.setMaximumSize(new java.awt.Dimension(220, 540));
        PanelMenuBar.setMinimumSize(new java.awt.Dimension(220, 540));
        PanelMenuBar.setPreferredSize(new java.awt.Dimension(220, 540));

        PanelApproveStudent.setBackground(new java.awt.Color(50, 50, 50));
        PanelApproveStudent.setMaximumSize(new java.awt.Dimension(220, 40));
        PanelApproveStudent.setMinimumSize(new java.awt.Dimension(220, 40));
        PanelApproveStudent.setPreferredSize(new java.awt.Dimension(220, 40));
        PanelApproveStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelApproveStudentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelApproveStudentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelApproveStudentMouseExited(evt);
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
        jLabel2.setText("Approve Student");

        javax.swing.GroupLayout PanelApproveStudentLayout = new javax.swing.GroupLayout(PanelApproveStudent);
        PanelApproveStudent.setLayout(PanelApproveStudentLayout);
        PanelApproveStudentLayout.setHorizontalGroup(
            PanelApproveStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelApproveStudentLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelApproveStudentLayout.setVerticalGroup(
            PanelApproveStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(PanelApproveStudentLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2))
        );

        PanelListView.setBackground(new java.awt.Color(30, 30, 30));
        PanelListView.setMaximumSize(new java.awt.Dimension(220, 40));
        PanelListView.setMinimumSize(new java.awt.Dimension(220, 40));
        PanelListView.setPreferredSize(new java.awt.Dimension(220, 40));
        PanelListView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelListViewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelListViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelListViewMouseExited(evt);
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
        jLabel3.setText("List View");

        javax.swing.GroupLayout PanelListViewLayout = new javax.swing.GroupLayout(PanelListView);
        PanelListView.setLayout(PanelListViewLayout);
        PanelListViewLayout.setHorizontalGroup(
            PanelListViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListViewLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelListViewLayout.setVerticalGroup(
            PanelListViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(PanelListViewLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3))
        );

        PanelBlock.setBackground(new java.awt.Color(30, 30, 30));
        PanelBlock.setMaximumSize(new java.awt.Dimension(220, 40));
        PanelBlock.setMinimumSize(new java.awt.Dimension(220, 40));
        PanelBlock.setPreferredSize(new java.awt.Dimension(220, 40));
        PanelBlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelBlockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelBlockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelBlockMouseExited(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(150, 150, 150));
        jPanel7.setPreferredSize(new java.awt.Dimension(3, 50));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Block");

        javax.swing.GroupLayout PanelBlockLayout = new javax.swing.GroupLayout(PanelBlock);
        PanelBlock.setLayout(PanelBlockLayout);
        PanelBlockLayout.setHorizontalGroup(
            PanelBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBlockLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelBlockLayout.setVerticalGroup(
            PanelBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(PanelBlockLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Manage Student");

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout PanelMenuBarLayout = new javax.swing.GroupLayout(PanelMenuBar);
        PanelMenuBar.setLayout(PanelMenuBarLayout);
        PanelMenuBarLayout.setHorizontalGroup(
            PanelMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuBarLayout.createSequentialGroup()
                .addGroup(PanelMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelListView, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelApproveStudent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelBlock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(PanelMenuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMenuBarLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelMenuBarLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
        );
        PanelMenuBarLayout.setVerticalGroup(
            PanelMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuBarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(PanelApproveStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(PanelListView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(PanelBlock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        PanelMainContent.setMaximumSize(new java.awt.Dimension(780, 540));
        PanelMainContent.setMinimumSize(new java.awt.Dimension(780, 540));
        PanelMainContent.setPreferredSize(new java.awt.Dimension(780, 540));

        javax.swing.GroupLayout PanelMainContentLayout = new javax.swing.GroupLayout(PanelMainContent);
        PanelMainContent.setLayout(PanelMainContentLayout);
        PanelMainContentLayout.setHorizontalGroup(
            PanelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        PanelMainContentLayout.setVerticalGroup(
            PanelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelMainContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(PanelMainContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reset(int index) {
        if (index != 1) {
            this.PanelApproveStudent.setBackground(new Color(30, 30, 30));
        }
        if (index != 2) {
            this.PanelListView.setBackground(new Color(30, 30, 30));
        }
        if (index != 3) {
            this.PanelBlock.setBackground(new Color(30, 30, 30));
        }
    }

    private void PanelApproveStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelApproveStudentMouseClicked
        selectIndex = 1;
        reset(selectIndex);
        approveStudent.populateTable();
        approveStudent.setVisible(true);
        listStudent.setVisible(false);
        block.setVisible(false);
    }//GEN-LAST:event_PanelApproveStudentMouseClicked

    private void PanelApproveStudentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelApproveStudentMouseEntered
        PanelApproveStudent.setBackground(new Color(50, 50, 50));
    }//GEN-LAST:event_PanelApproveStudentMouseEntered

    private void PanelApproveStudentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelApproveStudentMouseExited
        if (selectIndex != 1) {
            PanelApproveStudent.setBackground(new Color(30, 30, 30));
        }
    }//GEN-LAST:event_PanelApproveStudentMouseExited

    private void PanelListViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelListViewMouseClicked
        selectIndex = 2;
        reset(selectIndex);
        listStudent.populateTable();
        approveStudent.setVisible(false);
        listStudent.setVisible(true);
        block.setVisible(false);
        listStudent.populateTable();
    }//GEN-LAST:event_PanelListViewMouseClicked

    private void PanelListViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelListViewMouseEntered
        PanelListView.setBackground(new Color(50, 50, 50));
    }//GEN-LAST:event_PanelListViewMouseEntered

    private void PanelListViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelListViewMouseExited
        if (selectIndex != 2) {
            PanelListView.setBackground(new Color(30, 30, 30));
        }
    }//GEN-LAST:event_PanelListViewMouseExited

    private void PanelBlockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBlockMouseClicked
        selectIndex = 3;
        reset(selectIndex);

        block.populateAllTable();
        approveStudent.setVisible(false);
        listStudent.setVisible(false);
        block.setVisible(true);

    }//GEN-LAST:event_PanelBlockMouseClicked

    private void PanelBlockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBlockMouseEntered
        PanelBlock.setBackground(new Color(50, 50, 50));
    }//GEN-LAST:event_PanelBlockMouseEntered

    private void PanelBlockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBlockMouseExited
        if (selectIndex != 3) {
            PanelBlock.setBackground(new Color(30, 30, 30));
        }
    }//GEN-LAST:event_PanelBlockMouseExited

    private void setLook() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    private int xx;
    private int yy;
    private int selectIndex = 1;
    private final GridBagLayout layout;
    private final ApproveStudent approveStudent;
    private final ListStudent listStudent;
    private final Block block;
    private final GridBagConstraints constraints;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelApproveStudent;
    private javax.swing.JPanel PanelBlock;
    private javax.swing.JPanel PanelListView;
    private javax.swing.JPanel PanelMainContent;
    private javax.swing.JPanel PanelMenuBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
