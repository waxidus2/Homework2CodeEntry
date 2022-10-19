package homework1.homework2;

import homework1.Bad;
import org.junit.jupiter.api.Test;

public class ObjectHomework4 {
    @Test
    public void workingWithBad() {
        Bad firstBad = new Bad();

        firstBad.setTotalPrice(345);
        firstBad.setLenght(235);
        firstBad.setWidth(162);
        System.out.println("My Bad is white color");
        System.out.println("1st order");
        System.out.println(firstBad.getTotalPrice());
    }
}
