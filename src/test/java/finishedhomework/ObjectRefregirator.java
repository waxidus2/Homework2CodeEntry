package finishedhomework;

import homework1.Refrigerator;
import org.junit.jupiter.api.Test;

public class ObjectRefregirator {
    @Test
    public void workingWithRefregirator() {
      Refrigerator firstRefrigerator = new Refrigerator();

      firstRefrigerator.setTotalPrice(380);
      firstRefrigerator.setHeight(185);
      firstRefrigerator.setWidth(59);

      System.out.println("My Refrigerator is black color");
        System.out.println("Refrigerator brand is LG");
        System.out.println(firstRefrigerator.getTotalPrice());
    }
}
