
import java.util.*;

// Parent Class
class x {

    protected int id;
    protected String name;
    protected double basic_salary;

    // Constructor
    x(int id, String name, double basic_salary) {

        this.id = id;
        this.name = name;
        this.basic_salary = basic_salary;
    }

    // Salary Calculation
    double sal_cal() {
        return basic_salary;
    }

    // Bonus
    double bonus() {
        return 0;
    }

    // Payslip
    void pay_slip() {

        double bas_salary = sal_cal();
        double bon = bonus();
        double total = bas_salary + bon;

        System.out.println("\n======== PAY SLIP ========");

        System.out.println("Name           : " + name);
        System.out.println("ID             : " + id);
        System.out.println("Basic Salary   : " + bas_salary);
        System.out.println("Bonus          : " + bon);
        System.out.println("Total Salary   : " + total);

        System.out.println("==========================");
    }
}

// Child Class
class fulltime extends x {

    protected double bon;

    // Constructor
    fulltime(int id, String name, double basic_sal, double bonus) {

        super(id, name, basic_sal);
        this.bon = bonus;
    }

    // Overriding Salary Calculation
    @Override
    double sal_cal() {
        return basic_salary;
    }

    // Overriding Bonus Method
    @Override
    double bonus() {
        return bon;
    }

    // Overriding Payslip
    @Override
    void pay_slip() {
        super.pay_slip();
    }
}

// Main Class
public class pay_role {

    public static void main(String[] args) {

        // Parent Object
        x obj = new x(12, "Mayur Patil", 77346);

        obj.pay_slip();

        // Child Object
        fulltime obj1 = new fulltime(28, "Mayur Kelu", 2837, 5000);

        obj1.pay_slip();
    }
