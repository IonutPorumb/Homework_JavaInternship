package exercises.day3.exercise7;

public class BTBank extends BankAccount {

    public BTBank(String bankName, double accountAmount, String ownerName, String ownerIdNo, String accountIBAN, double interest, Money currency) {
        super(bankName, accountAmount, ownerName, ownerIdNo, accountIBAN, interest, currency);
    }

    public String withdraw(double withdrawnAmount) {
        if (withdrawnAmount < 50 || withdrawnAmount % 5 != 0.0) {
            return "The operation could not be processed. " +
                    "You must enter a positive value higher or equal to 10 that is a multiple of 10!";
        }
        if (withdrawnAmount > 2500.0) {
            return "The maximum value that can be withdrawn is 5000.0!";
        }
        if (withdrawnAmount > getAccountAmount() + getInterest() * withdrawnAmount / 100) {
            return "Insufficient founds!";
        }
        setAccountAmount(getAccountAmount() - (withdrawnAmount + getInterest() * withdrawnAmount / 100));
        return "The value of " + withdrawnAmount + getCurrency() + " was withdrawn from your account. " + "\n" +
                "The account balance value is :" + getAccountAmount() + getCurrency();
    }

    public String deposit(double depositAmount) {
        if (depositAmount < 50 || depositAmount % 10 != 0) {
            return "The operation could not be processed. " +
                    "Please insert a positive value that is a multiple of 10";
        }
        if (depositAmount > 15_000) {
            return "The operation could not be processed." +
                    "The maximum value that can be deposited in one operation is 10000";
        }
        setAccountAmount(getAccountAmount() + depositAmount);
        return "The amount value of " + depositAmount + getCurrency() + " was added to your account" + "\n" +
                "The new account balance is " + getAccountAmount() + getCurrency();

    }
}
