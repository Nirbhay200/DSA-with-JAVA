package items;

public class DVD implements LibraryItem{

    String title;
    public String uniqueId;
    private double value;

    private String artist;

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getUniqueId() {
        return this.uniqueId;
    }

    @Override
    public double claculateLateFee(int days) {
        return days * 30;
    }

    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public double calculateLateFee(int days) {
        return 0;
    }
}
