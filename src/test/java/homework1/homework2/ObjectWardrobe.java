package homework1.homework2;

import homework1.Wardrobe;
import org.junit.jupiter.api.Test;

public class ObjectWardrobe {
    @Test
    public void workingWithWardrobe() {
      Wardrobe firstWardrobe = new Wardrobe();

      firstWardrobe.setTotalPrice(265);
      firstWardrobe.setHeight(215.5);
      firstWardrobe.setWidth(200.5);

      System.out.println("My Wardrobe is white color");
        System.out.println("It haves two doars");
        System.out.println(firstWardrobe.getTotalPrice());
    }
}
