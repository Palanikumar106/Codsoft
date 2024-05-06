import java. util.*;
public class Atm {
    public int balanceAmount = 0;

    public void withdraw(int withdraw_amount){
        if(balanceAmount >= withdraw_amount){
            balanceAmount -= withdraw_amount;
            System.out.println("Withdrawing Amount Successfully");
            System.out.println("Current Balance : "+balanceAmount);
        }
        else
        {
            System.out.println("Insufficient Balance");
            System.out.println("Withdraw Unsuccessfully");
        }
    }

    public void deposit(int deposit_amount){
        if(deposit_amount > 0){
            balanceAmount += deposit_amount;
            System.out.println("Deposit Amount Successfully");
            System.out.println("Current Balance : "+balanceAmount);
        }
    }

    public void checkbalance(){
        System.out.println("Balance Amount: "+balanceAmount);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine.....");
        Atm a = new Atm();
        System.out.println("1\tWithdraw\n2\tDeposit\n3\tCheck Balance\n4\tExit");
        
        while(true){
            System.out.print("\nEnter Your Choice: ");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.print("Enter Amount for Withdraw: ");
                int withdrawAmount = sc.nextInt();
                a.withdraw(withdrawAmount);
            }
            else if(choice == 2){
                System.out.print("Enter Amount for Deposit: ");
                int amountToDeposit = sc.nextInt();
                a.deposit(amountToDeposit);
            }
            else if(choice == 3){
                a.checkbalance();
            }
            else{
                System.out.println("Balance: "+a.balanceAmount);
                System.out.println("Thank you come again...");
                return;
            }
        }
    }
}