package placementsolution.Admin.ManageStudent;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class BlockSubPanelUnblock extends javax.swing.JPanel {

    public BlockSubPanelUnblock() {
        this.setLook();
        this.c = new placementsolution.MyConnection();
        initComponents();
        this.populateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PaneUnblockBtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        PaneUnselectAllBtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        PaneSelectAllBtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(780, 420));
        setMinimumSize(new java.awt.Dimension(780, 420));

        PaneUnblockBtn.setBackground(new java.awt.Color(50, 50, 50));
        PaneUnblockBtn.setMaximumSize(new java.awt.Dimension(100, 40));
        PaneUnblockBtn.setMinimumSize(new java.awt.Dimension(100, 40));
        PaneUnblockBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaneUnblockBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PaneUnblockBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PaneUnblockBtnMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Unblock");

        javax.swing.GroupLayout PaneUnblockBtnLayout = new javax.swing.GroupLayout(PaneUnblockBtn);
        PaneUnblockBtn.setLayout(PaneUnblockBtnLayout);
        PaneUnblockBtnLayout.setHorizontalGroup(
            PaneUnblockBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneUnblockBtnLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        PaneUnblockBtnLayout.setVerticalGroup(
            PaneUnblockBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneUnblockBtnLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel4)
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
                "Roll No.", "Name", "Email", "Mobile No.", "DOB", "Stream", "Sem.", "HOD", "Select"
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(PaneSelectAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(PaneUnselectAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(PaneUnblockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PaneSelectAllBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaneUnselectAllBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaneUnblockBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
                    + "where lg.ACCESS='B'");
            while (c.r_set.next()) {
                model.addRow(new Object[]{c.r_set.getString(1), c.r_set.getString(2), c.r_set.getString(3),
                    c.r_set.getString(4), c.r_set.getString(5), c.r_set.getString(6), c.r_set.getString(7),
                    c.r_set.getString(8), false});
            }

        } catch (SQLException ex) {
            Logger.getLogger(ApproveStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void PaneUnblockBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneUnblockBtnMouseClicked
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
    }//GEN-LAST:event_PaneUnblockBtnMouseClicked

    private void PaneUnblockBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneUnblockBtnMouseEntered
        PaneUnblockBtn.setBackground(new Color(30, 30, 30));
    }//GEN-LAST:event_PaneUnblockBtnMouseEntered

    private void PaneUnblockBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneUnblockBtnMouseExited
        PaneUnblockBtn.setBackground(new Color(50, 50, 50));
    }//GEN-LAST:event_PaneUnblockBtnMouseExited

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

    private void setLook() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlockSubPanelUnblock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    placementsolution.MyConnection c;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PaneSelectAllBtn;
    private javax.swing.JPanel PaneUnblockBtn;
    private javax.swing.JPanel PaneUnselectAllBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
