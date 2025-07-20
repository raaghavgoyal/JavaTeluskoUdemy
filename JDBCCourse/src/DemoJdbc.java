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

        //String sql = "select sname from student where sid = 1";
        //String sql = "select * from student";
        //String sql = "insert into student values (5, 'John',48)";
        //String sql = "update student set sname = 'Max' where sid = 5";
        //String sql = "delete from student where sid=5";
        int sid = 102;
        String sname = "Jasmine";
        int marks = 30;
        //this is very tedious
        //String sql = "insert into student values ("+sid+",'"+sname+"',"+marks+")";
        String sql = "insert into student values(?,?,?)";

        //this line is optional in new java versions
        Class.forName("org.postgresql.Driver");//

        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");

        //PreparedStatement for better to do data manipulation
        PreparedStatement pst = con.prepareStatement(sql);
        //Statement generally used for updating the structure of the table
//        Statement st = con.createStatement();
//        ResultSet rs =  st.executeQuery(sql);
//        rs.next();//to go to the first record
//        String name = rs.getString("sname");
//        System.out.println("Name of a student is: "+name);

//        while(rs.next()){//to check if we have next row, if yes  move to next row
//            System.out.print(rs.getInt(1)+" - ");
//            System.out.print(rs.getString(2)+" - ");
//            System.out.println(rs.getInt(3));
//        }

//        boolean status = st.execute(sql);
//        //false represents insert query executed
//        System.out.println(status);

        //st.execute(sql);
        pst.setInt(1,sid);
        pst.setString(2,sname);
        pst.setInt(3,marks);

        pst.execute();
        con.close();
        System.out.println("Connection Closed");

    }
}
