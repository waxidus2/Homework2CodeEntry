package homework1.homework2;

import homework1.Microwave;
import org.junit.jupiter.api.Test;

public class ObjectHomework6 {
    @Test
    public void workingWithMicrowave() {
      Microwave firstMicrowave = new Microwave();

      firstMicrowave.setHeight(25.7);
      firstMicrowave.setWidth(48.7);
      firstMicrowave.setTotalPrice(160);

        System.out.println("My Microwave is black color");
        System.out.println("Microwave saves time");
        System.out.println(firstMicrowave.getTotalPrice());
    }
}
