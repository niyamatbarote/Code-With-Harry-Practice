
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyJDBC {

    private static final String url = "jdbc:mysql://localhost:3306/myhospital";
    private static final String username = "root";
    private static final String password = "Niyamat@2005";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // 1) Load & Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2) Connection Establishing
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established..!!✅");

            while (true) {
                System.out.println("\n=== Patient Database Menu ===");
                System.out.println("1. Insert Patient Details");
                System.out.println("2. Display Listed Patients");
                System.out.println("3. Update Patients");
                System.out.println("4. Delete Patients Data");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine(); // clear the buffer..!!

                switch (choice) {
                    case 1:
                        // Insert Patient Details:
                        System.out.println("Enter Your Name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter Your Age: ");
                        int age = sc.nextInt();
                        sc.nextLine(); // consume the leftover newline

                        String in = "INSERT INTO patients(name,age) values(?,?)";
                        PreparedStatement prInsert = con.prepareStatement(in);
                        prInsert.setString(1, name);
                        prInsert.setInt(2, age);

                        int insertUP = prInsert.executeUpdate(); // Count the num of changes, queries
                        System.out.println(insertUP + " Changes Successfully Inserted Details ✅");
                        prInsert.close();
                        break;

                    case 2:
                        // Display Patient Details
                        String det = "SELECT * FROM PATIENTS";
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(det);

                        System.out.println("PID | NAME | AGE");
                        System.out.println("--------------------");

                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt("pid") + " | " + rs.getString("name") + " | " + rs.getInt("age"));
                        }
                        // rs.close();
                        // st.close();

                        break;

                    case 3:
                        // Update Patients
                        System.out.println("Enter The Id You Want to Change: ");
                        int myid = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Change Patient Name: ");
                        String pname = sc.nextLine();
                        System.out.println("Change Patient Age: ");
                        int page = sc.nextInt();
                        sc.nextLine();

                        String up = "UPDATE PATIENTS SET name=?,age=? WHERE pid=?";
                        PreparedStatement psUp = con.prepareStatement(up);
                        psUp.setString(1, pname);
                        psUp.setInt(2, page);
                        psUp.setInt(3, myid);

                        int pUp = psUp.executeUpdate();
                        System.out.println(pUp + " Patients Updated Successfully✅ ");
                        psUp.close();
                        break;

                    case 4:
                        // Delete Patients
                        System.out.println("Enter ID You Want to Delete: ");
                        int delID = sc.nextInt();
                        sc.nextLine();

                        String del = "DELETE FROM PATIENTS WHERE pid=?";
                        PreparedStatement psDel = con.prepareStatement(del);
                        psDel.setInt(1, delID);

                        int numDel = psDel.executeUpdate();
                        System.out.println(numDel + " Patient Data Deleted✅");
                        psDel.close();
                        break;

                    case 5:
                        // Exit
                        System.out.println("Exitting....");
                        sc.close();
                        con.close();
                        return;

                    default:
                        System.out.println("Invalid Input..!! Try Again ❌");

                }

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

// Steps to Connect JDBC
// 1) Load & Register Driver
// Class.forName("com.mysql.cj.jdbc.Driver");

// // 2) Connection Establishing
// Connection con = DriverManager.getConnection(url, username, password);
// System.out.println("Conncection Established..!!");

// // 3a) Statement Creating --
// String query = "Select pid, name, age from patients where pid=?";
// // Statement st = con.createStatement(); // We Are not using it here

// // 3b) PreparedStatement Creation (Advanced & Most Used)
// PreparedStatement pst = con.prepareStatement(query);

// // 4) Filling Value
// pst.setInt(1, 3);

// // 5) Resultset
// ResultSet rs = pst.executeQuery();

// // 6) Executing Queries
// while (rs.next()) {
// System.out.println(rs.getInt("pid") + " " + rs.getString("name") + " " +
// rs.getInt("age"));

// }