/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Student
 */
public class Crud {
    
     public static void insert(Connection con, Student student) throws SQLException {
       
        System.out.println("Inserting records into the table...");

        String stat = "INSERT INTO students (studentid, name, birthdate, address) VALUES(?, ?, ?, ?)";
        
        PreparedStatement prepSt = con.prepareStatement(stat);
       
        prepSt.setInt(1, student.getId());
        prepSt.setString(2, student.getName());
        prepSt.setDate(3, student.getBirthday());
        prepSt.setString(4, student.getAddress());

        prepSt.executeUpdate();
   

        System.out.println("Inserted records into the table...");
            
    }
    
    public static void update(Connection con, Student student) throws SQLException {
        System.out.println("Update records into the table...");
        
        String stat = "UPDATE students SET name=? WHERE studentid=?";
        PreparedStatement prepSt = con.prepareStatement(stat);
         prepSt.setString(1, student.getName());
        prepSt.setInt(2, student.getId());
       
        prepSt.executeUpdate();

        System.out.println("Updated records into the table...");
    }
    
    public static void delete(Connection con, Student student) throws SQLException {
        
        System.out.println("Delete table...");
            
        String stat = "DELETE FROM students WHERE studentid=?";
        PreparedStatement prepSt = con.prepareStatement(stat);
        prepSt.setInt(1, student.getId());
        prepSt.executeUpdate();

        System.out.println("Updated records into the table...");
    }
 
    
}
