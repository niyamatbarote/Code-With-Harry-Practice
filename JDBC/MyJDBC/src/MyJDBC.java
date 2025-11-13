
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyJDBC {

    private static final String url = "jdbc:mysql://localhost:3306/myhospital";
    private static final String username = "root";
    private static final String password = "Niyamat@2005";

    public static void main(String[] args) {

        try {
            // 1) Load & Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2) Connection Establishing
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Conncection Established..!!");

            // 3a) Statement Creating --
            String query = "Select pid, name, age from patients where pid=?";
            // Statement st = con.createStatement(); // We Are not using it here

            // 3b) PreparedStatement Creation (Advanced & Most Used)
            PreparedStatement pst = con.prepareStatement(query);

            // 4) Filling Value
            pst.setInt(1, 3);

            // 5) Resultset
            ResultSet rs = pst.executeQuery();

            // 6) Executing Queries
            while (rs.next()) {
                System.out.println(rs.getInt("pid") + " " + rs.getString("name") + " " + rs.getInt("age"));

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// This is the method fetching data using statements -->
// // result.getInt is used to fetch column ** we need to put the correct Column
// // name
// int pid = resultset.getInt("pid");
// String name = resultset.getString("Name");
// int age = resultset.getInt("Age");
// System.out.println("ID : " + pid);
// System.out.println("NAME : " + name);
// System.out.println("AGE : " + age);
