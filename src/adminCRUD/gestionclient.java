/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package adminCRUD;

import javax.swing.JDesktopPane;

/**
 *
 * @author adem
 */
public class gestionclient extends javax.swing.JInternalFrame {
    private javax.swing.JDesktopPane jDesktopPane2;
    /**
     * Creates new form gestionclient
     */
    public gestionclient() {
        initComponents();
    }


    public gestionclient(javax.swing.JDesktopPane jDesktopPanel) {
        
        this.jDesktopPane2=jDesktopPanel;
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add = new javax.swing.JButton();
        del = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ban = new javax.swing.JButton();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        best = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        add.setBackground(new java.awt.Color(255, 255, 102));
        add.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        add.setText("ajouter");
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        del.setBackground(new java.awt.Color(255, 255, 102));
        del.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        del.setText("supprimer");
        del.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 102));
        jButton3.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        jButton3.setText("modifier");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        ban.setBackground(new java.awt.Color(255, 255, 102));
        ban.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        ban.setText("list banned");
        ban.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        best.setBackground(new java.awt.Color(255, 255, 102));
        best.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        best.setText("best client");
        best.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        best.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ban, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(best, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(ban, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(best, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 230, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        adclient adc=new adclient(jDesktopPane3);
        jDesktopPane3.removeAll();
        jDesktopPane3.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane3.add(adc);
        adc.show();  
    }//GEN-LAST:event_addActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        deleteclient adc=new deleteclient(jDesktopPane3);
        jDesktopPane3.removeAll();
        jDesktopPane3.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane3.add(adc);
        adc.show();  
    }//GEN-LAST:event_delActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        updateclient adc=new updateclient(jDesktopPane3);
        jDesktopPane3.removeAll();
        jDesktopPane3.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane3.add(adc);
        adc.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void banActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banActionPerformed
        listban lis=new listban(jDesktopPane3);
        jDesktopPane3.removeAll();
        jDesktopPane3.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane3.add(lis);
        lis.show();
    }//GEN-LAST:event_banActionPerformed

    private void bestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestActionPerformed
        // TODO add your handling code here:
        bestclient best=new bestclient(jDesktopPane3);
        jDesktopPane3.removeAll();
        jDesktopPane3.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane3.add(best);
        best.show();
    }//GEN-LAST:event_bestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton ban;
    private javax.swing.JButton best;
    private javax.swing.JButton del;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane3;
    // End of variables declaration//GEN-END:variables
}
