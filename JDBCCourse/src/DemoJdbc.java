import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
            1. import
            2. load and register
            3. create connection
            4. create statement
            5. execute statement
            6. process the results
            7. close
         */
        //default port of postgresql is 5432
        String url = "jdbc:postgresql://localhost:5432/TeluskoJava";

        String sql = "select sname from student where sid = 1";

        //this line is optional in new java versions
        Class.forName("org.postgresql.Driver");//

        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");

        Statement st = con.createStatement();
        ResultSet rs =  st.executeQuery(sql);
        rs.next();//to go to the first record
        String name = rs.getString("sname");
        System.out.println("Name of a student is: "+name);
        con.close();
        System.out.println("Connection Closed");

    }
}
