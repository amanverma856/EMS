import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConfig {
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ems", "root", "your_password_here");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}