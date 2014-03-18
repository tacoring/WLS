/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package waitinglist;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Casper
 */
public class WLToolBox {
    
    public static int getDatabaseRowCount(ResultSet aSet) throws SQLException{
        int rowCount = 0;
        if (aSet.last()) {
          rowCount = aSet.getRow();
          aSet.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
        }
        return rowCount;
    }
    
    /**
     * Tool for get min and Max value in integer array
     * @param aList
     * @return
     */
    
    public static int [] getMaxMin (int[] aList) {
        int [] minMaxList = new int[3];
        int min = 0;
        int max = 0;
        for (int i = 0; i < aList.length; i++) {
            if (min > aList[i]){ min = aList[i]; }
            if (max < aList[i]){ max = aList[i]; }
        }
        minMaxList[0] = min;
        minMaxList[1] = max;
        minMaxList[2] = max - min;
        
        return minMaxList;
    }
}
