public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount) {
        this.accountBalance += amount;
        System.out.println("You have successfully added $" + amount + " in your account");
        System.out.println("Current account balance = $" + this.accountBalance);
    }

    public void withdrawFunds(double amount) {
        if (this.accountBalance < amount) {
            System.out.println("Not enough funds in your balance.");
            System.out.println("Current account balance = $" + this.accountBalance);
            return;
        } else {
            System.out.println("You have successfully withdrawn $" + amount + " from your account");
            this.accountBalance -= amount;
            System.out.println("Current account balance = $" + this.accountBalance);
        }
    }

}
