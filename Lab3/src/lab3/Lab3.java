/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;
import java.sql.Date;
import java.sql.PreparedStatement;


/**
 *
 * @author Student
 */
public class Lab3 {
    
    static final String DB_URL = "jdbc:mysql://localhost/lab3"; 
    static final String USER = "root";
    static final String PASS = "root";

        
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Crud crud = new Crud();
        
        Connection con = null;
        Statement stm = null;
        
   
        Student student1 = new Student(3, "Laura", new Date(100, 2, 1), "Home1");
        Student student2 = new Student(4, "Maria", new Date(110, 2, 1), "Home2");
        Student student3 = new Student(5, "Vlad", new Date(120, 2, 1), "Home3");
        
        
        // TODO code application logic here
       
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            System.out.println("Connection to db...");
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            
            crud.insert(con, student1);
            crud.insert(con, student2);
            crud.insert(con, student3);
            //update(con, student);
            //delete(con,student1);
            
            System.out.println("Creating a statement...");
            stm = con.createStatement();
            String sql2 = "SELECT * FROM students";
            ResultSet rs = stm.executeQuery(sql2);
            
            while(rs.next()) {
                int id = rs.getInt("studentid");
                String name = rs.getString("name");
                String address = rs.getString("address");
                
                System.out.print("Id = " + id + " ");
                System.out.println("name = " + name);
                System.out.println("address = " + address);
                
            }
         con.close();   
         
        } catch (SQLException | ClassNotFoundException ex ) {
            System.out.println("Eroare la conectare");
         } 
    }

   
}
