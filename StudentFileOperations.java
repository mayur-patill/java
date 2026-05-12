import java.io.*;
import java.util.Scanner;

// Student Class
class Student implements Serializable {

    int rollNo;
    String name;
    double marks;

    // Constructor
    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Method to Display Student Information
    void display() {

        System.out.println("Roll Number : " + rollNo);
        System.out.println("Student Name : " + name);
        System.out.println("Marks : " + marks);

        System.out.println("---------------------------");
    }
}

// Main Class
public class StudentFileOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Taking Student Input
            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            // Creating Student Object
            Student s1 = new Student(roll, name, marks);

            // Writing Object into File
            FileOutputStream fos =
                    new FileOutputStream("student.txt");

            ObjectOutputStream oos =
                    new ObjectOutputStream(fos);

            oos.writeObject(s1);

            System.out.println("\nStudent Information Stored Successfully!");

            oos.close();
            fos.close();

            // Reading Data from File
            FileInputStream fis =
                    new FileInputStream("student.txt");

            ObjectInputStream ois =
                    new ObjectInputStream(fis);

            Student s = (Student) ois.readObject();

            System.out.println("\nStudent Information From File");
            System.out.println("---------------------------");

            s.display();

            ois.close();
            fis.close();

        } catch (Exception e) {

            System.out.println("Error: " + e);
        }

        sc.close();
    }
}
