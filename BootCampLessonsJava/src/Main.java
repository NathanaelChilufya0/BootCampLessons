import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //using <List> is more dynamic and allows us to adjust the list of things better
        List <String> names;
        names = new ArrayList<>();
        names.add("name1");
        names.add("name2");
        System.out.println(names.size());
        System.out.println(names.contains("name1"));
        //to print list
        names.forEach(k->{
            System.out.println("the name is "+ k);
            System.out.println("the name length is "+ k.length());
        });
        //for individual
        System.out.println(names.get(0));

        List<Account> accounts = new ArrayList<>();
        int x;//we declare
        Account acc; //here we declare like this. note object is not initialized
        //call constructor using new
        acc = new Account("24001",600,"Codergroup");
        accounts.add(acc);
        acc = new Account("24002",120,"CSS group");
        accounts.add(acc);
        accounts.add(new Account("243",500,"EHC"));
        accounts.forEach(a->{
            System.out.println(a.getData());
            //for each account we are increasing it by 100
            a.setBalance(a.getBalance() + 100);
            System.out.println("new balance: "+ a.getBalance());
        });

        for (int i=0;i<accounts.size();i++){
            System.out.println(accounts.get(i).getData());
            accounts.get(i).setBalance(accounts.get(i).getBalance()+100);
            System.out.println("new balance: "+ accounts.get(i).getBalance());
        }

        //printing and modifying figures
        System.out.println(acc.getBalance());
        acc.setBalance(1000);
        System.out.println(acc.getData());

        /*
        inheritance refers to a class getting the values of another class
        for using inheritance, we look at whether the class about to inherit a class is a subtype of that class or can be part of the class
        for example a mango inheriting a fruit class. in this case, the fruit class will be general class while mango class will be specifier.

        UML - Unified Modelling Language
        Interfaces
         */
        SavingsAccount savingsAccount = new SavingsAccount("2342",7000,"Testing Acc",0.09);
        CheckingBalance checkingBalance = new CheckingBalance("23243",99,"Test");
    }
}
/* interfaces over particular services as it were but doesnt control what those services do
* what are the pros of Iaccount, savingAaa2 and checkingacc2? because of polymorphism which are same methods but work differently.
* when working, we will be using different annotations such as @traget, @override
* for web servers include, IIS, Tomcat for hosting webs
* to use REST need REST CONTROLLER{
* @RestController...
* }
* for using the API, use @getcmapping (path = "account) and let the method return a value such a string.
 */