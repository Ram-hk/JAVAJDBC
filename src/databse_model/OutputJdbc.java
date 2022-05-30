package databse_model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import data_model.*;

public class OutputJdbc extends InputJdbc {
    
    public OutputJdbc() throws ClassNotFoundException
    {
    try {
        Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");                     
           Statement stmt = conn.createStatement();
                           
           ResultSet rs=stmt.executeQuery("select * from student_table");  
           while(rs.next())  {
              OutputMaster.setIndexNo(rs.getInt(1));
              OutputMaster.setStudentName(rs.getString(2)); 
              OutputMaster.setStudentBranch(rs.getString(3));
           }
            conn.close();
    }catch(Exception e){
        e.printStackTrace();
    }
      
   }
}
