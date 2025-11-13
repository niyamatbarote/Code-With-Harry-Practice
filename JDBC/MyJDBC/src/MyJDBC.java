
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyJDBC {

    private static final String url = "jdbc:mysql://localhost:3306/myhospital";
    private static final String username = "root";
    private static final String password = "Niyamat@2005";

    public static void main(String[] args) {

        try {
            // Load & Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Conncection Established..!!");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        try {
            // Establish Connection
            Connection connect = DriverManager.getConnection(url, username, password);
            Statement state = connect.createStatement();
            String query = "select * from patients";
            // Here, ReslutSet Fetches the Data From the Database in SQL.
            ResultSet resultset = state.executeQuery(query);

            while (resultset.next()) {// to run program till last row

                // result.getInt is used to fetch column ** we need to put the correct Column
                // name
                int pid = resultset.getInt("pid");
                String name = resultset.getString("Name");
                int age = resultset.getInt("Age");
                System.out.println("ID : " + pid);
                System.out.println("NAME : " + name);
                System.out.println("AGE : " + age);

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
