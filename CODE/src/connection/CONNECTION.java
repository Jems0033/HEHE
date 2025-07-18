package connection;


import java.sql.*;
public class CONNECTION {
    public void connection()throws Exception{
        String dburl="jdbc:mysql://localhost:3306/try";
        String dbuser="root";
        String dbpass="";
        Connection con=DriverManager.getConnection(dburl,dbuser,dbpass);
        System.out.println((con!=null)?"Succsessful":"Failed");
    }

}
