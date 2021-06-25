/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Ankur Bywar
 */
public class Doctor extends Person {

    public Doctor(String username, String password, String name, String phoneNumber, Date dob, House house, Icon logoImage) {
        super(username, password, name, phoneNumber, dob, house, logoImage);
    }
    
    @Override
    public PersonType getPersonType() {
        return PersonType.DOCTOR;
    }
}