class BankAccount {
    long accountNo;
    String username;
    String email;
    String accountType;
    int accountBalance;

    public BankAccount(long accountNo, String username, String email, String accountType, int accountBalance) {
        this.accountNo = accountNo;
        this.username = username;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public String getAccountDetails() {
        return (this.username + " " + this.email + " " + this.accountType);
    }

    public void displayAccontDetails() {
        System.out.println(" Account Number " + this.accountNo);
        System.out.println(" User Name " + this.username);
        System.out.println(" email " + this.email);
        System.out.println(" Account Type  " + this.accountType);
        System.out.println(" Balance " + this.accountBalance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount customer = new BankAccount(123465798, " Jenil Gajjar ", " gajjarjenil2004@gmial.com ", " Savings ",
                25000);
        System.out.println(customer.getAccountDetails());
        customer.displayAccontDetails();
    }
}