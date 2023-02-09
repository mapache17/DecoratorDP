package concreteDecorators;
import principal.*;

public class Embroidery extends BagDecorator{

    public Embroidery(Bag bag) {
        super(bag);
    }

    @Override
    public int getPrice(){
        return bag.getPrice()+9000;
    }

    @Override
    public String getDescription(){
        return bag.getDescription()+", decorada con bordado";
    }  
}
