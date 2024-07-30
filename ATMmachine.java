import java.util.*;

class ATM{
    int PIN=6314;
    double balance;

    public void checkpin(){
        System.out.println("Enter Your PIN:");
        Scanner sc =new Scanner(System.in);
        int pin = sc.nextInt();
        if(pin==PIN){
            System.out.println("Welcome Mr Ajay Gupta!!");
            menu();
        }
        else{
            System.out.println("Enter the correct pin!!!");
        }

    }


    public void menu(){
        System.out.println("1.Check Your Balance");
        System.out.println("2.Deposite Money");
        System.out.println("3.Withdraw Money");
        System.out.println("4.Exit");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if(option==1){
            CheckBalance();
        }
        else if(option==3){
            withdrawMoney();
         }
         else if(option==2){
            depositeMoney();
         }
         else if(option==4){
            return;
         }
         else{
            System.out.println("Enter A vaild option:");
         }
    }
    public void CheckBalance(){
        System.out.println(("Balance:" +balance));
        menu();
    }
    public void depositeMoney(){
        System.out.println("Enter the amount to be deposite:");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        balance = balance + amount;
        System.out.println("Money Deposite Sucessfully");
        menu();

    }
    public void  withdrawMoney(){
        System.out.println(("Enter amount to Withdraw"));
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        if(amount>balance){
            System.out.println("INSUFFICIENT BALANCE");
        }
        else{
        balance = balance - amount;
        System.out.println("Money withdrawl successfully!!");
        } menu();


    }
    

}

public class ATMmachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
    
}