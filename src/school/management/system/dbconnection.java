/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbconnection
{
    Connection con;
    Statement st;
    dbconnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://mysql8002.site4now.net/db_a90f8e_schoolm","a90f8e_schoolm","m12345678");
            st=con.createStatement();
            System.out.println("database connected!");
//            dbconnection dbconnection = new dbconnection();
//            ResultSet resultSet = dbconnection.st.executeQuery("select * from teachersignup");
//            while (resultSet.next())
//            {
//                System.out.println(resultSet.getString("tname"));
//                System.out.println(resultSet.getString("email"));
//                System.out.println(resultSet.getString("username"));
//                System.out.println(resultSet.getString("pass"));
//                System.out.println(resultSet.getString("age"));
//            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        dbconnection dbconnection=new dbconnection();
    }
}