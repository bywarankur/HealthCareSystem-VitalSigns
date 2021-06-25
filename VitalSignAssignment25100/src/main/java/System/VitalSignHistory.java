/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import java.util.ArrayList;

/**
 *
 * @author Ankur Bywar
 */
public class VitalSignHistory {
    private ArrayList<VitalSigns> history;
    
    public VitalSignHistory() {
        this.history = new ArrayList<VitalSigns>();    
    
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    
    public VitalSigns addNewVital() {
        VitalSigns newVital = new VitalSigns();
        history.add(newVital);
        return newVital;
    }
    
  
    public void deleteVital(VitalSigns vs) {
       history.remove(vs);
    }
    
    
    
    
   // public boolean deleteVital(int id) {
//       for (VitalSigns vs : history) {
//           if (vs.getId() == id) {
//               history.remove(vs);
//               return true;
//           }
//       }
//       return false;
//    }

//    public VitalSigns getVitalSign(int id) {
//        for (VitalSigns vs : history) {
//           if (vs.getId() == id) {
//               return vs;
//           }
       }

