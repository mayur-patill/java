import java.util.*;
class create_account{
    protected int id;
    protected String name;
    protected double balanced;

}
class operation extends create_account{
    protected double bal;
    Scanner sc = new Scanner(System.in);
    void create(int id, String name, double ballanc){
        this.id = id;
        this.name = name;
        this.balanced = ballanc;
    }

    void withdrawal(){
        System.out.println("enter amount");
        bal = sc.nextDouble();
        if(balanced == 0 || (balanced-bal)<=0){
            System.out.println("ballance is not sufficiant");
        }else {
            balanced = balanced-bal;
            System.out.println("this is your ammount"+bal);
            System.out.println("this is remainig ballance"+balanced);
        }
    }
    void deposit(){
        System.out.println("enter ammount");
        Scanner sc = new Scanner(System.in);
        bal = sc.nextDouble();
        if(bal<=0){
            System.out.println("chutya hai kya laude bhkariiiii");
        }else{
            balanced+=bal;
            System.out.println("current ammount"+balanced);
        }

    }
}
public class banck {
    public static void main(String[] args){
//        create_account obj1 = new create_account();
        operation obj2 = new operation();
        obj2.create(12,"mayur",1000);

        obj2.deposit();
        obj2.withdrawal();
    }
}
