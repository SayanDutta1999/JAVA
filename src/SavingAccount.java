public class SavingAccount {
    private int accountNo;
    private String customerName;
    private String address;
    private String pan;
    private String aadher;
    private String passport;
    private String voter;

    // for creating a Account constructor
    // Person 1
    SavingAccount(int accountNo, String customerName,  String address, String pan, String aadher){
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.address = address;
        this.pan = pan;
        this.aadher = aadher;
    }
   
    // person 2
    SavingAccount(int accountNo, String customerName,  String address, String pan, String aadher, String passport){
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.address = address;
        this.pan = pan;
        this.aadher = aadher;
        this.passport = passport;
    }
    // After add this voter information that why we create a seporate methor or function
    // Method Overloading
    void setVoter(String Voter){
        this.voter = Voter;

    }

    void setVoter(String Voter, String passport){
        this.voter = Voter;
        this.passport = passport;

    }

    
    // get for accessong private variable
    public int getaccountNo(){
        return accountNo;
    }
    
    public String getcustomerName(){
        return customerName;
    }

    public String getaddress(){
        return address;
    }

    public String getpan(){
        return pan;
    }
    
    public String getaadher(){
        return aadher;
    }
    
    public String getpassport(){
        return passport;
    }
    
    public String getvoter(){
        return voter;
    }

}
