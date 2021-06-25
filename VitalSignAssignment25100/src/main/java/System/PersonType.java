/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import ui.RegisterNewUser;

/**
 *
 * @author Ankur Bywar
 */
public enum PersonType {
    PATIENT,
    DOCTOR,
    NURSE,
    INVALID;
    
    private String text;
     
     
    public static PersonType from(String text) {
        switch (text) {
            case "Patient":
                return PersonType.PATIENT;
            case "Nurse":
                return PersonType.NURSE;
            case "Doctor":
                return PersonType.DOCTOR;
            default:
                return PersonType.INVALID;
        }
    }
}
