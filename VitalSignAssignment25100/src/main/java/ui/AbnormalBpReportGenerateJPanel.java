/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import System.AppDataStore;
import System.Appointment;
import System.VitalSignNormalRange;
import System.Doctor;
import System.Patient;
import System.Range;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.Collection;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ankur Bywar
 */
public class AbnormalBpReportGenerateJPanel extends javax.swing.JPanel {

    private final AppDataStore dataStore;
    private final Doctor doctor;
    private final JPanel mainWorkArea;

    /**
     * Creates new form ReportGenerateJPanel
     */
    public AbnormalBpReportGenerateJPanel(JPanel mainWorkArea, Doctor doctor, AppDataStore dataStore) {
        
        this.mainWorkArea = mainWorkArea;
        this.dataStore = dataStore;
        this.doctor = doctor;
        initComponents();
        populateBpTable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblReportGenerate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReportGenerate = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jCheckBoxShowOnlyAbnormalBp = new javax.swing.JCheckBox();

        lblReportGenerate.setText("       Report Generate");

        tblReportGenerate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Encounter date", "Age (in months)", "Actual BP", "Is BP Normal", "Normal BP Range"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblReportGenerate);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jCheckBoxShowOnlyAbnormalBp.setText("Only Show Abnormal Patients");
        jCheckBoxShowOnlyAbnormalBp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxShowOnlyAbnormalBpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btnBack)
                                .addGap(102, 102, 102)
                                .addComponent(lblReportGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(jCheckBoxShowOnlyAbnormalBp)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblReportGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnBack)))
                .addGap(39, 39, 39)
                .addComponent(jCheckBoxShowOnlyAbnormalBp)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        nextScreen(new DoctorWorkAreaJPanel(mainWorkArea, doctor, dataStore), 
                "AbnormalBpReportGenerateJPanel");    
    }//GEN-LAST:event_btnBackActionPerformed

    private void jCheckBoxShowOnlyAbnormalBpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxShowOnlyAbnormalBpActionPerformed
        // TODO add your handling code here:
        
        if (jCheckBoxShowOnlyAbnormalBp.isSelected()) {
            populateBpTable(true);
        } else {
            populateBpTable(false);
        }
    }//GEN-LAST:event_jCheckBoxShowOnlyAbnormalBpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JCheckBox jCheckBoxShowOnlyAbnormalBp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblReportGenerate;
    private javax.swing.JTable tblReportGenerate;
    // End of variables declaration//GEN-END:variables

//    private void nextScreen(JPanel nextScreen, String screenName) {
//        mainWorkArea.removeAll();
//        mainWorkArea.add(screenName , nextScreen);
//        CardLayout layout = (CardLayout)mainWorkArea.getLayout();
//        layout.next(mainWorkArea); 
//    }
    
    private void nextScreen(JPanel nextScreen, String screenName) {
        mainWorkArea.removeAll();
        mainWorkArea.add(nextScreen, screenName);
        CardLayout layout = (CardLayout)mainWorkArea.getLayout();
        layout.next(mainWorkArea);
        
        JFrame mainFrame = new JFrame();
        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(mainWorkArea, BorderLayout.CENTER);
        mainFrame.pack();
        mainFrame.setVisible(true);
        mainFrame.setResizable(false);
    }
    
    private void populateBpTable(boolean onlyShowAbnormalBp) {
        
        VitalSignNormalRange vsnr = new VitalSignNormalRange();
        
        Collection<List<Appointment>> encounterHistory = dataStore.getAllEncounterHistory();
        if (encounterHistory == null || encounterHistory.isEmpty()) {
            return;
        }
        
        DefaultTableModel  model = (DefaultTableModel) tblReportGenerate.getModel();
        model.setRowCount(0);
        for (List<Appointment> encounterList : encounterHistory) {
            for (Appointment encounter : encounterList) {
                
                boolean isBpNormal = vsnr.isBloodPressureNormal(encounter.getVitalSign().getBloodPressure(), encounter.getPatient().getDob(), encounter.getDate());
                if (isBpNormal && onlyShowAbnormalBp) {
                    continue;
                }
                
                Object row[] = new Object[6];
                row[0] = encounter.getPatient().getName();
                row[1] = encounter.getDate().toString();
                row[2] = vsnr.calculatePatientAgeInMonths(encounter.getPatient().getDob(), encounter.getDate());
                row[3] = encounter.getVitalSign().getBloodPressure().getLow() + "-" + encounter.getVitalSign().getBloodPressure().getHigh();
                row[4] = vsnr.isBloodPressureNormal(encounter.getVitalSign().getBloodPressure(), encounter.getPatient().getDob(), encounter.getDate()) ? "Yes" : "No";
                Range bpNormalRange = vsnr.getBloodPressureNormalRange(encounter.getPatient().getDob(), encounter.getDate());
                row[5] = bpNormalRange.getLow() + "-" + bpNormalRange.getHigh();
                model.addRow(row); 
            }

        }
    }
}
