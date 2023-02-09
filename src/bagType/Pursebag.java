package bagType;
import principal.*;

public class Pursebag implements Bag{

    @Override
    public int getPrice() {
        return 20000;
    }

    @Override
    public String getDescription() {
        return "Pursebag sencilla";
    }
}