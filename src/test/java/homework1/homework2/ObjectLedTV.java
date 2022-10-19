package homework1.homework2;

import homework1.LedTV;
import org.junit.jupiter.api.Test;

public class ObjectLedTV {
    @Test
    public void workingWithLedTV() {
      LedTV firstLedTV = new LedTV();

      firstLedTV.setTotalPrice(400);
      firstLedTV.setHeight(64.5);
      firstLedTV.setWidth(110.3);

      System.out.println("My LedTV is black color");
        System.out.println("Brand LG");
        System.out.println(firstLedTV.getTotalPrice());
    }
}
