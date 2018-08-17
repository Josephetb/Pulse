package atm;
import java.util.Scanner;
class shade{
    public class Atm{
	int balance = 250000;
	int pin = 1234;
	public void goodBye(){
            System.out.println("Thanks for using our services");		
	}
        public void menuAgain(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 to go back to the menu or press 0 to exit the application");
            int menu = sc.nextInt();
            switch(menu){
                case 1:
                    enterPin();
                break;
                case 0: 
                    goodBye();
                break;
                default:
                    menuAgain();
            }
        }
        public void enterPin(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your pin");
            int enterPin = sc.nextInt();
            if(enterPin==1234){
                menu();
            } else{
                System.out.println("You have entered an incorrect pin");
                enterPin();
            }
        }
        public void menu(){
            Scanner sc = new Scanner(System.in);
            System.out.println("1: Withdrawal             2: Transfer");
            System.out.println("3: Balance                4: Airtime ");
            int menuOption = sc.nextInt();
            switch(menuOption){
                case 1:
                    System.out.println("1: Savings             2: Current ");
                    int withdrawOption = sc.nextInt();
                    switch(withdrawOption){
                        case 1:
                            withdraw();
                        break;
                        case 2:
                            System.out.println("Wrong account");
                            goodBye();
                        break;
                        default:
                            goodBye();                                 
                    }
                break;
                case 2:
                    transaction();
                break;
                case 3:
                    checkBalance();
                break;
                case 4:
                    recharge();
                break;
                default: 
                    System.out.println("You have entered an invalid option.");
                    menu();
            }
        }
	public void withdraw(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount you would want to withdraw");
            int amount;
            amount = sc.nextInt();
            if(amount > balance){
        	System.out.println("You can not withdraw an amount greater than " + balance);
		withdraw();
            }
            balance = balance -amount; 
            System.out.println("You have withdrawn " + amount);
            System.out.println("Your remaining balance is " + balance);
            menuAgain();	
        }
	public void transaction(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the account number to which you want to send money");
            int accountNumber = sc.nextInt();
            System.out.println("Enter the amount you would like to send.");
            int amount = sc.nextInt();
            balance = balance - amount;
            System.out.println("You have sent " + amount + " to " + accountNumber);
            menuAgain();
	}
	public void checkBalance(){
            System.out.println("Your account balance is " + balance);
            menuAgain();
	}
	public void recharge(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the phone number you want to recharge.");
            String phoneNumber = sc.next();
            System.out.println("Enter the amount you want to recharge");
            int amount = sc.nextInt();
            balance = balance - amount;
            System.out.println("You have recharged " + phoneNumber + " with "+ amount);
            menuAgain();
	} 
    } 
}
public class ATM {   
    public static void main(String[] args) {
        shade.Atm dd=new shade().new Atm();
        dd.enterPin();
    }
}
