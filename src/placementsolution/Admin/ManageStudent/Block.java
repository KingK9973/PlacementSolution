package placementsolution.Admin.ManageStudent;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Block extends javax.swing.JPanel {

    public Block() {
        this.setLook();
        this.setVisible(true);
        panelBlock = new BlockSubPanelBlock();
        panelUnblock = new BlockSubPanelUnblock();
        layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        initComponents();

        PanelMainContent.setLayout(layout);
        PanelMainContent.add(panelBlock, constraints);
        PanelMainContent.add(panelUnblock, constraints);
    }

    void populateAllTable(){
        panelBlock.populateTable();
        panelUnblock.populateTable();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        PaneBlockBtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PaneUnblockBtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        PanelMainContent = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(780, 540));
        setMinimumSize(new java.awt.Dimension(780, 540));
        setPreferredSize(new java.awt.Dimension(780, 540));

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(780, 120));
        jPanel1.setMinimumSize(new java.awt.Dimension(780, 120));
        jPanel1.setPreferredSize(new java.awt.Dimension(780, 120));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Approve Student");

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        PaneBlockBtn.setBackground(new java.awt.Color(60, 60, 60));
        PaneBlockBtn.setMaximumSize(new java.awt.Dimension(100, 40));
        PaneBlockBtn.setMinimumSize(new java.awt.Dimension(100, 40));
        PaneBlockBtn.setPreferredSize(new java.awt.Dimension(100, 40));
        PaneBlockBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaneBlockBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PaneBlockBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PaneBlockBtnMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Block");

        javax.swing.GroupLayout PaneBlockBtnLayout = new javax.swing.GroupLayout(PaneBlockBtn);
        PaneBlockBtn.setLayout(PaneBlockBtnLayout);
        PaneBlockBtnLayout.setHorizontalGroup(
            PaneBlockBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneBlockBtnLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        PaneBlockBtnLayout.setVerticalGroup(
            PaneBlockBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaneBlockBtnLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(13, 13, 13))
        );

        PaneUnblockBtn.setBackground(new java.awt.Color(40, 40, 40));
        PaneUnblockBtn.setMaximumSize(new java.awt.Dimension(100, 40));
        PaneUnblockBtn.setMinimumSize(new java.awt.Dimension(100, 40));
        PaneUnblockBtn.setPreferredSize(new java.awt.Dimension(100, 40));
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

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Unblock");

        javax.swing.GroupLayout PaneUnblockBtnLayout = new javax.swing.GroupLayout(PaneUnblockBtn);
        PaneUnblockBtn.setLayout(PaneUnblockBtnLayout);
        PaneUnblockBtnLayout.setHorizontalGroup(
            PaneUnblockBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaneUnblockBtnLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(28, 28, 28))
        );
        PaneUnblockBtnLayout.setVerticalGroup(
            PaneUnblockBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneUnblockBtnLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PaneBlockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PaneUnblockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PaneBlockBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaneUnblockBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        PanelMainContent.setMaximumSize(new java.awt.Dimension(780, 420));
        PanelMainContent.setMinimumSize(new java.awt.Dimension(780, 420));
        PanelMainContent.setPreferredSize(new java.awt.Dimension(780, 420));

        javax.swing.GroupLayout PanelMainContentLayout = new javax.swing.GroupLayout(PanelMainContent);
        PanelMainContent.setLayout(PanelMainContentLayout);
        PanelMainContentLayout.setHorizontalGroup(
            PanelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelMainContentLayout.setVerticalGroup(
            PanelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelMainContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelMainContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reset(int index) {
        if (index != 1) {
            this.PaneBlockBtn.setBackground(new Color(40, 40, 40));
        }
        if (index != 2) {
            this.PaneUnblockBtn.setBackground(new Color(40, 40, 40));
        }
    }
    private void PaneBlockBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneBlockBtnMouseClicked
        selectIndex = 1;
        reset(selectIndex);
        panelBlock.populateTable();
        panelBlock.setVisible(true);
        panelUnblock.setVisible(false);
    }//GEN-LAST:event_PaneBlockBtnMouseClicked

    private void PaneBlockBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneBlockBtnMouseEntered
        if (selectIndex != 1) {
            PaneBlockBtn.setBackground(new Color(60, 60, 60));
        }
    }//GEN-LAST:event_PaneBlockBtnMouseEntered

    private void PaneBlockBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneBlockBtnMouseExited
        if (selectIndex != 1) {
            PaneBlockBtn.setBackground(new Color(40, 40, 40));
        }
    }//GEN-LAST:event_PaneBlockBtnMouseExited

    private void PaneUnblockBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneUnblockBtnMouseClicked
        selectIndex = 2;
        reset(selectIndex);
        panelUnblock.populateTable();
        panelBlock.setVisible(false);
        panelUnblock.setVisible(true);
    }//GEN-LAST:event_PaneUnblockBtnMouseClicked

    private void PaneUnblockBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneUnblockBtnMouseEntered
        if (selectIndex != 2) {
            PaneUnblockBtn.setBackground(new Color(60, 60, 60));
        }
    }//GEN-LAST:event_PaneUnblockBtnMouseEntered

    private void PaneUnblockBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneUnblockBtnMouseExited
        if (selectIndex != 2) {
            PaneUnblockBtn.setBackground(new Color(40, 40, 40));
        }
    }//GEN-LAST:event_PaneUnblockBtnMouseExited

    private void setLook() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Block.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    private int selectIndex = 1;
    private final GridBagLayout layout;
    private final BlockSubPanelBlock panelBlock;
    private final BlockSubPanelUnblock panelUnblock;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PaneBlockBtn;
    private javax.swing.JPanel PaneUnblockBtn;
    private javax.swing.JPanel PanelMainContent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
