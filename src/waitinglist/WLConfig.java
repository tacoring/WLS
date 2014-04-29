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
    
    //For log
    
    final boolean weightLogSwitchOFF    = true;  
    //For determine weight
    final int unitCompletedWeight   = 2000;
    final int visaWeight            = -100;
    final int currentUnitsWeight    = -5;
    
//    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://" 
            + WLConfig.serverIP +":" 
            + WLConfig.serverPort + "/" + WLConfig.database;
//    
    final String serverIP           = "54.186.24.136";
    final String serverPort         = "3306";
    final String database           = "waiting_list";
    final String databaseUser       = "cpsc462";
    final String databasePassword   = "qq101425";
    
    final static int LOGIN_START                =   1;
    final static int LOGIN_SUCCESS              =   2;
    final static int LOGIN_PASSWORD_NOTMATCH    =   3;
    final static int LOGIN_NOMATCH_USER         =   4;
}
