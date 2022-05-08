package exercises.day3.exercise7;

public abstract class BankAccount {
    private String bankName;
    private double accountAmount;
    private String ownerName;
    private String ownerIdNo;
    private String accountIBAN;
    private double interest;
    private Money currency;

    public BankAccount(String bankName, double accountAmount, String ownerName, String ownerIdNo, String accountIBAN, double interest, Money currency) {
        this.bankName = bankName;
        this.accountAmount = accountAmount;
        this.ownerName = ownerName;
        this.ownerIdNo = ownerIdNo;
        this.accountIBAN = accountIBAN;
        if (interest <= 0.0) {
            System.out.println("The Interest rate must be set to a value bigger than 0.0!");
        } else {
            this.interest = interest;
        }
        this.currency = currency;
    }


    public void setAccountAmount(double accountAmount) {
        this.accountAmount = accountAmount;
    }


    public double getAccountAmount() {
        return accountAmount;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerIdNo() {
        return ownerIdNo;
    }

    public String getAccountIBAN() {
        return accountIBAN;
    }

    public double getInterest() {
        return interest;
    }

    public String getBankName() {
        return bankName;
    }

    public Money getCurrency() {
        return currency;
    }

    public abstract String withdraw(double withdrawnAmount);

    public abstract String deposit(double depositAmount);

    @Override
    public String toString() {
        return "The bank name is :" + bankName + "\n" +
                "The account IBAN is :" + bankName + "\n" +
                "The account amount is :" + accountAmount + "\n" +
                "The account owner name is :" + ownerName + "\n" +
                "The owner name ID is : " + ownerIdNo + "\n" +
                "Account currency is : " + currency;
    }

}
