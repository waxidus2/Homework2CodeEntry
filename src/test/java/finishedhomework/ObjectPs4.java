package finishedhomework;

import homework1.Ps4;
import org.junit.jupiter.api.Test;

public class ObjectPs4 {
    @Test
    public void workingWithPs4() {
      Ps4 firstPs4 = new Ps4();

      firstPs4.setTotalPrice(350);
      firstPs4.setHeight(5.5);
      firstPs4.setWidth(29.5);

      System.out.println("My Ps4 is black color");
        System.out.println("Its my reralx");
        System.out.println(firstPs4.getTotalPrice());
    }
}
