// Base Class
class Staff {

    // Encapsulated Data Members
    private String name;
    private String doj;
    private int staffId;

    // Constructor
    Staff(String name, String doj, int staffId) {
        this.name = name;
        this.doj = doj;
        this.staffId = staffId;
    }

    // Method to Display Staff Details
    void displayStaff() {
        System.out.println("Staff Name : " + name);
        System.out.println("Date of Joining : " + doj);
        System.out.println("Staff ID : " + staffId);
    }
}

// Derived Class
class Professor extends Staff {

    private String subject;
    private double salary;

    // Constructor
    Professor(String name, String doj, int staffId,
              String subject, double salary) {

        super(name, doj, staffId);

        this.subject = subject;
        this.salary = salary;
    }

    // Method Overriding (Polymorphism)
    void displayStaff() {
        super.displayStaff();

        System.out.println("Subject Specialization : " + subject);
        System.out.println("Salary : " + salary);
    }
}

// Derived Class
class HOD extends Professor {

    private double allowance;

    // Constructor
    HOD(String name, String doj, int staffId,
        String subject, double salary,
        double allowance) {

        super(name, doj, staffId, subject, salary);

        this.allowance = allowance;
    }

    // Method Overriding (Polymorphism)
    void displayStaff() {
        super.displayStaff();

        System.out.println("Department Allowance : " + allowance);
    }
}

// Main Class
public class AcademicInstitution {

    public static void main(String[] args) {

        // Creating HOD Object
        HOD h = new HOD(
                "Dr. Mayur Patil",
                "10-06-2020",
                101,
                "Computer Science",
                85000,
                15000
        );

        // Display Details
        System.out.println("HOD INFORMATION");
        System.out.println("---------------------------");

        h.displayStaff();
    }
}
