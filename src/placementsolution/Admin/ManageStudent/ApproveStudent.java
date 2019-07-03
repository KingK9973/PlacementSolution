package placementsolution.Admin.ManageStudent;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ApproveStudent extends javax.swing.JPanel {

    public ApproveStudent() {
        this.setLook();
        this.setVisible(true);
        this.c = new placementsolution.MyConnection();
        initComponents();
        this.populateTable();

    }

    void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);

        try {
            c.stm = c.sql_con.createStatement();
            c.r_set = c.stm.executeQuery("select "
                    + "r.ROLLNO,r.\"NAME\",r.EMAIL,r.MOBILENO,r.DOB,r.STREAM,r.SEMESTER,r.HOD "
                    + "from REGISTRATION r INNER JOIN LOGIN lg "
                    + "ON "
                    + "r.EMAIL = lg.EMAIL "
                    + "where lg.ACCESS='N'");
            while (c.r_set.next()) {
                model.addRow(new Object[]{c.r_set.getString(1), c.r_set.getString(2), c.r_set.getString(3),
                    c.r_set.getString(4), c.r_set.getString(5), c.r_set.getString(6), c.r_set.getString(7),
                    c.r_set.getString(8), false});
            }

        } catch (SQLException ex) {
            Logger.getLogger(ApproveStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PaneSelectAllBtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PaneUnselectAllBtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        PaneApproveBtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(780, 540));
        setMinimumSize(new java.awt.Dimension(780, 540));

        PaneSelectAllBtn.setBackground(new java.awt.Color(50, 50, 50));
        PaneSelectAllBtn.setMaximumSize(new java.awt.Dimension(100, 40));
        PaneSelectAllBtn.setMinimumSize(new java.awt.Dimension(100, 40));
        PaneSelectAllBtn.setPreferredSize(new java.awt.Dimension(100, 40));
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

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Select All");

        javax.swing.GroupLayout PaneSelectAllBtnLayout = new javax.swing.GroupLayout(PaneSelectAllBtn);
        PaneSelectAllBtn.setLayout(PaneSelectAllBtnLayout);
        PaneSelectAllBtnLayout.setHorizontalGroup(
            PaneSelectAllBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneSelectAllBtnLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        PaneSelectAllBtnLayout.setVerticalGroup(
            PaneSelectAllBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneSelectAllBtnLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PaneUnselectAllBtn.setBackground(new java.awt.Color(50, 50, 50));
        PaneUnselectAllBtn.setMaximumSize(new java.awt.Dimension(100, 40));
        PaneUnselectAllBtn.setMinimumSize(new java.awt.Dimension(100, 40));
        PaneUnselectAllBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaneUnselectAllBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PaneUnselectAllBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PaneUnselectAllBtnMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Unselect All");

        javax.swing.GroupLayout PaneUnselectAllBtnLayout = new javax.swing.GroupLayout(PaneUnselectAllBtn);
        PaneUnselectAllBtn.setLayout(PaneUnselectAllBtnLayout);
        PaneUnselectAllBtnLayout.setHorizontalGroup(
            PaneUnselectAllBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneUnselectAllBtnLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        PaneUnselectAllBtnLayout.setVerticalGroup(
            PaneUnselectAllBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneUnselectAllBtnLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jTable.setAutoCreateRowSorter(true);
        jTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Roll No.", "Name", "Email", "Mobile No.", "DOB", "Stream", "Sem.", "HOD", "Approve"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setGridColor(new java.awt.Color(255, 255, 255));
        jTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable.setRowHeight(20);
        jTable.setSelectionBackground(new java.awt.Color(50, 50, 50));
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable.getColumnModel().getColumn(3).setResizable(false);
            jTable.getColumnModel().getColumn(3).setPreferredWidth(40);
            jTable.getColumnModel().getColumn(4).setResizable(false);
            jTable.getColumnModel().getColumn(4).setPreferredWidth(35);
            jTable.getColumnModel().getColumn(5).setPreferredWidth(10);
            jTable.getColumnModel().getColumn(6).setResizable(false);
            jTable.getColumnModel().getColumn(6).setPreferredWidth(5);
            jTable.getColumnModel().getColumn(8).setResizable(false);
            jTable.getColumnModel().getColumn(8).setPreferredWidth(15);
        }

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Approve Student");

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

        PaneApproveBtn.setBackground(new java.awt.Color(50, 50, 50));
        PaneApproveBtn.setMaximumSize(new java.awt.Dimension(100, 40));
        PaneApproveBtn.setMinimumSize(new java.awt.Dimension(100, 40));
        PaneApproveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaneApproveBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PaneApproveBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PaneApproveBtnMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Approve");

        javax.swing.GroupLayout PaneApproveBtnLayout = new javax.swing.GroupLayout(PaneApproveBtn);
        PaneApproveBtn.setLayout(PaneApproveBtnLayout);
        PaneApproveBtnLayout.setHorizontalGroup(
            PaneApproveBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneApproveBtnLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        PaneApproveBtnLayout.setVerticalGroup(
            PaneApproveBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneApproveBtnLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(PaneSelectAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(PaneUnselectAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(PaneApproveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PaneSelectAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaneUnselectAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaneApproveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PaneSelectAllBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneSelectAllBtnMouseClicked
        for (int i = 0; i < jTable.getRowCount(); i++) {
            jTable.setValueAt(true, i, 8);
        }
    }//GEN-LAST:event_PaneSelectAllBtnMouseClicked

    private void PaneSelectAllBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneSelectAllBtnMouseEntered
        PaneSelectAllBtn.setBackground(new Color(30, 30, 30));
    }//GEN-LAST:event_PaneSelectAllBtnMouseEntered

    private void PaneSelectAllBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneSelectAllBtnMouseExited
        PaneSelectAllBtn.setBackground(new Color(50, 50, 50));
    }//GEN-LAST:event_PaneSelectAllBtnMouseExited

    private void PaneUnselectAllBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneUnselectAllBtnMouseClicked
        for (int i = 0; i < jTable.getRowCount(); i++) {
            jTable.setValueAt(false, i, 8);
        }
    }//GEN-LAST:event_PaneUnselectAllBtnMouseClicked

    private void PaneUnselectAllBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneUnselectAllBtnMouseEntered
        PaneUnselectAllBtn.setBackground(new Color(30, 30, 30));
    }//GEN-LAST:event_PaneUnselectAllBtnMouseEntered

    private void PaneUnselectAllBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneUnselectAllBtnMouseExited
        PaneUnselectAllBtn.setBackground(new Color(50, 50, 50));
    }//GEN-LAST:event_PaneUnselectAllBtnMouseExited

    private void PaneApproveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneApproveBtnMouseClicked
        for (int i = 0; i < jTable.getRowCount(); i++) {
            if (jTable.getValueAt(i, 8).equals(true)) {
                try {
                    c.pre_s = c.sql_con.prepareStatement("update LOGIN set ACCESS = ? where EMAIL = ?");
                    c.pre_s.setString(1, "Y");
                    c.pre_s.setString(2, jTable.getValueAt(i, 2).toString());
                    c.pre_s.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(ApproveStudent.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        this.populateTable();
    }//GEN-LAST:event_PaneApproveBtnMouseClicked

    private void PaneApproveBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneApproveBtnMouseEntered
        PaneApproveBtn.setBackground(new Color(30, 30, 30));
    }//GEN-LAST:event_PaneApproveBtnMouseEntered

    private void PaneApproveBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneApproveBtnMouseExited
        PaneApproveBtn.setBackground(new Color(50, 50, 50));
    }//GEN-LAST:event_PaneApproveBtnMouseExited

    private void setLook() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApproveStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    placementsolution.MyConnection c;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PaneApproveBtn;
    private javax.swing.JPanel PaneSelectAllBtn;
    private javax.swing.JPanel PaneUnselectAllBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
