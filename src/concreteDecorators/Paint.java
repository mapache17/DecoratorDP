package concreteDecorators;
import principal.*;

public class Paint extends BagDecorator{

    public Paint(Bag bag) {
        super(bag);
    }

    @Override
    public int getPrice(){
        return bag.getPrice()+7500;
    }

    @Override
    public String getDescription(){
        return bag.getDescription()+", decorada con pintura";
    }  
}
