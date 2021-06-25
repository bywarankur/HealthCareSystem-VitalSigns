/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ankur Bywar
 */
public class PersonDirectory {
    
    private Map<String /*username*/, Person> personDirectory;
    
    public PersonDirectory() {
        this.personDirectory = new HashMap<String, Person>();
    }

    public Person getPerson(String username) {
        return personDirectory.get(username);
    }

    public void addPerson(Person p) {
        this.personDirectory.put(p.getUsername(), p);
    }

    public void addPerson(AppDataStore dataStore) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<Person> getDoctors() {
        ArrayList<Person> doctors = new ArrayList<Person>();
        
        for (Person p : personDirectory.values()) {
            if (p.getPersonType().equals(PersonType.DOCTOR)) {
                doctors.add(p);
            }
        }
        
        return doctors;
    }

}
