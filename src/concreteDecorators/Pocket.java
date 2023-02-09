package concreteDecorators;
import principal.*;

public class Pocket extends BagDecorator{

    public Pocket(Bag bag) {
        super(bag);
    }

    @Override
    public int getPrice(){
        return bag.getPrice()+1500;
    }

    @Override
    public String getDescription(){
        return bag.getDescription()+", añadido bolsillo";
    }  
}
