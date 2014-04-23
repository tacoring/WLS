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
    private float weight;
    private boolean isSelected = false;
    
    public Students(int cwid, String fName, String lName, int unitsCompleted, int visa, int currentUnits, float weight) {
        this.cwid = cwid;
        this.fName = fName;
        this.lName = lName;
        this.unitsCompleted = unitsCompleted;
        this.visa = visa;
        this.currentUnits = currentUnits;
        this.weight = weight;
    }

    Students() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    public String getVisaType(){
        String visaMean = "";
        if (visa == 1) {
            visaMean = "International";
        }else if (visa == 2){
            visaMean = "Dependent";
        }else if (visa == 3){
            visaMean = "Green card";
        }else if (visa == 4){
            visaMean = "Citizen";
        }
        return visaMean;
    }
    public int getCurrentUnits(){
        return currentUnits;
    }
    
    public boolean getSelected(){
        return isSelected;
    }
    
    public void setSelected(boolean isSelected){
        this.isSelected = isSelected;
    }
    public void setWeight(float weight){
        this.weight = weight;
        
    }
    public float getWeight() {
        return weight;
    }

    
    @Override
    public String toString() {
        
        return this.fName + ", " + this.lName + " - " + this.cwid + " - " + this.weight;
    }
    
    public String print(){
        
        return this.cwid  + " - " + this.fName + ", " + this.lName + "\n";
    }
    public String toStringOld() {
        
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
        public int compare(Students e1, Students e2) {
//            return e1.getWeight() - e2.getWeight();
            return (int) (e2.getWeight() - e1.getWeight()); //largger to smaller
//            return e1.getWeight() < e2.getWeight() ? -1 
//                    : e1.getWeight() > e2.getWeight() ? 1
//                    :0;
        }
    };
    
    public static Comparator<Students> UnitsCompletedComparator = new Comparator<Students>() {
 
        @Override
        public int compare(Students e1, Students e2) {
            return e1.getUnitsCompleted() - e2.getUnitsCompleted();
        }
    };
}