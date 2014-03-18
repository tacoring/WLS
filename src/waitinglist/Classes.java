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
public class Classes {
    private int courseId;
    private String courseNumber;
    private String courseName;
    
    public Classes (int aCourseId, String aCourseNumber, String aCourseName){
        this.courseId = aCourseId;
        this.courseName = aCourseNumber;
        this.courseNumber = aCourseName;
        
    }
    
    public int getCourseID(){
        return courseId;
    }
    
    public String getCourseNumber(){
        return courseNumber;
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    public void setCourseID(int aCourseID){
        this.courseId = aCourseID;
    }
}
