package exercises.day3.exercise6;

public class FacebookAdvertise implements CompanyAdvertise {
    private String facebookAccount;

    public FacebookAdvertise(String facebookAccount) {
        this.facebookAccount = facebookAccount;
    }

    public void setFacebookAccount(String facebookAccount) {
        this.facebookAccount = facebookAccount;
    }

    @Override
    public String advertiseMessage(String advertiseMessage, String companyName) {
        if (facebookAccount != null && !facebookAccount.equals("")) {
            if (advertiseMessage == null || advertiseMessage.equals("")) {
                return "User has not inserted an advertise message";
            }
            if (companyName == null || companyName.equals("")) {
                return "There is no company name allocated for the advertise message";
            }
            return advertiseMessage;
        }
        return "There was no facebook address specified for this advertise message";
    }
}
