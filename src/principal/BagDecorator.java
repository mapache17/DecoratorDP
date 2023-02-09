package principal;
public class BagDecorator implements Bag {
    protected Bag bag;
  
    public BagDecorator(Bag bag) {
      this.bag = bag;
    }
  
    @Override
    public int getPrice() {
        return bag.getPrice();
    }

    @Override
    public String getDescription() {
        return bag.getDescription();
    }
  }