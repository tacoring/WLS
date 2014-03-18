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
}
