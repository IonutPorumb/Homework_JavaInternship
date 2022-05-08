package exercises.day3.exercise6;

public class EmailAdvertise implements CompanyAdvertise {
    private String emailAddress;

    public EmailAdvertise(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String advertiseMessage(String advertiseMessage, String companyName) {
        if (emailAddress != null && !emailAddress.equals("")) {
            if (advertiseMessage == null || advertiseMessage.equals("")) {
                return "User has not inserted an advertise message";
            }
            if (companyName == null || companyName.equals("")) {
                return "There is no company name allocated for the advertise message";
            }
            return advertiseMessage;
        }
        return "There was no email address specified for this advertise message";
    }
}

