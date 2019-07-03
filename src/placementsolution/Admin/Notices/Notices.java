package placementsolution.Admin.Notices;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Notices extends javax.swing.JFrame {

    public Notices() {
        this.setLook();
        addNotice = new AddNotice();
        updateNotice = new DeleteNotice();
        listNotice = new ListNotice();

        layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;

        initComponents();

        PanelMainContent.setLayout(layout);
        PanelMainContent.add(addNotice, constraints);
        PanelMainContent.add(updateNotice, constraints);
        PanelMainContent.add(listNotice, constraints);

        addNotice.setVisible(true);
        updateNotice.setVisible(false);
        listNotice.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenuBar = new javax.swing.JPanel();
        PanelAdd = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PanelUpdate = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        PanelListView = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        PanelMainContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 540));
        setResizable(false);

        PanelMenuBar.setBackground(new java.awt.Color(30, 30, 30));
        PanelMenuBar.setMaximumSize(new java.awt.Dimension(220, 540));
        PanelMenuBar.setMinimumSize(new java.awt.Dimension(220, 540));
        PanelMenuBar.setPreferredSize(new java.awt.Dimension(220, 540));

        PanelAdd.setBackground(new java.awt.Color(50, 50, 50));
        PanelAdd.setMaximumSize(new java.awt.Dimension(120, 40));
        PanelAdd.setMinimumSize(new java.awt.Dimension(120, 40));
        PanelAdd.setPreferredSize(new java.awt.Dimension(120, 40));
        PanelAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelAddMouseExited(evt);
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
        jLabel2.setText("Add");

        javax.swing.GroupLayout PanelAddLayout = new javax.swing.GroupLayout(PanelAdd);
        PanelAdd.setLayout(PanelAddLayout);
        PanelAddLayout.setHorizontalGroup(
            PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelAddLayout.setVerticalGroup(
            PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(PanelAddLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2))
        );

        PanelUpdate.setBackground(new java.awt.Color(30, 30, 30));
        PanelUpdate.setMaximumSize(new java.awt.Dimension(120, 40));
        PanelUpdate.setMinimumSize(new java.awt.Dimension(120, 40));
        PanelUpdate.setPreferredSize(new java.awt.Dimension(120, 40));
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
        jLabel3.setText("Delete");

        javax.swing.GroupLayout PanelUpdateLayout = new javax.swing.GroupLayout(PanelUpdate);
        PanelUpdate.setLayout(PanelUpdateLayout);
        PanelUpdateLayout.setHorizontalGroup(
            PanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUpdateLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelUpdateLayout.setVerticalGroup(
            PanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(PanelUpdateLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3))
        );

        PanelListView.setBackground(new java.awt.Color(30, 30, 30));
        PanelListView.setMaximumSize(new java.awt.Dimension(120, 40));
        PanelListView.setMinimumSize(new java.awt.Dimension(120, 40));
        PanelListView.setPreferredSize(new java.awt.Dimension(120, 40));
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
        jLabel4.setText("List View");

        javax.swing.GroupLayout PanelListViewLayout = new javax.swing.GroupLayout(PanelListView);
        PanelListView.setLayout(PanelListViewLayout);
        PanelListViewLayout.setHorizontalGroup(
            PanelListViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListViewLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelListViewLayout.setVerticalGroup(
            PanelListViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(PanelListViewLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Notices");

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout PanelMenuBarLayout = new javax.swing.GroupLayout(PanelMenuBar);
        PanelMenuBar.setLayout(PanelMenuBarLayout);
        PanelMenuBarLayout.setHorizontalGroup(
            PanelMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelListView, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(PanelUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(PanelAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addGroup(PanelMenuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(PanelMenuBarLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(135, Short.MAX_VALUE))))
        );
        PanelMenuBarLayout.setVerticalGroup(
            PanelMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuBarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(PanelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(PanelUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(PanelListView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
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
            .addGap(0, 540, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelMainContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelMenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelMainContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reset(int index) {
        if (index != 1) {
            this.PanelAdd.setBackground(new Color(30, 30, 30));
        }
        if (index != 2) {
            this.PanelUpdate.setBackground(new Color(30, 30, 30));
        }
        if (index != 3) {
            this.PanelListView.setBackground(new Color(30, 30, 30));
        }
    }

    private void PanelAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelAddMouseClicked
        selectIndex = 1;
        reset(selectIndex);

        addNotice.setVisible(true);
        updateNotice.setVisible(false);
        listNotice.setVisible(false);
    }//GEN-LAST:event_PanelAddMouseClicked

    private void PanelAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelAddMouseEntered
        PanelAdd.setBackground(new Color(50, 50, 50));
    }//GEN-LAST:event_PanelAddMouseEntered

    private void PanelAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelAddMouseExited
        if (selectIndex != 1) {
            PanelAdd.setBackground(new Color(30, 30, 30));
        }
    }//GEN-LAST:event_PanelAddMouseExited

    private void PanelUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelUpdateMouseClicked
        selectIndex = 2;
        reset(selectIndex);

        updateNotice.populateTable();
        addNotice.setVisible(false);
        updateNotice.setVisible(true);
        listNotice.setVisible(false);
    }//GEN-LAST:event_PanelUpdateMouseClicked

    private void PanelUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelUpdateMouseEntered
        PanelUpdate.setBackground(new Color(50, 50, 50));
    }//GEN-LAST:event_PanelUpdateMouseEntered

    private void PanelUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelUpdateMouseExited
        if (selectIndex != 2) {
            PanelUpdate.setBackground(new Color(30, 30, 30));
        }
    }//GEN-LAST:event_PanelUpdateMouseExited

    private void PanelListViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelListViewMouseClicked
        selectIndex = 3;
        reset(selectIndex);

        listNotice.populateTable();
        addNotice.setVisible(false);
        updateNotice.setVisible(false);
        listNotice.setVisible(true);
    }//GEN-LAST:event_PanelListViewMouseClicked

    private void PanelListViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelListViewMouseEntered
        PanelListView.setBackground(new Color(50, 50, 50));
    }//GEN-LAST:event_PanelListViewMouseEntered

    private void PanelListViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelListViewMouseExited
        if (selectIndex != 3) {
            PanelListView.setBackground(new Color(30, 30, 30));
        }
    }//GEN-LAST:event_PanelListViewMouseExited

    private void setLook() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    private int xx;
    private int yy;
    private int selectIndex = 1;
    private final GridBagLayout layout;
    private final AddNotice addNotice;
    private final DeleteNotice updateNotice;
    private final ListNotice listNotice;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAdd;
    private javax.swing.JPanel PanelListView;
    private javax.swing.JPanel PanelMainContent;
    private javax.swing.JPanel PanelMenuBar;
    private javax.swing.JPanel PanelUpdate;
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
