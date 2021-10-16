/* Here by using extends keyword EducationLoan Inherite the 
properties of parent class Accountinherite, bcoz savings Account and Education loan account have 
common attributes or properties*/
public class EducationLoan extends Accountinherite{
    // int accountNo;
    // String ifsc;
    // String branchName;
    // Customer customer; // before creating an object of Account we need Customer datails.
    // // Here customer is an attribute of Account class.
    // double balance;

    //Operations of Education Loan Account

    double calculateInterestAmount(){
        double interest = 0;
        
        // Interest -- calculation

        return interest;
    }


    void withDrawByChrque(double amount){
        if (amount < balance) {
            balance -= amount;
        }
    }

    void rePayment(double amount){
        balance += amount;
    }
}
