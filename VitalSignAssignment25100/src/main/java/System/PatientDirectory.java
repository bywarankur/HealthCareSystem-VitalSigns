/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ankur Bywar
 */
public class PatientDirectory {
    
    private Map<String /*username*/, Patient> patientDirectory;

    public PatientDirectory(ArrayList<Patient> patient) {
        this.patientDirectory = new HashMap<String, Patient>();
    }

    public Patient getPatient(String username) {
        return patientDirectory.get(username);
    }

//    public void setPatient(Patient patient) {
//        this.patient = patient;
//    }
    
    
    
    
}
