package exercises.day3.exercise6;

public enum PaperSize {

    A4(297, 210, " mm "),
    A3(420, 297, " mm "),
    A2(594, 420, " mm "),
    A1(841, 594, " mm "),
    A0(1189, 841, " mm ");
    private int length;
    private int width;
    private String units;

    PaperSize(int length, int width, String units) {
        this.length = length;
        this.width = width;
        this.units = units;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getUnits() {
        return units;
    }
}
