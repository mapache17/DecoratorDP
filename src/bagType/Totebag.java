package bagType;
import principal.*;

public class Totebag implements Bag{

    @Override
    public int getPrice() {
        return 14000;
    }

    @Override
    public String getDescription() {
        return "Totebag simple";
    }
}