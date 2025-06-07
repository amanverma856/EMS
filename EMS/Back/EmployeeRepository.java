import java.sql.*;

public class EmployeeRepository {
    private Connection conn = DatabaseConfig.getConnection();

    public void addEmployee(Employee emp) throws SQLException {
        String sql = "INSERT INTO employees (id, name, email, role, salary) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, emp.getId());
        ps.setString(2, emp.getName());
        ps.setString(3, emp.getEmail());
        ps.setString(4, emp.getRole());
        ps.setDouble(5, emp.getSalary());
        ps.executeUpdate();
    }
}