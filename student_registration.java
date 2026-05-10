
import java.util.*;
class student{
    protected int id;
    protected String name;
    protected double marks;

    student(int id, String name, double marks){
         this.id = id;
         this.name = name;
         this.marks = marks;
         System.out.println("student created");
    }
    void update(String name,double marks){
        this.name = name;
        this.marks = marks;
        System.out.println("updated");
    }
    void cal_grade(){
        if (marks>=90){
            System.out.println("0");
        }else if (marks>=80){
            System.out.println("a+");
        }else if (marks>=70){
            System.out.println("a");
        }else if (marks>=60){
            System.out.println("b+");
        }else if (marks>=50){
            System.out.println("b");
        }else if (marks>=40){
            System.out.println("c");
        }else if (marks>=35){
            System.out.println("pass");
        }else if (marks<=35){
            System.out.println("fail");
        }
        return;
    }
}
public class student_registration {
   public static void main(String[] args) {


       student[] s = new student[3];
//          s[0] = new student(1,"mayur",79);
       Scanner sc = new Scanner(System.in);
       int count=0;
       int id;
       String name;
       double marks;

      while (true){

          System.out.println("enter 1 for student registration\n");
          System.out.println("enter 2 for update\n");
          System.out.println("enter 3 grade calculation\n");
          int choice = sc.nextInt();
          switch (choice){
              case 1:
                  System.out.println("enter id , name , marks\n");
                   id = sc.nextInt();
                   sc.nextLine();
                   name= sc.nextLine();
                   marks = sc.nextDouble();
                  s[count] = new student(id,name,marks);
                  count++;
                  System.out.println("created \n your roll is :-" +count);
                 break;
              case 2:

                 System.out.println("enter roll number");
                  int roll = sc.nextInt();
                  System.out.println("enter name and marks");
                  name = sc.nextLine();
                  marks = sc.nextDouble();
                  s[roll].update(name,marks);
                  System.out.println("updated");
                  break;
              case 3:
                  System.out.println("enter roll number");
                  int rol = sc.nextInt();
                  s[rol].cal_grade();
                  break;

              case 4:
           System.exit(0);
           break;
              default:
                  System.out.println("unauthorised input");
          }
      }

   }
}
