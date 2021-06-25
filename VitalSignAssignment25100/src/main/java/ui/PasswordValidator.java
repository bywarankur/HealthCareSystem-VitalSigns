/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import System.AppDataStore;
import System.Person;
import System.PersonDirectory;

/**
 *
 * @author Ankur Bywar
 */
class PasswordValidator {

    static boolean validateUsernameAndPassword(String username, String password, AppDataStore dataStore) {
       PersonDirectory pd = dataStore.getPersonDirectory();
       Person p = pd.getPerson(username);
       if (p == null) {
           System.out.println("Invalid Username");
           return false;
       }
       
       if (!p.getPassword().equals(password)) {
           System.out.println("Password mismatch");
           return false;
       }
       return true;
    }
}
