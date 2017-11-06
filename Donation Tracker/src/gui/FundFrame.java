/*
* Author(s): Tellon Smith, Johann Readhead
*/


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author legen
 */
public class FundFrame extends javax.swing.JFrame {

    /**
     * Creates new form FundFrame
     */
    public FundFrame() {
        initComponents();
        // set title frame title
        this.setTitle("Funds");
        // enable column sorting in the table
        fund_table.setAutoCreateRowSorter(true);
        // set funds button background color 
        funds_button.setBackground(Color.white);
        // launch frame maximized
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //set the focus on the funds button
        funds_button.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contributions_button = new javax.swing.JButton();
        donors_button = new javax.swing.JButton();
        funds_button = new javax.swing.JButton();
        reports_button = new javax.swing.JButton();
        fundTable_scrollPane = new javax.swing.JScrollPane();
        fund_table = new javax.swing.JTable();
        addUpdateDelete_panel = new javax.swing.JPanel();
        fundName_label = new javax.swing.JLabel();
        quickbooksAccNo_label = new javax.swing.JLabel();
        fundName_textField = new javax.swing.JTextField();
        quickbooksAccNo_textfield = new javax.swing.JTextField();
        add_button = new javax.swing.JButton();
        update_button = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contributions_button.setText("Contributions");

        donors_button.setText("Donors");

        funds_button.setText("Funds");

        reports_button.setText("Reports");

        fund_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Place Holder 1", "10003"},
                {"Place Holder 2", "10002"},
                {"Place Holder 3", "10001"}
            },
            new String [] {
                "Name", "QuickBooks Account No."
            }
        ));
        fundTable_scrollPane.setViewportView(fund_table);

        addUpdateDelete_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Add/Update/Delete Fund"));
        addUpdateDelete_panel.setToolTipText("");

        fundName_label.setText("Name:");

        quickbooksAccNo_label.setText("QuickBooks Account No.:");

        add_button.setText("Add");

        update_button.setText("Update");

        Reset.setText("Reset");

        delete_button.setText("Delete");

        javax.swing.GroupLayout addUpdateDelete_panelLayout = new javax.swing.GroupLayout(addUpdateDelete_panel);
        addUpdateDelete_panel.setLayout(addUpdateDelete_panelLayout);
        addUpdateDelete_panelLayout.setHorizontalGroup(
            addUpdateDelete_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUpdateDelete_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addUpdateDelete_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addUpdateDelete_panelLayout.createSequentialGroup()
                        .addGroup(addUpdateDelete_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quickbooksAccNo_label)
                            .addComponent(fundName_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addUpdateDelete_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quickbooksAccNo_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(fundName_textField)))
                    .addGroup(addUpdateDelete_panelLayout.createSequentialGroup()
                        .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addUpdateDelete_panelLayout.createSequentialGroup()
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addUpdateDelete_panelLayout.setVerticalGroup(
            addUpdateDelete_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUpdateDelete_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addUpdateDelete_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fundName_label)
                    .addComponent(fundName_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addUpdateDelete_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quickbooksAccNo_label)
                    .addComponent(quickbooksAccNo_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(addUpdateDelete_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_button)
                    .addComponent(update_button))
                .addGap(30, 30, 30)
                .addGroup(addUpdateDelete_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset)
                    .addComponent(delete_button))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fundTable_scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1144, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(contributions_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(donors_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(funds_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reports_button))
                    .addComponent(addUpdateDelete_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contributions_button)
                    .addComponent(donors_button)
                    .addComponent(funds_button)
                    .addComponent(reports_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fundTable_scrollPane)
                .addGap(18, 18, 18)
                .addComponent(addUpdateDelete_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FundFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FundFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FundFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FundFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FundFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.JPanel addUpdateDelete_panel;
    private javax.swing.JButton add_button;
    private javax.swing.JButton contributions_button;
    private javax.swing.JButton delete_button;
    private javax.swing.JButton donors_button;
    private javax.swing.JLabel fundName_label;
    private javax.swing.JTextField fundName_textField;
    private javax.swing.JScrollPane fundTable_scrollPane;
    private javax.swing.JTable fund_table;
    private javax.swing.JButton funds_button;
    private javax.swing.JLabel quickbooksAccNo_label;
    private javax.swing.JTextField quickbooksAccNo_textfield;
    private javax.swing.JButton reports_button;
    private javax.swing.JButton update_button;
    // End of variables declaration//GEN-END:variables
}
