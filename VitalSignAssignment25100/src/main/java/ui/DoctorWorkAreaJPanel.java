/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import System.AppDataStore;
import System.Appointment;
import System.Doctor;
import System.EncounterHistory;
import System.House;
import System.Nurse;
import System.Patient;
import System.Person;
import System.PersonType;
import System.VitalSignHistory;
import System.VitalSigns;
import java.awt.CardLayout;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ankur Bywar
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {
    JPanel mainWorkArea;
    Doctor doctor;
    AppDataStore dataStore;
    
    /**
     * Creates new form NUrseWorkAJPanel
     */
    public DoctorWorkAreaJPanel(JPanel mainWorkArea, Doctor doctor, AppDataStore dataStore) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.dataStore = dataStore;
         this.doctor = doctor;
         displayPersonDetail();
         displayUpcomingAppointments();
         
        tblUpcomingAppointments.setEnabled(true);
        tblUpcomingAppointments.setRowSelectionAllowed(true);
        tblUpcomingAppointments.setColumnSelectionAllowed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jNurseAreaWorkPanel = new javax.swing.JPanel();
        lblNurseWorkAreaPanel = new javax.swing.JLabel();
        lblTodayAppointment = new javax.swing.JLabel();
        lblSearchByDate = new javax.swing.JLabel();
        jUserNameSearchBtn = new javax.swing.JButton();
        lblNurseProfile = new javax.swing.JLabel();
        txtPatientUserNameSearch = new javax.swing.JTextField();
        lblName2 = new javax.swing.JLabel();
        lblDob2 = new javax.swing.JLabel();
        lblDobPlaceHolder = new javax.swing.JLabel();
        lblPhoneNumberPlaceHolder = new javax.swing.JLabel();
        lblAddressPlaceHolder = new javax.swing.JLabel();
        lblNamePlaceHolder = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblPhoneNumber1 = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();
        lblProfilePic = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientsEncounterHistory = new javax.swing.JTable();
        btnRecordVitalSigns = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUpcomingAppointments = new javax.swing.JTable();
        btnHighBpReport = new javax.swing.JButton();

        lblNurseWorkAreaPanel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblNurseWorkAreaPanel.setText("Nurse Work Area Panel");

        lblTodayAppointment.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTodayAppointment.setText("Upcoming Appointments");

        lblSearchByDate.setText("Search encounters by patient username:");

        jUserNameSearchBtn.setText("Search");
        jUserNameSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUserNameSearchBtnActionPerformed(evt);
            }
        });

        lblNurseProfile.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblNurseProfile.setText("Nurse profile");

        lblName2.setText("Name:");

        lblDob2.setText("Dob:");

        lblDobPlaceHolder.setText("DobPlaceHolder");

        lblPhoneNumberPlaceHolder.setText("Phone Number Place Holder");

        lblAddressPlaceHolder.setText("AddressPlaceHolder");

        lblNamePlaceHolder.setText("NamePlaceHolder");

        lblAddress.setText("Address:");

        lblPhoneNumber1.setText("Phone Number:");

        imgLogo.setText("<<No Image>>");

        lblProfilePic.setText("Profile Pic:");

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        tblPatientsEncounterHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Encounter Date", "Age", "Weight", "Blood Pressure", "Respiratory Rate", "Heart Rate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPatientsEncounterHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientsEncounterHistoryMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tblPatientsEncounterHistoryMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(tblPatientsEncounterHistory);

        btnRecordVitalSigns.setText("Record Vital Signs");
        btnRecordVitalSigns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordVitalSignsActionPerformed(evt);
            }
        });

        tblUpcomingAppointments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient Name", "Patient DoB", "Chief Complain", "Appointment Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblUpcomingAppointments.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblUpcomingAppointments.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblUpcomingAppointments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUpcomingAppointmentsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tblUpcomingAppointmentsMouseExited(evt);
            }
        });
        jScrollPane2.setViewportView(tblUpcomingAppointments);

        btnHighBpReport.setText("Blood Pressure Report");
        btnHighBpReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHighBpReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jNurseAreaWorkPanelLayout = new javax.swing.GroupLayout(jNurseAreaWorkPanel);
        jNurseAreaWorkPanel.setLayout(jNurseAreaWorkPanelLayout);
        jNurseAreaWorkPanelLayout.setHorizontalGroup(
            jNurseAreaWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jNurseAreaWorkPanelLayout.createSequentialGroup()
                .addGroup(jNurseAreaWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jNurseAreaWorkPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblProfilePic)
                        .addGap(26, 26, 26)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jNurseAreaWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jNurseAreaWorkPanelLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(jNurseAreaWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblName2)
                                    .addComponent(lblDob2)
                                    .addComponent(lblPhoneNumber1)))
                            .addGroup(jNurseAreaWorkPanelLayout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(lblAddress))))
                    .addGroup(jNurseAreaWorkPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lblNurseWorkAreaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jNurseAreaWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddressPlaceHolder)
                    .addComponent(lblPhoneNumberPlaceHolder)
                    .addGroup(jNurseAreaWorkPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jNurseAreaWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNamePlaceHolder)
                            .addComponent(lblDobPlaceHolder))
                        .addGap(99, 99, 99)
                        .addGroup(jNurseAreaWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHighBpReport, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(182, 613, Short.MAX_VALUE))
            .addGroup(jNurseAreaWorkPanelLayout.createSequentialGroup()
                .addGroup(jNurseAreaWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jNurseAreaWorkPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblNurseProfile))
                    .addGroup(jNurseAreaWorkPanelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lblTodayAppointment)))
                .addGap(0, 1316, Short.MAX_VALUE))
            .addGroup(jNurseAreaWorkPanelLayout.createSequentialGroup()
                .addGroup(jNurseAreaWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jNurseAreaWorkPanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(lblSearchByDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPatientUserNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jUserNameSearchBtn))
                    .addGroup(jNurseAreaWorkPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jNurseAreaWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jNurseAreaWorkPanelLayout.createSequentialGroup()
                    .addGap(191, 191, 191)
                    .addComponent(btnRecordVitalSigns, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1162, Short.MAX_VALUE)))
            .addGroup(jNurseAreaWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jNurseAreaWorkPanelLayout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1031, Short.MAX_VALUE)))
        );
        jNurseAreaWorkPanelLayout.setVerticalGroup(
            jNurseAreaWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jNurseAreaWorkPanelLayout.createSequentialGroup()
                .addGroup(jNurseAreaWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jNurseAreaWorkPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblNurseWorkAreaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNurseProfile)
                        .addGroup(jNurseAreaWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jNurseAreaWorkPanelLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(lblProfilePic))
                            .addGroup(jNurseAreaWorkPanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jNurseAreaWorkPanelLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(jNurseAreaWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName2)
                            .addComponent(lblNamePlaceHolder))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jNurseAreaWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDob2)
                            .addComponent(lblDobPlaceHolder))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jNurseAreaWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhoneNumber1)
                            .addComponent(lblPhoneNumberPlaceHolder))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jNurseAreaWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddress)
                            .addComponent(lblAddressPlaceHolder)))
                    .addGroup(jNurseAreaWorkPanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnLogout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHighBpReport)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTodayAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(319, 319, 319)
                .addGroup(jNurseAreaWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchByDate)
                    .addComponent(txtPatientUserNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUserNameSearchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(jNurseAreaWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jNurseAreaWorkPanelLayout.createSequentialGroup()
                    .addContainerGap(566, Short.MAX_VALUE)
                    .addComponent(btnRecordVitalSigns)
                    .addGap(337, 337, 337)))
            .addGroup(jNurseAreaWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jNurseAreaWorkPanelLayout.createSequentialGroup()
                    .addGap(312, 312, 312)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(372, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jNurseAreaWorkPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jNurseAreaWorkPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        
        nextScreen(new Login(dataStore, mainWorkArea), "Login");
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jUserNameSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUserNameSearchBtnActionPerformed
        // TODO add your handling code here:
        
        String patientUserName = txtPatientUserNameSearch.getText();
        if (patientUserName == null || patientUserName.isEmpty()) {
            JOptionPane.showMessageDialog(jNurseAreaWorkPanel, "Enter patient's username");
            return;  
        }
        
        Person person = dataStore.getPersonDirectory().getPerson(patientUserName);
        if (person != null && !person.getPersonType().equals(PersonType.PATIENT)) {
            JOptionPane.showMessageDialog(jNurseAreaWorkPanel, patientUserName + " is not a patient username");
            return;  
        }
        
        Patient patient = (Patient) person;
        
        
        DefaultTableModel  model = (DefaultTableModel) tblPatientsEncounterHistory.getModel();
        List<VitalSigns> vitalSigns = patient.getEncounterHistory();
        model.setRowCount(0);
        if (vitalSigns == null || vitalSigns.isEmpty()) {
            JOptionPane.showMessageDialog(jNurseAreaWorkPanel, "No previous encounters found for patient " + patient.getName());
            return; 
        }
        for (VitalSigns vs : vitalSigns) {
            Object row[] = new Object[7];
            row[0] = patient.getName();
            row[1] = vs.getDateForVitalSigns();
            row[2] = patient.getAge();
            row[3] = vs.getWeight();
            row[4] = vs.getBloodPressure().getLow() + "-" + vs.getBloodPressure().getHigh();
            row[5] = vs.getRespiratoryRate();
            row[6] = vs.getHeartRate();
            model.addRow(row);
        }
    }//GEN-LAST:event_jUserNameSearchBtnActionPerformed

    private void btnRecordVitalSignsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordVitalSignsActionPerformed
        // TODO add your handling code here:
       

        // tblUpcomingAppointments.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        System.out.println("Row count: " + tblUpcomingAppointments.getRowCount());
        int row = tblUpcomingAppointments.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(jNurseAreaWorkPanel, "No appointment selected from the table");
            return; 
        }
        
        String patientName = tblUpcomingAppointments.getModel().getValueAt(row, 0).toString();
        Date dob = (Date) tblUpcomingAppointments.getModel().getValueAt(row, 1);
        Date appointmentDate = (Date) tblUpcomingAppointments.getModel().getValueAt(row, 3);
        
        Person patient = null;
        Appointment currentAppointment = null;
        Collection<List<Appointment>> appointments = dataStore.getAppointments().values();
        for (List<Appointment> apts : appointments) {
            for (Appointment apt : apts) {
                if (apt.getPatient().getName().equals(patientName) &&
                        apt.getPatient().getDob().equals(dob) &&
                        apt.getDate().equals(appointmentDate)) {
                    patient = apt.getPatient();
                    currentAppointment = apt;
                }
            }
        }
        
        if (patient == null) {
            JOptionPane.showMessageDialog(jNurseAreaWorkPanel, "Error: No patient found in records for this appointment");
            return;  
        }
         
        nextScreen(new PatientVitalSignCollectionJPanel(mainWorkArea, doctor, (Patient) patient, dataStore, currentAppointment), 
                "PatientVitalSignCollectionJPanel");   
    }//GEN-LAST:event_btnRecordVitalSignsActionPerformed

    private void tblPatientsEncounterHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientsEncounterHistoryMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientsEncounterHistoryMouseClicked

    private void tblPatientsEncounterHistoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientsEncounterHistoryMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientsEncounterHistoryMouseExited

    private void tblUpcomingAppointmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUpcomingAppointmentsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblUpcomingAppointmentsMouseClicked

    private void tblUpcomingAppointmentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUpcomingAppointmentsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tblUpcomingAppointmentsMouseExited

    private void btnHighBpReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHighBpReportActionPerformed
        // TODO add your handling code here:
        
        nextScreen(new AbnormalBpReportGenerateJPanel(mainWorkArea, doctor, dataStore), 
                "AbnormalBpReportGenerateJPanel");   
    }//GEN-LAST:event_btnHighBpReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHighBpReport;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRecordVitalSigns;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JPanel jNurseAreaWorkPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jUserNameSearchBtn;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAddressPlaceHolder;
    private javax.swing.JLabel lblDob2;
    private javax.swing.JLabel lblDobPlaceHolder;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblNamePlaceHolder;
    private javax.swing.JLabel lblNurseProfile;
    private javax.swing.JLabel lblNurseWorkAreaPanel;
    private javax.swing.JLabel lblPhoneNumber1;
    private javax.swing.JLabel lblPhoneNumberPlaceHolder;
    private javax.swing.JLabel lblProfilePic;
    private javax.swing.JLabel lblSearchByDate;
    private javax.swing.JLabel lblTodayAppointment;
    private javax.swing.JTable tblPatientsEncounterHistory;
    private javax.swing.JTable tblUpcomingAppointments;
    private javax.swing.JTextField txtPatientUserNameSearch;
    // End of variables declaration//GEN-END:variables

    private void displayPersonDetail() {
        lblNamePlaceHolder.setText(doctor.getName());
        lblDobPlaceHolder.setText(doctor.getDob().toString());
        House house = doctor.getHouse();
        lblAddressPlaceHolder.setText(house.getCommunity() + ", " 
                + house.getCity() + ", " 
                + house.getState() + ", "
                + house.getZipcode() + ", "
                + house.getCountry());
        lblPhoneNumberPlaceHolder.setText(doctor.getPhoneNumber());
        if (doctor.getLogoImage() != null) {
            imgLogo.setIcon(doctor.getLogoImage());
        } else {
            imgLogo.setText("No Logo");
        }
    }
    
    
    private void nextScreen(JPanel nextScreen, String screenName) {
        mainWorkArea.removeAll();
        mainWorkArea.add(screenName , nextScreen);
        CardLayout layout = (CardLayout)mainWorkArea.getLayout();
        layout.next(mainWorkArea); 
    }

    private void displayUpcomingAppointments() {
        DefaultTableModel  model = (DefaultTableModel) tblUpcomingAppointments.getModel();
        List<Appointment> apts = dataStore.getAppointmentForDoctor(doctor);
        model.setRowCount(0);
        if (apts == null) {
             return;
        }
        for (Appointment apt : apts) {
            Object row[] = new Object[4];
            row[0] = apt.getPatient().getName();
            row[1] = apt.getPatient().getDob();
            row[2] = apt.getCheifComplain();
            row[3] = apt.getDate();
            model.addRow(row);
        }
    }

   
    }
