/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Ankur Bywar
 */
public class Patient extends Person {
    //private String cheifComplain;
    private ArrayList<VitalSigns> encounterHistory;
    private VitalSigns currentVitalSigns;
    private VitalSignNormalRange vitalSignNormalRange;


    public Patient(String username, String password, String name, String phoneNumber, Date dob, House house, Icon logoImage ) {
        super(username, password, name, phoneNumber, dob, house, logoImage);
        this.encounterHistory = new ArrayList<VitalSigns>();
        this.currentVitalSigns = null;
        this.vitalSignNormalRange = null;
        //this.cheifComplain = cheifComplain;
    }

//    public String getCheifComplain() {
//        return cheifComplain;
//    }
    
    
    

    @Override
    public PersonType getPersonType() {
        return PersonType.PATIENT;
    }

    public ArrayList<VitalSigns> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<VitalSigns> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public VitalSigns getCurrentVitalSigns() {
        return currentVitalSigns;
    }

    public void setCurrentVitalSigns(VitalSigns currentVitalSigns) {
        this.currentVitalSigns = currentVitalSigns;
    }

    public VitalSignNormalRange getVitalSignNormalRange() {
        return vitalSignNormalRange;
    }

    public void setVitalSignNormalRange(VitalSignNormalRange vitalSignNormalRange) {
        this.vitalSignNormalRange = vitalSignNormalRange;
    }

    public Object getAppointment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 
    
    

