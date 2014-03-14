/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package waitinglist;

import java.util.Comparator;

/**
 *
 * @author Majed
 */
public class Students {
    private int cwid;
    private String fName;
    private String lName;
    private int unitsCompleted;
    private int visa;
    private int currentUnits;
    private int weight;
    
    public Students(int cwid, String fName, String lName, int unitsCompleted, int visa, int currentUnits, int weight) {
        this.cwid = cwid;
        this.fName = fName;
        this.lName = lName;
        this.unitsCompleted = unitsCompleted;
        this.visa = visa;
        this.currentUnits = currentUnits;
        this.weight = weight;
    }

    public int getCwid(){
        return cwid;
    }
    
    public String getFName(){
        return fName;
    }
    
    public String getLName(){
        return lName;
    }
    public int getUnitsCompleted() {
        return unitsCompleted;
    }  
    
    public int getVisa(){
        return visa;
    }
    
    public int getCurrentUnits(){
        return currentUnits;
    }
    
    public void setWeight(int weight){
        this.weight = weight;
        
    }
    public int getWeight() {
        return weight;
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
//            return e1.getWeight() - e2.getWeight();
            return e2.getWeight() - e1.getWeight();
        }
    };
    
    public static Comparator<Students> UnitsCompletedComparator = new Comparator<Students>() {
 
        @Override
        public int compare(Students e1, Students e2) {
            return e1.getUnitsCompleted() - e2.getUnitsCompleted();
        }
    };
}