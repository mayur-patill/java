import java.util.*;

// User Defined Exception
class MarksOutOfBoundException extends Exception {

    // Constructor
    MarksOutOfBoundException(String message) {
        super(message);
    }
}

// Student Class
class Student {

    int roll;
    double marks;

    // Store Method
    void store(int roll, double marks)
            throws MarksOutOfBoundException {

        // Condition
        if(marks > 100) {

            throw new MarksOutOfBoundException(
                    "Marks cannot be greater than 100"
            );
        }

        this.roll = roll;
        this.marks = marks;

        System.out.println("\nData Stored Successfully");
    }

    // Display Method
    void display() {

        System.out.println("\nRoll No : " + roll);
        System.out.println("Marks   : " + marks);
    }
}

// Main Class
public class marks_100 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student obj = new Student();

        try {

            // Input
            System.out.print("Enter Roll No : ");
            int roll = sc.nextInt();

            System.out.print("Enter Marks : ");
            double marks = sc.nextDouble();

            // Store Data
            obj.store(roll, marks);

            // Display Data
            obj.display();
        }

        // Catch User Defined Exception
        catch(MarksOutOfBoundException e) {

            System.out.println("\nException : " + e.getMessage());
        }
    }
}
