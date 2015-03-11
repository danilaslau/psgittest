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
public class Student {
    
    private int id;
    private String name;
    private final Date birthday;
    private String address;
    
    Student(int id, String name, Date birthday, String address) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public Date getBirthday() {
        return birthday;
    }
    
    public String getAddress() {
        return address;
    }
    
   
    
}
