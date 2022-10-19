package homework1.homework2;

import homework1.Door;
import org.junit.jupiter.api.Test;

public class ObjectDoor {
    @Test
    public void workingWithDoor() {
      Door firstDoor = new Door();

      firstDoor.setTotalPrice(215);
      firstDoor.setHeight(198);
      firstDoor.setWidth(81);

      System.out.println("My door is brown");
        System.out.println("1st order");
        System.out.println(firstDoor.getTotalPrice());
    }
}
