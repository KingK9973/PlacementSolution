package placementsolution.Admin.Notices;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import placementsolution.MyConnection;

public class DeleteNotice extends javax.swing.JPanel {

    public DeleteNotice() {
        this.setLook();
        initComponents();
        this.populateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        PaneSelectAllBtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        PaneUnselectAllBtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        PaneDeleteBtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(780, 540));
        setMinimumSize(new java.awt.Dimension(780, 540));
        setPreferredSize(new java.awt.Dimension(780, 540));

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Update Notices");

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

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jTable.setAutoCreateRowSorter(true);
        jTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Subject", "Messages", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
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
            jTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable.getColumnModel().getColumn(3).setMaxWidth(50);
        }

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

        PaneDeleteBtn.setBackground(new java.awt.Color(50, 50, 50));
        PaneDeleteBtn.setMaximumSize(new java.awt.Dimension(100, 40));
        PaneDeleteBtn.setMinimumSize(new java.awt.Dimension(100, 40));
        PaneDeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaneDeleteBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PaneDeleteBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PaneDeleteBtnMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Delete");

        javax.swing.GroupLayout PaneDeleteBtnLayout = new javax.swing.GroupLayout(PaneDeleteBtn);
        PaneDeleteBtn.setLayout(PaneDeleteBtnLayout);
        PaneDeleteBtnLayout.setHorizontalGroup(
            PaneDeleteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneDeleteBtnLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        PaneDeleteBtnLayout.setVerticalGroup(
            PaneDeleteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneDeleteBtnLayout.createSequentialGroup()
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
                .addComponent(PaneDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(PaneDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
        MyConnection c = new MyConnection();

        try {
            c.stm = c.sql_con.createStatement();
            c.r_set = c.stm.executeQuery("select DATE, SUBJECT, MESSAGE from NOTICES WHERE STATUS = 'V'");
            while (c.r_set.next()) {
                model.addRow(new Object[]{c.r_set.getString(1), c.r_set.getString(2), c.r_set.getString(3)});
            }
            c.sql_con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DeleteNotice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void PaneSelectAllBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneSelectAllBtnMouseClicked
        for (int i = 0; i < jTable.getRowCount(); i++) {
            jTable.setValueAt(true, i, 3);
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
            jTable.setValueAt(false, i, 3);
        }
    }//GEN-LAST:event_PaneUnselectAllBtnMouseClicked

    private void PaneUnselectAllBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneUnselectAllBtnMouseEntered
        PaneUnselectAllBtn.setBackground(new Color(30, 30, 30));
    }//GEN-LAST:event_PaneUnselectAllBtnMouseEntered

    private void PaneUnselectAllBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneUnselectAllBtnMouseExited
        PaneUnselectAllBtn.setBackground(new Color(50, 50, 50));
    }//GEN-LAST:event_PaneUnselectAllBtnMouseExited

    private void PaneDeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneDeleteBtnMouseClicked

        MyConnection c = new MyConnection();
        for (int i = 0; i < jTable.getRowCount(); i++) {
            if (jTable.getValueAt(i, 9).equals(true)) {
                try {
                    c.pre_s = c.sql_con.prepareStatement("update NOTICES set STATUS = ? where SUBJECT = ?");
                    c.pre_s.setString(1, "I");
                    c.pre_s.setString(2, jTable.getValueAt(i, 1).toString());
                    c.pre_s.executeUpdate();
                    c.sql_con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DeleteNotice.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        this.populateTable();
    }//GEN-LAST:event_PaneDeleteBtnMouseClicked

    private void PaneDeleteBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneDeleteBtnMouseEntered
        PaneDeleteBtn.setBackground(new Color(30, 30, 30));
    }//GEN-LAST:event_PaneDeleteBtnMouseEntered

    private void PaneDeleteBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneDeleteBtnMouseExited
        PaneDeleteBtn.setBackground(new Color(50, 50, 50));
    }//GEN-LAST:event_PaneDeleteBtnMouseExited

    private void setLook() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteNotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PaneDeleteBtn;
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
