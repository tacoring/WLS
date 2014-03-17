/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package waitinglist;

/**
 *
 * @author Casper
 */
public interface WLConfig {
    //For determine weight
    final int unitCompletedWeight = 1000;
    final int visaWeight = 200;
    final int currentUnitsWeight = 100;
    
    final String serverIP = "54.186.24.136";
    final String serverPort = "3306";
    final String database = "waiting_list";
    final String databaseUser = "cpsc462";
    final String databasePassword = "qq101425";
    
}
