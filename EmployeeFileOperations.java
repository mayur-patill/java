import java.io.*;
import java.util.Scanner;

// Employee Class
class Employee implements Serializable {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + salary);
        System.out.println("---------------------------");
    }
}

// Main Class
public class EmployeeFileOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Creating File
            FileOutputStream fos = new FileOutputStream("employee.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Input Employee Details
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            // Create Employee Object
            Employee emp = new Employee(id, name, salary);

            // Write Object into File
            oos.writeObject(emp);

            System.out.println("\nEmployee Information Stored Successfully!");

            oos.close();
            fos.close();

            // Reading Data from File
            FileInputStream fis = new FileInputStream("employee.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee e = (Employee) ois.readObject();

            System.out.println("\nEmployee Information from File");
            System.out.println("---------------------------");
            e.display();

            ois.close();
            fis.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}
