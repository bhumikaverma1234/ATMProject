
import java.util.*;
class ATM{
    float Balance;
    int PIN = 5674;
    
    ATM(float Balance, int PIN){
        this.Balance = Balance;
        this.PIN = PIN;
        System.out.println("Enter your pin: ");
            Scanner sc = new Scanner(System.in);
            int enteredpin = sc.nextInt();
            if(enteredpin == PIN){
                menu();
            }
            else{
                System.out.println("enter a valid pin");
            }
    }

    // public void checkpin(){
    //     System.out.println("Enter your pin: ");
    //     Scanner sc = new Scanner(System.in);
    //     int enteredpin = sc.nextInt();
    //     if(enteredpin == PIN){
    //         menu();
    //     }
    //     else{
    //         System.out.println("enter a valid pin");
    //     }
    // }
    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3 Deposite Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            checkBalance();
        }
        else if(opt == 2){
            withdrawMoney();
        }
        else if(opt == 3){
            depositeMoney();
        }
        else if(opt == 4){
            return;
        }
        else{
            System.out.println("Enter a valid choice");
        }
    }
    public void checkBalance(){
        System.out.println("Balance :" + Balance);
        menu();
    }
    public void  withdrawMoney(){
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance = Balance - amount;
            System.out.println("Money Wthdrawl Successful");
        }
        menu();
    }
    public void depositeMoney(){
        System.out.println("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited successfully");
        menu();
    }
}
public class ATMProject {
    public static void main(String[] args) {
        ATM obj = new ATM(3000,5674);
        // obj.checkpin();

    }
}
