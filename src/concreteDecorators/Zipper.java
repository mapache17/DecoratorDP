package concreteDecorators;
import principal.*;

public class Zipper extends BagDecorator{

    public Zipper(Bag bag) {
        super(bag);
    }

    @Override
    public int getPrice(){
        return bag.getPrice()+3000;
    }

    @Override
    public String getDescription(){
        return bag.getDescription()+", añadido cremallera";
    }  
}
