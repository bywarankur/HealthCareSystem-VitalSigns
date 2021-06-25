/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Ankur Bywar
 */
public class AppDataStore {
    
    PersonDirectory personDirectory;
    HashMap<String /* patient's username */, List<Appointment>> appointments;
    HashMap<String /* patient's username */, List<Appointment>> encounterHistory;    

    public AppDataStore() {
        personDirectory = new PersonDirectory();
        appointments = new HashMap<String /* patient's username */, List<Appointment>>();
        encounterHistory = new HashMap<String /* patient's username */, List<Appointment>>();
    }
    
    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public HashMap<String, List<Appointment>> getAppointments() {
        return appointments;
    }
    
    public List<Appointment> getAppointment(String username) {
        return appointments.get(username);
    }
    
    public List<Appointment> getAppointmentForDoctor(Person doctor) {
        List<Appointment> result = new ArrayList<>();
        for (List<Appointment> appointments : appointments.values()) {
            for (Appointment apt : appointments) {
                if (apt.getDoctor().getUsername().equals(doctor.getUsername())) {
                    result.add(apt);
                }
            }
        }
        
        // Sort appointments by date before returning
        Collections.sort(result, new Comparator<Appointment>() {
            @Override
            public int compare(Appointment a1, Appointment a2) {
                return a1.getDate().compareTo(a2.getDate());
            }
        });
        
        return result;
    }
    
    public void addToEncounterHistory(String patientUserName, Appointment appt) {
        List<Appointment> apts = encounterHistory.get(patientUserName);
        if (apts == null) {
            apts = new ArrayList<Appointment>();
            encounterHistory.put(patientUserName, apts);
        }
        apts.add(appt);
    }
    
    public void addAppointment(String patientUserName, Appointment appt) {
        List<Appointment> apts = getAppointment(patientUserName);
        if (apts == null) {
            apts = new ArrayList<Appointment>();
            appointments.put(patientUserName, apts);
        }
        apts.add(appt);
    }
    
    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public void setName(String text) {
        return; //To change body of generated methods, choose Tools | Templates.
    }

    public void setPhoneNumber(long parseLong) {
        return; //To change body of generated methods, choose Tools | Templates.
    }

    public void setAge(String text) {
        return; //To change body of generated methods, choose Tools | Templates.
    }

    public void setAddress(String text) {
        return; //To change body of generated methods, choose Tools | Templates.
    }
//    
//
// public Patient searchAppointmentDate(Date date) {
//        for (Patient patient :  appointments ) {
//            if (patient.getAppointment() == date) {
//                return patient;
//            }
//        }
//        return null;
// }

    public List<Appointment> getEncounterHistory(String username) {
        return encounterHistory.get(username);
    }
    
    public Collection<List<Appointment>> getAllEncounterHistory() {
        return encounterHistory.values();
    }
    
  
    
}
