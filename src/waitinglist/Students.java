/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package waitinglist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Comparator;

/**
 *
 * @author Majed
 */
public class Students {
    private int cwid;
    private int unitsCompleted;
    private int visa;
    private int currentUnits;
    private int weight;
    
    public Students(int cwid, int unitsCompleted, int visa, int currentUnits, int weight) {
        this.cwid = cwid;
        this.unitsCompleted = unitsCompleted;
        this.visa = visa;
        this.currentUnits = currentUnits;
        this.weight = weight;
    }

//    Students() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
 
    public int getWeight() {
        return weight;
    }
    public int getUnitsCompleted() {
        return unitsCompleted;
    }
    
    public String toString() {
        return "[id=" + this.cwid + ", unitsCompleted=" + this.unitsCompleted + ", visa=" + this.visa + ", currentUnits=" +
                this.currentUnits + ", weight=" + this.weight + "]";
    }
    
    public int compareTo(Students emp) {
        //let's sort the employee based on id in ascending order
        //returns a negative integer, zero, or a positive integer as this employee id
        //is less than, equal to, or greater than the specified object.
        return (this.cwid - emp.cwid);
    }
    
    public static Comparator<Students> WeightComparator = new Comparator<Students>() {
 
        @Override
        public int compare(Students e1, Students e2) {
            return e1.getWeight() - e2.getWeight();
        }
    };
    
    public static Comparator<Students> UnitsCompletedComparator = new Comparator<Students>() {
 
        @Override
        public int compare(Students e1, Students e2) {
            return e1.getUnitsCompleted() - e2.getUnitsCompleted();
        }
    };
}

//class StudentsWeightComparator implements Comparator<Students> {
//    @Override
//    public int compare(Students student1, Students student2) {
//        
//        return student1.getWeight() - student2.getWeight();
//    }
//}
//
//class StudentsunitsCompletedComparator implements Comparator<Students> {
//    @Override
//    public int compare(Students student1, Students student2) {
//        
//        return student1.getUnitsCompleted() - student2.getUnitsCompleted();
//    }
//}