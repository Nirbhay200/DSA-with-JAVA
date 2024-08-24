package items;

public interface LibraryItem extends LateFeeCalculatable{

    String getTitle();
    String getUniqueId();

    double claculateLateFee(int days);

    double getValue();
}
