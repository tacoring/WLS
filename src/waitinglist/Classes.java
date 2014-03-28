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
    private String  courseName;
    private int     section;
    private String  sectionDetail;
    private int     classNumber;
    private String  dayTime;
    private String  room;
    private String  instructor;
    private String  meetingDate;
    
    
    public Classes (String  aCourseName, int aSection, String aSectionDetail, int aClassNumber, 
            String aDayTime, String aRoom, String aInstructor, String aMeetingDate){
        this.courseName     = aCourseName;
        this.section        = aSection;
        this.sectionDetail  = aSectionDetail;
        this.classNumber    = aClassNumber;
        this.dayTime        = aDayTime;
        this.room           = aRoom;
        this.instructor     = aInstructor;
        this.meetingDate    = aMeetingDate;
    }
    public String getCourseName(){
        return courseName;
    }
    public int getSection(){
        return section;
    }
    public String getSectionDetail(){
        return sectionDetail;
    }
    public int getClassNumber(){
        return classNumber;
    }
    public String getDayTime(){
        return dayTime;
    }
    public String getRoom(){
        return room;
    }
    public String getInstructor(){
        return instructor;
    }
    public String getMeetingDate(){
        return meetingDate;
    }
//    public void setCourseID(int aCourseID){
//        this.courseId = aCourseID;
//    }
    
    public String toStringOld() {
        return this.courseName + ", " + this.classNumber;
    }
    
    @Override
    public String toString(){
        String result = this.courseName.substring(6,9) + " - " + 
                this.courseName.substring(0,4) + " : " + 
                this.courseName.substring(12, this.courseName.length()) + " - " +
                String.format("%02d", this.section) + " - " +
                this.sectionDetail.substring(7,11);
        
        return result;
                
    }
    
    public String getShortName(){
        String name = this.courseName.substring(0,4) + 
                this.courseName.substring(6,9) +
                String.format("%02d", this.section);
        return name;
    }
}
