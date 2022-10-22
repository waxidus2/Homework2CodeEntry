package finishedhomework;

import homework1.Stove;
import org.junit.jupiter.api.Test;

public class ObjectStove {
    @Test
    public void workingWithStove() {
      Stove firstStove = new Stove();

      firstStove.setTotalPrice(250);
      firstStove.setHeight(58);
      firstStove.setWidth(59.5);

      System.out.println("My stove is black color");
        System.out.println("1st order");
        System.out.println(firstStove.getTotalPrice());
    }
}