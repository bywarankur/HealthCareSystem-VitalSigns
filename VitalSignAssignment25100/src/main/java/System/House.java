/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

/**
 *
 * @author Ankur Bywar
 */
public class House {

    private String community;
    private String city;
    private String zipcode;
    private String state;
    private String country;

    public House(String community, String zipcode, String city, String state, String country) {
        this.zipcode = zipcode;
        this.community = community;
        this.city = city;
        this.state = state;
        this.country = country;
    }


    public String getZipcode() {
        return zipcode;
    }

    public String getCommunity() {
        return community;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }  
}
