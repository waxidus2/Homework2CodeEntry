package finishedhomework;

import homework1.*;
import org.junit.jupiter.api.Test;

public class HomeWorkTest {
    public static class ObjectBad {
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

    public static class ObjectDoor {
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

    public static class ObjectKitchen {
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

    public static class ObjectLedTV {
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

    public static class ObjectMicrowave {
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

    public static class ObjectPs4 {
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

    public static class ObjectRefregirator {
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

    public static class ObjectStove {
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

    public static class ObjectWardrobe {
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

    public static class ObjectWindow {
        @Test
        public void workingWithWindow() {
          Window firstWindow = new Window();

          firstWindow.setTotalPrice(215);
          firstWindow.setHeight(131.5);
          firstWindow.setWidth(114.5);

          System.out.println("My window is white color");
            System.out.println("I have beautiful view from the window");
            System.out.println(firstWindow.getTotalPrice());
        }
    }
}
