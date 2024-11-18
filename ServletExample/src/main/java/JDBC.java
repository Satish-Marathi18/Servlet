import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/employee_management_system";
        String userName= "root";
        String password = "Satish@123";
        return DriverManager.getConnection(url,userName,password);
    }
}
