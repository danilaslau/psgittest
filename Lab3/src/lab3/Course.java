/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.sql.Date;

/**
 *
 * @author Student
 */
public class Course {
    
    private int id;
    private String name;
    private String  teacher;
    private int studyYear;
    

    public Course(int id, String name, String teacher, int studyYear) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.studyYear = studyYear;
    }
    
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }
   
    
    
    
    
    
}
