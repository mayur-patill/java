import java.util.*;

class staff{
    protected String name;
    protected String join_date;
    protected double ID;

    staff(String name, String join_date, double ID){
        this.name = name;
        this.join_date = join_date;
        this.ID = ID;
    }
    void dissplay(){
        System.out.println(name);
        System.out.println(join_date);
        System.out.println(ID);
    }
}
class professor extends staff{
    protected String subject;
    protected int salary;
    professor(String name, String join_date, double id, String subject,int salary){
        super(name, join_date, id);
        this.subject = subject;
        this.salary = salary;
    }
    @Override
    void dissplay(){
         super.dissplay();
        System.out.println(subject);
        System.out.println(salary);
    }
}
class HOD extends professor{

   protected double allowance;


   HOD(String name, String join_date, double id, String subject,int salary,double allowance){
//       super.dissplay(String name, String join_date, double id, String subject,String salary);
       super(name,join_date, id, subject, salary);
       this.allowance = allowance;
   }

    @Override
    void dissplay() {
        super.dissplay();
        System.out.println(allowance);
    }
}
public class StaffHierarchy {
    public static void main(String[] args) {

        professor p =
                new professor(
                        "Rahul",
                        "10-02-2020",
                        101,
                        "Java",
                        75000
                );

        HOD h =
                new HOD(
                        "Sneha",
                        "01-01-2018",
                        201,
                        "Computer Science",
                        120000,
                        25000
                );

        System.out.println("\n===== PROFESSOR DETAILS =====");
        p.dissplay();

        System.out.println("\n===== HOD DETAILS =====");
        h.dissplay();
    }
}
