package Day3_Encapuslation_Abstraction;
// q is abstraction perform
class atm{
    private int balance;
    atm(int balance){
        this.balance = balance;
    }
    public void withdrawl(int amt){
        if(balance < amt ){
            System.out.println("Insufficent Balance ");
        }else {
            balance = balance - amt;
            System.out.println("Successfully Withdrawal amount is " + amt);
        }
    }
    void display(){
        System.out.println("Your current balance is : " + balance);
    }
}
public class Q1 {
    public static void main(String[] args) {
        atm a = new atm(5000);
        a.withdrawl(200);
        a.display();

    }
}
