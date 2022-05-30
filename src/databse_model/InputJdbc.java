package databse_model;

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               import java.sql.*;
import data_model.*;

public class InputJdbc 
{
   
   protected static String DATABASE_NAME = "test";
   protected static String USER = "root";
   protected static String PASSWORD = "";
   protected static String DB_URL = "jdbc:mysql://localhost:3306/";

    public InputJdbc() throws ClassNotFoundException
   
   {
      try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL+DATABASE_NAME, USER, PASSWORD); 
            if (conn != null) {
                                   
            Statement stmt = conn.createStatement();
            String sqlQuery = "INSERT INTO `student_table` (`id`, `name`, `branch`) VALUES (NULL,"+InputMaster.getStudenntName()+
                 ", "+InputMaster.getStudentBaranch()+") ";
                      
            stmt.executeQuery(sqlQuery);
            //System.out.println(DB_URL+DATABASE_NAME);  
            
               
            }
            else{
               System.out.println("Insertion failed...");
            }
         }
            
      catch (SQLException e) {
            e.printStackTrace();
        }
   }
}

