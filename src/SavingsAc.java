/* Here by using extends keyword EducationLoan Inherite the 
properties of parent class Accountinherite, bcoz savings Account and Education loan account have 
common attributes or properties*/
public class SavingsAc extends Accountinherite {
    // int accountNo;
    // String ifsc;
    // String branchName;
    // Customer customer; // before creating an object of Account we need Customer datails.
    // // Here customer is an attribute of Account class.
    // double balance;

    // Operation of Savings Account

    void withdrawBYCash(double amount){
        if (amount < balance) {
            balance -= amount;
        }
    }
    void withdrawBYCheque(double amount){
        if (amount < balance) {
            balance -= amount;
        }
    }
    void depositInCash(double amount){
        balance += amount;
    }
    
    
}
