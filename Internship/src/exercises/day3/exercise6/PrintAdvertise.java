package exercises.day3.exercise6;

public class PrintAdvertise implements CompanyAdvertise {
    private PaperSize paperSize;

    public PrintAdvertise(PaperSize paperSize) {
        this.paperSize = paperSize;
    }

    public void setPaperSize(PaperSize paperSize) {
        this.paperSize = paperSize;
    }

    @Override
    public String advertiseMessage(String advertiseMessage, String companyName) {
        if (paperSize != null) {
            if (advertiseMessage == null || advertiseMessage.equals("")) {
                return "User has not inserted an advertise message";
            }
            if (companyName == null || companyName.equals("")) {
                return "There is no company name allocated for the advertise message";
            }
            return advertiseMessage + " printed on " + paperSize.name() + " size " + paperSize.getLength() + paperSize.getUnits() + "x " + paperSize.getWidth() + paperSize.getUnits();
        }
        return "There was no paper size specified for this advertise message";
    }
}