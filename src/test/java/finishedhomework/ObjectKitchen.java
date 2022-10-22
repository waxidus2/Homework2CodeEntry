package finishedhomework;

import homework1.Kitchen;
import org.junit.jupiter.api.Test;

public class ObjectKitchen {
    @Test
    public void workingWithKitchen() {
        Kitchen firstKitchen = new Kitchen();
        firstKitchen.setTotalPrice(1650);
        firstKitchen.setHeight(230);
        firstKitchen.setWidth(270.7);

        System.out.println("My Kitchen is brown");
        System.out.println("1st order");
        System.out.println(firstKitchen.getTotalPrice());

    }
}
