package principal;
import bagType.*;
import concreteDecorators.*;

public class Main {

    public static void main(String[] args) {

        //Pedido simple
        Bag pedido1 = new Totebag();
        System.out.println(pedido1.getDescription() + ". Tiene precio de $" + pedido1.getPrice());
        
        //Pedido con decoradores
        pedido1 = new Paint(pedido1);
        pedido1 = new Zipper(pedido1);
        pedido1 = new Pocket(pedido1);
        System.out.println(pedido1.getDescription() + ". Tiene precio de $" + pedido1.getPrice());

        //-------------------
        Bag pedido2 = new Pursebag();
        pedido2 = new Embroidery(pedido2);
        pedido2 = new Paint(pedido2);
        pedido2 = new Pocket(pedido2);
        System.out.println(pedido2.getDescription() + ". Tiene precio de $" + pedido2.getPrice());


      }
}
