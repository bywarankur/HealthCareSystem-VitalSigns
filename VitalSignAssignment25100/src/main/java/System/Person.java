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
public class Person {
    
    private int id;
    private String username;
    private String password;
    private Date dob;
   
    
    private PersonType personType;
    
    private String name;
    private String phoneNumber;
    private House house;
    private Icon logoImage;

    public Person(String username, String password, String name, String phoneNumber, Date dob, House house, Icon logoImage) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber ;
        this.house = house;
        this.dob = dob;
        this.id = username.hashCode();
        this.logoImage = logoImage;
    }

    public int getId() {
        return id;
    }

    public Date getDob() {
        return dob;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Icon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return 10;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
    
    public PersonType getPersonType() {
        return PersonType.INVALID;
    }
 
}
