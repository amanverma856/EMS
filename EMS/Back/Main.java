import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if(email.equals("admin@gmail.com") && password.equals("admin123")) {
            System.out.println("Login successful!");

            EmployeeRepository repo = new EmployeeRepository();
            Employee emp = new Employee(1, "Amar Kumar", "literacyclub123@gmail.com", "Software Developer", 40000);

            try {
                repo.addEmployee(emp);
                System.out.println("Employee added.");
            } catch (Exception e) {
                System.out.println("Error adding employee: " + e.getMessage());
            }
        } else {
            System.out.println("Invalid credentials.");
        }
    }
}